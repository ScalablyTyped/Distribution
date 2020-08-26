package typings.reactNativeMaterialTextfield.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.dashed
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.dotted
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.none
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.solid
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFieldProps extends TextInputProps {
  var activeLineWidth: js.UndefOr[Double] = js.native
  var affixTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var baseColor: js.UndefOr[String] = js.native
  var characterRestriction: js.UndefOr[Double] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var contentInset: js.UndefOr[ContentInset] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledLineType: js.UndefOr[solid | dotted | dashed | none] = js.native
  var disabledLineWidth: js.UndefOr[Double] = js.native
  var error: js.UndefOr[String] = js.native
  var errorColor: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var formatText: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var label: js.UndefOr[String] = js.native
  var labelFontSize: js.UndefOr[Double] = js.native
  var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var lineType: js.UndefOr[solid | dotted | dashed | none] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var prefix: js.UndefOr[String] = js.native
  var renderLeftAccessory: js.UndefOr[js.Function0[Element]] = js.native
  var renderRightAccessory: js.UndefOr[js.Function0[Element]] = js.native
  @JSName("style")
  var style_TextFieldProps: js.UndefOr[StyleProp[TextStyle]] = js.native
  var suffix: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
  var tintColor: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object TextFieldProps {
  @scala.inline
  def apply(): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldProps]
  }
  @scala.inline
  implicit class TextFieldPropsOps[Self <: TextFieldProps] (val x: Self) extends AnyVal {
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
    def setActiveLineWidth(value: Double): Self = this.set("activeLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveLineWidth: Self = this.set("activeLineWidth", js.undefined)
    @scala.inline
    def setAffixTextStyle(value: StyleProp[TextStyle]): Self = this.set("affixTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffixTextStyle: Self = this.set("affixTextStyle", js.undefined)
    @scala.inline
    def setAffixTextStyleNull: Self = this.set("affixTextStyle", null)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setBaseColor(value: String): Self = this.set("baseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseColor: Self = this.set("baseColor", js.undefined)
    @scala.inline
    def setCharacterRestriction(value: Double): Self = this.set("characterRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterRestriction: Self = this.set("characterRestriction", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setContentInset(value: ContentInset): Self = this.set("contentInset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentInset: Self = this.set("contentInset", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledLineType(value: solid | dotted | dashed | none): Self = this.set("disabledLineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledLineType: Self = this.set("disabledLineType", js.undefined)
    @scala.inline
    def setDisabledLineWidth(value: Double): Self = this.set("disabledLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledLineWidth: Self = this.set("disabledLineWidth", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorColor(value: String): Self = this.set("errorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorColor: Self = this.set("errorColor", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFormatText(value: /* text */ String => String): Self = this.set("formatText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatText: Self = this.set("formatText", js.undefined)
    @scala.inline
    def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("inputContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputContainerStyle: Self = this.set("inputContainerStyle", js.undefined)
    @scala.inline
    def setInputContainerStyleNull: Self = this.set("inputContainerStyle", null)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelFontSize(value: Double): Self = this.set("labelFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFontSize: Self = this.set("labelFontSize", js.undefined)
    @scala.inline
    def setLabelTextStyle(value: StyleProp[TextStyle]): Self = this.set("labelTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTextStyle: Self = this.set("labelTextStyle", js.undefined)
    @scala.inline
    def setLabelTextStyleNull: Self = this.set("labelTextStyle", null)
    @scala.inline
    def setLineType(value: solid | dotted | dashed | none): Self = this.set("lineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineType: Self = this.set("lineType", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ Event => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRenderLeftAccessory(value: () => Element): Self = this.set("renderLeftAccessory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderLeftAccessory: Self = this.set("renderLeftAccessory", js.undefined)
    @scala.inline
    def setRenderRightAccessory(value: () => Element): Self = this.set("renderRightAccessory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderRightAccessory: Self = this.set("renderRightAccessory", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleTextStyle(value: StyleProp[TextStyle]): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    @scala.inline
    def setTitleTextStyleNull: Self = this.set("titleTextStyle", null)
  }
  
}

