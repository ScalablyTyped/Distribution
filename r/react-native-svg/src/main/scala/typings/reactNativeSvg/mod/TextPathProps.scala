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
  
  inline def apply(): TextPathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPathProps]
  }
  
  extension [Self <: TextPathProps](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMethod(value: TextPathMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMidLine(value: TextPathMidLine): Self = StObject.set(x, "midLine", value.asInstanceOf[js.Any])
    
    inline def setMidLineUndefined: Self = StObject.set(x, "midLine", js.undefined)
    
    inline def setSpacing(value: TextPathSpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setStartOffset(value: NumberProp): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
    
    inline def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
  }
}
