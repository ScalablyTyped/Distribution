package typings
package reactDashMdLib.libListsListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseListItemProps extends js.Object {
  var `aria-posinset`: js.UndefOr[scala.Double] = js.undefined
  var `aria-setsize`: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var leftAvatar: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var primaryText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var rightAvatar: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var secondaryText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var threeLines: js.UndefOr[scala.Boolean] = js.undefined
  var tileClassName: js.UndefOr[java.lang.String] = js.undefined
  var tileStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object BaseListItemProps {
  @scala.inline
  def apply(
    `aria-posinset`: scala.Int | scala.Double = null,
    `aria-setsize`: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    leftAvatar: reactLib.reactMod.ReactNode = null,
    leftIcon: reactLib.reactMod.ReactNode = null,
    primaryText: reactLib.reactMod.ReactNode = null,
    rightAvatar: reactLib.reactMod.ReactNode = null,
    rightIcon: reactLib.reactMod.ReactNode = null,
    secondaryText: reactLib.reactMod.ReactNode = null,
    threeLines: js.UndefOr[scala.Boolean] = js.undefined,
    tileClassName: java.lang.String = null,
    tileStyle: reactLib.reactMod.CSSProperties = null
  ): BaseListItemProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (rightAvatar != null) __obj.updateDynamic("rightAvatar")(rightAvatar.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(threeLines)) __obj.updateDynamic("threeLines")(threeLines)
    if (tileClassName != null) __obj.updateDynamic("tileClassName")(tileClassName)
    if (tileStyle != null) __obj.updateDynamic("tileStyle")(tileStyle)
    __obj.asInstanceOf[BaseListItemProps]
  }
}

