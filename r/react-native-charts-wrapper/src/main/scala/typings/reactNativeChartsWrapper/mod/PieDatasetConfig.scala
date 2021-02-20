package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
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
  implicit class PieDatasetConfigMutableBuilder[Self <: PieDatasetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectionShift(value: Double): Self = StObject.set(x, "selectionShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionShiftUndefined: Self = StObject.set(x, "selectionShift", js.undefined)
    
    @scala.inline
    def setSliceSpace(value: Double): Self = StObject.set(x, "sliceSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceSpaceUndefined: Self = StObject.set(x, "sliceSpace", js.undefined)
    
    @scala.inline
    def setValueLineColor(value: Color): Self = StObject.set(x, "valueLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLineColorUndefined: Self = StObject.set(x, "valueLineColor", js.undefined)
    
    @scala.inline
    def setValueLinePart1Length(value: Double): Self = StObject.set(x, "valueLinePart1Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLinePart1LengthUndefined: Self = StObject.set(x, "valueLinePart1Length", js.undefined)
    
    @scala.inline
    def setValueLinePart1OffsetPercentage(value: Double): Self = StObject.set(x, "valueLinePart1OffsetPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLinePart1OffsetPercentageUndefined: Self = StObject.set(x, "valueLinePart1OffsetPercentage", js.undefined)
    
    @scala.inline
    def setValueLinePart2Length(value: Double): Self = StObject.set(x, "valueLinePart2Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLinePart2LengthUndefined: Self = StObject.set(x, "valueLinePart2Length", js.undefined)
    
    @scala.inline
    def setValueLineVariableLength(value: Boolean): Self = StObject.set(x, "valueLineVariableLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLineVariableLengthUndefined: Self = StObject.set(x, "valueLineVariableLength", js.undefined)
    
    @scala.inline
    def setValueLineWidth(value: Double): Self = StObject.set(x, "valueLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLineWidthUndefined: Self = StObject.set(x, "valueLineWidth", js.undefined)
    
    @scala.inline
    def setXValuePosition(value: PieValuePosition): Self = StObject.set(x, "xValuePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXValuePositionUndefined: Self = StObject.set(x, "xValuePosition", js.undefined)
    
    @scala.inline
    def setYValuePosition(value: PieValuePosition): Self = StObject.set(x, "yValuePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYValuePositionUndefined: Self = StObject.set(x, "yValuePosition", js.undefined)
  }
}
