package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalControlLevel extends js.Object {
  /**
    * The current level.
    */
  var level: scala.Double
  /**
    * The current progress to the next level.
    */
  var progress: scala.Double
  /**
    * The progress required to reach the next level.
    */
  var progressTotal: scala.Double
}

object GlobalControlLevel {
  @scala.inline
  def apply(level: scala.Double, progress: scala.Double, progressTotal: scala.Double): GlobalControlLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("progressTotal")(progressTotal)
    __obj.asInstanceOf[GlobalControlLevel]
  }
}

