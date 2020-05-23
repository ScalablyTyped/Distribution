package typings.reactNativeSettingsList.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Both
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Bottom
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemProps extends js.Object {
  var arrowIcon: js.UndefOr[ReactNode] = js.undefined
  var arrowStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var authPropsPW: js.UndefOr[js.Object] = js.undefined
  var authPropsUser: js.UndefOr[js.Object] = js.undefined
  /**
    * Individual background color. Can be globally set in the parent. Will become Deprecated
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /* Gives opens to hide specific borders */
  var borderHide: js.UndefOr[Top | Bottom | Both] = js.undefined
  /**
    * Editable Right Side Style
    */
  var editableTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Enable or disable the > arrow at the end of the setting item.
    * Default: true
    */
  var hasNavArrow: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable a Switch component
    */
  var hasSwitch: js.UndefOr[Boolean] = js.undefined
  /**
    * Icon displayed on the left of the settings item
    */
  var icon: js.UndefOr[ReactNode] = js.undefined
  /**
    * Allows for the item to become an auth item
    */
  var isAuth: js.UndefOr[Boolean] = js.undefined
  /**
    * Item Box Style
    */
  var itemBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var itemRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Individual item width.  Can be globally set in the parent.  Will become deprecated
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
  /**
    * Item on long press callback.
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Item on press callback.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Right side content
    */
  var rightSideContent: js.UndefOr[ReactNode] = js.undefined
  /**
    * Right Side Style
    */
  var rightSideStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * On value change callback
    */
  var switchOnValueChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Switch props
    */
  var switchProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Switch state
    */
  var switchState: js.UndefOr[Boolean] = js.undefined
  /**
    * Title being displayed
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Title Box Style
    */
  var titleBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Right side information on the setting item
    */
  var titleInfo: js.UndefOr[String] = js.undefined
  /**
    * If 'Bottom'; info is placed beneath the title
    */
  var titleInfoPosition: js.UndefOr[String] = js.undefined
  var titleInfoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Individual underlay click color.  Can be globally set in the parent.
    */
  var underlayColor: js.UndefOr[String] = js.undefined
}

object ItemProps {
  @scala.inline
  def apply(
    arrowIcon: ReactNode = null,
    arrowStyle: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    authPropsPW: js.Object = null,
    authPropsUser: js.Object = null,
    backgroundColor: String = null,
    borderHide: Top | Bottom | Both = null,
    editableTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    hasNavArrow: js.UndefOr[Boolean] = js.undefined,
    hasSwitch: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode = null,
    isAuth: js.UndefOr[Boolean] = js.undefined,
    itemBoxStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    itemRef: () => Unit = null,
    itemWidth: js.UndefOr[Double] = js.undefined,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    rightSideContent: ReactNode = null,
    rightSideStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    switchOnValueChange: () => Unit = null,
    switchProps: js.Object = null,
    switchState: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleBoxStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    titleInfo: String = null,
    titleInfoPosition: String = null,
    titleInfoStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    underlayColor: String = null
  ): ItemProps = {
    val __obj = js.Dynamic.literal()
    if (arrowIcon != null) __obj.updateDynamic("arrowIcon")(arrowIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowStyle)) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (authPropsPW != null) __obj.updateDynamic("authPropsPW")(authPropsPW.asInstanceOf[js.Any])
    if (authPropsUser != null) __obj.updateDynamic("authPropsUser")(authPropsUser.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderHide != null) __obj.updateDynamic("borderHide")(borderHide.asInstanceOf[js.Any])
    if (!js.isUndefined(editableTextStyle)) __obj.updateDynamic("editableTextStyle")(editableTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hasNavArrow)) __obj.updateDynamic("hasNavArrow")(hasNavArrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSwitch)) __obj.updateDynamic("hasSwitch")(hasSwitch.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isAuth)) __obj.updateDynamic("isAuth")(isAuth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemBoxStyle)) __obj.updateDynamic("itemBoxStyle")(itemBoxStyle.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(js.Any.fromFunction0(itemRef))
    if (!js.isUndefined(itemWidth)) __obj.updateDynamic("itemWidth")(itemWidth.get.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (rightSideContent != null) __obj.updateDynamic("rightSideContent")(rightSideContent.asInstanceOf[js.Any])
    if (!js.isUndefined(rightSideStyle)) __obj.updateDynamic("rightSideStyle")(rightSideStyle.asInstanceOf[js.Any])
    if (switchOnValueChange != null) __obj.updateDynamic("switchOnValueChange")(js.Any.fromFunction0(switchOnValueChange))
    if (switchProps != null) __obj.updateDynamic("switchProps")(switchProps.asInstanceOf[js.Any])
    if (!js.isUndefined(switchState)) __obj.updateDynamic("switchState")(switchState.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleBoxStyle)) __obj.updateDynamic("titleBoxStyle")(titleBoxStyle.asInstanceOf[js.Any])
    if (titleInfo != null) __obj.updateDynamic("titleInfo")(titleInfo.asInstanceOf[js.Any])
    if (titleInfoPosition != null) __obj.updateDynamic("titleInfoPosition")(titleInfoPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(titleInfoStyle)) __obj.updateDynamic("titleInfoStyle")(titleInfoStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
}

