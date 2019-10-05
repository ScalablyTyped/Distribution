package typings.reactDashNativeDashTabDashNavigator.reactDashNativeDashTabDashNavigatorMod

import typings.react.reactMod.Global.JSX.Element
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabNavigatorItemProps extends js.Object {
  /**
    * Allow font scaling for title
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Text for Item badge
    */
  var badgeText: js.UndefOr[String | Double] = js.undefined
  /**
    * onPress method for Item
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Returns Item badge
    */
  var renderBadge: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Returns Item icon
    */
  var renderIcon: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Returns selected Item icon
    */
  var renderSelectedIcon: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Return whether the item is selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * Styling for selected Item title
    */
  var selectedTitleStyle: js.UndefOr[TextStyle] = js.undefined
  /**
    * Styling for tab
    */
  var tabStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Item title
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Styling for Item title
    */
  var titleStyle: js.UndefOr[TextStyle] = js.undefined
}

object TabNavigatorItemProps {
  @scala.inline
  def apply(
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    badgeText: String | Double = null,
    onPress: () => Unit = null,
    renderBadge: () => Element = null,
    renderIcon: () => Element = null,
    renderSelectedIcon: () => Element = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedTitleStyle: TextStyle = null,
    tabStyle: ViewStyle = null,
    title: String = null,
    titleStyle: TextStyle = null
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

