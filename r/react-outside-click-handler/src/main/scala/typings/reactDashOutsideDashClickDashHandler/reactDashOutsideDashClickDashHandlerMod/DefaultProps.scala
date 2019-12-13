package typings.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerMod

import typings.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerStrings.`inline-block`
import typings.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerStrings.`inline`
import typings.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerStrings.block
import typings.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerStrings.contents
import typings.reactDashOutsideDashClickDashHandler.reactDashOutsideDashClickDashHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps extends js.Object {
  var disabled: Boolean
  var display: block | flex | `inline` | `inline-block` | contents
  var useCapture: Boolean
}

object DefaultProps {
  @scala.inline
  def apply(
    disabled: Boolean,
    display: block | flex | `inline` | `inline-block` | contents,
    useCapture: Boolean
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultProps]
  }
}

