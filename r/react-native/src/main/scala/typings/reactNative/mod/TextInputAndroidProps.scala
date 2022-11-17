package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputAndroidProps extends StObject {
  
  /**
    * Specifies autocomplete hints for the system, so it can provide autofill. On Android, the system will always attempt to offer autofill by using heuristics to identify the type of content.
    * To disable autocomplete, set `autoComplete` to `off`.
    *
    * *Android Only*
    *
    * Possible values for `autoComplete` are:
    *
    * - `birthdate-day`
    * - `birthdate-full`
    * - `birthdate-month`
    * - `birthdate-year`
    * - `cc-csc`
    * - `cc-exp`
    * - `cc-exp-day`
    * - `cc-exp-month`
    * - `cc-exp-year`
    * - `cc-number`
    * - `email`
    * - `gender`
    * - `name`
    * - `name-family`
    * - `name-given`
    * - `name-middle`
    * - `name-middle-initial`
    * - `name-prefix`
    * - `name-suffix`
    * - `password`
    * - `password-new`
    * - `postal-address`
    * - `postal-address-country`
    * - `postal-address-extended`
    * - `postal-address-extended-postal-code`
    * - `postal-address-locality`
    * - `postal-address-region`
    * - `postal-code`
    * - `street-address`
    * - `sms-otp`
    * - `tel`
    * - `tel-country-code`
    * - `tel-national`
    * - `tel-device`
    * - `username`
    * - `username-new`
    * - `off`
    */
  var autoComplete: js.UndefOr[
    "birthdate-day" | "birthdate-full" | "birthdate-month" | "birthdate-year" | "cc-csc" | "cc-exp" | "cc-exp-day" | "cc-exp-month" | "cc-exp-year" | "cc-number" | "email" | "gender" | "name" | "name-family" | "name-given" | "name-middle" | "name-middle-initial" | "name-prefix" | "name-suffix" | "password" | "password-new" | "postal-address" | "postal-address-country" | "postal-address-extended" | "postal-address-extended-postal-code" | "postal-address-locality" | "postal-address-region" | "postal-code" | "street-address" | "sms-otp" | "tel" | "tel-country-code" | "tel-national" | "tel-device" | "username" | "username-new" | "off"
  ] = js.undefined
  
  /**
    * When provided it will set the color of the cursor (or "caret") in the component.
    * Unlike the behavior of `selectionColor` the cursor color will be set independently
    * from the color of the text selection box.
    * @platform android
    */
  var cursorColor: js.UndefOr[ColorValue | Null] = js.undefined
  
  /**
    * When false, if there is a small amount of space available around a text input (e.g. landscape orientation on a phone),
    *   the OS may choose to have the user edit the text inside of a full screen text input mode.
    * When true, this feature is disabled and users will always edit the text directly inside of the text input.
    * Defaults to false.
    */
  var disableFullscreenUI: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether the individual fields in your app should be included in a
    * view structure for autofill purposes on Android API Level 26+. Defaults to auto.
    * To disable auto complete, use `off`.
    *
    * *Android Only*
    *
    * The following values work on Android only:
    *
    * - `auto` - let Android decide
    * - `no` - not important for autofill
    * - `noExcludeDescendants` - this view and its children aren't important for autofill
    * - `yes` - is important for autofill
    * - `yesExcludeDescendants` - this view is important for autofill but its children aren't
    */
  var importantForAutofill: js.UndefOr["auto" | "no" | "noExcludeDescendants" | "yes" | "yesExcludeDescendants"] = js.undefined
  
  /**
    * If defined, the provided image resource will be rendered on the left.
    */
  var inlineImageLeft: js.UndefOr[String] = js.undefined
  
  /**
    * Padding between the inline image, if any, and the text input itself.
    */
  var inlineImagePadding: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the number of lines for a TextInput.
    * Use it with multiline set to true to be able to fill the lines.
    */
  var numberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the return key to the label. Use it instead of `returnKeyType`.
    * @platform android
    */
  var returnKeyLabel: js.UndefOr[String] = js.undefined
  
  /**
    * When false, it will prevent the soft keyboard from showing when the field is focused. The default value is true
    */
  var showSoftInputOnFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertically align text when `multiline` is set to true
    */
  var textAlignVertical: js.UndefOr["auto" | "top" | "bottom" | "center"] = js.undefined
  
  /**
    * Set text break strategy on Android API Level 23+, possible values are simple, highQuality, balanced
    * The default value is simple.
    */
  var textBreakStrategy: js.UndefOr["simple" | "highQuality" | "balanced"] = js.undefined
  
  /**
    * The color of the textInput underline.
    */
  var underlineColorAndroid: js.UndefOr[ColorValue] = js.undefined
}
object TextInputAndroidProps {
  
