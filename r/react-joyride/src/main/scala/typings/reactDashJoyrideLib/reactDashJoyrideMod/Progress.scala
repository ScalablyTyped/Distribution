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
    val __obj = js.Dynamic.literal(index = index, percentageComplete = percentageComplete, step = step)
  
    __obj.asInstanceOf[Progress]
  }
}

