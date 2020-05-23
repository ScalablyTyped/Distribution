package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.CheckBoxProps> */
trait PartialCheckBoxProps extends js.Object {
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var checkedColor: js.UndefOr[String] = js.undefined
  var checkedIcon: js.UndefOr[String | ReactElement] = js.undefined
  var checkedTitle: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var iconRight: js.UndefOr[Boolean] = js.undefined
  var iconType: js.UndefOr[IconType] = js.undefined
  var onIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLongIconPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var title: js.UndefOr[String | ReactElement] = js.undefined
  var titleProps: js.UndefOr[PartialTextProperties] = js.undefined
  var uncheckedColor: js.UndefOr[String] = js.undefined
  var uncheckedIcon: js.UndefOr[String | ReactElement] = js.undefined
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PartialCheckBoxProps {
  @scala.inline
  def apply(
    Component: ComponentClass[js.Object, ComponentState] = null,
    center: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedColor: String = null,
    checkedIcon: String | ReactElement = null,
    checkedTitle: String = null,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    fontFamily: String = null,
    iconRight: js.UndefOr[Boolean] = js.undefined,
    iconType: IconType = null,
    onIconPress: () => Unit = null,
    onLongIconPress: () => Unit = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    right: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    textStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    title: String | ReactElement = null,
    titleProps: PartialTextProperties = null,
    uncheckedColor: String = null,
    uncheckedIcon: String | ReactElement = null,
    wrapperStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): PartialCheckBoxProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (checkedColor != null) __obj.updateDynamic("checkedColor")(checkedColor.asInstanceOf[js.Any])
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (checkedTitle != null) __obj.updateDynamic("checkedTitle")(checkedTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(iconRight)) __obj.updateDynamic("iconRight")(iconRight.get.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (onIconPress != null) __obj.updateDynamic("onIconPress")(js.Any.fromFunction0(onIconPress))
    if (onLongIconPress != null) __obj.updateDynamic("onLongIconPress")(js.Any.fromFunction0(onLongIconPress))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textStyle)) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (uncheckedColor != null) __obj.updateDynamic("uncheckedColor")(uncheckedColor.asInstanceOf[js.Any])
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapperStyle)) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCheckBoxProps]
  }
}

