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
  var renderError: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactElement[ViewProps]]] = js.undefined
  /**
    * Function that returns a loading indicator.
    */
  var renderLoading: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactElement[ViewProps]]] = js.undefined
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

object WebViewProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityStates: js.Array[AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    allowFileAccess: js.UndefOr[scala.Boolean] = js.undefined,
    allowsInlineMediaPlayback: js.UndefOr[scala.Boolean] = js.undefined,
    automaticallyAdjustContentInsets: js.UndefOr[scala.Boolean] = js.undefined,
    bounces: js.UndefOr[scala.Boolean] = js.undefined,
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    contentInset: Insets = null,
    dataDetectorTypes: reactDashNativeLib.DataDetectorTypes | js.Array[reactDashNativeLib.DataDetectorTypes] = null,
    decelerationRate: reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.fast | scala.Double = null,
    domStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: Insets = null,
    html: java.lang.String = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    injectedJavaScript: java.lang.String = null,
    javaScriptEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    mediaPlaybackRequiresUserAction: js.UndefOr[scala.Boolean] = js.undefined,
    mixedContentMode: reactDashNativeLib.reactDashNativeLibStrings.never | reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.compatibility = null,
    nativeConfig: WebViewNativeConfig = null,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: js.Function0[scala.Unit] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onError: js.Function1[/* event */ NavState, scala.Unit] = null,
    onLayout: js.Function1[/* event */ LayoutChangeEvent, scala.Unit] = null,
    onLoad: js.Function1[/* event */ NavState, scala.Unit] = null,
    onLoadEnd: js.Function1[/* event */ NavState, scala.Unit] = null,
    onLoadStart: js.Function1[/* event */ NavState, scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onMessage: js.Function1[/* event */ NativeSyntheticEvent[WebViewMessageEventData], scala.Unit] = null,
    onMoveShouldSetResponder: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onMoveShouldSetResponderCapture: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onNavigationStateChange: js.Function1[/* event */ NavState, scala.Unit] = null,
    onResponderEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderGrant: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderReject: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderRelease: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderTerminate: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onResponderTerminationRequest: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onShouldStartLoadWithRequest: js.Function1[/* event */ WebViewIOSLoadRequestEvent, scala.Boolean] = null,
    onStartShouldSetResponder: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onStartShouldSetResponderCapture: js.Function1[/* event */ GestureResponderEvent, scala.Boolean] = null,
    onTouchCancel: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEnd: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchEndCapture: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchMove: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    onTouchStart: js.Function1[/* event */ GestureResponderEvent, scala.Unit] = null,
    originWhitelist: js.Array[java.lang.String] = null,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderError: js.Function0[reactLib.reactMod.ReactNs.ReactElement[ViewProps]] = null,
    renderLoading: js.Function0[reactLib.reactMod.ReactNs.ReactElement[ViewProps]] = null,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    saveFormDataDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    scalesPageToFit: js.UndefOr[scala.Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    source: WebViewUriSource | WebViewHtmlSource | scala.Double = null,
    startInLoadingState: js.UndefOr[scala.Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    url: java.lang.String = null,
    useWebKit: js.UndefOr[scala.Boolean] = js.undefined,
    userAgent: java.lang.String = null
  ): WebViewProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (!js.isUndefined(allowFileAccess)) __obj.updateDynamic("allowFileAccess")(allowFileAccess)
    if (!js.isUndefined(allowsInlineMediaPlayback)) __obj.updateDynamic("allowsInlineMediaPlayback")(allowsInlineMediaPlayback)
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets)
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset)
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(domStorageEnabled)) __obj.updateDynamic("domStorageEnabled")(domStorageEnabled)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (html != null) __obj.updateDynamic("html")(html)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (injectedJavaScript != null) __obj.updateDynamic("injectedJavaScript")(injectedJavaScript)
    if (!js.isUndefined(javaScriptEnabled)) __obj.updateDynamic("javaScriptEnabled")(javaScriptEnabled)
    if (!js.isUndefined(mediaPlaybackRequiresUserAction)) __obj.updateDynamic("mediaPlaybackRequiresUserAction")(mediaPlaybackRequiresUserAction)
    if (mixedContentMode != null) __obj.updateDynamic("mixedContentMode")(mixedContentMode.asInstanceOf[js.Any])
    if (nativeConfig != null) __obj.updateDynamic("nativeConfig")(nativeConfig)
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadEnd != null) __obj.updateDynamic("onLoadEnd")(onLoadEnd)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onMessage != null) __obj.updateDynamic("onMessage")(onMessage)
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder)
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture)
    if (onNavigationStateChange != null) __obj.updateDynamic("onNavigationStateChange")(onNavigationStateChange)
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd)
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant)
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove)
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject)
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease)
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart)
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate)
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest)
    if (onShouldStartLoadWithRequest != null) __obj.updateDynamic("onShouldStartLoadWithRequest")(onShouldStartLoadWithRequest)
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (originWhitelist != null) __obj.updateDynamic("originWhitelist")(originWhitelist)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (renderError != null) __obj.updateDynamic("renderError")(renderError)
    if (renderLoading != null) __obj.updateDynamic("renderLoading")(renderLoading)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(saveFormDataDisabled)) __obj.updateDynamic("saveFormDataDisabled")(saveFormDataDisabled)
    if (!js.isUndefined(scalesPageToFit)) __obj.updateDynamic("scalesPageToFit")(scalesPageToFit)
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(startInLoadingState)) __obj.updateDynamic("startInLoadingState")(startInLoadingState)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useWebKit)) __obj.updateDynamic("useWebKit")(useWebKit)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[WebViewProps]
  }
}

