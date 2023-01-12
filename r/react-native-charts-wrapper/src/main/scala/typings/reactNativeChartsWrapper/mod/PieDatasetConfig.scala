package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieDatasetConfig
  extends StObject
     with CommonDatasetConfig {
  
  var selectionShift: js.UndefOr[Double] = js.undefined
  
  var sliceSpace: js.UndefOr[Double] = js.undefined
  
  var valueLineColor: js.UndefOr[Color] = js.undefined
  
  var valueLinePart1Length: js.UndefOr[Double] = js.undefined
  
  var valueLinePart1OffsetPercentage: js.UndefOr[Double] = js.undefined
  
  var valueLinePart2Length: js.UndefOr[Double] = js.undefined
  
  var valueLineVariableLength: js.UndefOr[Boolean] = js.undefined
  
  var valueLineWidth: js.UndefOr[Double] = js.undefined
  
  var xValuePosition: js.UndefOr[PieValuePosition] = js.undefined
  
  var yValuePosition: js.UndefOr[PieValuePosition] = js.undefined
}
object PieDatasetConfig {
  
  inline def apply(): PieDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieDatasetConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieDatasetConfig] (val x: Self) extends AnyVal {
    
    inline def setSelectionShift(value: Double): Self = StObject.set(x, "selectionShift", value.asInstanceOf[js.Any])
    
    inline def setSelectionShiftUndefined: Self = StObject.set(x, "selectionShift", js.undefined)
    
    inline def setSliceSpace(value: Double): Self = StObject.set(x, "sliceSpace", value.asInstanceOf[js.Any])
    
    inline def setSliceSpaceUndefined: Self = StObject.set(x, "sliceSpace", js.undefined)
    
    inline def setValueLineColor(value: Color): Self = StObject.set(x, "valueLineColor", value.asInstanceOf[js.Any])
    
    inline def setValueLineColorUndefined: Self = StObject.set(x, "valueLineColor", js.undefined)
    
    inline def setValueLinePart1Length(value: Double): Self = StObject.set(x, "valueLinePart1Length", value.asInstanceOf[js.Any])
    
    inline def setValueLinePart1LengthUndefined: Self = StObject.set(x, "valueLinePart1Length", js.undefined)
    
    inline def setValueLinePart1OffsetPercentage(value: Double): Self = StObject.set(x, "valueLinePart1OffsetPercentage", value.asInstanceOf[js.Any])
    
    inline def setValueLinePart1OffsetPercentageUndefined: Self = StObject.set(x, "valueLinePart1OffsetPercentage", js.undefined)
    
    inline def setValueLinePart2Length(value: Double): Self = StObject.set(x, "valueLinePart2Length", value.asInstanceOf[js.Any])
    
    inline def setValueLinePart2LengthUndefined: Self = StObject.set(x, "valueLinePart2Length", js.undefined)
    
    inline def setValueLineVariableLength(value: Boolean): Self = StObject.set(x, "valueLineVariableLength", value.asInstanceOf[js.Any])
    
    inline def setValueLineVariableLengthUndefined: Self = StObject.set(x, "valueLineVariableLength", js.undefined)
    
    inline def setValueLineWidth(value: Double): Self = StObject.set(x, "valueLineWidth", value.asInstanceOf[js.Any])
    
    inline def setValueLineWidthUndefined: Self = StObject.set(x, "valueLineWidth", js.undefined)
    
    inline def setXValuePosition(value: PieValuePosition): Self = StObject.set(x, "xValuePosition", value.asInstanceOf[js.Any])
    
    inline def setXValuePositionUndefined: Self = StObject.set(x, "xValuePosition", js.undefined)
    
    inline def setYValuePosition(value: PieValuePosition): Self = StObject.set(x, "yValuePosition", value.asInstanceOf[js.Any])
    
    inline def setYValuePositionUndefined: Self = StObject.set(x, "yValuePosition", js.undefined)
  }
}
