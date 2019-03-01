package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var index: scala.Double
  var percentageComplete: scala.Double
  var step: Step
}

object Progress {
  @scala.inline
  def apply(index: scala.Double, percentageComplete: scala.Double, step: Step): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("percentageComplete")(percentageComplete)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[Progress]
  }
}