  inline def apply(): TextInputAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputAndroidProps]
  }
  
  extension [Self <: TextInputAndroidProps](x: Self) {
    
    inline def setAutoComplete(
      value: "birthdate-day" | "birthdate-full" | "birthdate-month" | "birthdate-year" | "cc-csc" | "cc-exp" | "cc-exp-day" | "cc-exp-month" | "cc-exp-year" | "cc-number" | "email" | "gender" | "name" | "name-family" | "name-given" | "name-middle" | "name-middle-initial" | "name-prefix" | "name-suffix" | "password" | "password-new" | "postal-address" | "postal-address-country" | "postal-address-extended" | "postal-address-extended-postal-code" | "postal-address-locality" | "postal-address-region" | "postal-code" | "street-address" | "sms-otp" | "tel" | "tel-country-code" | "tel-national" | "tel-device" | "username" | "username-new" | "off"
    ): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setCursorColor(value: ColorValue): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
    
    inline def setCursorColorNull: Self = StObject.set(x, "cursorColor", null)
    
    inline def setCursorColorUndefined: Self = StObject.set(x, "cursorColor", js.undefined)
    
    inline def setDisableFullscreenUI(value: Boolean): Self = StObject.set(x, "disableFullscreenUI", value.asInstanceOf[js.Any])
    
    inline def setDisableFullscreenUIUndefined: Self = StObject.set(x, "disableFullscreenUI", js.undefined)
    
    inline def setImportantForAutofill(value: "auto" | "no" | "noExcludeDescendants" | "yes" | "yesExcludeDescendants"): Self = StObject.set(x, "importantForAutofill", value.asInstanceOf[js.Any])
    
    inline def setImportantForAutofillUndefined: Self = StObject.set(x, "importantForAutofill", js.undefined)
    
    inline def setInlineImageLeft(value: String): Self = StObject.set(x, "inlineImageLeft", value.asInstanceOf[js.Any])
    
    inline def setInlineImageLeftUndefined: Self = StObject.set(x, "inlineImageLeft", js.undefined)
    
    inline def setInlineImagePadding(value: Double): Self = StObject.set(x, "inlineImagePadding", value.asInstanceOf[js.Any])
    
    inline def setInlineImagePaddingUndefined: Self = StObject.set(x, "inlineImagePadding", js.undefined)
    
    inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setReturnKeyLabel(value: String): Self = StObject.set(x, "returnKeyLabel", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyLabelUndefined: Self = StObject.set(x, "returnKeyLabel", js.undefined)
    
    inline def setShowSoftInputOnFocus(value: Boolean): Self = StObject.set(x, "showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    inline def setShowSoftInputOnFocusUndefined: Self = StObject.set(x, "showSoftInputOnFocus", js.undefined)
    
    inline def setTextAlignVertical(value: "auto" | "top" | "bottom" | "center"): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
    
    inline def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
    
    inline def setTextBreakStrategy(value: "simple" | "highQuality" | "balanced"): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    inline def setUnderlineColorAndroid(value: ColorValue): Self = StObject.set(x, "underlineColorAndroid", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColorAndroidUndefined: Self = StObject.set(x, "underlineColorAndroid", js.undefined)
  }
}
