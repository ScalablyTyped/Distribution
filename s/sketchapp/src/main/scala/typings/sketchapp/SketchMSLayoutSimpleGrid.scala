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
    val __obj = js.Dynamic.literal(_class = _class, gridSize = gridSize, isEnabled = isEnabled, thickGridTimes = thickGridTimes)
  
    __obj.asInstanceOf[SketchMSLayoutSimpleGrid]
  }
}

