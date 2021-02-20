package typings.sketchapp

import typings.sketchapp.sketchappStrings.layoutGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSLayoutGrid extends SketchMSLayout {
  
  var _class: layoutGrid = js.native
  
  var columnWidth: Double = js.native
  
  var drawHorizontal: Boolean = js.native
  
  var drawHorizontalLines: Boolean = js.native
  
  var drawVertical: Boolean = js.native
  
  var gutterHeight: Double = js.native
  
  var gutterWidth: Double = js.native
  
  var guttersOutside: Boolean = js.native
  
  var horizontalOffset: Double = js.native
  
  var isEnabled: Boolean = js.native
  
  var numberOfColumns: Double = js.native
  
  var rowHeightMultiplication: Double = js.native
  
  var totalWidth: Double = js.native
}
object SketchMSLayoutGrid {
  
  @scala.inline
  def apply(
    _class: layoutGrid,
    columnWidth: Double,
    drawHorizontal: Boolean,
    drawHorizontalLines: Boolean,
    drawVertical: Boolean,
    gutterHeight: Double,
    gutterWidth: Double,
    guttersOutside: Boolean,
    horizontalOffset: Double,
    isEnabled: Boolean,
    numberOfColumns: Double,
    rowHeightMultiplication: Double,
    totalWidth: Double
  ): SketchMSLayoutGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], drawHorizontal = drawHorizontal.asInstanceOf[js.Any], drawHorizontalLines = drawHorizontalLines.asInstanceOf[js.Any], drawVertical = drawVertical.asInstanceOf[js.Any], gutterHeight = gutterHeight.asInstanceOf[js.Any], gutterWidth = gutterWidth.asInstanceOf[js.Any], guttersOutside = guttersOutside.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], rowHeightMultiplication = rowHeightMultiplication.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutGrid]
  }
  
  @scala.inline
  implicit class SketchMSLayoutGridMutableBuilder[Self <: SketchMSLayoutGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawHorizontal(value: Boolean): Self = StObject.set(x, "drawHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawHorizontalLines(value: Boolean): Self = StObject.set(x, "drawHorizontalLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawVertical(value: Boolean): Self = StObject.set(x, "drawVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterHeight(value: Double): Self = StObject.set(x, "gutterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuttersOutside(value: Boolean): Self = StObject.set(x, "guttersOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfColumns(value: Double): Self = StObject.set(x, "numberOfColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightMultiplication(value: Double): Self = StObject.set(x, "rowHeightMultiplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalWidth(value: Double): Self = StObject.set(x, "totalWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: layoutGrid): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
