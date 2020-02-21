package typings.reactPhoneNumberInput.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactPhoneNumberInput.AnonCountry
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.InputHTMLAttributes<string>, 'onChange'> ]: react.react.InputHTMLAttributes<string>[P]} */ trait PhoneInputProps extends js.Object {
  // Optional props
  /**
    * Set to false to remove the "International" option from country <select/>.
    */
  var addInternationalOption: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified, only these countries will be available for selection.
    * @example ["RU", "UA", "KZ"]
    */
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Can be used to place some countries on top of the list of country <select/> options.
    *  - "|" — inserts a separator.
    *  - "..." — means "the rest of the countries" (can be omitted, in which case it will
    * automatically be added at the end).
    *
    * @example
    * ["US", "CA", "AU", "|", "..."]
    */
  var countryOptionsOrder: js.UndefOr[js.Array[String]] = js.undefined
  var countrySelectComponent: js.UndefOr[ComponentType[CountrySelectComponentProps]] = js.undefined
  /**
    * Country <select/> component props. Along with the usual DOM properties such as aria-label
    * and tabIndex, some custom properties are supported, such as arrowComponent and unicodeFlags.
    */
  var countrySelectProps: js.UndefOr[Double] = js.undefined
  /**
    * A two-letter country code for formatting `value`
    * when a user inputs a national phone number (example: `(213) 373-4253`).
    * The user can still input a phone number in international format.
    * Example: "US".
    * `country` and `defaultCountry` properties are mutually exclusive.
    */
  var defaultCountry: js.UndefOr[String] = js.undefined
  /**
    * Set to true to disable both the phone number <input/> and the country <select/>
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayInitialValueAsLocalNumber: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var flagComponent: js.UndefOr[ComponentType[AnonCountry]] = js.undefined
  /**
    * A URL template of a country flag, where "{XX}" is a two-letter country code in upper case,
    * or where "{xx}" is a two-letter country code in lower case. By default it points to
    * country-flag-icons github pages website. I imagine someone might want to download those
    * country flag icons and host them on their own servers instead (all flags are available in
    * the country-flag-icons library). There's a catch though: new countries may be added in future,
    * so when hosting country flag icons on your own server one should check the CHANGELOG.md every
    * time before updating this library, otherwise there's a possibility that some new country flag
    * would be missing.
    */
  var flagUrl: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[FlagsMap] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  /**
    * Phone number <input/> component.
    *
    * Receives properties:
    *  - value: string — The formatted value.
    *  - onChange(event: Event) — Updates the formatted value from event.target.value.
    *  - onFocus() — Is used to toggle the --focus CSS class.
    *  - onBlur() — Is used to toggle the --focus CSS class.
    *  - Other properties like type="tel" or autoComplete="tel" that should be passed through to the DOM <input/>.
    *
    * Must also either use React.forwardRef() to "forward" ref to the <input/> or implement .focus() method.
    */
  var inputComponent: js.UndefOr[
    ForwardRefExoticComponent[InputHTMLAttributes[HTMLInputElement] with RefAttributes[_]]
  ] = js.undefined
  /**
    * If `country` property is passed along with `international={true}` property
    * then the phone number will be input in "international" format for that `country`
    * (without "country calling code").
    * For example, if `country="US"` property is passed to "without country select" input
    * then the phone number will be input in the "national" format for `US` (`(213) 373-4253`).
    * But if both `country="US"` and `international={true}` properties are passed then
    * the phone number will be input in the "international" format for `US` (`213 373 4253`)
    * (without "country calling code" `+1`).
    */
  var internationalIcon: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * If set to true the phone number input will get trimmed if it exceeds the maximum length for the country.
    */
  var limitMaxLength: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
  /**
    * Phone number <input/> component additional props.
    */
  var numberInputProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Is called every time the selected country changes: either programmatically or when user selects it manually from the list.
    */
  var onCountryChange: js.UndefOr[js.Function1[/* countryCode */ js.UndefOr[String], Unit]] = js.undefined
  var showCountrySelect: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, the caret position is being "intelligently" managed
    * while a user inputs a phone number.
    * This "smart" caret behavior can be turned off
    * by passing `smartCaret={false}` property.
    * This is just an "escape hatch" for any possible caret position issues.
    * @default true
    */
  var smartCaret: js.UndefOr[Boolean] = js.undefined
  /**
    * When `defaultCountry` is defined and the initial `value` corresponds to `defaultCountry`,
    * then the `value` will be formatted as a national phone number by default.
    * To format the initial `value` of `defaultCountry` as an international number instead
    * set `useNationalFormatForDefaultCountryValue` property to `true`.
    */
  var useNationalFormatForDefaultCountryValue: js.UndefOr[Boolean] = js.undefined
  /**
    * The phone number (in E.164 format).
    * Examples: `undefined`, `"+12"`, `"+12133734253"`.
    */
  var value: String
  // Required props
  def onChange(value: String): Unit
}

