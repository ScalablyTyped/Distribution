package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureParams extends js.Object {
  var cellCount: Double = js.native
  var estimatedCellSize: Double = js.native
}

object ConfigureParams {
  @scala.inline
  def apply(cellCount: Double, estimatedCellSize: Double): ConfigureParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], estimatedCellSize = estimatedCellSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureParams]
  }
  @scala.inline
  implicit class ConfigureParamsOps[Self <: ConfigureParams] (val x: Self) extends AnyVal {
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
    def setCellCount(value: Double): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setEstimatedCellSize(value: Double): Self = this.set("estimatedCellSize", value.asInstanceOf[js.Any])
  }
  
}

