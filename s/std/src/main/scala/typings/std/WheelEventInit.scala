package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WheelEventInit
  extends StObject
     with MouseEventInit {
  
  var deltaMode: js.UndefOr[Double] = js.undefined
  
  var deltaX: js.UndefOr[Double] = js.undefined
  
  var deltaY: js.UndefOr[Double] = js.undefined
  
  var deltaZ: js.UndefOr[Double] = js.undefined
}
object WheelEventInit {
  
  @scala.inline
  def apply(): WheelEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelEventInit]
  }
  
  @scala.inline
  implicit class WheelEventInitMutableBuilder[Self <: WheelEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaModeUndefined: Self = StObject.set(x, "deltaMode", js.undefined)
    
    @scala.inline
    def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    @scala.inline
    def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaZUndefined: Self = StObject.set(x, "deltaZ", js.undefined)
  }
}
