package typings.reactNativeVideo.mod

import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.yes
import typings.reactNativeVideo.anon.BufferForPlaybackAfterRebufferMs
import typings.reactNativeVideo.anon.Language
import typings.reactNativeVideo.anon.Type
import typings.reactNativeVideo.anon.Uri
import typings.reactNativeVideo.anon.Value
import typings.reactNativeVideo.reactNativeVideoStrings.all
import typings.reactNativeVideo.reactNativeVideoStrings.contain
import typings.reactNativeVideo.reactNativeVideoStrings.cover
import typings.reactNativeVideo.reactNativeVideoStrings.ignore
import typings.reactNativeVideo.reactNativeVideoStrings.landscape
import typings.reactNativeVideo.reactNativeVideoStrings.none
import typings.reactNativeVideo.reactNativeVideoStrings.obey
import typings.reactNativeVideo.reactNativeVideoStrings.portrait
import typings.reactNativeVideo.reactNativeVideoStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProperties extends ViewProps {
  var allowsExternalPlayback: js.UndefOr[Boolean] = js.undefined
  var audioOnly: js.UndefOr[Boolean] = js.undefined
  var automaticallyWaitsToMinimizeStalling: js.UndefOr[Boolean] = js.undefined
  var bufferConfig: js.UndefOr[BufferForPlaybackAfterRebufferMs] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var currentTime: js.UndefOr[Double] = js.undefined
  var disableFocus: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[FilterType] = js.undefined
  var filterEnable: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var fullscreenAutorotate: js.UndefOr[Boolean] = js.undefined
  var fullscreenOrientation: js.UndefOr[all | landscape | portrait] = js.undefined
  var hideShutterView: js.UndefOr[Boolean] = js.undefined
  var ignoreSilentSwitch: js.UndefOr[ignore | obey] = js.undefined
  var maxBitRate: js.UndefOr[Double] = js.undefined
  var minLoadRetryCount: js.UndefOr[Double] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var onAudioBecomingNoisy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAudioFocusChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBandwidthUpdate: js.UndefOr[js.Function1[/* data */ OnBandwidthUpdateData, Unit]] = js.undefined
  var onBuffer: js.UndefOr[js.Function1[/* data */ OnBufferData, Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ LoadError, Unit]] = js.undefined
  var onExternalPlaybackChange: js.UndefOr[js.Function1[/* data */ OnExternalPlaybackChangeData, Unit]] = js.undefined
  var onFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* data */ OnLoadData, Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPictureInPictureStatusChanged: js.UndefOr[js.Function1[/* data */ OnPictureInPictureStatusData, Unit]] = js.undefined
  var onPlaybackRateChange: js.UndefOr[js.Function1[/* data */ OnPlaybackRateData, Unit]] = js.undefined
  var onPlaybackResume: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlaybackStalled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* data */ OnProgressData, Unit]] = js.undefined
  var onReadyForDisplay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRestoreUserInterfaceForPictureInPictureStop: js.UndefOr[js.Function0[Unit]] = js.undefined
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
  var pictureInPicture: js.UndefOr[Boolean] = js.undefined
  var playInBackground: js.UndefOr[Boolean] = js.undefined
  var playWhenInactive: js.UndefOr[Boolean] = js.undefined
   // via Image#resizeMode
  var poster: js.UndefOr[String] = js.undefined
   // via Image#resizeMode
  var posterResizeMode: js.UndefOr[stretch | contain | cover | none] = js.undefined
  var progressUpdateInterval: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[Boolean] = js.undefined
  var reportBandwidth: js.UndefOr[Boolean] = js.undefined
  var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  /* Required by react-native */
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
  var seek: js.UndefOr[Double] = js.undefined
  var selectedAudioTrack: js.UndefOr[Type] = js.undefined
  var selectedTextTrack: js.UndefOr[Type] = js.undefined
  var selectedVideoTrack: js.UndefOr[Value] = js.undefined
  /* Wrapper component */
  // Opaque type returned by require('./video.mp4')
  var source: Uri | Double
  /* Native only */
  var src: js.UndefOr[js.Any] = js.undefined
  var stereoPan: js.UndefOr[Double] = js.undefined
  var textTracks: js.UndefOr[js.Array[Language]] = js.undefined
  var translateX: js.UndefOr[Double] = js.undefined
  var translateY: js.UndefOr[Double] = js.undefined
  var useTextureView: js.UndefOr[Boolean] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object VideoProperties {
  @scala.inline
  def apply(
    source: Uri | Double,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: typings.reactNative.reactNativeStrings.none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: typings.reactNative.reactNativeStrings.none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    allowsExternalPlayback: js.UndefOr[Boolean] = js.undefined,
    audioOnly: js.UndefOr[Boolean] = js.undefined,
    automaticallyWaitsToMinimizeStalling: js.UndefOr[Boolean] = js.undefined,
    bufferConfig: BufferForPlaybackAfterRebufferMs = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    currentTime: js.UndefOr[Double] = js.undefined,
    disableFocus: js.UndefOr[Boolean] = js.undefined,
    filter: FilterType = null,
    filterEnable: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    fullscreenAutorotate: js.UndefOr[Boolean] = js.undefined,
    fullscreenOrientation: all | landscape | portrait = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hideShutterView: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    ignoreSilentSwitch: ignore | obey = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    maxBitRate: js.UndefOr[Double] = js.undefined,
    minLoadRetryCount: js.UndefOr[Double] = js.undefined,
    muted: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onAudioBecomingNoisy: () => Unit = null,
    onAudioFocusChanged: () => Unit = null,
    onBandwidthUpdate: /* data */ OnBandwidthUpdateData => Unit = null,
    onBuffer: /* data */ OnBufferData => Unit = null,
    onEnd: () => Unit = null,
    onError: /* error */ LoadError => Unit = null,
    onExternalPlaybackChange: /* data */ OnExternalPlaybackChangeData => Unit = null,
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
    onPictureInPictureStatusChanged: /* data */ OnPictureInPictureStatusData => Unit = null,
    onPlaybackRateChange: /* data */ OnPlaybackRateData => Unit = null,
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
    onRestoreUserInterfaceForPictureInPictureStop: () => Unit = null,
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
    pictureInPicture: js.UndefOr[Boolean] = js.undefined,
    playInBackground: js.UndefOr[Boolean] = js.undefined,
    playWhenInactive: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | typings.reactNative.reactNativeStrings.none | `box-only` | auto = null,
    poster: String = null,
    posterResizeMode: stretch | contain | cover | none = null,
    progressUpdateInterval: js.UndefOr[Double] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    repeat: js.UndefOr[Boolean] = js.undefined,
    reportBandwidth: js.UndefOr[Boolean] = js.undefined,
    resizeMode: stretch | contain | cover | none = null,
    rotation: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    seek: js.UndefOr[Double] = js.undefined,
    selectedAudioTrack: Type = null,
    selectedTextTrack: Type = null,
    selectedVideoTrack: Value = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    src: js.Any = null,
    stereoPan: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    testID: String = null,
    textTracks: js.Array[Language] = null,
    translateX: js.UndefOr[Double] = js.undefined,
    translateY: js.UndefOr[Double] = js.undefined,
    tvParallaxMagnification: js.UndefOr[Double] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined,
    tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined,
    tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined,
    useTextureView: js.UndefOr[Boolean] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined
  ): VideoProperties = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.get.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.get.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowsExternalPlayback)) __obj.updateDynamic("allowsExternalPlayback")(allowsExternalPlayback.get.asInstanceOf[js.Any])
    if (!js.isUndefined(audioOnly)) __obj.updateDynamic("audioOnly")(audioOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyWaitsToMinimizeStalling)) __obj.updateDynamic("automaticallyWaitsToMinimizeStalling")(automaticallyWaitsToMinimizeStalling.get.asInstanceOf[js.Any])
    if (bufferConfig != null) __obj.updateDynamic("bufferConfig")(bufferConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(currentTime)) __obj.updateDynamic("currentTime")(currentTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocus)) __obj.updateDynamic("disableFocus")(disableFocus.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(filterEnable)) __obj.updateDynamic("filterEnable")(filterEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreenAutorotate)) __obj.updateDynamic("fullscreenAutorotate")(fullscreenAutorotate.get.asInstanceOf[js.Any])
    if (fullscreenOrientation != null) __obj.updateDynamic("fullscreenOrientation")(fullscreenOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideShutterView)) __obj.updateDynamic("hideShutterView")(hideShutterView.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (ignoreSilentSwitch != null) __obj.updateDynamic("ignoreSilentSwitch")(ignoreSilentSwitch.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBitRate)) __obj.updateDynamic("maxBitRate")(maxBitRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLoadRetryCount)) __obj.updateDynamic("minLoadRetryCount")(minLoadRetryCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.get.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onAudioBecomingNoisy != null) __obj.updateDynamic("onAudioBecomingNoisy")(js.Any.fromFunction0(onAudioBecomingNoisy))
    if (onAudioFocusChanged != null) __obj.updateDynamic("onAudioFocusChanged")(js.Any.fromFunction0(onAudioFocusChanged))
    if (onBandwidthUpdate != null) __obj.updateDynamic("onBandwidthUpdate")(js.Any.fromFunction1(onBandwidthUpdate))
    if (onBuffer != null) __obj.updateDynamic("onBuffer")(js.Any.fromFunction1(onBuffer))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onExternalPlaybackChange != null) __obj.updateDynamic("onExternalPlaybackChange")(js.Any.fromFunction1(onExternalPlaybackChange))
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
    if (onPictureInPictureStatusChanged != null) __obj.updateDynamic("onPictureInPictureStatusChanged")(js.Any.fromFunction1(onPictureInPictureStatusChanged))
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
    if (onRestoreUserInterfaceForPictureInPictureStop != null) __obj.updateDynamic("onRestoreUserInterfaceForPictureInPictureStop")(js.Any.fromFunction0(onRestoreUserInterfaceForPictureInPictureStop))
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
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pictureInPicture)) __obj.updateDynamic("pictureInPicture")(pictureInPicture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playInBackground)) __obj.updateDynamic("playInBackground")(playInBackground.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playWhenInactive)) __obj.updateDynamic("playWhenInactive")(playWhenInactive.get.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (posterResizeMode != null) __obj.updateDynamic("posterResizeMode")(posterResizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(progressUpdateInterval)) __obj.updateDynamic("progressUpdateInterval")(progressUpdateInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reportBandwidth)) __obj.updateDynamic("reportBandwidth")(reportBandwidth.get.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seek)) __obj.updateDynamic("seek")(seek.get.asInstanceOf[js.Any])
    if (selectedAudioTrack != null) __obj.updateDynamic("selectedAudioTrack")(selectedAudioTrack.asInstanceOf[js.Any])
    if (selectedTextTrack != null) __obj.updateDynamic("selectedTextTrack")(selectedTextTrack.asInstanceOf[js.Any])
    if (selectedVideoTrack != null) __obj.updateDynamic("selectedVideoTrack")(selectedVideoTrack.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.get.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (!js.isUndefined(stereoPan)) __obj.updateDynamic("stereoPan")(stereoPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textTracks != null) __obj.updateDynamic("textTracks")(textTracks.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxMagnification)) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.get.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceX)) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceY)) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxTiltAngle)) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTextureView)) __obj.updateDynamic("useTextureView")(useTextureView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
}

