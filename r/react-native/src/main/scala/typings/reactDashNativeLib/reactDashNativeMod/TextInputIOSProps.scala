package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputIOSProps extends js.Object {
  /**
    * enum('never', 'while-editing', 'unless-editing', 'always')
    * When the clear button should appear on the right side of the text view
    */
  var clearButtonMode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.`while-editing` | reactDashNativeLib.reactDashNativeLibStrings.`unless-editing` | reactDashNativeLib.reactDashNativeLibStrings.always
  ] = js.undefined
  /**
    * If true, clears the text field automatically when editing begins
    */
  var clearTextOnFocus: js.UndefOr[scala.Boolean] = js.undefined
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
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.undefined
  /**
    * If true, the keyboard disables the return key when there is no text and automatically enables it when there is text.
    * The default value is false.
    */
  var enablesReturnKeyAutomatically: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines the color of the keyboard.
    */
  var keyboardAppearance: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.light | reactDashNativeLib.reactDashNativeLibStrings.dark
  ] = js.undefined
  /**
    * If false, scrolling of the text view will be disabled. The default value is true. Only works with multiline={true}
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * See DocumentSelectionState.js, some state that is responsible for maintaining selection information for a document
    */
  var selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  /**
    * If false, disables spell-check style (i.e. red underlines). The default value is inherited from autoCorrect
    */
  var spellCheck: js.UndefOr[scala.Boolean] = js.undefined
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
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.URL | reactDashNativeLib.reactDashNativeLibStrings.addressCity | reactDashNativeLib.reactDashNativeLibStrings.addressCityAndState | reactDashNativeLib.reactDashNativeLibStrings.addressState | reactDashNativeLib.reactDashNativeLibStrings.countryName | reactDashNativeLib.reactDashNativeLibStrings.creditCardNumber | reactDashNativeLib.reactDashNativeLibStrings.emailAddress | reactDashNativeLib.reactDashNativeLibStrings.familyName | reactDashNativeLib.reactDashNativeLibStrings.fullStreetAddress | reactDashNativeLib.reactDashNativeLibStrings.givenName | reactDashNativeLib.reactDashNativeLibStrings.jobTitle | reactDashNativeLib.reactDashNativeLibStrings.location | reactDashNativeLib.reactDashNativeLibStrings.middleName | reactDashNativeLib.reactDashNativeLibStrings.name | reactDashNativeLib.reactDashNativeLibStrings.namePrefix | reactDashNativeLib.reactDashNativeLibStrings.nameSuffix | reactDashNativeLib.reactDashNativeLibStrings.nickname | reactDashNativeLib.reactDashNativeLibStrings.organizationName | reactDashNativeLib.reactDashNativeLibStrings.postalCode | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine1 | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine2 | reactDashNativeLib.reactDashNativeLibStrings.sublocality | reactDashNativeLib.reactDashNativeLibStrings.telephoneNumber | reactDashNativeLib.reactDashNativeLibStrings.username | reactDashNativeLib.reactDashNativeLibStrings.password | reactDashNativeLib.reactDashNativeLibStrings.newPassword | reactDashNativeLib.reactDashNativeLibStrings.oneTimeCode
  ] = js.undefined
}

object TextInputIOSProps {
  @scala.inline
  def apply(
    clearButtonMode: reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.`while-editing` | reactDashNativeLib.reactDashNativeLibStrings.`unless-editing` | reactDashNativeLib.reactDashNativeLibStrings.always = null,
    clearTextOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    enablesReturnKeyAutomatically: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardAppearance: reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.light | reactDashNativeLib.reactDashNativeLibStrings.dark = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    selectionState: DocumentSelectionState = null,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    textContentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.URL | reactDashNativeLib.reactDashNativeLibStrings.addressCity | reactDashNativeLib.reactDashNativeLibStrings.addressCityAndState | reactDashNativeLib.reactDashNativeLibStrings.addressState | reactDashNativeLib.reactDashNativeLibStrings.countryName | reactDashNativeLib.reactDashNativeLibStrings.creditCardNumber | reactDashNativeLib.reactDashNativeLibStrings.emailAddress | reactDashNativeLib.reactDashNativeLibStrings.familyName | reactDashNativeLib.reactDashNativeLibStrings.fullStreetAddress | reactDashNativeLib.reactDashNativeLibStrings.givenName | reactDashNativeLib.reactDashNativeLibStrings.jobTitle | reactDashNativeLib.reactDashNativeLibStrings.location | reactDashNativeLib.reactDashNativeLibStrings.middleName | reactDashNativeLib.reactDashNativeLibStrings.name | reactDashNativeLib.reactDashNativeLibStrings.namePrefix | reactDashNativeLib.reactDashNativeLibStrings.nameSuffix | reactDashNativeLib.reactDashNativeLibStrings.nickname | reactDashNativeLib.reactDashNativeLibStrings.organizationName | reactDashNativeLib.reactDashNativeLibStrings.postalCode | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine1 | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine2 | reactDashNativeLib.reactDashNativeLibStrings.sublocality | reactDashNativeLib.reactDashNativeLibStrings.telephoneNumber | reactDashNativeLib.reactDashNativeLibStrings.username | reactDashNativeLib.reactDashNativeLibStrings.password | reactDashNativeLib.reactDashNativeLibStrings.newPassword | reactDashNativeLib.reactDashNativeLibStrings.oneTimeCode = null
  ): TextInputIOSProps = {
    val __obj = js.Dynamic.literal()
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus)
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically)
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputIOSProps]
  }
}

