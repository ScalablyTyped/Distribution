package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSpecificProps
  extends TransformProps
     with FillProps
     with StrokeProps
     with ClipProps
     with VectorEffectProps
     with ResponderProps
     with TouchableProps
     with DefinitionProps
     with CommonMarkerProps
     with CommonMaskProps
     with FontProps {
  
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.native
  
  var baselineShift: js.UndefOr[BaselineShift] = js.native
  
  var fontData: js.UndefOr[Null | StringDictionary[js.Any]] = js.native
  
  var lengthAdjust: js.UndefOr[LengthAdjust] = js.native
  
  var textLength: js.UndefOr[NumberProp] = js.native
  
  var verticalAlign: js.UndefOr[NumberProp] = js.native
}
object TextSpecificProps {
  
  @scala.inline
  def apply(): TextSpecificProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSpecificProps]
  }
  
  @scala.inline
  implicit class TextSpecificPropsOps[Self <: TextSpecificProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignmentBaseline(value: AlignmentBaseline): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    
    @scala.inline
    def setBaselineShiftVarargs(value: NumberProp*): Self = this.set("baselineShift", js.Array(value :_*))
    
    @scala.inline
    def setBaselineShift(value: BaselineShift): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    
    @scala.inline
    def setFontData(value: StringDictionary[js.Any]): Self = this.set("fontData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontData: Self = this.set("fontData", js.undefined)
    
    @scala.inline
    def setFontDataNull: Self = this.set("fontData", null)
    
    @scala.inline
    def setLengthAdjust(value: LengthAdjust): Self = this.set("lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthAdjust: Self = this.set("lengthAdjust", js.undefined)
    
    @scala.inline
    def setTextLength(value: NumberProp): Self = this.set("textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextLength: Self = this.set("textLength", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: NumberProp): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
}
