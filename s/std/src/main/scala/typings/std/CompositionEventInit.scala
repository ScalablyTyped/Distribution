package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionEventInit
  extends StObject
     with UIEventInit {
  
  /* standard dom */
  var data: js.UndefOr[java.lang.String] = js.undefined
}
object CompositionEventInit {
  
  inline def apply(): CompositionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositionEventInit] (val x: Self) extends AnyVal {
    
    inline def setData(value: java.lang.String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
