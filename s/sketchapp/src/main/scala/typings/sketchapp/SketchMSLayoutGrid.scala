package typings.sketchapp

import typings.sketchapp.sketchappStrings.layoutGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSLayoutGrid
  extends StObject
     with SketchMSLayout {
  
  var _class: layoutGrid
  
  var columnWidth: Double
  
  var drawHorizontal: Boolean
  
  var drawHorizontalLines: Boolean
  
  var drawVertical: Boolean
  
  var gutterHeight: Double
  
  var gutterWidth: Double
  
  var guttersOutside: Boolean
  
  var horizontalOffset: Double
  
  var isEnabled: Boolean
  
  var numberOfColumns: Double
  
  var rowHeightMultiplication: Double
  
  var totalWidth: Double
}
object SketchMSLayoutGrid {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(_class = "layoutGrid", columnWidth = columnWidth.asInstanceOf[js.Any], drawHorizontal = drawHorizontal.asInstanceOf[js.Any], drawHorizontalLines = drawHorizontalLines.asInstanceOf[js.Any], drawVertical = drawVertical.asInstanceOf[js.Any], gutterHeight = gutterHeight.asInstanceOf[js.Any], gutterWidth = gutterWidth.asInstanceOf[js.Any], guttersOutside = guttersOutside.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], rowHeightMultiplication = rowHeightMultiplication.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutGrid]
  }
  
  extension [Self <: SketchMSLayoutGrid](x: Self) {
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setDrawHorizontal(value: Boolean): Self = StObject.set(x, "drawHorizontal", value.asInstanceOf[js.Any])
    
    inline def setDrawHorizontalLines(value: Boolean): Self = StObject.set(x, "drawHorizontalLines", value.asInstanceOf[js.Any])
    
    inline def setDrawVertical(value: Boolean): Self = StObject.set(x, "drawVertical", value.asInstanceOf[js.Any])
    
    inline def setGutterHeight(value: Double): Self = StObject.set(x, "gutterHeight", value.asInstanceOf[js.Any])
    
    inline def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
    
    inline def setGuttersOutside(value: Boolean): Self = StObject.set(x, "guttersOutside", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setNumberOfColumns(value: Double): Self = StObject.set(x, "numberOfColumns", value.asInstanceOf[js.Any])
    
    inline def setRowHeightMultiplication(value: Double): Self = StObject.set(x, "rowHeightMultiplication", value.asInstanceOf[js.Any])
    
    inline def setTotalWidth(value: Double): Self = StObject.set(x, "totalWidth", value.asInstanceOf[js.Any])
    
    inline def set_class(value: layoutGrid): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
