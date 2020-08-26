package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.height
import typings.reactNative.reactNativeStrings.padding
import typings.reactNative.reactNativeStrings.position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardAvoidingViewProps extends ViewProps {
  var behavior: js.UndefOr[height | position | padding] = js.native
  /**
    * The style of the content container(View) when behavior is 'position'.
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Enables or disables the KeyboardAvoidingView.
    *
    * Default is true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * This is the distance between the top of the user screen and the react native view,
    * may be non-zero in some use cases.
    */
  var keyboardVerticalOffset: js.UndefOr[Double] = js.native
}

object KeyboardAvoidingViewProps {
  @scala.inline
  def apply(): KeyboardAvoidingViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardAvoidingViewProps]
  }
  @scala.inline
  implicit class KeyboardAvoidingViewPropsOps[Self <: KeyboardAvoidingViewProps] (val x: Self) extends AnyVal {
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
    def setBehavior(value: height | position | padding): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setKeyboardVerticalOffset(value: Double): Self = this.set("keyboardVerticalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardVerticalOffset: Self = this.set("keyboardVerticalOffset", js.undefined)
  }
  
}

