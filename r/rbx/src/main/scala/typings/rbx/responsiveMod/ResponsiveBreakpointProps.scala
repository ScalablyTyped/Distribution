package typings.rbx.responsiveMod

import typings.rbx.anon.Only
import typings.rbx.anon.OnlyBoolean
import typings.rbx.anon.OnlyBooleanValue
import typings.rbx.anon.OnlyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveBreakpointProps extends js.Object {
  var display: js.UndefOr[Only] = js.undefined
  var hide: js.UndefOr[OnlyValue] = js.undefined
  var textAlign: js.UndefOr[OnlyBoolean] = js.undefined
  var textSize: js.UndefOr[OnlyBooleanValue] = js.undefined
}

object ResponsiveBreakpointProps {
  @scala.inline
  def apply(
    display: Only = null,
    hide: OnlyValue = null,
    textAlign: OnlyBoolean = null,
    textSize: OnlyBooleanValue = null
  ): ResponsiveBreakpointProps = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveBreakpointProps]
  }
}

