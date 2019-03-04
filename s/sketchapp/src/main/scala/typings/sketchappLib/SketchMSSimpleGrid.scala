package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSimpleGrid extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.simpleGrid
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var gridSize: scala.Double
  var isEnabled: scala.Double
  var objectID: java.lang.String
  var thickGridTimes: scala.Double
}

object SketchMSSimpleGrid {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.simpleGrid,
    gridSize: scala.Double,
    isEnabled: scala.Double,
    objectID: java.lang.String,
    thickGridTimes: scala.Double,
    do_objectID: java.lang.String = null
  ): SketchMSSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = _class, gridSize = gridSize, isEnabled = isEnabled, objectID = objectID, thickGridTimes = thickGridTimes)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSimpleGrid]
  }
}

