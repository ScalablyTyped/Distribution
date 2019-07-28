package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.always
import typings.reactDashNative.reactDashNativeStrings.compatibility
import typings.reactDashNative.reactDashNativeStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewPropsAndroid extends js.Object {
  /**
    * Sets whether the webview allows access to the file system.
    */
  var allowFileAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * Used on Android only, controls whether DOM Storage is enabled
    * or not android
    */
  var domStorageEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Used for android only, JS is enabled by default for WebView on iOS
    */
  var javaScriptEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the mixed content mode. i.e WebView will allow a secure origin to load content from any other origin.
  Possible values for mixedContentMode are:
  'never' (default) - WebView will not allow a secure origin to load content from an insecure origin.
  'always' - WebView will allow a secure origin to load content from any other origin, even if that origin is insecure.
  'compatibility' - WebView will attempt to be compatible with the approach of a modern web browser with regard to mixed content.
    */
  var mixedContentMode: js.UndefOr[never | always | compatibility] = js.undefined
  /**
    * Controls whether form autocomplete data should be saved
    */
  var saveFormDataDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the user-agent for the WebView.
    */
  var userAgent: js.UndefOr[String] = js.undefined
}

object WebViewPropsAndroid {
  @scala.inline
  def apply(
    allowFileAccess: js.UndefOr[Boolean] = js.undefined,
    domStorageEnabled: js.UndefOr[Boolean] = js.undefined,
    javaScriptEnabled: js.UndefOr[Boolean] = js.undefined,
    mixedContentMode: never | always | compatibility = null,
    saveFormDataDisabled: js.UndefOr[Boolean] = js.undefined,
    userAgent: String = null
  ): WebViewPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFileAccess)) __obj.updateDynamic("allowFileAccess")(allowFileAccess)
    if (!js.isUndefined(domStorageEnabled)) __obj.updateDynamic("domStorageEnabled")(domStorageEnabled)
    if (!js.isUndefined(javaScriptEnabled)) __obj.updateDynamic("javaScriptEnabled")(javaScriptEnabled)
    if (mixedContentMode != null) __obj.updateDynamic("mixedContentMode")(mixedContentMode.asInstanceOf[js.Any])
    if (!js.isUndefined(saveFormDataDisabled)) __obj.updateDynamic("saveFormDataDisabled")(saveFormDataDisabled)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[WebViewPropsAndroid]
  }
}

