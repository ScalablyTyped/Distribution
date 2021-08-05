package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSpecificProps
  extends StObject
     with PathProps
     with FontProps {
  
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.undefined
  
  var baselineShift: js.UndefOr[BaselineShift] = js.undefined
  
  var fontData: js.UndefOr[js.Object] = js.undefined
  
  var fontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.undefined
  
  var lengthAdjust: js.UndefOr[LengthAdjust] = js.undefined
  
  var textLength: js.UndefOr[TextLength] = js.undefined
  
  var verticalAlign: js.UndefOr[VerticalAlign] = js.undefined
}
object TextSpecificProps {
  
  inline def apply(): TextSpecificProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSpecificProps]
  }
  
  extension [Self <: TextSpecificProps](x: Self) {
    
    inline def setAlignmentBaseline(value: AlignmentBaseline): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    inline def setBaselineShift(value: BaselineShift): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    inline def setBaselineShiftVarargs(value: NumberProp*): Self = StObject.set(x, "baselineShift", js.Array(value :_*))
    
    inline def setFontData(value: js.Object): Self = StObject.set(x, "fontData", value.asInstanceOf[js.Any])
    
    inline def setFontDataUndefined: Self = StObject.set(x, "fontData", js.undefined)
    
    inline def setFontFeatureSettings(value: FontFeatureSettings): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    inline def setLengthAdjust(value: LengthAdjust): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    inline def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
    
    inline def setTextLength(value: TextLength): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    inline def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlign): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
  }
}
