package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARTClippingRectangleProps
  extends StObject
     with ARTNodeMixin {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ARTClippingRectangleProps {
  
  @scala.inline
  def apply(): ARTClippingRectangleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARTClippingRectangleProps]
  }
  
  @scala.inline
  implicit class ARTClippingRectanglePropsMutableBuilder[Self <: ARTClippingRectangleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
