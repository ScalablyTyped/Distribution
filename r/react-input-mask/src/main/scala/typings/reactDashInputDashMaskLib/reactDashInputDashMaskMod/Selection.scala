package typings
package reactDashInputDashMaskLib.reactDashInputDashMaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  var end: scala.Double
  var start: scala.Double
}

object Selection {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): Selection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Selection]
  }
}

