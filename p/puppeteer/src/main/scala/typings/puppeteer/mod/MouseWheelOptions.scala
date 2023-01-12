package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseWheelOptions extends StObject {
  
  var deltaX: js.UndefOr[Double] = js.undefined
  
  var deltaY: js.UndefOr[Double] = js.undefined
}
object MouseWheelOptions {
  
  inline def apply(): MouseWheelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseWheelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseWheelOptions] (val x: Self) extends AnyVal {
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
  }
}
