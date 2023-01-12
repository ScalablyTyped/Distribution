package typings.reactNativeVideo.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeVideo.anon.BufferForPlaybackAfterRebufferMs
import typings.reactNativeVideo.anon.Headers
import typings.reactNativeVideo.anon.Language
import typings.reactNativeVideo.anon.Type
import typings.reactNativeVideo.anon.Value
import typings.reactNativeVideo.reactNativeVideoStrings.all
import typings.reactNativeVideo.reactNativeVideoStrings.contain
import typings.reactNativeVideo.reactNativeVideoStrings.cover
import typings.reactNativeVideo.reactNativeVideoStrings.duck
import typings.reactNativeVideo.reactNativeVideoStrings.ignore
import typings.reactNativeVideo.reactNativeVideoStrings.inherit
import typings.reactNativeVideo.reactNativeVideoStrings.landscape
import typings.reactNativeVideo.reactNativeVideoStrings.mix
import typings.reactNativeVideo.reactNativeVideoStrings.none
import typings.reactNativeVideo.reactNativeVideoStrings.obey
import typings.reactNativeVideo.reactNativeVideoStrings.portrait
import typings.reactNativeVideo.reactNativeVideoStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoProperties
  extends StObject
     with ViewProps {
  
  var allowsExternalPlayback: js.UndefOr[Boolean] = js.undefined
  
  var audioOnly: js.UndefOr[Boolean] = js.undefined
  
  var automaticallyWaitsToMinimizeStalling: js.UndefOr[Boolean] = js.undefined
  
  var bufferConfig: js.UndefOr[BufferForPlaybackAfterRebufferMs] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var currentTime: js.UndefOr[Double] = js.undefined
  
  var disableFocus: js.UndefOr[Boolean] = js.undefined
  
  var drm: js.UndefOr[DRMSettings] = js.undefined
  
  var filter: js.UndefOr[FilterType] = js.undefined
  
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  var fullscreenAutorotate: js.UndefOr[Boolean] = js.undefined
  
  var fullscreenOrientation: js.UndefOr[all | landscape | portrait] = js.undefined
  
  var hideShutterView: js.UndefOr[Boolean] = js.undefined
  
  var ignoreSilentSwitch: js.UndefOr[ignore | obey] = js.undefined
  
  var maxBitRate: js.UndefOr[Double] = js.undefined
  
  var minLoadRetryCount: js.UndefOr[Double] = js.undefined
  
  var mixWithOthers: js.UndefOr[inherit | mix | duck] = js.undefined
  
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
  
  var preferredForwardBufferDuration: js.UndefOr[Double] = js.undefined
  
  var preventsDisplaySleepDuringVideoPlayback: js.UndefOr[Boolean] = js.undefined
  
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
  var source: Headers | Double
  
  /* Native only */
  var src: js.UndefOr[Any] = js.undefined
  
  var stereoPan: js.UndefOr[Double] = js.undefined
  
  var textTracks: js.UndefOr[js.Array[Language]] = js.undefined
  
  var translateX: js.UndefOr[Double] = js.undefined
  
  var translateY: js.UndefOr[Double] = js.undefined
  
  var useTextureView: js.UndefOr[Boolean] = js.undefined
  
  var volume: js.UndefOr[Double] = js.undefined
}
object VideoProperties {
  
