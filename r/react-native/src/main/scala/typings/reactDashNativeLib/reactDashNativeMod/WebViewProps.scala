package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewProps
  extends ViewProps
     with WebViewPropsAndroid
     with WebViewPropsIOS {
  /**
    * Controls whether to adjust the content inset for web views that are
    * placed behind a navigation bar, tab bar, or toolbar. The default value
    * is `true`.
    */
  var automaticallyAdjustContentInsets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The amount by which the web view content is inset from the edges of
    * the scroll view. Defaults to {top: 0, left: 0, bottom: 0, right: 0}.
    */
  var contentInset: js.UndefOr[Insets] = js.undefined
  /**
    * @deprecated
    */
  var html: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this to provide JavaScript that will be injected into the web page
    * when the view loads.
    */
  var injectedJavaScript: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines whether HTML5 audio & videos require the user to tap
    * before they can start playing. The default value is false.
    */
  var mediaPlaybackRequiresUserAction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Override the native component used to render the WebView. Enables a custom native
    * WebView which uses the same JavaScript as the original WebView.
    */
  var nativeConfig: js.UndefOr[WebViewNativeConfig] = js.undefined
  /**
    * Invoked when load fails
    */
  var onError: js.UndefOr[js.Function1[/* event */ NavState, scala.Unit]] = js.undefined
  /**
    * Invoked when load finish
    */
  var onLoad: js.UndefOr[js.Function1[/* event */ NavState, scala.Unit]] = js.undefined
  /**
    * Invoked when load either succeeds or fails
    */
  var onLoadEnd: js.UndefOr[js.Function1[/* event */ NavState, scala.Unit]] = js.undefined
  /**
    * Invoked on load start
    */
  var onLoadStart: js.UndefOr[js.Function1[/* event */ NavState, scala.Unit]] = js.undefined
  /**
    * Invoked when window.postMessage is called from WebView.
    */
  var onMessage: js.UndefOr[
    js.Function1[/* event */ NativeSyntheticEvent[WebViewMessageEventData], scala.Unit]
  ] = js.undefined
  /**
    * Function that is invoked when the `WebView` loading starts or ends.
    */
  var onNavigationStateChange: js.UndefOr[js.Function1[/* event */ NavState, scala.Unit]] = js.undefined
  /**
    * List of origin strings to allow being navigated to.
    * The strings allow wildcards and get matched against just the origin (not the full URL).
    * If the user taps to navigate to a new page but the new page is not in this whitelist, the URL will be handled by the OS.
    * The default whitelisted origins are "http://" and "https://".
    */
  var originWhitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Function that returns a view to show if there's an error.
    */
  var renderError: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactElement]] = js.undefined
  /**
    * Function that returns a loading indicator.
    */
  var renderLoading: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactElement]] = js.undefined
  /**
    * sets whether the webpage scales to fit the view and the user can change the scale
    */
  var scalesPageToFit: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[WebViewUriSource | WebViewHtmlSource | scala.Double] = js.undefined
  /**
    * Boolean value that forces the `WebView` to show the loading view
    * on the first load.
    */
  var startInLoadingState: js.UndefOr[scala.Boolean] = js.undefined
  // Deprecated: Use the `source` prop instead.
  var url: js.UndefOr[java.lang.String] = js.undefined
}

