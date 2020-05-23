package typings.storybookReactNative.onDeviceUIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDeviceUIProps extends js.Object {
  var isUIHidden: js.UndefOr[Boolean] = js.undefined
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.undefined
  var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined
  var stories: js.Any
  var tabOpen: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object OnDeviceUIProps {
  @scala.inline
  def apply(
    stories: js.Any,
    isUIHidden: js.UndefOr[Boolean] = js.undefined,
    keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.undefined,
    shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined,
    tabOpen: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): OnDeviceUIProps = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    if (!js.isUndefined(isUIHidden)) __obj.updateDynamic("isUIHidden")(isUIHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardAvoidingViewVerticalOffset)) __obj.updateDynamic("keyboardAvoidingViewVerticalOffset")(keyboardAvoidingViewVerticalOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldDisableKeyboardAvoidingView)) __obj.updateDynamic("shouldDisableKeyboardAvoidingView")(shouldDisableKeyboardAvoidingView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabOpen)) __obj.updateDynamic("tabOpen")(tabOpen.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDeviceUIProps]
  }
}

