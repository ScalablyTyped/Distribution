package typings.storybookReactNative.previewMod

import typings.storybookReactNative.anon.BackgroundColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var asyncStorage: js.UndefOr[AsyncStorage | Null] = js.undefined
  var disableWebsockets: Boolean
  var host: String
  var initialSelection: js.Any
  var isUIHidden: Boolean
  var keyboardAvoidingViewVerticalOffset: Double
  var onDeviceUI: Boolean
  var port: Double
  var query: String
  var resetStorybook: Boolean
  var secured: Boolean
  var shouldDisableKeyboardAvoidingView: Boolean
  var shouldPersistSelection: Boolean
  var tabOpen: Double
  var theme: BackgroundColor
}

object Params {
  @scala.inline
  def apply(
    disableWebsockets: Boolean,
    host: String,
    initialSelection: js.Any,
    isUIHidden: Boolean,
    keyboardAvoidingViewVerticalOffset: Double,
    onDeviceUI: Boolean,
    port: Double,
    query: String,
    resetStorybook: Boolean,
    secured: Boolean,
    shouldDisableKeyboardAvoidingView: Boolean,
    shouldPersistSelection: Boolean,
    tabOpen: Double,
    theme: BackgroundColor,
    asyncStorage: js.UndefOr[Null | AsyncStorage] = js.undefined
  ): Params = {
    val __obj = js.Dynamic.literal(disableWebsockets = disableWebsockets.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], initialSelection = initialSelection.asInstanceOf[js.Any], isUIHidden = isUIHidden.asInstanceOf[js.Any], keyboardAvoidingViewVerticalOffset = keyboardAvoidingViewVerticalOffset.asInstanceOf[js.Any], onDeviceUI = onDeviceUI.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resetStorybook = resetStorybook.asInstanceOf[js.Any], secured = secured.asInstanceOf[js.Any], shouldDisableKeyboardAvoidingView = shouldDisableKeyboardAvoidingView.asInstanceOf[js.Any], shouldPersistSelection = shouldPersistSelection.asInstanceOf[js.Any], tabOpen = tabOpen.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncStorage)) __obj.updateDynamic("asyncStorage")(asyncStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

