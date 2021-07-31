package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps
  extends StObject
     with TextSpecificProps {
  
  var dx: js.UndefOr[NumberArray] = js.undefined
  
  var dy: js.UndefOr[NumberArray] = js.undefined
  
  var inlineSize: js.UndefOr[NumberProp] = js.undefined
  
  var opacity: js.UndefOr[NumberProp] = js.undefined
  
  var rotate: js.UndefOr[NumberArray] = js.undefined
}
object TextProps {
  
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  @scala.inline
  implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDx(value: NumberArray): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDxVarargs(value: NumberProp*): Self = StObject.set(x, "dx", js.Array(value :_*))
    
    @scala.inline
    def setDy(value: NumberArray): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setDyVarargs(value: NumberProp*): Self = StObject.set(x, "dy", js.Array(value :_*))
    
    @scala.inline
    def setInlineSize(value: NumberProp): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
    
    @scala.inline
    def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRotate(value: NumberArray): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setRotateVarargs(value: NumberProp*): Self = StObject.set(x, "rotate", js.Array(value :_*))
  }
}
