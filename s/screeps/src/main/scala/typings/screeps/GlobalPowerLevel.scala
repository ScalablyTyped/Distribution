package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalPowerLevel extends js.Object {
  /**
    * The current level.
    */
  var level: Double
  /**
    * The current progress to the next level.
    */
  var progress: Double
  /**
    * The progress required to reach the next level.
    */
  var progressTotal: Double
}

object GlobalPowerLevel {
  @scala.inline
  def apply(level: Double, progress: Double, progressTotal: Double): GlobalPowerLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalPowerLevel]
  }
}

