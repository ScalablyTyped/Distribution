package typings.reactDashNativeDashPhoneDashInput.reactDashNativeDashPhoneDashInputMod

import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativePhoneInputProps[TextComponentType /* <: ComponentType[js.Object] */] extends js.Object {
  /**
    * Allow user input 0 after country code
    */
  var allowZeroAfterCountryCode: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom styles for country picker button
    */
  var buttonTextStyle: js.UndefOr[TextStyle] = js.undefined
  /**
    * Cancel word
    */
  var cancelText: js.UndefOr[String] = js.undefined
  /**
    * Confirm word
    */
  var confirmText: js.UndefOr[String] = js.undefined
  /**
    * Custom countries list
    */
  var countriesList: js.UndefOr[js.Array[CountriesListItem]] = js.undefined
  /**
    * If true, disable all interaction of this component
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom styles for flag image eg. {{width: 50, height: 30, borderWidth:0}}
    */
  var flagStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Initial selected country
    */
  var initialCountry: js.UndefOr[String] = js.undefined
  /**
    * Distance between flag and phone number
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Function to be invoked when phone number is changed
    */
  var onChangePhoneNumber: js.UndefOr[js.Function1[/* number */ Double, Unit]] = js.undefined
  /**
    * Function to be invoked when cancelling country picker selection
    */
  var onPressCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function to be invoked when confirming country picker selection
    */
  var onPressConfirm: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function to be invoked when press on flag image
    */
  var onPressFlag: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function to be invoked when country picker is selected
    */
  var onSelectCountry: js.UndefOr[js.Function1[/* iso2 */ String, Unit]] = js.undefined
  /**
    * Set background color of country picker
    */
  var pickerBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Set button color of country picker
    */
  var pickerButtonColor: js.UndefOr[String] = js.undefined
  /**
    * Custom styles for text in country picker eg. {{fontSize: 14}}
    */
  var pickerItemStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * Custom styles to be applied if supplied
    */
  var style: js.UndefOr[ViewStyle] = js.undefined
  /**
    * The input component to use
    */
  var textComponent: js.UndefOr[TextComponentType] = js.undefined
  /**
    * Properties for phone number text input eg. {{placeholder: 'Telephone number'}}
    */
  var textProps: js.UndefOr[ComponentProps[TextComponentType]] = js.undefined
  /**
    * Custom styles for phone number text input eg. {{fontSize: 14}}
    */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  /**
    * Initial phone number
    */
  var value: js.UndefOr[String] = js.undefined
}

object ReactNativePhoneInputProps {
  @scala.inline
  def apply[TextComponentType /* <: ComponentType[js.Object] */](
    allowZeroAfterCountryCode: js.UndefOr[Boolean] = js.undefined,
    buttonTextStyle: TextStyle = null,
    cancelText: String = null,
    confirmText: String = null,
    countriesList: js.Array[CountriesListItem] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    flagStyle: ViewStyle = null,
    initialCountry: String = null,
    offset: Int | Double = null,
    onChangePhoneNumber: /* number */ Double => Unit = null,
    onPressCancel: () => Unit = null,
    onPressConfirm: () => Unit = null,
    onPressFlag: () => Unit = null,
    onSelectCountry: /* iso2 */ String => Unit = null,
    pickerBackgroundColor: String = null,
    pickerButtonColor: String = null,
    pickerItemStyle: ViewStyle = null,
    style: ViewStyle = null,
    textComponent: TextComponentType = null,
    textProps: ComponentProps[TextComponentType] = null,
    textStyle: TextStyle = null,
    value: String = null
  ): ReactNativePhoneInputProps[TextComponentType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowZeroAfterCountryCode)) __obj.updateDynamic("allowZeroAfterCountryCode")(allowZeroAfterCountryCode.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (countriesList != null) __obj.updateDynamic("countriesList")(countriesList.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (flagStyle != null) __obj.updateDynamic("flagStyle")(flagStyle.asInstanceOf[js.Any])
    if (initialCountry != null) __obj.updateDynamic("initialCountry")(initialCountry.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChangePhoneNumber != null) __obj.updateDynamic("onChangePhoneNumber")(js.Any.fromFunction1(onChangePhoneNumber))
    if (onPressCancel != null) __obj.updateDynamic("onPressCancel")(js.Any.fromFunction0(onPressCancel))
    if (onPressConfirm != null) __obj.updateDynamic("onPressConfirm")(js.Any.fromFunction0(onPressConfirm))
    if (onPressFlag != null) __obj.updateDynamic("onPressFlag")(js.Any.fromFunction0(onPressFlag))
    if (onSelectCountry != null) __obj.updateDynamic("onSelectCountry")(js.Any.fromFunction1(onSelectCountry))
    if (pickerBackgroundColor != null) __obj.updateDynamic("pickerBackgroundColor")(pickerBackgroundColor.asInstanceOf[js.Any])
    if (pickerButtonColor != null) __obj.updateDynamic("pickerButtonColor")(pickerButtonColor.asInstanceOf[js.Any])
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (textProps != null) __obj.updateDynamic("textProps")(textProps.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNativePhoneInputProps[TextComponentType]]
  }
}

