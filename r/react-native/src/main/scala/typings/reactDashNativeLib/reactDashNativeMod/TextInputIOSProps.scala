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
  var dataDetectorTypes: js.UndefOr[
    reactDashNativeLib.DataDetectorTypes | js.Array[reactDashNativeLib.DataDetectorTypes]
  ] = js.undefined
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
    *
    */
  var textContentType: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.URL | reactDashNativeLib.reactDashNativeLibStrings.addressCity | reactDashNativeLib.reactDashNativeLibStrings.addressCityAndState | reactDashNativeLib.reactDashNativeLibStrings.addressState | reactDashNativeLib.reactDashNativeLibStrings.countryName | reactDashNativeLib.reactDashNativeLibStrings.creditCardNumber | reactDashNativeLib.reactDashNativeLibStrings.emailAddress | reactDashNativeLib.reactDashNativeLibStrings.familyName | reactDashNativeLib.reactDashNativeLibStrings.fullStreetAddress | reactDashNativeLib.reactDashNativeLibStrings.givenName | reactDashNativeLib.reactDashNativeLibStrings.jobTitle | reactDashNativeLib.reactDashNativeLibStrings.location | reactDashNativeLib.reactDashNativeLibStrings.middleName | reactDashNativeLib.reactDashNativeLibStrings.name | reactDashNativeLib.reactDashNativeLibStrings.namePrefix | reactDashNativeLib.reactDashNativeLibStrings.nameSuffix | reactDashNativeLib.reactDashNativeLibStrings.nickname | reactDashNativeLib.reactDashNativeLibStrings.organizationName | reactDashNativeLib.reactDashNativeLibStrings.postalCode | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine1 | reactDashNativeLib.reactDashNativeLibStrings.streetAddressLine2 | reactDashNativeLib.reactDashNativeLibStrings.sublocality | reactDashNativeLib.reactDashNativeLibStrings.telephoneNumber | reactDashNativeLib.reactDashNativeLibStrings.username | reactDashNativeLib.reactDashNativeLibStrings.password
  ] = js.undefined
}