  inline def apply(source: Headers | Double): VideoProperties = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoProperties] (val x: Self) extends AnyVal {
    
    inline def setAllowsExternalPlayback(value: Boolean): Self = StObject.set(x, "allowsExternalPlayback", value.asInstanceOf[js.Any])
    
    inline def setAllowsExternalPlaybackUndefined: Self = StObject.set(x, "allowsExternalPlayback", js.undefined)
    
    inline def setAudioOnly(value: Boolean): Self = StObject.set(x, "audioOnly", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyUndefined: Self = StObject.set(x, "audioOnly", js.undefined)
    
    inline def setAutomaticallyWaitsToMinimizeStalling(value: Boolean): Self = StObject.set(x, "automaticallyWaitsToMinimizeStalling", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyWaitsToMinimizeStallingUndefined: Self = StObject.set(x, "automaticallyWaitsToMinimizeStalling", js.undefined)
    
    inline def setBufferConfig(value: BufferForPlaybackAfterRebufferMs): Self = StObject.set(x, "bufferConfig", value.asInstanceOf[js.Any])
    
    inline def setBufferConfigUndefined: Self = StObject.set(x, "bufferConfig", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setDisableFocus(value: Boolean): Self = StObject.set(x, "disableFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusUndefined: Self = StObject.set(x, "disableFocus", js.undefined)
    
    inline def setDrm(value: DRMSettings): Self = StObject.set(x, "drm", value.asInstanceOf[js.Any])
    
    inline def setDrmUndefined: Self = StObject.set(x, "drm", js.undefined)
    
    inline def setFilter(value: FilterType): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
    
    inline def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenAutorotate(value: Boolean): Self = StObject.set(x, "fullscreenAutorotate", value.asInstanceOf[js.Any])
    
    inline def setFullscreenAutorotateUndefined: Self = StObject.set(x, "fullscreenAutorotate", js.undefined)
    
    inline def setFullscreenOrientation(value: all | landscape | portrait): Self = StObject.set(x, "fullscreenOrientation", value.asInstanceOf[js.Any])
    
    inline def setFullscreenOrientationUndefined: Self = StObject.set(x, "fullscreenOrientation", js.undefined)
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setHideShutterView(value: Boolean): Self = StObject.set(x, "hideShutterView", value.asInstanceOf[js.Any])
    
    inline def setHideShutterViewUndefined: Self = StObject.set(x, "hideShutterView", js.undefined)
    
    inline def setIgnoreSilentSwitch(value: ignore | obey): Self = StObject.set(x, "ignoreSilentSwitch", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSilentSwitchUndefined: Self = StObject.set(x, "ignoreSilentSwitch", js.undefined)
    
    inline def setMaxBitRate(value: Double): Self = StObject.set(x, "maxBitRate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitRateUndefined: Self = StObject.set(x, "maxBitRate", js.undefined)
    
    inline def setMinLoadRetryCount(value: Double): Self = StObject.set(x, "minLoadRetryCount", value.asInstanceOf[js.Any])
    
    inline def setMinLoadRetryCountUndefined: Self = StObject.set(x, "minLoadRetryCount", js.undefined)
    
    inline def setMixWithOthers(value: inherit | mix | duck): Self = StObject.set(x, "mixWithOthers", value.asInstanceOf[js.Any])
    
    inline def setMixWithOthersUndefined: Self = StObject.set(x, "mixWithOthers", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setOnAudioBecomingNoisy(value: () => Unit): Self = StObject.set(x, "onAudioBecomingNoisy", js.Any.fromFunction0(value))
    
    inline def setOnAudioBecomingNoisyUndefined: Self = StObject.set(x, "onAudioBecomingNoisy", js.undefined)
    
    inline def setOnAudioFocusChanged(value: () => Unit): Self = StObject.set(x, "onAudioFocusChanged", js.Any.fromFunction0(value))
    
    inline def setOnAudioFocusChangedUndefined: Self = StObject.set(x, "onAudioFocusChanged", js.undefined)
    
    inline def setOnBandwidthUpdate(value: /* data */ OnBandwidthUpdateData => Unit): Self = StObject.set(x, "onBandwidthUpdate", js.Any.fromFunction1(value))
    
    inline def setOnBandwidthUpdateUndefined: Self = StObject.set(x, "onBandwidthUpdate", js.undefined)
    
    inline def setOnBuffer(value: /* data */ OnBufferData => Unit): Self = StObject.set(x, "onBuffer", js.Any.fromFunction1(value))
    
    inline def setOnBufferUndefined: Self = StObject.set(x, "onBuffer", js.undefined)
    
    inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnError(value: /* error */ LoadError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnExternalPlaybackChange(value: /* data */ OnExternalPlaybackChangeData => Unit): Self = StObject.set(x, "onExternalPlaybackChange", js.Any.fromFunction1(value))
    
    inline def setOnExternalPlaybackChangeUndefined: Self = StObject.set(x, "onExternalPlaybackChange", js.undefined)
    
    inline def setOnFullscreenPlayerDidDismiss(value: () => Unit): Self = StObject.set(x, "onFullscreenPlayerDidDismiss", js.Any.fromFunction0(value))
    
    inline def setOnFullscreenPlayerDidDismissUndefined: Self = StObject.set(x, "onFullscreenPlayerDidDismiss", js.undefined)
    
    inline def setOnFullscreenPlayerDidPresent(value: () => Unit): Self = StObject.set(x, "onFullscreenPlayerDidPresent", js.Any.fromFunction0(value))
    
    inline def setOnFullscreenPlayerDidPresentUndefined: Self = StObject.set(x, "onFullscreenPlayerDidPresent", js.undefined)
    
    inline def setOnFullscreenPlayerWillDismiss(value: () => Unit): Self = StObject.set(x, "onFullscreenPlayerWillDismiss", js.Any.fromFunction0(value))
    
    inline def setOnFullscreenPlayerWillDismissUndefined: Self = StObject.set(x, "onFullscreenPlayerWillDismiss", js.undefined)
    
    inline def setOnFullscreenPlayerWillPresent(value: () => Unit): Self = StObject.set(x, "onFullscreenPlayerWillPresent", js.Any.fromFunction0(value))
    
    inline def setOnFullscreenPlayerWillPresentUndefined: Self = StObject.set(x, "onFullscreenPlayerWillPresent", js.undefined)
    
    inline def setOnLoad(value: /* data */ OnLoadData => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadStart(value: () => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction0(value))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnPictureInPictureStatusChanged(value: /* data */ OnPictureInPictureStatusData => Unit): Self = StObject.set(x, "onPictureInPictureStatusChanged", js.Any.fromFunction1(value))
    
    inline def setOnPictureInPictureStatusChangedUndefined: Self = StObject.set(x, "onPictureInPictureStatusChanged", js.undefined)
    
    inline def setOnPlaybackRateChange(value: /* data */ OnPlaybackRateData => Unit): Self = StObject.set(x, "onPlaybackRateChange", js.Any.fromFunction1(value))
    
    inline def setOnPlaybackRateChangeUndefined: Self = StObject.set(x, "onPlaybackRateChange", js.undefined)
    
    inline def setOnPlaybackResume(value: () => Unit): Self = StObject.set(x, "onPlaybackResume", js.Any.fromFunction0(value))
    
    inline def setOnPlaybackResumeUndefined: Self = StObject.set(x, "onPlaybackResume", js.undefined)
    
    inline def setOnPlaybackStalled(value: () => Unit): Self = StObject.set(x, "onPlaybackStalled", js.Any.fromFunction0(value))
    
    inline def setOnPlaybackStalledUndefined: Self = StObject.set(x, "onPlaybackStalled", js.undefined)
    
    inline def setOnProgress(value: /* data */ OnProgressData => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnReadyForDisplay(value: () => Unit): Self = StObject.set(x, "onReadyForDisplay", js.Any.fromFunction0(value))
    
    inline def setOnReadyForDisplayUndefined: Self = StObject.set(x, "onReadyForDisplay", js.undefined)
    
    inline def setOnRestoreUserInterfaceForPictureInPictureStop(value: () => Unit): Self = StObject.set(x, "onRestoreUserInterfaceForPictureInPictureStop", js.Any.fromFunction0(value))
    
    inline def setOnRestoreUserInterfaceForPictureInPictureStopUndefined: Self = StObject.set(x, "onRestoreUserInterfaceForPictureInPictureStop", js.undefined)
    
    inline def setOnSeek(value: /* data */ OnSeekData => Unit): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
    
    inline def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
    
    inline def setOnTimedMetadata(value: () => Unit): Self = StObject.set(x, "onTimedMetadata", js.Any.fromFunction0(value))
    
    inline def setOnTimedMetadataUndefined: Self = StObject.set(x, "onTimedMetadata", js.undefined)
    
    inline def setOnVideoBuffer(value: () => Unit): Self = StObject.set(x, "onVideoBuffer", js.Any.fromFunction0(value))
    
    inline def setOnVideoBufferUndefined: Self = StObject.set(x, "onVideoBuffer", js.undefined)
    
    inline def setOnVideoEnd(value: () => Unit): Self = StObject.set(x, "onVideoEnd", js.Any.fromFunction0(value))
    
    inline def setOnVideoEndUndefined: Self = StObject.set(x, "onVideoEnd", js.undefined)
    
    inline def setOnVideoError(value: () => Unit): Self = StObject.set(x, "onVideoError", js.Any.fromFunction0(value))
    
    inline def setOnVideoErrorUndefined: Self = StObject.set(x, "onVideoError", js.undefined)
    
    inline def setOnVideoFullscreenPlayerDidDismiss(value: () => Unit): Self = StObject.set(x, "onVideoFullscreenPlayerDidDismiss", js.Any.fromFunction0(value))
    
    inline def setOnVideoFullscreenPlayerDidDismissUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerDidDismiss", js.undefined)
    
    inline def setOnVideoFullscreenPlayerDidPresent(value: () => Unit): Self = StObject.set(x, "onVideoFullscreenPlayerDidPresent", js.Any.fromFunction0(value))
    
    inline def setOnVideoFullscreenPlayerDidPresentUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerDidPresent", js.undefined)
    
    inline def setOnVideoFullscreenPlayerWillDismiss(value: () => Unit): Self = StObject.set(x, "onVideoFullscreenPlayerWillDismiss", js.Any.fromFunction0(value))
    
    inline def setOnVideoFullscreenPlayerWillDismissUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerWillDismiss", js.undefined)
    
    inline def setOnVideoFullscreenPlayerWillPresent(value: () => Unit): Self = StObject.set(x, "onVideoFullscreenPlayerWillPresent", js.Any.fromFunction0(value))
    
    inline def setOnVideoFullscreenPlayerWillPresentUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerWillPresent", js.undefined)
    
    inline def setOnVideoLoad(value: () => Unit): Self = StObject.set(x, "onVideoLoad", js.Any.fromFunction0(value))
    
    inline def setOnVideoLoadStart(value: () => Unit): Self = StObject.set(x, "onVideoLoadStart", js.Any.fromFunction0(value))
    
    inline def setOnVideoLoadStartUndefined: Self = StObject.set(x, "onVideoLoadStart", js.undefined)
    
    inline def setOnVideoLoadUndefined: Self = StObject.set(x, "onVideoLoad", js.undefined)
    
    inline def setOnVideoProgress(value: () => Unit): Self = StObject.set(x, "onVideoProgress", js.Any.fromFunction0(value))
    
    inline def setOnVideoProgressUndefined: Self = StObject.set(x, "onVideoProgress", js.undefined)
    
    inline def setOnVideoSeek(value: () => Unit): Self = StObject.set(x, "onVideoSeek", js.Any.fromFunction0(value))
    
    inline def setOnVideoSeekUndefined: Self = StObject.set(x, "onVideoSeek", js.undefined)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setPictureInPicture(value: Boolean): Self = StObject.set(x, "pictureInPicture", value.asInstanceOf[js.Any])
    
    inline def setPictureInPictureUndefined: Self = StObject.set(x, "pictureInPicture", js.undefined)
    
    inline def setPlayInBackground(value: Boolean): Self = StObject.set(x, "playInBackground", value.asInstanceOf[js.Any])
    
    inline def setPlayInBackgroundUndefined: Self = StObject.set(x, "playInBackground", js.undefined)
    
    inline def setPlayWhenInactive(value: Boolean): Self = StObject.set(x, "playWhenInactive", value.asInstanceOf[js.Any])
    
    inline def setPlayWhenInactiveUndefined: Self = StObject.set(x, "playWhenInactive", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterResizeMode(value: stretch | contain | cover | none): Self = StObject.set(x, "posterResizeMode", value.asInstanceOf[js.Any])
    
    inline def setPosterResizeModeUndefined: Self = StObject.set(x, "posterResizeMode", js.undefined)
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setPreferredForwardBufferDuration(value: Double): Self = StObject.set(x, "preferredForwardBufferDuration", value.asInstanceOf[js.Any])
    
    inline def setPreferredForwardBufferDurationUndefined: Self = StObject.set(x, "preferredForwardBufferDuration", js.undefined)
    
    inline def setPreventsDisplaySleepDuringVideoPlayback(value: Boolean): Self = StObject.set(x, "preventsDisplaySleepDuringVideoPlayback", value.asInstanceOf[js.Any])
    
    inline def setPreventsDisplaySleepDuringVideoPlaybackUndefined: Self = StObject.set(x, "preventsDisplaySleepDuringVideoPlayback", js.undefined)
    
    inline def setProgressUpdateInterval(value: Double): Self = StObject.set(x, "progressUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateIntervalUndefined: Self = StObject.set(x, "progressUpdateInterval", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setReportBandwidth(value: Boolean): Self = StObject.set(x, "reportBandwidth", value.asInstanceOf[js.Any])
    
    inline def setReportBandwidthUndefined: Self = StObject.set(x, "reportBandwidth", js.undefined)
    
    inline def setResizeMode(value: stretch | contain | cover | none): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setSeek(value: Double): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
    
    inline def setSeekUndefined: Self = StObject.set(x, "seek", js.undefined)
    
    inline def setSelectedAudioTrack(value: Type): Self = StObject.set(x, "selectedAudioTrack", value.asInstanceOf[js.Any])
    
    inline def setSelectedAudioTrackUndefined: Self = StObject.set(x, "selectedAudioTrack", js.undefined)
    
    inline def setSelectedTextTrack(value: Type): Self = StObject.set(x, "selectedTextTrack", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextTrackUndefined: Self = StObject.set(x, "selectedTextTrack", js.undefined)
    
    inline def setSelectedVideoTrack(value: Value): Self = StObject.set(x, "selectedVideoTrack", value.asInstanceOf[js.Any])
    
    inline def setSelectedVideoTrackUndefined: Self = StObject.set(x, "selectedVideoTrack", js.undefined)
    
    inline def setSource(value: Headers | Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: Any): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStereoPan(value: Double): Self = StObject.set(x, "stereoPan", value.asInstanceOf[js.Any])
    
    inline def setStereoPanUndefined: Self = StObject.set(x, "stereoPan", js.undefined)
    
    inline def setTextTracks(value: js.Array[Language]): Self = StObject.set(x, "textTracks", value.asInstanceOf[js.Any])
    
    inline def setTextTracksUndefined: Self = StObject.set(x, "textTracks", js.undefined)
    
    inline def setTextTracksVarargs(value: Language*): Self = StObject.set(x, "textTracks", js.Array(value*))
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    inline def setUseTextureView(value: Boolean): Self = StObject.set(x, "useTextureView", value.asInstanceOf[js.Any])
    
    inline def setUseTextureViewUndefined: Self = StObject.set(x, "useTextureView", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
