package typings.reactNativeInputSpinner.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.float
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeInputSpinnerProps extends js.Object {
  var activeOpacity: js.UndefOr[Double] = js.undefined
  var append: js.UndefOr[ReactElement] = js.undefined
  var arrows: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var buttonFontFamily: js.UndefOr[String] = js.undefined
  var buttonFontSize: js.UndefOr[Double] = js.undefined
  var buttonLeftDisabled: js.UndefOr[Boolean] = js.undefined
  var buttonLeftImage: js.UndefOr[ReactElement] = js.undefined
  var buttonLeftText: js.UndefOr[String] = js.undefined
  var buttonPressLeftImage: js.UndefOr[ReactElement] = js.undefined
  var buttonPressRightImage: js.UndefOr[ReactElement] = js.undefined
  var buttonPressStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonRightDisabled: js.UndefOr[Boolean] = js.undefined
  var buttonRightImage: js.UndefOr[ReactElement] = js.undefined
  var buttonRightText: js.UndefOr[String] = js.undefined
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonTextColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colorLeft: js.UndefOr[String] = js.undefined
  var colorMax: js.UndefOr[String] = js.undefined
  var colorMin: js.UndefOr[String] = js.undefined
  var colorPress: js.UndefOr[String] = js.undefined
  var colorRight: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var inputStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var max: js.UndefOr[String | Double] = js.undefined
  var min: js.UndefOr[String | Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], _]] = js.undefined
  var onDecrease: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  var onIncrease: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  var onMax: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  var onMin: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var prepend: js.UndefOr[ReactElement] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var showBorder: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[int | float] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object ReactNativeInputSpinnerProps {
  @scala.inline
  def apply(
    activeOpacity: js.UndefOr[Double] = js.undefined,
    append: ReactElement = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    background: String = null,
    buttonFontFamily: String = null,
    buttonFontSize: js.UndefOr[Double] = js.undefined,
    buttonLeftDisabled: js.UndefOr[Boolean] = js.undefined,
    buttonLeftImage: ReactElement = null,
    buttonLeftText: String = null,
    buttonPressLeftImage: ReactElement = null,
    buttonPressRightImage: ReactElement = null,
    buttonPressStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    buttonRightDisabled: js.UndefOr[Boolean] = js.undefined,
    buttonRightImage: ReactElement = null,
    buttonRightText: String = null,
    buttonStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    buttonTextColor: String = null,
    color: String = null,
    colorLeft: String = null,
    colorMax: String = null,
    colorMin: String = null,
    colorPress: String = null,
    colorRight: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    height: String | Double = null,
    inputStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    max: String | Double = null,
    min: String | Double = null,
    onChange: /* val */ js.UndefOr[js.Any] => _ = null,
    onDecrease: /* val */ js.Any => _ = null,
    onIncrease: /* val */ js.Any => _ = null,
    onMax: /* val */ js.Any => _ = null,
    onMin: /* val */ js.Any => _ = null,
    precision: js.UndefOr[Double] = js.undefined,
    prepend: ReactElement = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    showBorder: js.UndefOr[Boolean] = js.undefined,
    step: String | Double = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    textColor: String = null,
    `type`: int | float = null,
    value: String | Double = null,
    width: String | Double = null
  ): ReactNativeInputSpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeOpacity)) __obj.updateDynamic("activeOpacity")(activeOpacity.get.asInstanceOf[js.Any])
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.get.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (buttonFontFamily != null) __obj.updateDynamic("buttonFontFamily")(buttonFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonFontSize)) __obj.updateDynamic("buttonFontSize")(buttonFontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonLeftDisabled)) __obj.updateDynamic("buttonLeftDisabled")(buttonLeftDisabled.get.asInstanceOf[js.Any])
    if (buttonLeftImage != null) __obj.updateDynamic("buttonLeftImage")(buttonLeftImage.asInstanceOf[js.Any])
    if (buttonLeftText != null) __obj.updateDynamic("buttonLeftText")(buttonLeftText.asInstanceOf[js.Any])
    if (buttonPressLeftImage != null) __obj.updateDynamic("buttonPressLeftImage")(buttonPressLeftImage.asInstanceOf[js.Any])
    if (buttonPressRightImage != null) __obj.updateDynamic("buttonPressRightImage")(buttonPressRightImage.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonPressStyle)) __obj.updateDynamic("buttonPressStyle")(buttonPressStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonRightDisabled)) __obj.updateDynamic("buttonRightDisabled")(buttonRightDisabled.get.asInstanceOf[js.Any])
    if (buttonRightImage != null) __obj.updateDynamic("buttonRightImage")(buttonRightImage.asInstanceOf[js.Any])
    if (buttonRightText != null) __obj.updateDynamic("buttonRightText")(buttonRightText.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonStyle)) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttonTextColor != null) __obj.updateDynamic("buttonTextColor")(buttonTextColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorLeft != null) __obj.updateDynamic("colorLeft")(colorLeft.asInstanceOf[js.Any])
    if (colorMax != null) __obj.updateDynamic("colorMax")(colorMax.asInstanceOf[js.Any])
    if (colorMin != null) __obj.updateDynamic("colorMin")(colorMin.asInstanceOf[js.Any])
    if (colorPress != null) __obj.updateDynamic("colorPress")(colorPress.asInstanceOf[js.Any])
    if (colorRight != null) __obj.updateDynamic("colorRight")(colorRight.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(inputStyle)) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDecrease != null) __obj.updateDynamic("onDecrease")(js.Any.fromFunction1(onDecrease))
    if (onIncrease != null) __obj.updateDynamic("onIncrease")(js.Any.fromFunction1(onIncrease))
    if (onMax != null) __obj.updateDynamic("onMax")(js.Any.fromFunction1(onMax))
    if (onMin != null) __obj.updateDynamic("onMin")(js.Any.fromFunction1(onMin))
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(prepend.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorder)) __obj.updateDynamic("showBorder")(showBorder.get.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNativeInputSpinnerProps]
  }
}

