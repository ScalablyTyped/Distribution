package typings
package reactDashNativeDashTabDashNavigatorLib.reactDashNativeDashTabDashNavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabNavigatorItemProps extends js.Object {
  /**
    * Allow font scaling for title
    */
  var allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text for Item badge
    */
  var badgeText: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * onPress method for Item
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Returns Item badge
    */
  var renderBadge: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Returns Item icon
    */
  var renderIcon: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Returns selected Item icon
    */
  var renderSelectedIcon: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Return whether the item is selected
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Styling for selected Item title
    */
  var selectedTitleStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
  /**
    * Styling for tab
    */
  var tabStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * Item title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styling for Item title
    */
  var titleStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
}

object TabNavigatorItemProps {
  @scala.inline
  def apply(
    allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    badgeText: java.lang.String | scala.Double = null,
    onPress: () => scala.Unit = null,
    renderBadge: () => reactLib.reactMod.Global.JSXNs.Element = null,
    renderIcon: () => reactLib.reactMod.Global.JSXNs.Element = null,
    renderSelectedIcon: () => reactLib.reactMod.Global.JSXNs.Element = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedTitleStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    title: java.lang.String = null,
    titleStyle: reactDashNativeLib.reactDashNativeMod.TextStyle = null
  ): TabNavigatorItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (badgeText != null) __obj.updateDynamic("badgeText")(badgeText.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (renderBadge != null) __obj.updateDynamic("renderBadge")(js.Any.fromFunction0(renderBadge))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction0(renderIcon))
    if (renderSelectedIcon != null) __obj.updateDynamic("renderSelectedIcon")(js.Any.fromFunction0(renderSelectedIcon))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedTitleStyle != null) __obj.updateDynamic("selectedTitleStyle")(selectedTitleStyle)
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.asInstanceOf[TabNavigatorItemProps]
  }
}

