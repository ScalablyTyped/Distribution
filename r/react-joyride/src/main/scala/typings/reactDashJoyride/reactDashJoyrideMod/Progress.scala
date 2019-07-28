package typings.reactDashJoyride.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var index: Double
  var percentageComplete: Double
  var step: Step
}

object Progress {
  @scala.inline
  def apply(index: Double, percentageComplete: Double, step: Step): Progress = {
    val __obj = js.Dynamic.literal(index = index, percentageComplete = percentageComplete, step = step)
  
    __obj.asInstanceOf[Progress]
  }
}

