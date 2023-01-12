package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopStateEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var state: js.UndefOr[Any] = js.undefined
}
object PopStateEventInit {
  
  inline def apply(): PopStateEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopStateEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopStateEventInit] (val x: Self) extends AnyVal {
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
