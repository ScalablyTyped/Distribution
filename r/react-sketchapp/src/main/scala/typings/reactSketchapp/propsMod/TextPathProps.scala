package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextPathProps extends TextSpecificProps {
  
  var href: String = js.native
  
  var method: js.UndefOr[Method] = js.native
  
  var midLine: js.UndefOr[MidLine] = js.native
  
  var side: js.UndefOr[Side] = js.native
  
  var spacing: js.UndefOr[Spacing] = js.native
  
  var startOffset: js.UndefOr[StartOffset] = js.native
}
object TextPathProps {
  
  @scala.inline
  def apply(href: String): TextPathProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPathProps]
  }
  
  @scala.inline
  implicit class TextPathPropsMutableBuilder[Self <: TextPathProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMidLine(value: MidLine): Self = StObject.set(x, "midLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidLineUndefined: Self = StObject.set(x, "midLine", js.undefined)
    
    @scala.inline
    def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    @scala.inline
    def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStartOffset(value: StartOffset): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
  }
}
