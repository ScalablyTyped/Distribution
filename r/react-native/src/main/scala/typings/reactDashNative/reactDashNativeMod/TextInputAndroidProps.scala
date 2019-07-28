package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.`cc-csc`
import typings.reactDashNative.reactDashNativeStrings.`cc-exp-month`
import typings.reactDashNative.reactDashNativeStrings.`cc-exp-year`
import typings.reactDashNative.reactDashNativeStrings.`cc-exp`
import typings.reactDashNative.reactDashNativeStrings.`cc-number`
import typings.reactDashNative.reactDashNativeStrings.`postal-code`
import typings.reactDashNative.reactDashNativeStrings.`street-address`
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.balanced
import typings.reactDashNative.reactDashNativeStrings.bottom
import typings.reactDashNative.reactDashNativeStrings.center
import typings.reactDashNative.reactDashNativeStrings.email
import typings.reactDashNative.reactDashNativeStrings.highQuality
import typings.reactDashNative.reactDashNativeStrings.name
import typings.reactDashNative.reactDashNativeStrings.off
import typings.reactDashNative.reactDashNativeStrings.password
import typings.reactDashNative.reactDashNativeStrings.simple
import typings.reactDashNative.reactDashNativeStrings.tel
import typings.reactDashNative.reactDashNativeStrings.top
import typings.reactDashNative.reactDashNativeStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputAndroidProps extends js.Object {
  /**
    * Determines which content to suggest on auto complete, e.g.`username`.
    * To disable auto complete, use `off`.
    *
    * *Android Only*
    *
    * The following values work on Android only:
    *
    * - `username`
    * - `password`
    * - `email`
    * - `name`
    * - `tel`
    * - `street-address`
    * - `postal-code`
    * - `cc-number`
    * - `cc-csc`
    * - `cc-exp`
    * - `cc-exp-month`
    * - `cc-exp-year`
    * - `off`
    */
  var autoCompleteType: js.UndefOr[
    `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
  ] = js.undefined
  /**
    * When false, if there is a small amount of space available around a text input (e.g. landscape orientation on a phone),
    *   the OS may choose to have the user edit the text inside of a full screen text input mode.
    * When true, this feature is disabled and users will always edit the text directly inside of the text input.
    * Defaults to false.
    */
  var disableFullscreenUI: js.UndefOr[Boolean] = js.undefined
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
    * Vertically align text when `multiline` is set to true
    */
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.undefined
  /**
    * Set text break strategy on Android API Level 23+, possible values are simple, highQuality, balanced
    * The default value is simple.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
  /**
    * The color of the textInput underline.
    */
  var underlineColorAndroid: js.UndefOr[String] = js.undefined
}

object TextInputAndroidProps {
  @scala.inline
  def apply(
    autoCompleteType: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off = null,
    disableFullscreenUI: js.UndefOr[Boolean] = js.undefined,
    inlineImageLeft: String = null,
    inlineImagePadding: Int | Double = null,
    numberOfLines: Int | Double = null,
    returnKeyLabel: String = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    underlineColorAndroid: String = null
  ): TextInputAndroidProps = {
    val __obj = js.Dynamic.literal()
    if (autoCompleteType != null) __obj.updateDynamic("autoCompleteType")(autoCompleteType.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI)
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft)
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (returnKeyLabel != null) __obj.updateDynamic("returnKeyLabel")(returnKeyLabel)
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid)
    __obj.asInstanceOf[TextInputAndroidProps]
  }
}

