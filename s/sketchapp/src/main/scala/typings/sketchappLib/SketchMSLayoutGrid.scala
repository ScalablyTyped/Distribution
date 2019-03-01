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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("columnWidth")(columnWidth)
    __obj.updateDynamic("drawHorizontal")(drawHorizontal)
    __obj.updateDynamic("drawHorizontalLines")(drawHorizontalLines)
    __obj.updateDynamic("drawVertical")(drawVertical)
    __obj.updateDynamic("gutterHeight")(gutterHeight)
    __obj.updateDynamic("gutterWidth")(gutterWidth)
    __obj.updateDynamic("guttersOutside")(guttersOutside)
    __obj.updateDynamic("horizontalOffset")(horizontalOffset)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("numberOfColumns")(numberOfColumns)
    __obj.updateDynamic("objectID")(objectID)
    __obj.updateDynamic("rowHeightMultiplication")(rowHeightMultiplication)
    __obj.updateDynamic("totalWidth")(totalWidth)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSLayoutGrid]
  }
}

