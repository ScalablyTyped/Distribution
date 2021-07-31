package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPathProps
  extends StObject
     with TextSpecificProps {
  
  var href: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[TextPathMethod] = js.undefined
  
  var midLine: js.UndefOr[TextPathMidLine] = js.undefined
  
  var spacing: js.UndefOr[TextPathSpacing] = js.undefined
  
  var startOffset: js.UndefOr[NumberProp] = js.undefined
  
  var xlinkHref: js.UndefOr[String] = js.undefined
}
object TextPathProps {
  
  @scala.inline
  def apply(): TextPathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPathProps]
  }
  
  @scala.inline
  implicit class TextPathPropsMutableBuilder[Self <: TextPathProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setMethod(value: TextPathMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMidLine(value: TextPathMidLine): Self = StObject.set(x, "midLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidLineUndefined: Self = StObject.set(x, "midLine", js.undefined)
    
    @scala.inline
    def setSpacing(value: TextPathSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStartOffset(value: NumberProp): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    @scala.inline
    def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
  }
}
