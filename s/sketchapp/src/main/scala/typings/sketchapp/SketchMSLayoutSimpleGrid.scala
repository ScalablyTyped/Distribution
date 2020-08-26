package typings.sketchapp

import typings.sketchapp.sketchappStrings.simpleGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSLayoutSimpleGrid extends SketchMSLayout {
  var _class: simpleGrid = js.native
  var gridSize: Double = js.native
  var isEnabled: Double = js.native
  var thickGridTimes: Double = js.native
}

object SketchMSLayoutSimpleGrid {
  @scala.inline
  def apply(_class: simpleGrid, gridSize: Double, isEnabled: Double, thickGridTimes: Double): SketchMSLayoutSimpleGrid = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], gridSize = gridSize.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], thickGridTimes = thickGridTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayoutSimpleGrid]
  }
  @scala.inline
  implicit class SketchMSLayoutSimpleGridOps[Self <: SketchMSLayoutSimpleGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_class(value: simpleGrid): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridSize(value: Double): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Double): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setThickGridTimes(value: Double): Self = this.set("thickGridTimes", value.asInstanceOf[js.Any])
  }
  
}

