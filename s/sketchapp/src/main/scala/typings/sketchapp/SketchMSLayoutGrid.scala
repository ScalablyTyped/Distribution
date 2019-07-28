package typings.sketchapp

import typings.sketchapp.sketchappStrings.layoutGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSLayoutGrid extends js.Object {
  var _class: layoutGrid
  var columnWidth: Double
  var do_objectID: js.UndefOr[String] = js.undefined
  var drawHorizontal: Double
  var drawHorizontalLines: Double
  var drawVertical: Double
  var gutterHeight: Double
  var gutterWidth: Double
  var guttersOutside: Double
  var horizontalOffset: Double
  var isEnabled: Double
  var numberOfColumns: Double
  var objectID: String
  var rowHeightMultiplication: Double
  var totalWidth: Double
}

object SketchMSLayoutGrid {
  @scala.inline
  def apply(
    _class: layoutGrid,
    columnWidth: Double,
    drawHorizontal: Double,
    drawHorizontalLines: Double,
    drawVertical: Double,
    gutterHeight: Double,
    gutterWidth: Double,
    guttersOutside: Double,
    horizontalOffset: Double,
    isEnabled: Double,
    numberOfColumns: Double,
    objectID: String,
    rowHeightMultiplication: Double,
    totalWidth: Double,
    do_objectID: String = null
  ): SketchMSLayoutGrid = {
    val __obj = js.Dynamic.literal(_class = _class, columnWidth = columnWidth, drawHorizontal = drawHorizontal, drawHorizontalLines = drawHorizontalLines, drawVertical = drawVertical, gutterHeight = gutterHeight, gutterWidth = gutterWidth, guttersOutside = guttersOutside, horizontalOffset = horizontalOffset, isEnabled = isEnabled, numberOfColumns = numberOfColumns, objectID = objectID, rowHeightMultiplication = rowHeightMultiplication, totalWidth = totalWidth)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSLayoutGrid]
  }
}

