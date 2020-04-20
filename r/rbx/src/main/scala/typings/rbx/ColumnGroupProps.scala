package typings.rbx

import typings.rbx.columnGroupMod.ColumnGroupBreakpointOptions
import typings.rbx.rbxNumbers.`0`
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxNumbers.`8`
import typings.rbx.rbxStrings.`black-bis`
import typings.rbx.rbxStrings.`black-ter`
import typings.rbx.rbxStrings.`grey-dark`
import typings.rbx.rbxStrings.`grey-darker`
import typings.rbx.rbxStrings.`grey-light`
import typings.rbx.rbxStrings.`grey-lighter`
import typings.rbx.rbxStrings.`white-bis`
import typings.rbx.rbxStrings.`white-ter`
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.bold
import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.capitalized
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.desktop
import typings.rbx.rbxStrings.fullhd
import typings.rbx.rbxStrings.grey
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.lowercase
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.mobile
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.semibold
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.tablet
import typings.rbx.rbxStrings.top
import typings.rbx.rbxStrings.touch
import typings.rbx.rbxStrings.uppercase
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import typings.rbx.rbxStrings.widescreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/grid/columns/column-group.ColumnGroupProps */
trait ColumnGroupProps extends js.Object {
  var backgroundColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.undefined
  var badge: js.UndefOr[Double | String] = js.undefined
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var badgeOutlined: js.UndefOr[Boolean] = js.undefined
  var badgeRounded: js.UndefOr[Boolean] = js.undefined
  var badgeSize: js.UndefOr[small | medium | large] = js.undefined
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearfix: js.UndefOr[Boolean] = js.undefined
  var clipped: js.UndefOr[Boolean] = js.undefined
  var desktop: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var fullhd: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  var gapless: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var invisible: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var marginless: js.UndefOr[Boolean] = js.undefined
  var mobile: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
  var paddingless: js.UndefOr[Boolean] = js.undefined
  var pull: js.UndefOr[left | right] = js.undefined
  var radiusless: js.UndefOr[Boolean] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.undefined
  var shadowless: js.UndefOr[Boolean] = js.undefined
  var srOnly: js.UndefOr[Boolean] = js.undefined
  var tablet: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var textAlign: js.UndefOr[centered | justified | left | right] = js.undefined
  var textColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.undefined
  var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.undefined
  var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.undefined
  var tooltip: js.UndefOr[Double | String] = js.undefined
  var tooltipActive: js.UndefOr[Boolean] = js.undefined
  var tooltipColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var tooltipMultiline: js.UndefOr[Boolean] = js.undefined
  var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.undefined
  var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsto] = js.undefined
  var touch: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var unselectable: js.UndefOr[Boolean] = js.undefined
  var vcentered: js.UndefOr[Boolean] = js.undefined
  var widescreen: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
}

object ColumnGroupProps {
  @scala.inline
  def apply(
    backgroundColor: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis` = null,
    badge: Double | String = null,
    badgeColor: primary | success | info | warning | danger | light | dark | white | black | link = null,
    badgeOutlined: js.UndefOr[Boolean] = js.undefined,
    badgeRounded: js.UndefOr[Boolean] = js.undefined,
    badgeSize: small | medium | large = null,
    breakpoint: mobile | tablet | desktop | widescreen | fullhd | touch = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearfix: js.UndefOr[Boolean] = js.undefined,
    clipped: js.UndefOr[Boolean] = js.undefined,
    desktop: ColumnGroupBreakpointOptions = null,
    fullhd: ColumnGroupBreakpointOptions = null,
    gapSize: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = null,
    gapless: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    marginless: js.UndefOr[Boolean] = js.undefined,
    mobile: ColumnGroupBreakpointOptions = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    paddingless: js.UndefOr[Boolean] = js.undefined,
    pull: left | right = null,
    radiusless: js.UndefOr[Boolean] = js.undefined,
    relative: js.UndefOr[Boolean] = js.undefined,
    responsive: BinVariablesbreakpointsLi = null,
    shadowless: js.UndefOr[Boolean] = js.undefined,
    srOnly: js.UndefOr[Boolean] = js.undefined,
    tablet: ColumnGroupBreakpointOptions = null,
    textAlign: centered | justified | left | right = null,
    textColor: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis` = null,
    textSize: `1` | `2` | `3` | `4` | `5` | `6` | `7` = null,
    textTransform: capitalized | lowercase | uppercase = null,
    textWeight: light | medium | normal | semibold | bold = null,
    tooltip: Double | String = null,
    tooltipActive: js.UndefOr[Boolean] = js.undefined,
    tooltipColor: primary | success | info | warning | danger | light | dark | white | black | link = null,
    tooltipMultiline: js.UndefOr[Boolean] = js.undefined,
    tooltipPosition: top | right | bottom | left = null,
    tooltipResponsive: KinVariablesbreakpointsto = null,
    touch: ColumnGroupBreakpointOptions = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    vcentered: js.UndefOr[Boolean] = js.undefined,
    widescreen: ColumnGroupBreakpointOptions = null
  ): ColumnGroupProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeOutlined)) __obj.updateDynamic("badgeOutlined")(badgeOutlined.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeRounded)) __obj.updateDynamic("badgeRounded")(badgeRounded.asInstanceOf[js.Any])
    if (badgeSize != null) __obj.updateDynamic("badgeSize")(badgeSize.asInstanceOf[js.Any])
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(gapless)) __obj.updateDynamic("gapless")(gapless.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (!js.isUndefined(marginless)) __obj.updateDynamic("marginless")(marginless.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingless)) __obj.updateDynamic("paddingless")(paddingless.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusless)) __obj.updateDynamic("radiusless")(radiusless.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowless)) __obj.updateDynamic("shadowless")(shadowless.asInstanceOf[js.Any])
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (textWeight != null) __obj.updateDynamic("textWeight")(textWeight.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipActive)) __obj.updateDynamic("tooltipActive")(tooltipActive.asInstanceOf[js.Any])
    if (tooltipColor != null) __obj.updateDynamic("tooltipColor")(tooltipColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipMultiline)) __obj.updateDynamic("tooltipMultiline")(tooltipMultiline.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    if (tooltipResponsive != null) __obj.updateDynamic("tooltipResponsive")(tooltipResponsive.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(vcentered)) __obj.updateDynamic("vcentered")(vcentered.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps]
  }
}

