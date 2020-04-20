package typings.rbx.responsiveMod

import typings.rbx.Anon3
import typings.rbx.Anon4
import typings.rbx.AnonValue
import typings.rbx.AnonValueBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitedResponsiveBreakpointProps extends js.Object {
  var display: js.UndefOr[AnonValue] = js.undefined
  var hide: js.UndefOr[AnonValueBoolean] = js.undefined
  var textAlign: js.UndefOr[Anon3] = js.undefined
  var textSize: js.UndefOr[Anon4] = js.undefined
}

object LimitedResponsiveBreakpointProps {
  @scala.inline
  def apply(
    display: AnonValue = null,
    hide: AnonValueBoolean = null,
    textAlign: Anon3 = null,
    textSize: Anon4 = null
  ): LimitedResponsiveBreakpointProps = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitedResponsiveBreakpointProps]
  }
}

