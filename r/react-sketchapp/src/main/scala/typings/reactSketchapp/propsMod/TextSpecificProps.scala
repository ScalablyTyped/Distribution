package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSpecificProps
  extends PathProps
     with FontProps {
  
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.native
  
  var baselineShift: js.UndefOr[BaselineShift] = js.native
  
  var fontData: js.UndefOr[js.Object] = js.native
  
  var fontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.native
  
  var lengthAdjust: js.UndefOr[LengthAdjust] = js.native
  
  var textLength: js.UndefOr[TextLength] = js.native
  
  var verticalAlign: js.UndefOr[VerticalAlign] = js.native
}
object TextSpecificProps {
  
  @scala.inline
  def apply(): TextSpecificProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSpecificProps]
  }
  
  @scala.inline
  implicit class TextSpecificPropsMutableBuilder[Self <: TextSpecificProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignmentBaseline(value: AlignmentBaseline): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: BaselineShift): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    @scala.inline
    def setBaselineShiftVarargs(value: NumberProp*): Self = StObject.set(x, "baselineShift", js.Array(value :_*))
    
    @scala.inline
    def setFontData(value: js.Object): Self = StObject.set(x, "fontData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDataUndefined: Self = StObject.set(x, "fontData", js.undefined)
    
    @scala.inline
    def setFontFeatureSettings(value: FontFeatureSettings): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setLengthAdjust(value: LengthAdjust): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
    
    @scala.inline
    def setTextLength(value: TextLength): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlign): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
  }
}
