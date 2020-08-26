package typings.reactNativeVideo.mod

import typings.reactNative.mod.ViewProps
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
  var source: Uri | Double = js.native
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
  def apply(source: Uri | Double): VideoProperties = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProperties]
  }
  @scala.inline
  implicit class VideoPropertiesOps[Self <: VideoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: Uri | Double): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowsExternalPlayback(value: Boolean): Self = this.set("allowsExternalPlayback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowsExternalPlayback: Self = this.set("allowsExternalPlayback", js.undefined)
    @scala.inline
    def setAudioOnly(value: Boolean): Self = this.set("audioOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioOnly: Self = this.set("audioOnly", js.undefined)
    @scala.inline
    def setAutomaticallyWaitsToMinimizeStalling(value: Boolean): Self = this.set("automaticallyWaitsToMinimizeStalling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticallyWaitsToMinimizeStalling: Self = this.set("automaticallyWaitsToMinimizeStalling", js.undefined)
    @scala.inline
    def setBufferConfig(value: BufferForPlaybackAfterRebufferMs): Self = this.set("bufferConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferConfig: Self = this.set("bufferConfig", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    @scala.inline
    def setDisableFocus(value: Boolean): Self = this.set("disableFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocus: Self = this.set("disableFocus", js.undefined)
    @scala.inline
    def setFilter(value: FilterType): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterEnable(value: Boolean): Self = this.set("filterEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterEnable: Self = this.set("filterEnable", js.undefined)
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setFullscreenAutorotate(value: Boolean): Self = this.set("fullscreenAutorotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenAutorotate: Self = this.set("fullscreenAutorotate", js.undefined)
    @scala.inline
    def setFullscreenOrientation(value: all | landscape | portrait): Self = this.set("fullscreenOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenOrientation: Self = this.set("fullscreenOrientation", js.undefined)
    @scala.inline
    def setHideShutterView(value: Boolean): Self = this.set("hideShutterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideShutterView: Self = this.set("hideShutterView", js.undefined)
    @scala.inline
    def setIgnoreSilentSwitch(value: ignore | obey): Self = this.set("ignoreSilentSwitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSilentSwitch: Self = this.set("ignoreSilentSwitch", js.undefined)
    @scala.inline
    def setMaxBitRate(value: Double): Self = this.set("maxBitRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBitRate: Self = this.set("maxBitRate", js.undefined)
    @scala.inline
    def setMinLoadRetryCount(value: Double): Self = this.set("minLoadRetryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLoadRetryCount: Self = this.set("minLoadRetryCount", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setOnAudioBecomingNoisy(value: () => Unit): Self = this.set("onAudioBecomingNoisy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAudioBecomingNoisy: Self = this.set("onAudioBecomingNoisy", js.undefined)
    @scala.inline
    def setOnAudioFocusChanged(value: () => Unit): Self = this.set("onAudioFocusChanged", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAudioFocusChanged: Self = this.set("onAudioFocusChanged", js.undefined)
    @scala.inline
    def setOnBandwidthUpdate(value: /* data */ OnBandwidthUpdateData => Unit): Self = this.set("onBandwidthUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBandwidthUpdate: Self = this.set("onBandwidthUpdate", js.undefined)
    @scala.inline
    def setOnBuffer(value: /* data */ OnBufferData => Unit): Self = this.set("onBuffer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBuffer: Self = this.set("onBuffer", js.undefined)
    @scala.inline
    def setOnEnd(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ LoadError => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnExternalPlaybackChange(value: /* data */ OnExternalPlaybackChangeData => Unit): Self = this.set("onExternalPlaybackChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExternalPlaybackChange: Self = this.set("onExternalPlaybackChange", js.undefined)
    @scala.inline
    def setOnFullscreenPlayerDidDismiss(value: () => Unit): Self = this.set("onFullscreenPlayerDidDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFullscreenPlayerDidDismiss: Self = this.set("onFullscreenPlayerDidDismiss", js.undefined)
    @scala.inline
    def setOnFullscreenPlayerDidPresent(value: () => Unit): Self = this.set("onFullscreenPlayerDidPresent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFullscreenPlayerDidPresent: Self = this.set("onFullscreenPlayerDidPresent", js.undefined)
    @scala.inline
    def setOnFullscreenPlayerWillDismiss(value: () => Unit): Self = this.set("onFullscreenPlayerWillDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFullscreenPlayerWillDismiss: Self = this.set("onFullscreenPlayerWillDismiss", js.undefined)
    @scala.inline
    def setOnFullscreenPlayerWillPresent(value: () => Unit): Self = this.set("onFullscreenPlayerWillPresent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFullscreenPlayerWillPresent: Self = this.set("onFullscreenPlayerWillPresent", js.undefined)
    @scala.inline
    def setOnLoad(value: /* data */ OnLoadData => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadStart(value: () => Unit): Self = this.set("onLoadStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnPictureInPictureStatusChanged(value: /* data */ OnPictureInPictureStatusData => Unit): Self = this.set("onPictureInPictureStatusChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPictureInPictureStatusChanged: Self = this.set("onPictureInPictureStatusChanged", js.undefined)
    @scala.inline
    def setOnPlaybackRateChange(value: /* data */ OnPlaybackRateData => Unit): Self = this.set("onPlaybackRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaybackRateChange: Self = this.set("onPlaybackRateChange", js.undefined)
    @scala.inline
    def setOnPlaybackResume(value: () => Unit): Self = this.set("onPlaybackResume", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPlaybackResume: Self = this.set("onPlaybackResume", js.undefined)
    @scala.inline
    def setOnPlaybackStalled(value: () => Unit): Self = this.set("onPlaybackStalled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPlaybackStalled: Self = this.set("onPlaybackStalled", js.undefined)
    @scala.inline
    def setOnProgress(value: /* data */ OnProgressData => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnReadyForDisplay(value: () => Unit): Self = this.set("onReadyForDisplay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnReadyForDisplay: Self = this.set("onReadyForDisplay", js.undefined)
    @scala.inline
    def setOnRestoreUserInterfaceForPictureInPictureStop(value: () => Unit): Self = this.set("onRestoreUserInterfaceForPictureInPictureStop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRestoreUserInterfaceForPictureInPictureStop: Self = this.set("onRestoreUserInterfaceForPictureInPictureStop", js.undefined)
    @scala.inline
    def setOnSeek(value: /* data */ OnSeekData => Unit): Self = this.set("onSeek", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeek: Self = this.set("onSeek", js.undefined)
    @scala.inline
    def setOnTimedMetadata(value: () => Unit): Self = this.set("onTimedMetadata", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTimedMetadata: Self = this.set("onTimedMetadata", js.undefined)
    @scala.inline
    def setOnVideoBuffer(value: () => Unit): Self = this.set("onVideoBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoBuffer: Self = this.set("onVideoBuffer", js.undefined)
    @scala.inline
    def setOnVideoEnd(value: () => Unit): Self = this.set("onVideoEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoEnd: Self = this.set("onVideoEnd", js.undefined)
    @scala.inline
    def setOnVideoError(value: () => Unit): Self = this.set("onVideoError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoError: Self = this.set("onVideoError", js.undefined)
    @scala.inline
    def setOnVideoFullscreenPlayerDidDismiss(value: () => Unit): Self = this.set("onVideoFullscreenPlayerDidDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoFullscreenPlayerDidDismiss: Self = this.set("onVideoFullscreenPlayerDidDismiss", js.undefined)
    @scala.inline
    def setOnVideoFullscreenPlayerDidPresent(value: () => Unit): Self = this.set("onVideoFullscreenPlayerDidPresent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoFullscreenPlayerDidPresent: Self = this.set("onVideoFullscreenPlayerDidPresent", js.undefined)
    @scala.inline
    def setOnVideoFullscreenPlayerWillDismiss(value: () => Unit): Self = this.set("onVideoFullscreenPlayerWillDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoFullscreenPlayerWillDismiss: Self = this.set("onVideoFullscreenPlayerWillDismiss", js.undefined)
    @scala.inline
    def setOnVideoFullscreenPlayerWillPresent(value: () => Unit): Self = this.set("onVideoFullscreenPlayerWillPresent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoFullscreenPlayerWillPresent: Self = this.set("onVideoFullscreenPlayerWillPresent", js.undefined)
    @scala.inline
    def setOnVideoLoad(value: () => Unit): Self = this.set("onVideoLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoLoad: Self = this.set("onVideoLoad", js.undefined)
    @scala.inline
    def setOnVideoLoadStart(value: () => Unit): Self = this.set("onVideoLoadStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoLoadStart: Self = this.set("onVideoLoadStart", js.undefined)
    @scala.inline
    def setOnVideoProgress(value: () => Unit): Self = this.set("onVideoProgress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoProgress: Self = this.set("onVideoProgress", js.undefined)
    @scala.inline
    def setOnVideoSeek(value: () => Unit): Self = this.set("onVideoSeek", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnVideoSeek: Self = this.set("onVideoSeek", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setPictureInPicture(value: Boolean): Self = this.set("pictureInPicture", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePictureInPicture: Self = this.set("pictureInPicture", js.undefined)
    @scala.inline
    def setPlayInBackground(value: Boolean): Self = this.set("playInBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayInBackground: Self = this.set("playInBackground", js.undefined)
    @scala.inline
    def setPlayWhenInactive(value: Boolean): Self = this.set("playWhenInactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayWhenInactive: Self = this.set("playWhenInactive", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def setPosterResizeMode(value: stretch | contain | cover | none): Self = this.set("posterResizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosterResizeMode: Self = this.set("posterResizeMode", js.undefined)
    @scala.inline
    def setProgressUpdateInterval(value: Double): Self = this.set("progressUpdateInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressUpdateInterval: Self = this.set("progressUpdateInterval", js.undefined)
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setRepeat(value: Boolean): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setReportBandwidth(value: Boolean): Self = this.set("reportBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportBandwidth: Self = this.set("reportBandwidth", js.undefined)
    @scala.inline
    def setResizeMode(value: stretch | contain | cover | none): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setSeek(value: Double): Self = this.set("seek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeek: Self = this.set("seek", js.undefined)
    @scala.inline
    def setSelectedAudioTrack(value: Type): Self = this.set("selectedAudioTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedAudioTrack: Self = this.set("selectedAudioTrack", js.undefined)
    @scala.inline
    def setSelectedTextTrack(value: Type): Self = this.set("selectedTextTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTextTrack: Self = this.set("selectedTextTrack", js.undefined)
    @scala.inline
    def setSelectedVideoTrack(value: Value): Self = this.set("selectedVideoTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedVideoTrack: Self = this.set("selectedVideoTrack", js.undefined)
    @scala.inline
    def setSrc(value: js.Any): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStereoPan(value: Double): Self = this.set("stereoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStereoPan: Self = this.set("stereoPan", js.undefined)
    @scala.inline
    def setTextTracksVarargs(value: Language*): Self = this.set("textTracks", js.Array(value :_*))
    @scala.inline
    def setTextTracks(value: js.Array[Language]): Self = this.set("textTracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTracks: Self = this.set("textTracks", js.undefined)
    @scala.inline
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    @scala.inline
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    @scala.inline
    def setUseTextureView(value: Boolean): Self = this.set("useTextureView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTextureView: Self = this.set("useTextureView", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

