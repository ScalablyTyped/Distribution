package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPathProps
  extends StObject
     with TextSpecificProps {
  
  var href: String
  
  var method: js.UndefOr[Method] = js.undefined
  
  var midLine: js.UndefOr[MidLine] = js.undefined
  
  var side: js.UndefOr[Side] = js.undefined
  
  var spacing: js.UndefOr[Spacing] = js.undefined
  
  var startOffset: js.UndefOr[StartOffset] = js.undefined
}
object TextPathProps {
  
  inline def apply(href: String): TextPathProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPathProps]
  }
  
  extension [Self <: TextPathProps](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMidLine(value: MidLine): Self = StObject.set(x, "midLine", value.asInstanceOf[js.Any])
    
    inline def setMidLineUndefined: Self = StObject.set(x, "midLine", js.undefined)
    
    inline def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStartOffset(value: StartOffset): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
  }
}
