package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var code: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var wasClean: js.UndefOr[scala.Boolean] = js.undefined
}
object CloseEventInit {
  
  inline def apply(): CloseEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseEventInit] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReason(value: java.lang.String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setWasClean(value: scala.Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    
    inline def setWasCleanUndefined: Self = StObject.set(x, "wasClean", js.undefined)
  }
}
