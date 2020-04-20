package typings.sketchapp

import typings.sketchapp.sketchappStrings.simpleGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSLayoutSimpleGrid extends SketchMSLayout {
  var _class: simpleGrid
  var gridSize: Double
  var isEnabled: Double
  var thickGridTimes: Double
}

object SketchMSLayoutSimpleGrid {
  @scala.inline
  def apply(_class: simpleGrid, gridSize: Double, isEnabled: Double, thickGridTimes: Double): SketchMSLayoutSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutSimpleGrid]
  }
}

