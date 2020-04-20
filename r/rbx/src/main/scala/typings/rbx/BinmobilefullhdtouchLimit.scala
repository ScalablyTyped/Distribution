package typings.rbx

import typings.rbx.responsiveMod.LimitedResponsiveBreakpointProps
import typings.rbx.responsiveMod.ResponsiveBreakpointProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ B in 'mobile' | 'fullhd' | 'touch' ]:? rbx.rbx/base/helpers/responsive.LimitedResponsiveBreakpointProps} & {[ B in std.Exclude<'mobile' | 'tablet' | 'desktop' | 'widescreen' | 'fullhd' | 'touch', 'mobile' | 'fullhd' | 'touch'> ]:? rbx.rbx/base/helpers/responsive.ResponsiveBreakpointProps} */
trait BinmobilefullhdtouchLimit extends js.Object {
  var desktop: js.UndefOr[ResponsiveBreakpointProps] = js.undefined
  var fullhd: js.UndefOr[LimitedResponsiveBreakpointProps] = js.undefined
  var mobile: js.UndefOr[LimitedResponsiveBreakpointProps] = js.undefined
  var tablet: js.UndefOr[ResponsiveBreakpointProps] = js.undefined
  var touch: js.UndefOr[LimitedResponsiveBreakpointProps] = js.undefined
  var widescreen: js.UndefOr[ResponsiveBreakpointProps] = js.undefined
}

object BinmobilefullhdtouchLimit {
  @scala.inline
  def apply(
    desktop: ResponsiveBreakpointProps = null,
    fullhd: LimitedResponsiveBreakpointProps = null,
    mobile: LimitedResponsiveBreakpointProps = null,
    tablet: ResponsiveBreakpointProps = null,
    touch: LimitedResponsiveBreakpointProps = null,
    widescreen: ResponsiveBreakpointProps = null
  ): BinmobilefullhdtouchLimit = {
    val __obj = js.Dynamic.literal()
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinmobilefullhdtouchLimit]
  }
}

