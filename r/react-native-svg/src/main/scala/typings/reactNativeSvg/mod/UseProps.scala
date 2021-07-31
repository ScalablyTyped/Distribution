package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseProps
  extends StObject
     with CommonPathProps {
  
  var height: js.UndefOr[NumberProp] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
  
  var width: js.UndefOr[NumberProp] = js.undefined
  
  @JSName("x")
  var x_UseProps: js.UndefOr[NumberProp] = js.undefined
  
  var xlinkHref: js.UndefOr[String] = js.undefined
  
  @JSName("y")
  var y_UseProps: js.UndefOr[NumberProp] = js.undefined
}
object UseProps {
  
  @scala.inline
  def apply(): UseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseProps]
  }
  
  @scala.inline
  implicit class UsePropsMutableBuilder[Self <: UseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
    
    @scala.inline
    def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
