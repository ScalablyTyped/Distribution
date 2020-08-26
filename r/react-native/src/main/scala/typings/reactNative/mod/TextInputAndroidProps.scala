package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.`cc-csc`
import typings.reactNative.reactNativeStrings.`cc-exp-month`
import typings.reactNative.reactNativeStrings.`cc-exp-year`
import typings.reactNative.reactNativeStrings.`cc-exp`
import typings.reactNative.reactNativeStrings.`cc-number`
import typings.reactNative.reactNativeStrings.`postal-code`
import typings.reactNative.reactNativeStrings.`street-address`
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.balanced
import typings.reactNative.reactNativeStrings.bottom
import typings.reactNative.reactNativeStrings.center
import typings.reactNative.reactNativeStrings.email
import typings.reactNative.reactNativeStrings.highQuality
import typings.reactNative.reactNativeStrings.name
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.noExcludeDescendants
import typings.reactNative.reactNativeStrings.off
import typings.reactNative.reactNativeStrings.password
import typings.reactNative.reactNativeStrings.simple
import typings.reactNative.reactNativeStrings.tel
import typings.reactNative.reactNativeStrings.top
import typings.reactNative.reactNativeStrings.username
import typings.reactNative.reactNativeStrings.yes
import typings.reactNative.reactNativeStrings.yesExcludeDescendants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  ] = js.native
  /**
    * When false, if there is a small amount of space available around a text input (e.g. landscape orientation on a phone),
    *   the OS may choose to have the user edit the text inside of a full screen text input mode.
    * When true, this feature is disabled and users will always edit the text directly inside of the text input.
    * Defaults to false.
    */
  var disableFullscreenUI: js.UndefOr[Boolean] = js.native
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
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.native
  /**
    * If defined, the provided image resource will be rendered on the left.
    */
  var inlineImageLeft: js.UndefOr[String] = js.native
  /**
    * Padding between the inline image, if any, and the text input itself.
    */
  var inlineImagePadding: js.UndefOr[Double] = js.native
  /**
    * Sets the number of lines for a TextInput.
    * Use it with multiline set to true to be able to fill the lines.
    */
  var numberOfLines: js.UndefOr[Double] = js.native
  /**
    * Sets the return key to the label. Use it instead of `returnKeyType`.
    * @platform android
    */
  var returnKeyLabel: js.UndefOr[String] = js.native
  /**
    * When false, it will prevent the soft keyboard from showing when the field is focused. The default value is true
    */
  var showSoftInputOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * Vertically align text when `multiline` is set to true
    */
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.native
  /**
    * Set text break strategy on Android API Level 23+, possible values are simple, highQuality, balanced
    * The default value is simple.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
  /**
    * The color of the textInput underline.
    */
  var underlineColorAndroid: js.UndefOr[ColorValue] = js.native
}

object TextInputAndroidProps {
  @scala.inline
  def apply(): TextInputAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputAndroidProps]
  }
  @scala.inline
  implicit class TextInputAndroidPropsOps[Self <: TextInputAndroidProps] (val x: Self) extends AnyVal {
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
    def setAutoCompleteType(
      value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
    ): Self = this.set("autoCompleteType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCompleteType: Self = this.set("autoCompleteType", js.undefined)
    @scala.inline
    def setDisableFullscreenUI(value: Boolean): Self = this.set("disableFullscreenUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFullscreenUI: Self = this.set("disableFullscreenUI", js.undefined)
    @scala.inline
    def setImportantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): Self = this.set("importantForAutofill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportantForAutofill: Self = this.set("importantForAutofill", js.undefined)
    @scala.inline
    def setInlineImageLeft(value: String): Self = this.set("inlineImageLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineImageLeft: Self = this.set("inlineImageLeft", js.undefined)
    @scala.inline
    def setInlineImagePadding(value: Double): Self = this.set("inlineImagePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineImagePadding: Self = this.set("inlineImagePadding", js.undefined)
    @scala.inline
    def setNumberOfLines(value: Double): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    @scala.inline
    def setReturnKeyLabel(value: String): Self = this.set("returnKeyLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnKeyLabel: Self = this.set("returnKeyLabel", js.undefined)
    @scala.inline
    def setShowSoftInputOnFocus(value: Boolean): Self = this.set("showSoftInputOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSoftInputOnFocus: Self = this.set("showSoftInputOnFocus", js.undefined)
    @scala.inline
    def setTextAlignVertical(value: auto | top | bottom | center): Self = this.set("textAlignVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlignVertical: Self = this.set("textAlignVertical", js.undefined)
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
    @scala.inline
    def setUnderlineColorAndroid(value: ColorValue): Self = this.set("underlineColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineColorAndroid: Self = this.set("underlineColorAndroid", js.undefined)
  }
  
}

