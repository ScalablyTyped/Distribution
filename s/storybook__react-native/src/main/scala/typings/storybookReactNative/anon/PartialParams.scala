package typings.storybookReactNative.anon

import typings.storybookReactNative.previewMod.AsyncStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/react-native.@storybook/react-native/dist/preview.Params> */
@js.native
trait PartialParams extends js.Object {
  var asyncStorage: js.UndefOr[AsyncStorage | Null] = js.native
  var disableWebsockets: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var initialSelection: js.UndefOr[js.Any] = js.native
  var isUIHidden: js.UndefOr[Boolean] = js.native
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.native
  var onDeviceUI: js.UndefOr[Boolean] = js.native
  var port: js.UndefOr[Double] = js.native
  var query: js.UndefOr[String] = js.native
  var resetStorybook: js.UndefOr[Boolean] = js.native
  var secured: js.UndefOr[Boolean] = js.native
  var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.native
  var shouldPersistSelection: js.UndefOr[Boolean] = js.native
  var tabOpen: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[BackgroundColor] = js.native
}

object PartialParams {
  @scala.inline
  def apply(): PartialParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParams]
  }
  @scala.inline
  implicit class PartialParamsOps[Self <: PartialParams] (val x: Self) extends AnyVal {
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
    def setAsyncStorage(value: AsyncStorage): Self = this.set("asyncStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncStorage: Self = this.set("asyncStorage", js.undefined)
    @scala.inline
    def setAsyncStorageNull: Self = this.set("asyncStorage", null)
    @scala.inline
    def setDisableWebsockets(value: Boolean): Self = this.set("disableWebsockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWebsockets: Self = this.set("disableWebsockets", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setInitialSelection(value: js.Any): Self = this.set("initialSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSelection: Self = this.set("initialSelection", js.undefined)
    @scala.inline
    def setIsUIHidden(value: Boolean): Self = this.set("isUIHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUIHidden: Self = this.set("isUIHidden", js.undefined)
    @scala.inline
    def setKeyboardAvoidingViewVerticalOffset(value: Double): Self = this.set("keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardAvoidingViewVerticalOffset: Self = this.set("keyboardAvoidingViewVerticalOffset", js.undefined)
    @scala.inline
    def setOnDeviceUI(value: Boolean): Self = this.set("onDeviceUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDeviceUI: Self = this.set("onDeviceUI", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setResetStorybook(value: Boolean): Self = this.set("resetStorybook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetStorybook: Self = this.set("resetStorybook", js.undefined)
    @scala.inline
    def setSecured(value: Boolean): Self = this.set("secured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecured: Self = this.set("secured", js.undefined)
    @scala.inline
    def setShouldDisableKeyboardAvoidingView(value: Boolean): Self = this.set("shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldDisableKeyboardAvoidingView: Self = this.set("shouldDisableKeyboardAvoidingView", js.undefined)
    @scala.inline
    def setShouldPersistSelection(value: Boolean): Self = this.set("shouldPersistSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldPersistSelection: Self = this.set("shouldPersistSelection", js.undefined)
    @scala.inline
    def setTabOpen(value: Double): Self = this.set("tabOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabOpen: Self = this.set("tabOpen", js.undefined)
    @scala.inline
    def setTheme(value: BackgroundColor): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

