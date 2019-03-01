package typings
package reactDashNativeDashVideoLib.reactDashNativeDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProperties
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  var allowsExternalPlayback: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var currentTime: js.UndefOr[scala.Double] = js.undefined
  var disableFocus: js.UndefOr[scala.Boolean] = js.undefined
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreSilentSwitch: js.UndefOr[
    reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.ignore | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.obey
  ] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var onAudioBecomingNoisy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onAudioFocusChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onBuffer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ LoadError, scala.Unit]] = js.undefined
  var onFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFullscreenPlayerDidPresent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFullscreenPlayerWillPresent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* data */ OnLoadData, scala.Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlaybackRateChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlaybackResume: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlaybackStalled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onProgress: js.UndefOr[
    js.Function1[/* data */ reactDashNativeDashVideoLib.Anon_CurrentTime, scala.Unit]
  ] = js.undefined
  var onReadyForDisplay: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTimedMetadata: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoBuffer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoFullscreenPlayerDidPresent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoFullscreenPlayerWillPresent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoLoadStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoProgress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVideoSeek: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  var playInBackground: js.UndefOr[scala.Boolean] = js.undefined
  var playWhenInactive: js.UndefOr[scala.Boolean] = js.undefined
  var poster: js.UndefOr[java.lang.String] = js.undefined
  var progressUpdateInterval: js.UndefOr[scala.Double] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var repeat: js.UndefOr[scala.Boolean] = js.undefined
  var resizeMode: js.UndefOr[java.lang.String] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /* Required by react-native */
  var scaleX: js.UndefOr[scala.Double] = js.undefined
  var scaleY: js.UndefOr[scala.Double] = js.undefined
  var seek: js.UndefOr[scala.Double] = js.undefined
  var selectedTextTrack: js.UndefOr[reactDashNativeDashVideoLib.Anon_Disabled] = js.undefined
  /* Wrapper component */
  // Opaque type returned by require('./video.mp4')
  var source: reactDashNativeDashVideoLib.Anon_Uri | scala.Double
  /* Native only */
  var src: js.UndefOr[js.Any] = js.undefined
  var textTracks: js.UndefOr[js.Array[reactDashNativeDashVideoLib.Anon_ApplicationttmlxmlApplicationxsubrip]] = js.undefined
  var translateX: js.UndefOr[scala.Double] = js.undefined
  var translateY: js.UndefOr[scala.Double] = js.undefined
  var useTextureView: js.UndefOr[scala.Boolean] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object VideoProperties {
  @scala.inline
  def apply(
    source: reactDashNativeDashVideoLib.Anon_Uri | scala.Double,
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: reactDashNativeLib.reactDashNativeMod.AccessibilityRole = null,
    accessibilityStates: js.Array[reactDashNativeLib.reactDashNativeMod.AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    allowsExternalPlayback: js.UndefOr[scala.Boolean] = js.undefined,
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    currentTime: scala.Int | scala.Double = null,
    disableFocus: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: reactDashNativeLib.reactDashNativeMod.Insets = null,
    ignoreSilentSwitch: reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.ignore | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.obey = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: js.Function0[scala.Unit] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onAudioBecomingNoisy: js.Function0[scala.Unit] = null,
    onAudioFocusChanged: js.Function0[scala.Unit] = null,
    onBuffer: js.Function0[scala.Unit] = null,
    onEnd: js.Function0[scala.Unit] = null,
    onError: js.Function1[/* error */ LoadError, scala.Unit] = null,
    onFullscreenPlayerDidDismiss: js.Function0[scala.Unit] = null,
    onFullscreenPlayerDidPresent: js.Function0[scala.Unit] = null,
    onFullscreenPlayerWillDismiss: js.Function0[scala.Unit] = null,
    onFullscreenPlayerWillPresent: js.Function0[scala.Unit] = null,
    onLayout: js.Function1[/* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent, scala.Unit] = null,
    onLoad: js.Function1[/* data */ OnLoadData, scala.Unit] = null,
    onLoadStart: js.Function0[scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onMoveShouldSetResponder: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onMoveShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onPlaybackRateChange: js.Function0[scala.Unit] = null,
    onPlaybackResume: js.Function0[scala.Unit] = null,
    onPlaybackStalled: js.Function0[scala.Unit] = null,
    onProgress: js.Function1[/* data */ reactDashNativeDashVideoLib.Anon_CurrentTime, scala.Unit] = null,
    onReadyForDisplay: js.Function0[scala.Unit] = null,
    onResponderEnd: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderGrant: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderMove: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderReject: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderRelease: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderStart: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderTerminate: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderTerminationRequest: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onSeek: js.Function0[scala.Unit] = null,
    onStartShouldSetResponder: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onStartShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onTimedMetadata: js.Function0[scala.Unit] = null,
    onTouchCancel: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchEnd: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchEndCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchMove: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchStart: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onVideoBuffer: js.Function0[scala.Unit] = null,
    onVideoEnd: js.Function0[scala.Unit] = null,
    onVideoError: js.Function0[scala.Unit] = null,
    onVideoFullscreenPlayerDidDismiss: js.Function0[scala.Unit] = null,
    onVideoFullscreenPlayerDidPresent: js.Function0[scala.Unit] = null,
    onVideoFullscreenPlayerWillDismiss: js.Function0[scala.Unit] = null,
    onVideoFullscreenPlayerWillPresent: js.Function0[scala.Unit] = null,
    onVideoLoad: js.Function0[scala.Unit] = null,
    onVideoLoadStart: js.Function0[scala.Unit] = null,
    onVideoProgress: js.Function0[scala.Unit] = null,
    onVideoSeek: js.Function0[scala.Unit] = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    playInBackground: js.UndefOr[scala.Boolean] = js.undefined,
    playWhenInactive: js.UndefOr[scala.Boolean] = js.undefined,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    poster: java.lang.String = null,
    progressUpdateInterval: scala.Int | scala.Double = null,
    rate: scala.Int | scala.Double = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    repeat: js.UndefOr[scala.Boolean] = js.undefined,
    resizeMode: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    scaleX: scala.Int | scala.Double = null,
    scaleY: scala.Int | scala.Double = null,
    seek: scala.Int | scala.Double = null,
    selectedTextTrack: reactDashNativeDashVideoLib.Anon_Disabled = null,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    src: js.Any = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    testID: java.lang.String = null,
    textTracks: js.Array[reactDashNativeDashVideoLib.Anon_ApplicationttmlxmlApplicationxsubrip] = null,
    translateX: scala.Int | scala.Double = null,
    translateY: scala.Int | scala.Double = null,
    useTextureView: js.UndefOr[scala.Boolean] = js.undefined,
    volume: scala.Int | scala.Double = null
  ): VideoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
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
    if (!js.isUndefined(allowsExternalPlayback)) __obj.updateDynamic("allowsExternalPlayback")(allowsExternalPlayback)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocus)) __obj.updateDynamic("disableFocus")(disableFocus)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (ignoreSilentSwitch != null) __obj.updateDynamic("ignoreSilentSwitch")(ignoreSilentSwitch.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onAudioBecomingNoisy != null) __obj.updateDynamic("onAudioBecomingNoisy")(onAudioBecomingNoisy)
    if (onAudioFocusChanged != null) __obj.updateDynamic("onAudioFocusChanged")(onAudioFocusChanged)
    if (onBuffer != null) __obj.updateDynamic("onBuffer")(onBuffer)
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFullscreenPlayerDidDismiss != null) __obj.updateDynamic("onFullscreenPlayerDidDismiss")(onFullscreenPlayerDidDismiss)
    if (onFullscreenPlayerDidPresent != null) __obj.updateDynamic("onFullscreenPlayerDidPresent")(onFullscreenPlayerDidPresent)
    if (onFullscreenPlayerWillDismiss != null) __obj.updateDynamic("onFullscreenPlayerWillDismiss")(onFullscreenPlayerWillDismiss)
    if (onFullscreenPlayerWillPresent != null) __obj.updateDynamic("onFullscreenPlayerWillPresent")(onFullscreenPlayerWillPresent)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder)
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture)
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(onPlaybackRateChange)
    if (onPlaybackResume != null) __obj.updateDynamic("onPlaybackResume")(onPlaybackResume)
    if (onPlaybackStalled != null) __obj.updateDynamic("onPlaybackStalled")(onPlaybackStalled)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onReadyForDisplay != null) __obj.updateDynamic("onReadyForDisplay")(onReadyForDisplay)
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd)
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant)
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove)
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject)
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease)
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart)
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate)
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest)
    if (onSeek != null) __obj.updateDynamic("onSeek")(onSeek)
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (onTimedMetadata != null) __obj.updateDynamic("onTimedMetadata")(onTimedMetadata)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onVideoBuffer != null) __obj.updateDynamic("onVideoBuffer")(onVideoBuffer)
    if (onVideoEnd != null) __obj.updateDynamic("onVideoEnd")(onVideoEnd)
    if (onVideoError != null) __obj.updateDynamic("onVideoError")(onVideoError)
    if (onVideoFullscreenPlayerDidDismiss != null) __obj.updateDynamic("onVideoFullscreenPlayerDidDismiss")(onVideoFullscreenPlayerDidDismiss)
    if (onVideoFullscreenPlayerDidPresent != null) __obj.updateDynamic("onVideoFullscreenPlayerDidPresent")(onVideoFullscreenPlayerDidPresent)
    if (onVideoFullscreenPlayerWillDismiss != null) __obj.updateDynamic("onVideoFullscreenPlayerWillDismiss")(onVideoFullscreenPlayerWillDismiss)
    if (onVideoFullscreenPlayerWillPresent != null) __obj.updateDynamic("onVideoFullscreenPlayerWillPresent")(onVideoFullscreenPlayerWillPresent)
    if (onVideoLoad != null) __obj.updateDynamic("onVideoLoad")(onVideoLoad)
    if (onVideoLoadStart != null) __obj.updateDynamic("onVideoLoadStart")(onVideoLoadStart)
    if (onVideoProgress != null) __obj.updateDynamic("onVideoProgress")(onVideoProgress)
    if (onVideoSeek != null) __obj.updateDynamic("onVideoSeek")(onVideoSeek)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (!js.isUndefined(playInBackground)) __obj.updateDynamic("playInBackground")(playInBackground)
    if (!js.isUndefined(playWhenInactive)) __obj.updateDynamic("playWhenInactive")(playWhenInactive)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (progressUpdateInterval != null) __obj.updateDynamic("progressUpdateInterval")(progressUpdateInterval.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat)
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode)
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
    if (!js.isUndefined(useTextureView)) __obj.updateDynamic("useTextureView")(useTextureView)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
}

