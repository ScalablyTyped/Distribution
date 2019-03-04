package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSLayoutGrid extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.layoutGrid
  var columnWidth: scala.Double
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var drawHorizontal: scala.Double
  var drawHorizontalLines: scala.Double
  var drawVertical: scala.Double
  var gutterHeight: scala.Double
  var gutterWidth: scala.Double
  var guttersOutside: scala.Double
  var horizontalOffset: scala.Double
  var isEnabled: scala.Double
  var numberOfColumns: scala.Double
  var objectID: java.lang.String
  var rowHeightMultiplication: scala.Double
  var totalWidth: scala.Double
}

object SketchMSLayoutGrid {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.layoutGrid,
    columnWidth: scala.Double,
    drawHorizontal: scala.Double,
    drawHorizontalLines: scala.Double,
    drawVertical: scala.Double,
    gutterHeight: scala.Double,
    gutterWidth: scala.Double,
    guttersOutside: scala.Double,
    horizontalOffset: scala.Double,
    isEnabled: scala.Double,
    numberOfColumns: scala.Double,
    objectID: java.lang.String,
    rowHeightMultiplication: scala.Double,
    totalWidth: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSLayoutGrid = {
    val __obj = js.Dynamic.literal(_class = _class, columnWidth = columnWidth, drawHorizontal = drawHorizontal, drawHorizontalLines = drawHorizontalLines, drawVertical = drawVertical, gutterHeight = gutterHeight, gutterWidth = gutterWidth, guttersOutside = guttersOutside, horizontalOffset = horizontalOffset, isEnabled = isEnabled, numberOfColumns = numberOfColumns, objectID = objectID, rowHeightMultiplication = rowHeightMultiplication, totalWidth = totalWidth)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSLayoutGrid]
  }
}

