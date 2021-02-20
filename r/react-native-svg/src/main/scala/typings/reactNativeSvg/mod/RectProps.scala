package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectProps extends CommonPathProps {
  
  var height: js.UndefOr[NumberProp] = js.native
  
  var opacity: js.UndefOr[NumberProp] = js.native
  
  var rx: js.UndefOr[NumberProp] = js.native
  
  var ry: js.UndefOr[NumberProp] = js.native
  
  var width: js.UndefOr[NumberProp] = js.native
  
  @JSName("x")
  var x_RectProps: js.UndefOr[NumberProp] = js.native
  
  @JSName("y")
  var y_RectProps: js.UndefOr[NumberProp] = js.native
}
object RectProps {
  
  @scala.inline
  def apply(): RectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectProps]
  }
  
  @scala.inline
  implicit class RectPropsMutableBuilder[Self <: RectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    @scala.inline
    def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
