package typings.rbx.responsiveMod

import typings.rbx.anon.Value
import typings.rbx.anon.ValueBoolean
import typings.rbx.anon.`3`
import typings.rbx.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitedResponsiveBreakpointProps extends js.Object {
  var display: js.UndefOr[Value] = js.undefined
  var hide: js.UndefOr[ValueBoolean] = js.undefined
  var textAlign: js.UndefOr[`3`] = js.undefined
  var textSize: js.UndefOr[`4`] = js.undefined
}

object LimitedResponsiveBreakpointProps {
  @scala.inline
  def apply(display: Value = null, hide: ValueBoolean = null, textAlign: `3` = null, textSize: `4` = null): LimitedResponsiveBreakpointProps = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitedResponsiveBreakpointProps]
  }
}

