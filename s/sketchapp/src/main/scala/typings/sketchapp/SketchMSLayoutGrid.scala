package typings.sketchapp

import typings.sketchapp.sketchappStrings.layoutGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSLayoutGrid extends SketchMSLayout {
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
}

