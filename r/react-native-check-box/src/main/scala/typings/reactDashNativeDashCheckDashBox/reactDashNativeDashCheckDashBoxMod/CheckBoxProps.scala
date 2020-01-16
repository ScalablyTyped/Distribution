package typings.reactDashNativeDashCheckDashBox.reactDashNativeDashCheckDashBoxMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxProps extends js.Object {
  var checkBoxColor: js.UndefOr[String] = js.undefined
  var checkedCheckBoxColor: js.UndefOr[String] = js.undefined
  var checkedImage: js.UndefOr[ReactElement] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isChecked: Boolean
  var leftText: js.UndefOr[String] = js.undefined
  var leftTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var leftTextView: js.UndefOr[ReactNode] = js.undefined
  var rightText: js.UndefOr[String] = js.undefined
  var rightTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var rightTextView: js.UndefOr[ReactNode] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var uncheckedCheckBoxColor: js.UndefOr[String] = js.undefined
  var uncheckedImage: js.UndefOr[ReactElement] = js.undefined
  def onClick(): Unit
}

object CheckBoxProps {
  @scala.inline
  def apply(
    isChecked: Boolean,
    onClick: () => Unit,
    checkBoxColor: String = null,
    checkedCheckBoxColor: String = null,
    checkedImage: ReactElement = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    leftText: String = null,
    leftTextStyle: StyleProp[TextStyle] = null,
    leftTextView: ReactNode = null,
    rightText: String = null,
    rightTextStyle: StyleProp[TextStyle] = null,
    rightTextView: ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    uncheckedCheckBoxColor: String = null,
    uncheckedImage: ReactElement = null
  ): CheckBoxProps = {
    val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
    if (checkBoxColor != null) __obj.updateDynamic("checkBoxColor")(checkBoxColor.asInstanceOf[js.Any])
    if (checkedCheckBoxColor != null) __obj.updateDynamic("checkedCheckBoxColor")(checkedCheckBoxColor.asInstanceOf[js.Any])
    if (checkedImage != null) __obj.updateDynamic("checkedImage")(checkedImage.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (leftText != null) __obj.updateDynamic("leftText")(leftText.asInstanceOf[js.Any])
    if (leftTextStyle != null) __obj.updateDynamic("leftTextStyle")(leftTextStyle.asInstanceOf[js.Any])
    if (leftTextView != null) __obj.updateDynamic("leftTextView")(leftTextView.asInstanceOf[js.Any])
    if (rightText != null) __obj.updateDynamic("rightText")(rightText.asInstanceOf[js.Any])
    if (rightTextStyle != null) __obj.updateDynamic("rightTextStyle")(rightTextStyle.asInstanceOf[js.Any])
    if (rightTextView != null) __obj.updateDynamic("rightTextView")(rightTextView.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uncheckedCheckBoxColor != null) __obj.updateDynamic("uncheckedCheckBoxColor")(uncheckedCheckBoxColor.asInstanceOf[js.Any])
    if (uncheckedImage != null) __obj.updateDynamic("uncheckedImage")(uncheckedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
}

