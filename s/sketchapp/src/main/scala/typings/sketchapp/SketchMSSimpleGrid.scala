package typings.sketchapp

import typings.sketchapp.sketchappStrings.simpleGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSSimpleGrid extends js.Object {
  var _class: simpleGrid
  var do_objectID: js.UndefOr[String] = js.undefined
  var gridSize: Double
  var isEnabled: Double
  var objectID: String
  var thickGridTimes: Double
}

object SketchMSSimpleGrid {
  @scala.inline
  def apply(
    _class: simpleGrid,
    gridSize: Double,
    isEnabled: Double,
    objectID: String,
    thickGridTimes: Double,
    do_objectID: String = null
  ): SketchMSSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = _class, gridSize = gridSize, isEnabled = isEnabled, objectID = objectID, thickGridTimes = thickGridTimes)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSSimpleGrid]
  }
}

