package typings.reactNativeInputSpinner.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.float
import typings.reactNativeInputSpinner.reactNativeInputSpinnerStrings.int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativeInputSpinnerProps extends js.Object {
  var activeOpacity: js.UndefOr[Double] = js.native
  var append: js.UndefOr[ReactElement] = js.native
  var arrows: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[String] = js.native
  var buttonFontFamily: js.UndefOr[String] = js.native
  var buttonFontSize: js.UndefOr[Double] = js.native
  var buttonLeftDisabled: js.UndefOr[Boolean] = js.native
  var buttonLeftImage: js.UndefOr[ReactElement] = js.native
  var buttonLeftText: js.UndefOr[String] = js.native
  var buttonPressLeftImage: js.UndefOr[ReactElement] = js.native
  var buttonPressRightImage: js.UndefOr[ReactElement] = js.native
  var buttonPressStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var buttonRightDisabled: js.UndefOr[Boolean] = js.native
  var buttonRightImage: js.UndefOr[ReactElement] = js.native
  var buttonRightText: js.UndefOr[String] = js.native
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var buttonTextColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var colorLeft: js.UndefOr[String] = js.native
  var colorMax: js.UndefOr[String] = js.native
  var colorMin: js.UndefOr[String] = js.native
  var colorPress: js.UndefOr[String] = js.native
  var colorRight: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var inputStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var max: js.UndefOr[String | Double] = js.native
  var min: js.UndefOr[String | Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], _]] = js.native
  var onDecrease: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var onIncrease: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var onMax: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var onMin: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var precision: js.UndefOr[Double] = js.native
  var prepend: js.UndefOr[ReactElement] = js.native
  var rounded: js.UndefOr[Boolean] = js.native
  var showBorder: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[String | Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var textColor: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[int | float] = js.native
  var value: js.UndefOr[String | Double] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object ReactNativeInputSpinnerProps {
  @scala.inline
  def apply(): ReactNativeInputSpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativeInputSpinnerProps]
  }
  @scala.inline
  implicit class ReactNativeInputSpinnerPropsOps[Self <: ReactNativeInputSpinnerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    @scala.inline
    def setAppend(value: ReactElement): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setButtonFontFamily(value: String): Self = this.set("buttonFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonFontFamily: Self = this.set("buttonFontFamily", js.undefined)
    @scala.inline
    def setButtonFontSize(value: Double): Self = this.set("buttonFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonFontSize: Self = this.set("buttonFontSize", js.undefined)
    @scala.inline
    def setButtonLeftDisabled(value: Boolean): Self = this.set("buttonLeftDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLeftDisabled: Self = this.set("buttonLeftDisabled", js.undefined)
    @scala.inline
    def setButtonLeftImage(value: ReactElement): Self = this.set("buttonLeftImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLeftImage: Self = this.set("buttonLeftImage", js.undefined)
    @scala.inline
    def setButtonLeftText(value: String): Self = this.set("buttonLeftText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonLeftText: Self = this.set("buttonLeftText", js.undefined)
    @scala.inline
    def setButtonPressLeftImage(value: ReactElement): Self = this.set("buttonPressLeftImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonPressLeftImage: Self = this.set("buttonPressLeftImage", js.undefined)
    @scala.inline
    def setButtonPressRightImage(value: ReactElement): Self = this.set("buttonPressRightImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonPressRightImage: Self = this.set("buttonPressRightImage", js.undefined)
    @scala.inline
    def setButtonPressStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonPressStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonPressStyle: Self = this.set("buttonPressStyle", js.undefined)
    @scala.inline
    def setButtonPressStyleNull: Self = this.set("buttonPressStyle", null)
    @scala.inline
    def setButtonRightDisabled(value: Boolean): Self = this.set("buttonRightDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonRightDisabled: Self = this.set("buttonRightDisabled", js.undefined)
    @scala.inline
    def setButtonRightImage(value: ReactElement): Self = this.set("buttonRightImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonRightImage: Self = this.set("buttonRightImage", js.undefined)
    @scala.inline
    def setButtonRightText(value: String): Self = this.set("buttonRightText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonRightText: Self = this.set("buttonRightText", js.undefined)
    @scala.inline
    def setButtonStyle(value: StyleProp[ViewStyle]): Self = this.set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonStyle: Self = this.set("buttonStyle", js.undefined)
    @scala.inline
    def setButtonStyleNull: Self = this.set("buttonStyle", null)
    @scala.inline
    def setButtonTextColor(value: String): Self = this.set("buttonTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonTextColor: Self = this.set("buttonTextColor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorLeft(value: String): Self = this.set("colorLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorLeft: Self = this.set("colorLeft", js.undefined)
    @scala.inline
    def setColorMax(value: String): Self = this.set("colorMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMax: Self = this.set("colorMax", js.undefined)
    @scala.inline
    def setColorMin(value: String): Self = this.set("colorMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMin: Self = this.set("colorMin", js.undefined)
    @scala.inline
    def setColorPress(value: String): Self = this.set("colorPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPress: Self = this.set("colorPress", js.undefined)
    @scala.inline
    def setColorRight(value: String): Self = this.set("colorRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRight: Self = this.set("colorRight", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInputStyle(value: StyleProp[ViewStyle]): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setInputStyleNull: Self = this.set("inputStyle", null)
    @scala.inline
    def setMax(value: String | Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: String | Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnChange(value: /* val */ js.UndefOr[js.Any] => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDecrease(value: /* val */ js.Any => _): Self = this.set("onDecrease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDecrease: Self = this.set("onDecrease", js.undefined)
    @scala.inline
    def setOnIncrease(value: /* val */ js.Any => _): Self = this.set("onIncrease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIncrease: Self = this.set("onIncrease", js.undefined)
    @scala.inline
    def setOnMax(value: /* val */ js.Any => _): Self = this.set("onMax", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMax: Self = this.set("onMax", js.undefined)
    @scala.inline
    def setOnMin(value: /* val */ js.Any => _): Self = this.set("onMin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMin: Self = this.set("onMin", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setPrepend(value: ReactElement): Self = this.set("prepend", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    @scala.inline
    def setShowBorder(value: Boolean): Self = this.set("showBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBorder: Self = this.set("showBorder", js.undefined)
    @scala.inline
    def setStep(value: String | Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setType(value: int | float): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

