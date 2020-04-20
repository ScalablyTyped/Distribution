package typings.rbx

import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in rbx.rbx/base/helpers/variables.Variables['breakpoints'] ]:? {  colors  :['primary', 'success', 'info', 'warning', 'danger', 'light', 'dark', 'white', 'black', 'link'],   shades  :['black-bis', 'black-ter', 'grey-darker', 'grey-dark', 'grey', 'grey-light', 'grey-lighter', 'white-ter', 'white-bis'],   badgeSizes  :['small', 'medium', 'large'],   floatPulledAlignments  :['left', 'right'],   breakpoints  :['mobile', 'tablet', 'desktop', 'widescreen', 'fullhd', 'touch'],   breakpointsLimited  :['mobile', 'fullhd', 'touch'],   tooltipPositions  :['top', 'right', 'bottom', 'left'],   textAlignments  :['centered', 'justified', 'left', 'right'],   textSizes  :[1, 2, 3, 4, 5, 6, 7],   textTransforms  :['capitalized', 'lowercase', 'uppercase'],   textWeights  :['light', 'medium', 'normal', 'semibold', 'bold'],   displays  :['block', 'flex', 'inline', 'inline-block', 'inline-flex']}['tooltipPositions'][number]} */
trait KinVariablesbreakpointsco extends js.Object {
  var desktop: js.UndefOr[top | right | bottom | left] = js.undefined
  var fullhd: js.UndefOr[top | right | bottom | left] = js.undefined
  var mobile: js.UndefOr[top | right | bottom | left] = js.undefined
  var tablet: js.UndefOr[top | right | bottom | left] = js.undefined
  var touch: js.UndefOr[top | right | bottom | left] = js.undefined
  var widescreen: js.UndefOr[top | right | bottom | left] = js.undefined
}

object KinVariablesbreakpointsco {
  @scala.inline
  def apply(
    desktop: top | right | bottom | left = null,
    fullhd: top | right | bottom | left = null,
    mobile: top | right | bottom | left = null,
    tablet: top | right | bottom | left = null,
    touch: top | right | bottom | left = null,
    widescreen: top | right | bottom | left = null
  ): KinVariablesbreakpointsco = {
    val __obj = js.Dynamic.literal()
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinVariablesbreakpointsco]
  }
}

