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
import typings.reactNativeVideo.reactNativeVideoStrings.ignore
import typings.reactNativeVideo.reactNativeVideoStrings.landscape
import typings.reactNativeVideo.reactNativeVideoStrings.none
import typings.reactNativeVideo.reactNativeVideoStrings.obey
import typings.reactNativeVideo.reactNativeVideoStrings.portrait
import typings.reactNativeVideo.reactNativeVideoStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoProperties extends ViewProps {
  
  var allowsExternalPlayback: js.UndefOr[Boolean] = js.native
  
  var audioOnly: js.UndefOr[Boolean] = js.native
  
  var automaticallyWaitsToMinimizeStalling: js.UndefOr[Boolean] = js.native
  
  var bufferConfig: js.UndefOr[BufferForPlaybackAfterRebufferMs] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var currentTime: js.UndefOr[Double] = js.native
  
  var disableFocus: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[FilterType] = js.native
  
  var filterEnable: js.UndefOr[Boolean] = js.native
  
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  var fullscreenAutorotate: js.UndefOr[Boolean] = js.native
  
  var fullscreenOrientation: js.UndefOr[all | landscape | portrait] = js.native
  
  var hideShutterView: js.UndefOr[Boolean] = js.native
  
  var ignoreSilentSwitch: js.UndefOr[ignore | obey] = js.native
  
  var maxBitRate: js.UndefOr[Double] = js.native
  
  var minLoadRetryCount: js.UndefOr[Double] = js.native
  
  var muted: js.UndefOr[Boolean] = js.native
  
  var onAudioBecomingNoisy: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAudioFocusChanged: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBandwidthUpdate: js.UndefOr[js.Function1[/* data */ OnBandwidthUpdateData, Unit]] = js.native
  
  var onBuffer: js.UndefOr[js.Function1[/* data */ OnBufferData, Unit]] = js.native
  
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ LoadError, Unit]] = js.native
  
  var onExternalPlaybackChange: js.UndefOr[js.Function1[/* data */ OnExternalPlaybackChangeData, Unit]] = js.native
  
  var onFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function1[/* data */ OnLoadData, Unit]] = js.native
  
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPictureInPictureStatusChanged: js.UndefOr[js.Function1[/* data */ OnPictureInPictureStatusData, Unit]] = js.native
  
  var onPlaybackRateChange: js.UndefOr[js.Function1[/* data */ OnPlaybackRateData, Unit]] = js.native
  
  var onPlaybackResume: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPlaybackStalled: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onProgress: js.UndefOr[js.Function1[/* data */ OnProgressData, Unit]] = js.native
  
  var onReadyForDisplay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRestoreUserInterfaceForPictureInPictureStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSeek: js.UndefOr[js.Function1[/* data */ OnSeekData, Unit]] = js.native
  
  var onTimedMetadata: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoBuffer: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoError: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoFullscreenPlayerDidDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoFullscreenPlayerDidPresent: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoFullscreenPlayerWillDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoFullscreenPlayerWillPresent: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoProgress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onVideoSeek: js.UndefOr[js.Function0[Unit]] = js.native
  
  var paused: js.UndefOr[Boolean] = js.native
  
  var pictureInPicture: js.UndefOr[Boolean] = js.native
  
  var playInBackground: js.UndefOr[Boolean] = js.native
  
  var playWhenInactive: js.UndefOr[Boolean] = js.native
  
  // via Image#resizeMode
  var poster: js.UndefOr[String] = js.native
  
  // via Image#resizeMode
  var posterResizeMode: js.UndefOr[stretch | contain | cover | none] = js.native
  
  var preventsDisplaySleepDuringVideoPlayback: js.UndefOr[Boolean] = js.native
  
  var progressUpdateInterval: js.UndefOr[Double] = js.native
  
  var rate: js.UndefOr[Double] = js.native
  
  var repeat: js.UndefOr[Boolean] = js.native
  
  var reportBandwidth: js.UndefOr[Boolean] = js.native
  
  var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  /* Required by react-native */
  var scaleX: js.UndefOr[Double] = js.native
  
  var scaleY: js.UndefOr[Double] = js.native
  
  var seek: js.UndefOr[Double] = js.native
  
  var selectedAudioTrack: js.UndefOr[Type] = js.native
  
  var selectedTextTrack: js.UndefOr[Type] = js.native
  
  var selectedVideoTrack: js.UndefOr[Value] = js.native
  
  /* Wrapper component */
  // Opaque type returned by require('./video.mp4')
  var source: Headers | Double = js.native
  
  /* Native only */
  var src: js.UndefOr[js.Any] = js.native
  
  var stereoPan: js.UndefOr[Double] = js.native
  
  var textTracks: js.UndefOr[js.Array[Language]] = js.native
  
  var translateX: js.UndefOr[Double] = js.native
  
  var translateY: js.UndefOr[Double] = js.native
  
  var useTextureView: js.UndefOr[Boolean] = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object VideoProperties {
  
  @scala.inline
  def apply(source: Headers | Double): VideoProperties = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
  
  @scala.inline
  implicit class VideoPropertiesMutableBuilder[Self <: VideoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowsExternalPlayback(value: Boolean): Self = StObject.set(x, "allowsExternalPlayback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsExternalPlaybackUndefined: Self = StObject.set(x, "allowsExternalPlayback", js.undefined)
    
    @scala.inline
    def setAudioOnly(value: Boolean): Self = StObject.set(x, "audioOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioOnlyUndefined: Self = StObject.set(x, "audioOnly", js.undefined)
    
    @scala.inline
    def setAutomaticallyWaitsToMinimizeStalling(value: Boolean): Self = StObject.set(x, "automaticallyWaitsToMinimizeStalling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticallyWaitsToMinimizeStallingUndefined: Self = StObject.set(x, "automaticallyWaitsToMinimizeStalling", js.undefined)
    
    @scala.inline
    def setBufferConfig(value: BufferForPlaybackAfterRebufferMs): Self = StObject.set(x, "bufferConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferConfigUndefined: Self = StObject.set(x, "bufferConfig", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setDisableFocus(value: Boolean): Self = StObject.set(x, "disableFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusUndefined: Self = StObject.set(x, "disableFocus", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterType): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterEnable(value: Boolean): Self = StObject.set(x, "filterEnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterEnableUndefined: Self = StObject.set(x, "filterEnable", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenAutorotate(value: Boolean): Self = StObject.set(x, "fullscreenAutorotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenAutorotateUndefined: Self = StObject.set(x, "fullscreenAutorotate", js.undefined)
    
    @scala.inline
    def setFullscreenOrientation(value: all | landscape | portrait): Self = StObject.set(x, "fullscreenOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenOrientationUndefined: Self = StObject.set(x, "fullscreenOrientation", js.undefined)
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setHideShutterView(value: Boolean): Self = StObject.set(x, "hideShutterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideShutterViewUndefined: Self = StObject.set(x, "hideShutterView", js.undefined)
    
    @scala.inline
    def setIgnoreSilentSwitch(value: ignore | obey): Self = StObject.set(x, "ignoreSilentSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSilentSwitchUndefined: Self = StObject.set(x, "ignoreSilentSwitch", js.undefined)
    
    @scala.inline
    def setMaxBitRate(value: Double): Self = StObject.set(x, "maxBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitRateUndefined: Self = StObject.set(x, "maxBitRate", js.undefined)
    
    @scala.inline
    def setMinLoadRetryCount(value: Double): Self = StObject.set(x, "minLoadRetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLoadRetryCountUndefined: Self = StObject.set(x, "minLoadRetryCount", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setOnAudioBecomingNoisy(value: () => Unit): Self = StObject.set(x, "onAudioBecomingNoisy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAudioBecomingNoisyUndefined: Self = StObject.set(x, "onAudioBecomingNoisy", js.undefined)
    
    @scala.inline
    def setOnAudioFocusChanged(value: () => Unit): Self = StObject.set(x, "onAudioFocusChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAudioFocusChangedUndefined: Self = StObject.set(x, "onAudioFocusChanged", js.undefined)
    
    @scala.inline
    def setOnBandwidthUpdate(value: /* data */ OnBandwidthUpdateData => Unit): Self = StObject.set(x, "onBandwidthUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBandwidthUpdateUndefined: Self = StObject.set(x, "onBandwidthUpdate", js.undefined)
    
    @scala.inline
    def setOnBuffer(value: /* data */ OnBufferData => Unit): Self = StObject.set(x, "onBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBufferUndefined: Self = StObject.set(x, "onBuffer", js.undefined)
    
    @scala.inline
    def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ LoadError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnExternalPlaybackChange(value: /* data */ OnExternalPlaybackChangeData => Unit): Self = StObject.set(x, "onExternalPlaybackChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnExternalPlaybackChangeUndefined: Self = StObject.set(x, "onExternalPlaybackChange", js.undefined)
    
    @scala.inline
    def setOnFullscreenPlayerDidDismiss(value: () => Unit): Self = StObject.set(x, "onFullscreenPlayerDidDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFullscreenPlayerDidDismissUndefined: Self = StObject.set(x, "onFullscreenPlayerDidDismiss", js.undefined)
    
    @scala.inline
    def setOnFullscreenPlayerDidPresent(value: () => Unit): Self = StObject.set(x, "onFullscreenPlayerDidPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFullscreenPlayerDidPresentUndefined: Self = StObject.set(x, "onFullscreenPlayerDidPresent", js.undefined)
    
    @scala.inline
    def setOnFullscreenPlayerWillDismiss(value: () => Unit): Self = StObject.set(x, "onFullscreenPlayerWillDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFullscreenPlayerWillDismissUndefined: Self = StObject.set(x, "onFullscreenPlayerWillDismiss", js.undefined)
    
    @scala.inline
    def setOnFullscreenPlayerWillPresent(value: () => Unit): Self = StObject.set(x, "onFullscreenPlayerWillPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFullscreenPlayerWillPresentUndefined: Self = StObject.set(x, "onFullscreenPlayerWillPresent", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* data */ OnLoadData => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStart(value: () => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnPictureInPictureStatusChanged(value: /* data */ OnPictureInPictureStatusData => Unit): Self = StObject.set(x, "onPictureInPictureStatusChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPictureInPictureStatusChangedUndefined: Self = StObject.set(x, "onPictureInPictureStatusChanged", js.undefined)
    
    @scala.inline
    def setOnPlaybackRateChange(value: /* data */ OnPlaybackRateData => Unit): Self = StObject.set(x, "onPlaybackRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlaybackRateChangeUndefined: Self = StObject.set(x, "onPlaybackRateChange", js.undefined)
    
    @scala.inline
    def setOnPlaybackResume(value: () => Unit): Self = StObject.set(x, "onPlaybackResume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPlaybackResumeUndefined: Self = StObject.set(x, "onPlaybackResume", js.undefined)
    
    @scala.inline
    def setOnPlaybackStalled(value: () => Unit): Self = StObject.set(x, "onPlaybackStalled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPlaybackStalledUndefined: Self = StObject.set(x, "onPlaybackStalled", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* data */ OnProgressData => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnReadyForDisplay(value: () => Unit): Self = StObject.set(x, "onReadyForDisplay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadyForDisplayUndefined: Self = StObject.set(x, "onReadyForDisplay", js.undefined)
    
    @scala.inline
    def setOnRestoreUserInterfaceForPictureInPictureStop(value: () => Unit): Self = StObject.set(x, "onRestoreUserInterfaceForPictureInPictureStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRestoreUserInterfaceForPictureInPictureStopUndefined: Self = StObject.set(x, "onRestoreUserInterfaceForPictureInPictureStop", js.undefined)
    
    @scala.inline
    def setOnSeek(value: /* data */ OnSeekData => Unit): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
    
    @scala.inline
    def setOnTimedMetadata(value: () => Unit): Self = StObject.set(x, "onTimedMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTimedMetadataUndefined: Self = StObject.set(x, "onTimedMetadata", js.undefined)
    
    @scala.inline
    def setOnVideoBuffer(value: () => Unit): Self = StObject.set(x, "onVideoBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoBufferUndefined: Self = StObject.set(x, "onVideoBuffer", js.undefined)
    
    @scala.inline
    def setOnVideoEnd(value: () => Unit): Self = StObject.set(x, "onVideoEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoEndUndefined: Self = StObject.set(x, "onVideoEnd", js.undefined)
    
    @scala.inline
    def setOnVideoError(value: () => Unit): Self = StObject.set(x, "onVideoError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoErrorUndefined: Self = StObject.set(x, "onVideoError", js.undefined)
    
    @scala.inline
    def setOnVideoFullscreenPlayerDidDismiss(value: () => Unit): Self = StObject.set(x, "onVideoFullscreenPlayerDidDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoFullscreenPlayerDidDismissUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerDidDismiss", js.undefined)
    
    @scala.inline
    def setOnVideoFullscreenPlayerDidPresent(value: () => Unit): Self = StObject.set(x, "onVideoFullscreenPlayerDidPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoFullscreenPlayerDidPresentUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerDidPresent", js.undefined)
    
    @scala.inline
    def setOnVideoFullscreenPlayerWillDismiss(value: () => Unit): Self = StObject.set(x, "onVideoFullscreenPlayerWillDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoFullscreenPlayerWillDismissUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerWillDismiss", js.undefined)
    
    @scala.inline
    def setOnVideoFullscreenPlayerWillPresent(value: () => Unit): Self = StObject.set(x, "onVideoFullscreenPlayerWillPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoFullscreenPlayerWillPresentUndefined: Self = StObject.set(x, "onVideoFullscreenPlayerWillPresent", js.undefined)
    
    @scala.inline
    def setOnVideoLoad(value: () => Unit): Self = StObject.set(x, "onVideoLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoLoadStart(value: () => Unit): Self = StObject.set(x, "onVideoLoadStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoLoadStartUndefined: Self = StObject.set(x, "onVideoLoadStart", js.undefined)
    
    @scala.inline
    def setOnVideoLoadUndefined: Self = StObject.set(x, "onVideoLoad", js.undefined)
    
    @scala.inline
    def setOnVideoProgress(value: () => Unit): Self = StObject.set(x, "onVideoProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoProgressUndefined: Self = StObject.set(x, "onVideoProgress", js.undefined)
    
    @scala.inline
    def setOnVideoSeek(value: () => Unit): Self = StObject.set(x, "onVideoSeek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVideoSeekUndefined: Self = StObject.set(x, "onVideoSeek", js.undefined)
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    @scala.inline
    def setPictureInPicture(value: Boolean): Self = StObject.set(x, "pictureInPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureInPictureUndefined: Self = StObject.set(x, "pictureInPicture", js.undefined)
    
    @scala.inline
    def setPlayInBackground(value: Boolean): Self = StObject.set(x, "playInBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayInBackgroundUndefined: Self = StObject.set(x, "playInBackground", js.undefined)
    
    @scala.inline
    def setPlayWhenInactive(value: Boolean): Self = StObject.set(x, "playWhenInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayWhenInactiveUndefined: Self = StObject.set(x, "playWhenInactive", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterResizeMode(value: stretch | contain | cover | none): Self = StObject.set(x, "posterResizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterResizeModeUndefined: Self = StObject.set(x, "posterResizeMode", js.undefined)
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    @scala.inline
    def setPreventsDisplaySleepDuringVideoPlayback(value: Boolean): Self = StObject.set(x, "preventsDisplaySleepDuringVideoPlayback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventsDisplaySleepDuringVideoPlaybackUndefined: Self = StObject.set(x, "preventsDisplaySleepDuringVideoPlayback", js.undefined)
    
    @scala.inline
    def setProgressUpdateInterval(value: Double): Self = StObject.set(x, "progressUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdateIntervalUndefined: Self = StObject.set(x, "progressUpdateInterval", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setReportBandwidth(value: Boolean): Self = StObject.set(x, "reportBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportBandwidthUndefined: Self = StObject.set(x, "reportBandwidth", js.undefined)
    
    @scala.inline
    def setResizeMode(value: stretch | contain | cover | none): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setSeek(value: Double): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeekUndefined: Self = StObject.set(x, "seek", js.undefined)
    
    @scala.inline
    def setSelectedAudioTrack(value: Type): Self = StObject.set(x, "selectedAudioTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedAudioTrackUndefined: Self = StObject.set(x, "selectedAudioTrack", js.undefined)
    
    @scala.inline
    def setSelectedTextTrack(value: Type): Self = StObject.set(x, "selectedTextTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTextTrackUndefined: Self = StObject.set(x, "selectedTextTrack", js.undefined)
    
    @scala.inline
    def setSelectedVideoTrack(value: Value): Self = StObject.set(x, "selectedVideoTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedVideoTrackUndefined: Self = StObject.set(x, "selectedVideoTrack", js.undefined)
    
    @scala.inline
    def setSource(value: Headers | Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: js.Any): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setStereoPan(value: Double): Self = StObject.set(x, "stereoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStereoPanUndefined: Self = StObject.set(x, "stereoPan", js.undefined)
    
    @scala.inline
    def setTextTracks(value: js.Array[Language]): Self = StObject.set(x, "textTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTracksUndefined: Self = StObject.set(x, "textTracks", js.undefined)
    
    @scala.inline
    def setTextTracksVarargs(value: Language*): Self = StObject.set(x, "textTracks", js.Array(value :_*))
    
    @scala.inline
    def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    @scala.inline
    def setUseTextureView(value: Boolean): Self = StObject.set(x, "useTextureView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTextureViewUndefined: Self = StObject.set(x, "useTextureView", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
