package typings.reactDashNativeDashVideo.reactDashNativeDashVideoMod

import typings.reactDashNative.reactDashNativeMod.AccessibilityRole
import typings.reactDashNative.reactDashNativeMod.AccessibilityState
import typings.reactDashNative.reactDashNativeMod.AccessibilityStates
import typings.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typings.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typings.reactDashNative.reactDashNativeMod.Insets
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typings.reactDashNative.reactDashNativeMod.ViewProps
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNative.reactDashNativeStrings.`box-none`
import typings.reactDashNative.reactDashNativeStrings.`box-only`
import typings.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typings.reactDashNative.reactDashNativeStrings.assertive
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.button
import typings.reactDashNative.reactDashNativeStrings.no
import typings.reactDashNative.reactDashNativeStrings.polite
import typings.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typings.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typings.reactDashNative.reactDashNativeStrings.yes
import typings.reactDashNativeDashVideo.Anon_Applicationttmlxml
import typings.reactDashNativeDashVideo.Anon_Disabled
import typings.reactDashNativeDashVideo.Anon_PlaybackRate
import typings.reactDashNativeDashVideo.Anon_Uri
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.contain
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.cover
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.ignore
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.none
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.obey
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProperties extends ViewProps {
  var allowsExternalPlayback: js.UndefOr[Boolean] = js.undefined
  var audioOnly: js.UndefOr[Boolean] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var currentTime: js.UndefOr[Double] = js.undefined
  var disableFocus: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var ignoreSilentSwitch: js.UndefOr[ignore | obey] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var onAudioBecomingNoisy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAudioFocusChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBuffer: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ LoadError, Unit]] = js.undefined
  var onFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* data */ OnLoadData, Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlaybackRateChange: js.UndefOr[js.Function1[/* data */ Anon_PlaybackRate, Unit]] = js.undefined
  var onPlaybackResume: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlaybackStalled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* data */ OnProgressData, Unit]] = js.undefined
  var onReadyForDisplay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function1[/* data */ OnSeekData, Unit]] = js.undefined
  var onTimedMetadata: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoBuffer: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoProgress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVideoSeek: js.UndefOr[js.Function0[Unit]] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
  var playInBackground: js.UndefOr[Boolean] = js.undefined
  var playWhenInactive: js.UndefOr[Boolean] = js.undefined
   // via Image#resizeMode
  var poster: js.UndefOr[String] = js.undefined
   // via Image#resizeMode
  var posterResizeMode: js.UndefOr[stretch | contain | cover | none] = js.undefined
  var progressUpdateInterval: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[Boolean] = js.undefined
  var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  /* Required by react-native */
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var seek: js.UndefOr[Double] = js.undefined
  var selectedTextTrack: js.UndefOr[Anon_Disabled] = js.undefined
  /* Wrapper component */
  // Opaque type returned by require('./video.mp4')
  var source: Anon_Uri | Double
  /* Native only */
  var src: js.UndefOr[js.Any] = js.undefined
  var textTracks: js.UndefOr[js.Array[Anon_Applicationttmlxml]] = js.undefined
  var translateX: js.UndefOr[Double] = js.undefined
  var translateY: js.UndefOr[Double] = js.undefined
  var useTextureView: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object VideoProperties {
  @scala.inline
  def apply(
    source: Anon_Uri | Double,
    accessibilityActions: js.Array[String] = null,
    accessibilityComponentType: typings.reactDashNative.reactDashNativeStrings.none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: typings.reactDashNative.reactDashNativeStrings.none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    allowsExternalPlayback: js.UndefOr[Boolean] = js.undefined,
    audioOnly: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    currentTime: Int | Double = null,
    disableFocus: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    ignoreSilentSwitch: ignore | obey = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onAudioBecomingNoisy: () => Unit = null,
    onAudioFocusChanged: () => Unit = null,
    onBuffer: () => Unit = null,
    onEnd: () => Unit = null,
    onError: /* error */ LoadError => Unit = null,
    onFullscreenPlayerDidDismiss: () => Unit = null,
    onFullscreenPlayerDidPresent: () => Unit = null,
    onFullscreenPlayerWillDismiss: () => Unit = null,
    onFullscreenPlayerWillPresent: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLoad: /* data */ OnLoadData => Unit = null,
    onLoadStart: () => Unit = null,
    onMagicTap: () => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onPlaybackRateChange: /* data */ Anon_PlaybackRate => Unit = null,
    onPlaybackResume: () => Unit = null,
    onPlaybackStalled: () => Unit = null,
    onProgress: /* data */ OnProgressData => Unit = null,
    onReadyForDisplay: () => Unit = null,
    onResponderEnd: /* event */ GestureResponderEvent => Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => Boolean = null,
    onSeek: /* data */ OnSeekData => Unit = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onTimedMetadata: () => Unit = null,
    onTouchCancel: /* event */ GestureResponderEvent => Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => Unit = null,
    onVideoBuffer: () => Unit = null,
    onVideoEnd: () => Unit = null,
    onVideoError: () => Unit = null,
    onVideoFullscreenPlayerDidDismiss: () => Unit = null,
    onVideoFullscreenPlayerDidPresent: () => Unit = null,
    onVideoFullscreenPlayerWillDismiss: () => Unit = null,
    onVideoFullscreenPlayerWillPresent: () => Unit = null,
    onVideoLoad: () => Unit = null,
    onVideoLoadStart: () => Unit = null,
    onVideoProgress: () => Unit = null,
    onVideoSeek: () => Unit = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    playInBackground: js.UndefOr[Boolean] = js.undefined,
    playWhenInactive: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | typings.reactDashNative.reactDashNativeStrings.none | `box-only` | auto = null,
    poster: String = null,
    posterResizeMode: stretch | contain | cover | none = null,
    progressUpdateInterval: Int | Double = null,
    rate: Int | Double = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    repeat: js.UndefOr[Boolean] = js.undefined,
    resizeMode: stretch | contain | cover | none = null,
    rotation: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    seek: Int | Double = null,
    selectedTextTrack: Anon_Disabled = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    src: js.Any = null,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    textTracks: js.Array[Anon_Applicationttmlxml] = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    useTextureView: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null
  ): VideoProperties = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (!js.isUndefined(allowsExternalPlayback)) __obj.updateDynamic("allowsExternalPlayback")(allowsExternalPlayback)
    if (!js.isUndefined(audioOnly)) __obj.updateDynamic("audioOnly")(audioOnly)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocus)) __obj.updateDynamic("disableFocus")(disableFocus)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (ignoreSilentSwitch != null) __obj.updateDynamic("ignoreSilentSwitch")(ignoreSilentSwitch.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction0(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onAudioBecomingNoisy != null) __obj.updateDynamic("onAudioBecomingNoisy")(js.Any.fromFunction0(onAudioBecomingNoisy))
    if (onAudioFocusChanged != null) __obj.updateDynamic("onAudioFocusChanged")(js.Any.fromFunction0(onAudioFocusChanged))
    if (onBuffer != null) __obj.updateDynamic("onBuffer")(js.Any.fromFunction0(onBuffer))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFullscreenPlayerDidDismiss != null) __obj.updateDynamic("onFullscreenPlayerDidDismiss")(js.Any.fromFunction0(onFullscreenPlayerDidDismiss))
    if (onFullscreenPlayerDidPresent != null) __obj.updateDynamic("onFullscreenPlayerDidPresent")(js.Any.fromFunction0(onFullscreenPlayerDidPresent))
    if (onFullscreenPlayerWillDismiss != null) __obj.updateDynamic("onFullscreenPlayerWillDismiss")(js.Any.fromFunction0(onFullscreenPlayerWillDismiss))
    if (onFullscreenPlayerWillPresent != null) __obj.updateDynamic("onFullscreenPlayerWillPresent")(js.Any.fromFunction0(onFullscreenPlayerWillPresent))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction0(onLoadStart))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1(onPlaybackRateChange))
    if (onPlaybackResume != null) __obj.updateDynamic("onPlaybackResume")(js.Any.fromFunction0(onPlaybackResume))
    if (onPlaybackStalled != null) __obj.updateDynamic("onPlaybackStalled")(js.Any.fromFunction0(onPlaybackStalled))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onReadyForDisplay != null) __obj.updateDynamic("onReadyForDisplay")(js.Any.fromFunction0(onReadyForDisplay))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onSeek != null) __obj.updateDynamic("onSeek")(js.Any.fromFunction1(onSeek))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTimedMetadata != null) __obj.updateDynamic("onTimedMetadata")(js.Any.fromFunction0(onTimedMetadata))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onVideoBuffer != null) __obj.updateDynamic("onVideoBuffer")(js.Any.fromFunction0(onVideoBuffer))
    if (onVideoEnd != null) __obj.updateDynamic("onVideoEnd")(js.Any.fromFunction0(onVideoEnd))
    if (onVideoError != null) __obj.updateDynamic("onVideoError")(js.Any.fromFunction0(onVideoError))
    if (onVideoFullscreenPlayerDidDismiss != null) __obj.updateDynamic("onVideoFullscreenPlayerDidDismiss")(js.Any.fromFunction0(onVideoFullscreenPlayerDidDismiss))
    if (onVideoFullscreenPlayerDidPresent != null) __obj.updateDynamic("onVideoFullscreenPlayerDidPresent")(js.Any.fromFunction0(onVideoFullscreenPlayerDidPresent))
    if (onVideoFullscreenPlayerWillDismiss != null) __obj.updateDynamic("onVideoFullscreenPlayerWillDismiss")(js.Any.fromFunction0(onVideoFullscreenPlayerWillDismiss))
    if (onVideoFullscreenPlayerWillPresent != null) __obj.updateDynamic("onVideoFullscreenPlayerWillPresent")(js.Any.fromFunction0(onVideoFullscreenPlayerWillPresent))
    if (onVideoLoad != null) __obj.updateDynamic("onVideoLoad")(js.Any.fromFunction0(onVideoLoad))
    if (onVideoLoadStart != null) __obj.updateDynamic("onVideoLoadStart")(js.Any.fromFunction0(onVideoLoadStart))
    if (onVideoProgress != null) __obj.updateDynamic("onVideoProgress")(js.Any.fromFunction0(onVideoProgress))
    if (onVideoSeek != null) __obj.updateDynamic("onVideoSeek")(js.Any.fromFunction0(onVideoSeek))
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (!js.isUndefined(playInBackground)) __obj.updateDynamic("playInBackground")(playInBackground)
    if (!js.isUndefined(playWhenInactive)) __obj.updateDynamic("playWhenInactive")(playWhenInactive)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (posterResizeMode != null) __obj.updateDynamic("posterResizeMode")(posterResizeMode.asInstanceOf[js.Any])
    if (progressUpdateInterval != null) __obj.updateDynamic("progressUpdateInterval")(progressUpdateInterval.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat)
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (seek != null) __obj.updateDynamic("seek")(seek.asInstanceOf[js.Any])
    if (selectedTextTrack != null) __obj.updateDynamic("selectedTextTrack")(selectedTextTrack)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (src != null) __obj.updateDynamic("src")(src)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textTracks != null) __obj.updateDynamic("textTracks")(textTracks)
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(useTextureView)) __obj.updateDynamic("useTextureView")(useTextureView)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
}

