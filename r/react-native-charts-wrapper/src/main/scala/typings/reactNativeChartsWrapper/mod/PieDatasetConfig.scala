package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieDatasetConfig extends CommonDatasetConfig {
  
  var selectionShift: js.UndefOr[Double] = js.native
  
  var sliceSpace: js.UndefOr[Double] = js.native
  
  var valueLineColor: js.UndefOr[Color] = js.native
  
  var valueLinePart1Length: js.UndefOr[Double] = js.native
  
  var valueLinePart1OffsetPercentage: js.UndefOr[Double] = js.native
  
  var valueLinePart2Length: js.UndefOr[Double] = js.native
  
  var valueLineVariableLength: js.UndefOr[Boolean] = js.native
  
  var valueLineWidth: js.UndefOr[Double] = js.native
  
  var xValuePosition: js.UndefOr[PieValuePosition] = js.native
  
  var yValuePosition: js.UndefOr[PieValuePosition] = js.native
}
object PieDatasetConfig {
  
  @scala.inline
  def apply(): PieDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieDatasetConfig]
  }
  
  @scala.inline
  implicit class PieDatasetConfigOps[Self <: PieDatasetConfig] (val x: Self) extends AnyVal {
    
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
    def setSelectionShift(value: Double): Self = this.set("selectionShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionShift: Self = this.set("selectionShift", js.undefined)
    
    @scala.inline
    def setSliceSpace(value: Double): Self = this.set("sliceSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliceSpace: Self = this.set("sliceSpace", js.undefined)
    
    @scala.inline
    def setValueLineColor(value: Color): Self = this.set("valueLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLineColor: Self = this.set("valueLineColor", js.undefined)
    
    @scala.inline
    def setValueLinePart1Length(value: Double): Self = this.set("valueLinePart1Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLinePart1Length: Self = this.set("valueLinePart1Length", js.undefined)
    
    @scala.inline
    def setValueLinePart1OffsetPercentage(value: Double): Self = this.set("valueLinePart1OffsetPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLinePart1OffsetPercentage: Self = this.set("valueLinePart1OffsetPercentage", js.undefined)
    
    @scala.inline
    def setValueLinePart2Length(value: Double): Self = this.set("valueLinePart2Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLinePart2Length: Self = this.set("valueLinePart2Length", js.undefined)
    
    @scala.inline
    def setValueLineVariableLength(value: Boolean): Self = this.set("valueLineVariableLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLineVariableLength: Self = this.set("valueLineVariableLength", js.undefined)
    
    @scala.inline
    def setValueLineWidth(value: Double): Self = this.set("valueLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLineWidth: Self = this.set("valueLineWidth", js.undefined)
    
    @scala.inline
    def setXValuePosition(value: PieValuePosition): Self = this.set("xValuePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXValuePosition: Self = this.set("xValuePosition", js.undefined)
    
    @scala.inline
    def setYValuePosition(value: PieValuePosition): Self = this.set("yValuePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYValuePosition: Self = this.set("yValuePosition", js.undefined)
  }
}
