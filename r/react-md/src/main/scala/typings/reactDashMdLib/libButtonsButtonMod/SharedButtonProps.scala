package typings
package reactDashMdLib.libButtonsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedButtonProps extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  var forceIconFontSize: js.UndefOr[scala.Boolean] = js.undefined
  var forceIconSize: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[scala.Boolean] = js.undefined
  var iconBefore: js.UndefOr[scala.Boolean] = js.undefined
  var iconChildren: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var iconEl: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  /**
    * @deprecated
    */
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  var svg: js.UndefOr[scala.Boolean] = js.undefined
  var swapTheming: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[ButtonTypes] = js.undefined
}

object SharedButtonProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    forceIconFontSize: js.UndefOr[scala.Boolean] = js.undefined,
    forceIconSize: scala.Boolean | scala.Double = null,
    href: java.lang.String = null,
    icon: js.UndefOr[scala.Boolean] = js.undefined,
    iconBefore: js.UndefOr[scala.Boolean] = js.undefined,
    iconChildren: reactLib.reactMod.ReactNode = null,
    iconClassName: java.lang.String = null,
    iconEl: reactLib.reactMod.ReactElement[_] = null,
    label: reactLib.reactMod.ReactNode = null,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    raised: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    svg: js.UndefOr[scala.Boolean] = js.undefined,
    swapTheming: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null,
    `type`: ButtonTypes = null
  ): SharedButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(forceIconFontSize)) __obj.updateDynamic("forceIconFontSize")(forceIconFontSize)
    if (forceIconSize != null) __obj.updateDynamic("forceIconSize")(forceIconSize.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(iconBefore)) __obj.updateDynamic("iconBefore")(iconBefore)
    if (iconChildren != null) __obj.updateDynamic("iconChildren")(iconChildren.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconEl != null) __obj.updateDynamic("iconEl")(iconEl)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg)
    if (!js.isUndefined(swapTheming)) __obj.updateDynamic("swapTheming")(swapTheming)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SharedButtonProps]
  }
}

