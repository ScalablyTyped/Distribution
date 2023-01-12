package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WheelEventInit
  extends StObject
     with MouseEventInit {
  
  /* standard dom */
  var deltaMode: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var deltaX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var deltaY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var deltaZ: js.UndefOr[Double] = js.undefined
}
object WheelEventInit {
  
  inline def apply(): WheelEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WheelEventInit] (val x: Self) extends AnyVal {
    
    inline def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
    
    inline def setDeltaModeUndefined: Self = StObject.set(x, "deltaMode", js.undefined)
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    inline def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
    
    inline def setDeltaZUndefined: Self = StObject.set(x, "deltaZ", js.undefined)
  }
}
