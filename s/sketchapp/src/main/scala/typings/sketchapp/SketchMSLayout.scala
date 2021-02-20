package typings.sketchapp

import typings.sketchapp.sketchappStrings.layoutGrid
import typings.sketchapp.sketchappStrings.simpleGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sketchapp.SketchMSLayoutGrid
  - typings.sketchapp.SketchMSLayoutSimpleGrid
*/
trait SketchMSLayout extends StObject
object SketchMSLayout {
  
  @scala.inline
  def SketchMSLayoutGrid(
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
  ): typings.sketchapp.SketchMSLayoutGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], drawHorizontal = drawHorizontal.asInstanceOf[js.Any], drawHorizontalLines = drawHorizontalLines.asInstanceOf[js.Any], drawVertical = drawVertical.asInstanceOf[js.Any], gutterHeight = gutterHeight.asInstanceOf[js.Any], gutterWidth = gutterWidth.asInstanceOf[js.Any], guttersOutside = guttersOutside.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], numberOfColumns = numberOfColumns.asInstanceOf[js.Any], rowHeightMultiplication = rowHeightMultiplication.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchapp.SketchMSLayoutGrid]
  }
  
  @scala.inline
  def SketchMSLayoutSimpleGrid(_class: simpleGrid, gridSize: Double, isEnabled: Double, thickGridTimes: Double): typings.sketchapp.SketchMSLayoutSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sketchapp.SketchMSLayoutSimpleGrid]
  }
}
