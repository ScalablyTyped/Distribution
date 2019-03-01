package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewPropsIOS extends js.Object {
  /**
    * Determines whether HTML5 videos play inline or use the native
    * full-screen controller. default value false
    * NOTE : "In order * for video to play inline, not only does
    * this property need to be set to true, but the video element
    * in the HTML document must also include the webkit-playsinline
    * attribute."
    */
  var allowsInlineMediaPlayback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Boolean value that determines whether the web view bounces
    * when it reaches the edge of the content. The default value is `true`.
    * @platform ios
    */
  var bounces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determines the types of data converted to clickable URLs in
    * the web view’s content. By default only phone numbers are detected.
    *
    * You can provide one type or an array of many types.
    *
    * Possible values for `dataDetectorTypes` are:
    *
    * - `'phoneNumber'`
    * - `'link'`
    * - `'address'`
    * - `'calendarEvent'`
    * - `'none'`
    * - `'all'`
    */
  var dataDetectorTypes: js.UndefOr[
    reactDashNativeLib.DataDetectorTypes | js.Array[reactDashNativeLib.DataDetectorTypes]
  ] = js.undefined
  /**
    * A floating-point number that determines how quickly the scroll
    * view decelerates after the user lifts their finger. You may also
    * use string shortcuts "normal" and "fast" which match the
    * underlying iOS settings for UIScrollViewDecelerationRateNormal
    * and UIScrollViewDecelerationRateFast respectively.
    * - normal: 0.998 - fast: 0.99 (the default for iOS WebView)
    */
  var decelerationRate: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.fast | scala.Double
  ] = js.undefined
  /**
    * Allows custom handling of any webview requests by a JS handler.
    * Return true or false from this method to continue loading the
    * request.
    */
  var onShouldStartLoadWithRequest: js.UndefOr[js.Function1[/* event */ WebViewIOSLoadRequestEvent, scala.Boolean]] = js.undefined
  /**
    * Boolean value that determines whether scrolling is enabled in the
    * `WebView`. The default value is `true`.
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, use WKWebView instead of UIWebView.
    */
  var useWebKit: js.UndefOr[scala.Boolean] = js.undefined
}

object WebViewPropsIOS {
  @scala.inline
  def apply(
    allowsInlineMediaPlayback: js.UndefOr[scala.Boolean] = js.undefined,
    bounces: js.UndefOr[scala.Boolean] = js.undefined,
    dataDetectorTypes: reactDashNativeLib.DataDetectorTypes | js.Array[reactDashNativeLib.DataDetectorTypes] = null,
    decelerationRate: reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.fast | scala.Double = null,
    onShouldStartLoadWithRequest: js.Function1[/* event */ WebViewIOSLoadRequestEvent, scala.Boolean] = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    useWebKit: js.UndefOr[scala.Boolean] = js.undefined
  ): WebViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowsInlineMediaPlayback)) __obj.updateDynamic("allowsInlineMediaPlayback")(allowsInlineMediaPlayback)
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces)
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (onShouldStartLoadWithRequest != null) __obj.updateDynamic("onShouldStartLoadWithRequest")(onShouldStartLoadWithRequest)
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(useWebKit)) __obj.updateDynamic("useWebKit")(useWebKit)
    __obj.asInstanceOf[WebViewPropsIOS]
  }
}

