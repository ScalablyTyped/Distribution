package typings.reactPhoneNumberInput.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactPhoneNumberInput.AnonCountry
import typings.reactPhoneNumberInput.AnonDisable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneInputProps extends js.Object {
  // Optional props
  var autoComplete: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var countryOptions: js.UndefOr[js.Array[String]] = js.undefined
  var countrySelectComponent: js.UndefOr[Component[CountrySelectComponentProps, js.Object, _]] = js.undefined
  var countrySelectTabIndex: js.UndefOr[Double] = js.undefined
  var defaultCountry: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayInitialValueAsLocalNumber: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[ReactElement] = js.undefined
  var flagComponent: js.UndefOr[Component[AnonCountry, js.Object, _]] = js.undefined
  var flags: js.UndefOr[FlagsMap] = js.undefined
  var flagsPath: js.UndefOr[String] = js.undefined
  var getInputClassName: js.UndefOr[js.Function1[/* params */ AnonDisable, String]] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputComponent: js.UndefOr[Component[InputComponentProps, js.Object, _]] = js.undefined
  var international: js.UndefOr[Boolean] = js.undefined
  var internationalIcon: js.UndefOr[Component[js.Object, js.Object, _]] = js.undefined
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var limitMaxLength: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* countryCode */ js.UndefOr[String], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var showCountrySelect: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: String
  // Required props
  def onChange(value: String): Unit
}

object PhoneInputProps {
  @scala.inline
  def apply(
    onChange: String => Unit,
    value: String,
    autoComplete: String = null,
    className: String = null,
    countries: js.Array[String] = null,
    country: String = null,
    countryOptions: js.Array[String] = null,
    countrySelectComponent: Component[CountrySelectComponentProps, js.Object, _] = null,
    countrySelectTabIndex: Int | Double = null,
    defaultCountry: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayInitialValueAsLocalNumber: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    ext: ReactElement = null,
    flagComponent: Component[AnonCountry, js.Object, _] = null,
    flags: FlagsMap = null,
    flagsPath: String = null,
    getInputClassName: /* params */ AnonDisable => String = null,
    id: String | Double = null,
    inputClassName: String = null,
    inputComponent: Component[InputComponentProps, js.Object, _] = null,
    international: js.UndefOr[Boolean] = js.undefined,
    internationalIcon: Component[js.Object, js.Object, _] = null,
    labels: StringDictionary[String] = null,
    limitMaxLength: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Object = null,
    onCountryChange: /* countryCode */ js.UndefOr[String] => Unit = null,
    placeholder: String = null,
    showCountrySelect: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): PhoneInputProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryOptions != null) __obj.updateDynamic("countryOptions")(countryOptions.asInstanceOf[js.Any])
    if (countrySelectComponent != null) __obj.updateDynamic("countrySelectComponent")(countrySelectComponent.asInstanceOf[js.Any])
    if (countrySelectTabIndex != null) __obj.updateDynamic("countrySelectTabIndex")(countrySelectTabIndex.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(displayInitialValueAsLocalNumber)) __obj.updateDynamic("displayInitialValueAsLocalNumber")(displayInitialValueAsLocalNumber.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (flagComponent != null) __obj.updateDynamic("flagComponent")(flagComponent.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (flagsPath != null) __obj.updateDynamic("flagsPath")(flagsPath.asInstanceOf[js.Any])
    if (getInputClassName != null) __obj.updateDynamic("getInputClassName")(js.Any.fromFunction1(getInputClassName))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(international)) __obj.updateDynamic("international")(international.asInstanceOf[js.Any])
    if (internationalIcon != null) __obj.updateDynamic("internationalIcon")(internationalIcon.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(limitMaxLength)) __obj.updateDynamic("limitMaxLength")(limitMaxLength.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showCountrySelect)) __obj.updateDynamic("showCountrySelect")(showCountrySelect.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInputProps]
  }
}

