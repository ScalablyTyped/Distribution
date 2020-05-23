package typings.rbx.tileMod

import typings.rbx.anon.BinVariablesbreakpointsLi
import typings.rbx.anon.KinVariablesbreakpointsto
import typings.rbx.rbxNumbers.`10`
import typings.rbx.rbxNumbers.`11`
import typings.rbx.rbxNumbers.`12`
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxNumbers.`8`
import typings.rbx.rbxNumbers.`9`
import typings.rbx.rbxStrings.`black-bis`
import typings.rbx.rbxStrings.`black-ter`
import typings.rbx.rbxStrings.`grey-dark`
import typings.rbx.rbxStrings.`grey-darker`
import typings.rbx.rbxStrings.`grey-light`
import typings.rbx.rbxStrings.`grey-lighter`
import typings.rbx.rbxStrings.`white-bis`
import typings.rbx.rbxStrings.`white-ter`
import typings.rbx.rbxStrings.ancestor
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.bold
import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.capitalized
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.child
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.grey
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.lowercase
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.parent
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.semibold
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.top
import typings.rbx.rbxStrings.uppercase
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/base/helpers.HelpersProps & rbx.rbx/grid/tiles/tile.TileModifierProps */
trait TileProps extends js.Object {
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
  var className: js.UndefOr[String] = js.undefined
  var clearfix: js.UndefOr[Boolean] = js.undefined
  var clipped: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var invisible: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[ancestor | parent | child] = js.undefined
  var marginless: js.UndefOr[Boolean] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
  var paddingless: js.UndefOr[Boolean] = js.undefined
  var pull: js.UndefOr[left | right] = js.undefined
  var radiusless: js.UndefOr[Boolean] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.undefined
  var shadowless: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`] = js.undefined
  var srOnly: js.UndefOr[Boolean] = js.undefined
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
  var unselectable: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object TileProps {
  @scala.inline
  def apply(
    backgroundColor: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis` = null,
    badge: Double | String = null,
    badgeColor: primary | success | info | warning | danger | light | dark | white | black | link = null,
    badgeOutlined: js.UndefOr[Boolean] = js.undefined,
    badgeRounded: js.UndefOr[Boolean] = js.undefined,
    badgeSize: small | medium | large = null,
    className: String = null,
    clearfix: js.UndefOr[Boolean] = js.undefined,
    clipped: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    kind: ancestor | parent | child = null,
    marginless: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    paddingless: js.UndefOr[Boolean] = js.undefined,
    pull: left | right = null,
    radiusless: js.UndefOr[Boolean] = js.undefined,
    relative: js.UndefOr[Boolean] = js.undefined,
    responsive: BinVariablesbreakpointsLi = null,
    shadowless: js.UndefOr[Boolean] = js.undefined,
    size: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` = null,
    srOnly: js.UndefOr[Boolean] = js.undefined,
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
    unselectable: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): TileProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeOutlined)) __obj.updateDynamic("badgeOutlined")(badgeOutlined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeRounded)) __obj.updateDynamic("badgeRounded")(badgeRounded.get.asInstanceOf[js.Any])
    if (badgeSize != null) __obj.updateDynamic("badgeSize")(badgeSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(marginless)) __obj.updateDynamic("marginless")(marginless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingless)) __obj.updateDynamic("paddingless")(paddingless.get.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusless)) __obj.updateDynamic("radiusless")(radiusless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowless)) __obj.updateDynamic("shadowless")(shadowless.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (textWeight != null) __obj.updateDynamic("textWeight")(textWeight.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipActive)) __obj.updateDynamic("tooltipActive")(tooltipActive.get.asInstanceOf[js.Any])
    if (tooltipColor != null) __obj.updateDynamic("tooltipColor")(tooltipColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipMultiline)) __obj.updateDynamic("tooltipMultiline")(tooltipMultiline.get.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    if (tooltipResponsive != null) __obj.updateDynamic("tooltipResponsive")(tooltipResponsive.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileProps]
  }
}

