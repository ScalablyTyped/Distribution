package typings.reactNativeElements.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProps extends TextInputProps {
  /**
    * Renders component in place of the React Native `TextInput` (optional)
    */
  var InputComponent: js.UndefOr[ComponentType[_]] = js.native
  /**
    * Styling for Input Component Container (optional)
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Disables the input field
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Style of the input field when disabled
    */
  var disabledInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * 	Adds error message (optional)
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * 	props to be passed to the React Native Text component used to display the error message (optional)
    */
  var errorProps: js.UndefOr[TextProps] = js.native
  /**
    * 	Add styling to error message (optional)
    */
  var errorStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Styling for Input Component Container (optional)
    */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * 	Adds styling to input component (optional)
    */
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * 	Adds label (optional)
    */
  var label: js.UndefOr[String | ReactElement] = js.native
  /**
    *  props to be passed to the React Native Text component used to display the label (optional)
    */
  var labelProps: js.UndefOr[TextProps] = js.native
  /**
    * 	Add styling to label (optional)
    */
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Displays an icon to the left (optional)
    */
  var leftIcon: js.UndefOr[IconNode] = js.native
  /**
    * Styling for left Icon Component container
    */
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    *  displays error message
    */
  var renderErrorMessage: js.UndefOr[Boolean] = js.native
  /**
    * Displays an icon to the right (optional)
    */
  var rightIcon: js.UndefOr[IconNode] = js.native
  /**
    * Styling for the right icon container
    */
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object InputProps {
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps] (val x: Self) extends AnyVal {
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
    def setInputComponent(value: ComponentType[_]): Self = this.set("InputComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputComponent: Self = this.set("InputComponent", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledInputStyle(value: StyleProp[TextStyle]): Self = this.set("disabledInputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledInputStyle: Self = this.set("disabledInputStyle", js.undefined)
    @scala.inline
    def setDisabledInputStyleNull: Self = this.set("disabledInputStyle", null)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setErrorProps(value: TextProps): Self = this.set("errorProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorProps: Self = this.set("errorProps", js.undefined)
    @scala.inline
    def setErrorStyle(value: StyleProp[TextStyle]): Self = this.set("errorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorStyle: Self = this.set("errorStyle", js.undefined)
    @scala.inline
    def setErrorStyleNull: Self = this.set("errorStyle", null)
    @scala.inline
    def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("inputContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputContainerStyle: Self = this.set("inputContainerStyle", js.undefined)
    @scala.inline
    def setInputContainerStyleNull: Self = this.set("inputContainerStyle", null)
    @scala.inline
    def setInputStyle(value: StyleProp[TextStyle]): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setInputStyleNull: Self = this.set("inputStyle", null)
    @scala.inline
    def setLabel(value: String | ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelProps(value: TextProps): Self = this.set("labelProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelProps: Self = this.set("labelProps", js.undefined)
    @scala.inline
    def setLabelStyle(value: StyleProp[TextStyle]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLabelStyleNull: Self = this.set("labelStyle", null)
    @scala.inline
    def setLeftIcon(value: IconNode): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    @scala.inline
    def setLeftIconContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("leftIconContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIconContainerStyle: Self = this.set("leftIconContainerStyle", js.undefined)
    @scala.inline
    def setLeftIconContainerStyleNull: Self = this.set("leftIconContainerStyle", null)
    @scala.inline
    def setRenderErrorMessage(value: Boolean): Self = this.set("renderErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderErrorMessage: Self = this.set("renderErrorMessage", js.undefined)
    @scala.inline
    def setRightIcon(value: IconNode): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    @scala.inline
    def setRightIconContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("rightIconContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIconContainerStyle: Self = this.set("rightIconContainerStyle", js.undefined)
    @scala.inline
    def setRightIconContainerStyleNull: Self = this.set("rightIconContainerStyle", null)
  }
  
}

