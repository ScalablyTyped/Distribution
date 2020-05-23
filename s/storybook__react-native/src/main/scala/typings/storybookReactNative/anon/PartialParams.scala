package typings.storybookReactNative.anon

import typings.storybookReactNative.previewMod.AsyncStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/react-native.@storybook/react-native/dist/preview.Params> */
trait PartialParams extends js.Object {
  var asyncStorage: js.UndefOr[AsyncStorage] = js.undefined
  var disableWebsockets: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var initialSelection: js.UndefOr[js.Any] = js.undefined
  var isUIHidden: js.UndefOr[Boolean] = js.undefined
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.undefined
  var onDeviceUI: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var resetStorybook: js.UndefOr[Boolean] = js.undefined
  var secured: js.UndefOr[Boolean] = js.undefined
  var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined
  var shouldPersistSelection: js.UndefOr[Boolean] = js.undefined
  var tabOpen: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[BackgroundColor] = js.undefined
}

object PartialParams {
  @scala.inline
  def apply(
    asyncStorage: AsyncStorage = null,
    disableWebsockets: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    initialSelection: js.Any = null,
    isUIHidden: js.UndefOr[Boolean] = js.undefined,
    keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.undefined,
    onDeviceUI: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    query: String = null,
    resetStorybook: js.UndefOr[Boolean] = js.undefined,
    secured: js.UndefOr[Boolean] = js.undefined,
    shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined,
    shouldPersistSelection: js.UndefOr[Boolean] = js.undefined,
    tabOpen: js.UndefOr[Double] = js.undefined,
    theme: BackgroundColor = null
  ): PartialParams = {
    val __obj = js.Dynamic.literal()
    if (asyncStorage != null) __obj.updateDynamic("asyncStorage")(asyncStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWebsockets)) __obj.updateDynamic("disableWebsockets")(disableWebsockets.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (initialSelection != null) __obj.updateDynamic("initialSelection")(initialSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(isUIHidden)) __obj.updateDynamic("isUIHidden")(isUIHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardAvoidingViewVerticalOffset)) __obj.updateDynamic("keyboardAvoidingViewVerticalOffset")(keyboardAvoidingViewVerticalOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onDeviceUI)) __obj.updateDynamic("onDeviceUI")(onDeviceUI.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(resetStorybook)) __obj.updateDynamic("resetStorybook")(resetStorybook.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secured)) __obj.updateDynamic("secured")(secured.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldDisableKeyboardAvoidingView)) __obj.updateDynamic("shouldDisableKeyboardAvoidingView")(shouldDisableKeyboardAvoidingView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldPersistSelection)) __obj.updateDynamic("shouldPersistSelection")(shouldPersistSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabOpen)) __obj.updateDynamic("tabOpen")(tabOpen.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialParams]
  }
}

