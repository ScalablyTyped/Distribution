package typings.storybookReactNative.onDeviceUIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceUIProps extends js.Object {
  var isUIHidden: js.UndefOr[Boolean] = js.native
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.native
  var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.native
  var stories: js.Any = js.native
  var tabOpen: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object OnDeviceUIProps {
  @scala.inline
  def apply(stories: js.Any): OnDeviceUIProps = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDeviceUIProps]
  }
  @scala.inline
  implicit class OnDeviceUIPropsOps[Self <: OnDeviceUIProps] (val x: Self) extends AnyVal {
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
    def setStories(value: js.Any): Self = this.set("stories", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUIHidden(value: Boolean): Self = this.set("isUIHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUIHidden: Self = this.set("isUIHidden", js.undefined)
    @scala.inline
    def setKeyboardAvoidingViewVerticalOffset(value: Double): Self = this.set("keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardAvoidingViewVerticalOffset: Self = this.set("keyboardAvoidingViewVerticalOffset", js.undefined)
    @scala.inline
    def setShouldDisableKeyboardAvoidingView(value: Boolean): Self = this.set("shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldDisableKeyboardAvoidingView: Self = this.set("shouldDisableKeyboardAvoidingView", js.undefined)
    @scala.inline
    def setTabOpen(value: Double): Self = this.set("tabOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabOpen: Self = this.set("tabOpen", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

