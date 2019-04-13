package typings
package reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps extends js.Object {
  var arrowIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var arrowStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle]
  ] = js.undefined
  var authPropsPW: js.UndefOr[js.Object] = js.undefined
  var authPropsUser: js.UndefOr[js.Object] = js.undefined
  /**
    * Individual background color. Can be globally set in the parent. Will become Deprecated
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /* Gives opens to hide specific borders */
  var borderHide: js.UndefOr[
    reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListLibStrings.Top | reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListLibStrings.Bottom | reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListLibStrings.Both
  ] = js.undefined
  /**
    * Editable Right Side Style
    */
  var editableTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Enable or disable the > arrow at the end of the setting item.
    * Default: true
    */
  var hasNavArrow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable or disable a Switch component
    */
  var hasSwitch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Icon displayed on the left of the settings item
    */
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Allows for the item to become an auth item
    */
  var isAuth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Item Box Style
    */
  var itemBoxStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var itemRef: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Individual item width.  Can be globally set in the parent.  Will become deprecated
    */
  var itemWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Item on long press callback.
    */
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Item on press callback.
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Right side content
    */
  var rightSideContent: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Right Side Style
    */
  var rightSideStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * On value change callback
    */
  var switchOnValueChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Switch props
    */
  var switchProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Switch state
    */
  var switchState: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Title being displayed
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title Box Style
    */
  var titleBoxStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Right side information on the setting item
    */
  var titleInfo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If 'Bottom'; info is placed beneath the title
    */
  var titleInfoPosition: js.UndefOr[java.lang.String] = js.undefined
  var titleInfoStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Individual underlay click color.  Can be globally set in the parent.
    */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
}

object ItemProps {
  @scala.inline
  def apply(
    arrowIcon: reactLib.reactMod.ReactNode = null,
    arrowStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle] = null,
    authPropsPW: js.Object = null,
    authPropsUser: js.Object = null,
    backgroundColor: java.lang.String = null,
    borderHide: reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListLibStrings.Top | reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListLibStrings.Bottom | reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListLibStrings.Both = null,
    editableTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    hasNavArrow: js.UndefOr[scala.Boolean] = js.undefined,
    hasSwitch: js.UndefOr[scala.Boolean] = js.undefined,
    icon: reactLib.reactMod.ReactNode = null,
    isAuth: js.UndefOr[scala.Boolean] = js.undefined,
    itemBoxStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    itemRef: () => scala.Unit = null,
    itemWidth: scala.Int | scala.Double = null,
    onLongPress: () => scala.Unit = null,
    onPress: () => scala.Unit = null,
    rightSideContent: reactLib.reactMod.ReactNode = null,
    rightSideStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    switchOnValueChange: () => scala.Unit = null,
    switchProps: js.Object = null,
    switchState: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleBoxStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    titleInfo: java.lang.String = null,
    titleInfoPosition: java.lang.String = null,
    titleInfoStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    titleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    underlayColor: java.lang.String = null
  ): ItemProps = {
    val __obj = js.Dynamic.literal()
    if (arrowIcon != null) __obj.updateDynamic("arrowIcon")(arrowIcon.asInstanceOf[js.Any])
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (authPropsPW != null) __obj.updateDynamic("authPropsPW")(authPropsPW)
    if (authPropsUser != null) __obj.updateDynamic("authPropsUser")(authPropsUser)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderHide != null) __obj.updateDynamic("borderHide")(borderHide.asInstanceOf[js.Any])
    if (editableTextStyle != null) __obj.updateDynamic("editableTextStyle")(editableTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasNavArrow)) __obj.updateDynamic("hasNavArrow")(hasNavArrow)
    if (!js.isUndefined(hasSwitch)) __obj.updateDynamic("hasSwitch")(hasSwitch)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuth)) __obj.updateDynamic("isAuth")(isAuth)
    if (itemBoxStyle != null) __obj.updateDynamic("itemBoxStyle")(itemBoxStyle.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(js.Any.fromFunction0(itemRef))
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (rightSideContent != null) __obj.updateDynamic("rightSideContent")(rightSideContent.asInstanceOf[js.Any])
    if (rightSideStyle != null) __obj.updateDynamic("rightSideStyle")(rightSideStyle.asInstanceOf[js.Any])
    if (switchOnValueChange != null) __obj.updateDynamic("switchOnValueChange")(js.Any.fromFunction0(switchOnValueChange))
    if (switchProps != null) __obj.updateDynamic("switchProps")(switchProps)
    if (!js.isUndefined(switchState)) __obj.updateDynamic("switchState")(switchState)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleBoxStyle != null) __obj.updateDynamic("titleBoxStyle")(titleBoxStyle.asInstanceOf[js.Any])
    if (titleInfo != null) __obj.updateDynamic("titleInfo")(titleInfo)
    if (titleInfoPosition != null) __obj.updateDynamic("titleInfoPosition")(titleInfoPosition)
    if (titleInfoStyle != null) __obj.updateDynamic("titleInfoStyle")(titleInfoStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[ItemProps]
  }
}

