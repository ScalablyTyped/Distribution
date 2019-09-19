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
    val __obj = js.Dynamic.literal(_class = _class, columnWidth = columnWidth, drawHorizontal = drawHorizontal, drawHorizontalLines = drawHorizontalLines, drawVertical = drawVertical, gutterHeight = gutterHeight, gutterWidth = gutterWidth, guttersOutside = guttersOutside, horizontalOffset = horizontalOffset, isEnabled = isEnabled, numberOfColumns = numberOfColumns, rowHeightMultiplication = rowHeightMultiplication, totalWidth = totalWidth)
  
    __obj.asInstanceOf[SketchMSLayoutGrid]
  }
}

