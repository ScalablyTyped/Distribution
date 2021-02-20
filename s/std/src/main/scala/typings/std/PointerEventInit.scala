package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerEventInit extends MouseEventInit {
  
  var height: js.UndefOr[Double] = js.native
  
  var isPrimary: js.UndefOr[scala.Boolean] = js.native
  
  var pointerId: js.UndefOr[Double] = js.native
  
  var pointerType: js.UndefOr[java.lang.String] = js.native
  
  var pressure: js.UndefOr[Double] = js.native
  
  var tangentialPressure: js.UndefOr[Double] = js.native
  
  var tiltX: js.UndefOr[Double] = js.native
  
  var tiltY: js.UndefOr[Double] = js.native
  
  var twist: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PointerEventInit {
  
  @scala.inline
  def apply(): PointerEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerEventInit]
  }
  
  @scala.inline
  implicit class PointerEventInitMutableBuilder[Self <: PointerEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIsPrimary(value: scala.Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerIdUndefined: Self = StObject.set(x, "pointerId", js.undefined)
    
    @scala.inline
    def setPointerType(value: java.lang.String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    @scala.inline
    def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressureUndefined: Self = StObject.set(x, "pressure", js.undefined)
    
    @scala.inline
    def setTangentialPressure(value: Double): Self = StObject.set(x, "tangentialPressure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentialPressureUndefined: Self = StObject.set(x, "tangentialPressure", js.undefined)
    
    @scala.inline
    def setTiltX(value: Double): Self = StObject.set(x, "tiltX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltXUndefined: Self = StObject.set(x, "tiltX", js.undefined)
    
    @scala.inline
    def setTiltY(value: Double): Self = StObject.set(x, "tiltY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltYUndefined: Self = StObject.set(x, "tiltY", js.undefined)
    
    @scala.inline
    def setTwist(value: Double): Self = StObject.set(x, "twist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwistUndefined: Self = StObject.set(x, "twist", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
