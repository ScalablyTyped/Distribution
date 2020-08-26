package typings.storybookAddonBackgrounds.gridSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundGridParameters extends js.Object {
  var cellSize: Double = js.native
}

object BackgroundGridParameters {
  @scala.inline
  def apply(cellSize: Double): BackgroundGridParameters = {
    val __obj = js.Dynamic.literal(cellSize = cellSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundGridParameters]
  }
  @scala.inline
  implicit class BackgroundGridParametersOps[Self <: BackgroundGridParameters] (val x: Self) extends AnyVal {
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
    def setCellSize(value: Double): Self = this.set("cellSize", value.asInstanceOf[js.Any])
  }
  
}

