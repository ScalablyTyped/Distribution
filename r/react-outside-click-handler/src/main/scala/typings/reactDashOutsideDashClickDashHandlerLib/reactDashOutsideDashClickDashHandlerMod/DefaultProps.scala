package typings
package reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps extends js.Object {
  var disabled: scala.Boolean
  var display: reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerLibStrings.block | reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerLibStrings.flex | reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerLibStrings.`inline-block`
  var useCapture: scala.Boolean
}

object DefaultProps {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    display: reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerLibStrings.block | reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerLibStrings.flex | reactDashOutsideDashClickDashHandlerLib.reactDashOutsideDashClickDashHandlerLibStrings.`inline-block`,
    useCapture: scala.Boolean
  ): DefaultProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.updateDynamic("useCapture")(useCapture)
    __obj.asInstanceOf[DefaultProps]
  }
}

