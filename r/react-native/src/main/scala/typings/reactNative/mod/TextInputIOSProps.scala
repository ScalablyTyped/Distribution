package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.URL
import typings.reactNative.reactNativeStrings.`unless-editing`
import typings.reactNative.reactNativeStrings.`while-editing`
import typings.reactNative.reactNativeStrings.addressCity
import typings.reactNative.reactNativeStrings.addressCityAndState
import typings.reactNative.reactNativeStrings.addressState
import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.countryName
import typings.reactNative.reactNativeStrings.creditCardNumber
import typings.reactNative.reactNativeStrings.dark
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.emailAddress
import typings.reactNative.reactNativeStrings.familyName
import typings.reactNative.reactNativeStrings.fullStreetAddress
import typings.reactNative.reactNativeStrings.givenName
import typings.reactNative.reactNativeStrings.jobTitle
import typings.reactNative.reactNativeStrings.light
import typings.reactNative.reactNativeStrings.location
import typings.reactNative.reactNativeStrings.middleName
import typings.reactNative.reactNativeStrings.name
import typings.reactNative.reactNativeStrings.namePrefix
import typings.reactNative.reactNativeStrings.nameSuffix
import typings.reactNative.reactNativeStrings.never
import typings.reactNative.reactNativeStrings.newPassword
import typings.reactNative.reactNativeStrings.nickname
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.oneTimeCode
import typings.reactNative.reactNativeStrings.organizationName
import typings.reactNative.reactNativeStrings.password
import typings.reactNative.reactNativeStrings.postalCode
import typings.reactNative.reactNativeStrings.streetAddressLine1
import typings.reactNative.reactNativeStrings.streetAddressLine2
import typings.reactNative.reactNativeStrings.sublocality
import typings.reactNative.reactNativeStrings.telephoneNumber
import typings.reactNative.reactNativeStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputIOSProps extends js.Object {
  
  /**
    * enum('never', 'while-editing', 'unless-editing', 'always')
    * When the clear button should appear on the right side of the text view
    */
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.native
  
  /**
    * If true, clears the text field automatically when editing begins
    */
  var clearTextOnFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines the types of data converted to clickable URLs in the text input.
    * Only valid if `multiline={true}` and `editable={false}`.
    * By default no data types are detected.
    *
    * You can provide one type or an array of many types.
    *
    * Possible values for `dataDetectorTypes` are:
    *
    * - `'phoneNumber'`
    * - `'link'`
    * - `'address'`
    * - `'calendarEvent'`
    * - `'none'`
    * - `'all'`
    */
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.native
  
  /**
    * If true, the keyboard disables the return key when there is no text and automatically enables it when there is text.
    * The default value is false.
    */
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines the color of the keyboard.
    */
  var keyboardAppearance: js.UndefOr[default | light | dark] = js.native
  
  /**
    * Provide rules for your password.
    * For example, say you want to require a password with at least eight characters consisting of a mix of uppercase and lowercase letters, at least one number, and at most two consecutive characters.
    * "required: upper; required: lower; required: digit; max-consecutive: 2; minlength: 8;"
    */
  var passwordRules: js.UndefOr[String | Null] = js.native
  
  /**
    * If `true`, allows TextInput to pass touch events to the parent component.
    * This allows components to be swipeable from the TextInput on iOS,
    * as is the case on Android by default.
    * If `false`, TextInput always asks to handle the input (except when disabled).
    */
  var rejectResponderTermination: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * If false, scrolling of the text view will be disabled. The default value is true. Only works with multiline={true}
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * See DocumentSelectionState.js, some state that is responsible for maintaining selection information for a document
    */
  var selectionState: js.UndefOr[DocumentSelectionState] = js.native
  
  /**
    * If false, disables spell-check style (i.e. red underlines). The default value is inherited from autoCorrect
    */
  var spellCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * Give the keyboard and the system information about the expected
    * semantic meaning for the content that users enter.
    *
    * For iOS 11+ you can set `textContentType` to `username` or `password` to
    * enable autofill of login details from the device keychain.
    *
    * For iOS 12+ `newPassword` can be used to indicate a new password input the
    * user may want to save in the keychain, and `oneTimeCode` can be used to indicate
    * that a field can be autofilled by a code arriving in an SMS.
    *
    * To disable autofill, set textContentType to `none`.
    *
    * Possible values for `textContentType` are:
    *
    *  - `'none'`
    *  - `'URL'`
    *  - `'addressCity'`
    *  - `'addressCityAndState'`
    *  - `'addressState'`
    *  - `'countryName'`
    *  - `'creditCardNumber'`
    *  - `'emailAddress'`
    *  - `'familyName'`
    *  - `'fullStreetAddress'`
    *  - `'givenName'`
    *  - `'jobTitle'`
    *  - `'location'`
    *  - `'middleName'`
    *  - `'name'`
    *  - `'namePrefix'`
    *  - `'nameSuffix'`
    *  - `'nickname'`
    *  - `'organizationName'`
    *  - `'postalCode'`
    *  - `'streetAddressLine1'`
    *  - `'streetAddressLine2'`
    *  - `'sublocality'`
    *  - `'telephoneNumber'`
    *  - `'username'`
    *  - `'password'`
    *  - `'newPassword'`
    *  - `'oneTimeCode'`
    *
    */
  var textContentType: js.UndefOr[
    none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.native
}
object TextInputIOSProps {
  
  @scala.inline
  def apply(): TextInputIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputIOSProps]
  }
  
  @scala.inline
  implicit class TextInputIOSPropsOps[Self <: TextInputIOSProps] (val x: Self) extends AnyVal {
    
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
    def setClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = this.set("clearButtonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonMode: Self = this.set("clearButtonMode", js.undefined)
    
    @scala.inline
    def setClearTextOnFocus(value: Boolean): Self = this.set("clearTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearTextOnFocus: Self = this.set("clearTextOnFocus", js.undefined)
    
    @scala.inline
    def setDataDetectorTypesVarargs(value: DataDetectorTypes*): Self = this.set("dataDetectorTypes", js.Array(value :_*))
    
    @scala.inline
    def setDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = this.set("dataDetectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDetectorTypes: Self = this.set("dataDetectorTypes", js.undefined)
    
    @scala.inline
    def setEnablesReturnKeyAutomatically(value: Boolean): Self = this.set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablesReturnKeyAutomatically: Self = this.set("enablesReturnKeyAutomatically", js.undefined)
    
    @scala.inline
    def setKeyboardAppearance(value: default | light | dark): Self = this.set("keyboardAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardAppearance: Self = this.set("keyboardAppearance", js.undefined)
    
    @scala.inline
    def setPasswordRules(value: String): Self = this.set("passwordRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRules: Self = this.set("passwordRules", js.undefined)
    
    @scala.inline
    def setPasswordRulesNull: Self = this.set("passwordRules", null)
    
    @scala.inline
    def setRejectResponderTermination(value: Boolean): Self = this.set("rejectResponderTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectResponderTermination: Self = this.set("rejectResponderTermination", js.undefined)
    
    @scala.inline
    def setRejectResponderTerminationNull: Self = this.set("rejectResponderTermination", null)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setSelectionState(value: DocumentSelectionState): Self = this.set("selectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionState: Self = this.set("selectionState", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Boolean): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setTextContentType(
      value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): Self = this.set("textContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContentType: Self = this.set("textContentType", js.undefined)
  }
}
