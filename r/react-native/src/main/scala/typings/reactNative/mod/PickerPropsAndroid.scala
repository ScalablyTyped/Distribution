package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dialog
import typings.reactNative.reactNativeStrings.dropdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerPropsAndroid extends ViewProps {
  /**
    * If set to false, the picker will be disabled, i.e. the user will not be able to make a
    * selection.
    * @platform android
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * On Android, specifies how to display the selection items when the user taps on the picker:
    *
    *   - 'dialog': Show a modal dialog. This is the default.
    *   - 'dropdown': Shows a dropdown anchored to the picker view
    *
    * @platform android
    */
  var mode: js.UndefOr[dialog | dropdown] = js.native
  /**
    * Prompt string for this picker, used on Android in dialog mode as the title of the dialog.
    * @platform android
    */
  var prompt: js.UndefOr[String] = js.native
}

object PickerPropsAndroid {
  @scala.inline
  def apply(): PickerPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerPropsAndroid]
  }
  @scala.inline
  implicit class PickerPropsAndroidOps[Self <: PickerPropsAndroid] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMode(value: dialog | dropdown): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
  }
  
}

