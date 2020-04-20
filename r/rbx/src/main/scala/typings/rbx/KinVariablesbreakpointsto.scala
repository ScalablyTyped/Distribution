package typings.rbx

import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in rbx.rbx/base/helpers/variables.Variables['breakpoints'] ]:? 'top' | 'right' | 'bottom' | 'left'} */
trait KinVariablesbreakpointsto extends js.Object {
  var desktop: js.UndefOr[top | right | bottom | left] = js.undefined
  var fullhd: js.UndefOr[top | right | bottom | left] = js.undefined
  var mobile: js.UndefOr[top | right | bottom | left] = js.undefined
  var tablet: js.UndefOr[top | right | bottom | left] = js.undefined
  var touch: js.UndefOr[top | right | bottom | left] = js.undefined
  var widescreen: js.UndefOr[top | right | bottom | left] = js.undefined
}

object KinVariablesbreakpointsto {
  @scala.inline
  def apply(
    desktop: top | right | bottom | left = null,
    fullhd: top | right | bottom | left = null,
    mobile: top | right | bottom | left = null,
    tablet: top | right | bottom | left = null,
    touch: top | right | bottom | left = null,
    widescreen: top | right | bottom | left = null
  ): KinVariablesbreakpointsto = {
    val __obj = js.Dynamic.literal()
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinVariablesbreakpointsto]
  }
}