object PhoneInputProps {
  @scala.inline
  def apply(
    onChange: String => Unit,
    value: String,
    addInternationalOption: js.UndefOr[Boolean] = js.undefined,
    countries: js.Array[String] = null,
    countryOptionsOrder: js.Array[String] = null,
    countrySelectComponent: ComponentType[CountrySelectComponentProps] = null,
    countrySelectProps: Int | Double = null,
    defaultCountry: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayInitialValueAsLocalNumber: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    flagComponent: ComponentType[AnonCountry] = null,
    flagUrl: String = null,
    flags: FlagsMap = null,
    inputClassName: String = null,
    inputComponent: ForwardRefExoticComponent[InputHTMLAttributes[HTMLInputElement] with RefAttributes[_]] = null,
    internationalIcon: ComponentType[js.Object] = null,
    labels: StringDictionary[String] = null,
    limitMaxLength: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Object = null,
    numberInputProps: js.Object = null,
    onCountryChange: /* countryCode */ js.UndefOr[String] => Unit = null,
    showCountrySelect: js.UndefOr[Boolean] = js.undefined,
    smartCaret: js.UndefOr[Boolean] = js.undefined,
    useNationalFormatForDefaultCountryValue: js.UndefOr[Boolean] = js.undefined
  ): PhoneInputProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(addInternationalOption)) __obj.updateDynamic("addInternationalOption")(addInternationalOption.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (countryOptionsOrder != null) __obj.updateDynamic("countryOptionsOrder")(countryOptionsOrder.asInstanceOf[js.Any])
    if (countrySelectComponent != null) __obj.updateDynamic("countrySelectComponent")(countrySelectComponent.asInstanceOf[js.Any])
    if (countrySelectProps != null) __obj.updateDynamic("countrySelectProps")(countrySelectProps.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(displayInitialValueAsLocalNumber)) __obj.updateDynamic("displayInitialValueAsLocalNumber")(displayInitialValueAsLocalNumber.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (flagComponent != null) __obj.updateDynamic("flagComponent")(flagComponent.asInstanceOf[js.Any])
    if (flagUrl != null) __obj.updateDynamic("flagUrl")(flagUrl.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent.asInstanceOf[js.Any])
    if (internationalIcon != null) __obj.updateDynamic("internationalIcon")(internationalIcon.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(limitMaxLength)) __obj.updateDynamic("limitMaxLength")(limitMaxLength.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (numberInputProps != null) __obj.updateDynamic("numberInputProps")(numberInputProps.asInstanceOf[js.Any])
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (!js.isUndefined(showCountrySelect)) __obj.updateDynamic("showCountrySelect")(showCountrySelect.asInstanceOf[js.Any])
    if (!js.isUndefined(smartCaret)) __obj.updateDynamic("smartCaret")(smartCaret.asInstanceOf[js.Any])
    if (!js.isUndefined(useNationalFormatForDefaultCountryValue)) __obj.updateDynamic("useNationalFormatForDefaultCountryValue")(useNationalFormatForDefaultCountryValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInputProps]
  }
}

