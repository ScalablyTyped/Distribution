package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalPowerLevel extends js.Object {
  /**
    * The current level.
    */
  var level: Double = js.native
  /**
    * The current progress to the next level.
    */
  var progress: Double = js.native
  /**
    * The progress required to reach the next level.
    */
  var progressTotal: Double = js.native
}

object GlobalPowerLevel {
  @scala.inline
  def apply(level: Double, progress: Double, progressTotal: Double): GlobalPowerLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalPowerLevel]
  }
  @scala.inline
  implicit class GlobalPowerLevelOps[Self <: GlobalPowerLevel] (val x: Self) extends AnyVal {
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgressTotal(value: Double): Self = this.set("progressTotal", value.asInstanceOf[js.Any])
  }
  
}

