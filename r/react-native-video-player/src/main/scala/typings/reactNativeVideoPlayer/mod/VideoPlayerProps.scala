package typings.reactNativeVideoPlayer.mod

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeVideoPlayer.anon.ControlButton
import typings.reactNativeVideoPlayer.anon.MainVer
import typings.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.contain
import typings.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.cover
import typings.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.none
import typings.reactNativeVideoPlayer.reactNativeVideoPlayerStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoPlayerProps extends js.Object {
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var controlsTimeout: js.UndefOr[Double] = js.native
  
  var customStyles: js.UndefOr[ControlButton] = js.native
  
  var defaultMuted: js.UndefOr[Boolean] = js.native
  
  var disableControlsAutoHide: js.UndefOr[Boolean] = js.native
  
  var disableFullscreen: js.UndefOr[Boolean] = js.native
  
  var disableSeek: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var endThumbnail: js.UndefOr[ImageSourcePropType] = js.native
  
  var endWithThumbnail: js.UndefOr[Boolean] = js.native
  
  var fullScreenOnLongPress: js.UndefOr[Boolean] = js.native
  
  var hideControlsOnStart: js.UndefOr[Boolean] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var muted: js.UndefOr[Boolean] = js.native
  
  var onEnd: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  var onHideControls: js.UndefOr[js.Function0[_]] = js.native
  
  var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  var onMutePress: js.UndefOr[js.Function0[_]] = js.native
  
  var onPlayPress: js.UndefOr[js.Function0[_]] = js.native
  
  var onProgress: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.native
  
  var onShowControls: js.UndefOr[js.Function0[_]] = js.native
  
  var onStart: js.UndefOr[js.Function0[_]] = js.native
  
  var pauseOnPress: js.UndefOr[Boolean] = js.native
  
  var paused: js.UndefOr[Boolean] = js.native
  
  var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var thumbnail: js.UndefOr[ImageSourcePropType] = js.native
  
  var video: js.UndefOr[MainVer | Double] = js.native
  
  var videoHeight: js.UndefOr[Double] = js.native
  
  var videoWidth: js.UndefOr[Double] = js.native
}
object VideoPlayerProps {
  
  @scala.inline
  def apply(): VideoPlayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayerProps]
  }
  
  @scala.inline
  implicit class VideoPlayerPropsOps[Self <: VideoPlayerProps] (val x: Self) extends AnyVal {
    
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setControlsTimeout(value: Double): Self = this.set("controlsTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlsTimeout: Self = this.set("controlsTimeout", js.undefined)
    
    @scala.inline
    def setCustomStyles(value: ControlButton): Self = this.set("customStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStyles: Self = this.set("customStyles", js.undefined)
    
    @scala.inline
    def setDefaultMuted(value: Boolean): Self = this.set("defaultMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMuted: Self = this.set("defaultMuted", js.undefined)
    
    @scala.inline
    def setDisableControlsAutoHide(value: Boolean): Self = this.set("disableControlsAutoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableControlsAutoHide: Self = this.set("disableControlsAutoHide", js.undefined)
    
    @scala.inline
    def setDisableFullscreen(value: Boolean): Self = this.set("disableFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFullscreen: Self = this.set("disableFullscreen", js.undefined)
    
    @scala.inline
    def setDisableSeek(value: Boolean): Self = this.set("disableSeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSeek: Self = this.set("disableSeek", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEndThumbnailVarargs(value: ImageURISource*): Self = this.set("endThumbnail", js.Array(value :_*))
    
    @scala.inline
    def setEndThumbnail(value: ImageSourcePropType): Self = this.set("endThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndThumbnail: Self = this.set("endThumbnail", js.undefined)
    
    @scala.inline
    def setEndWithThumbnail(value: Boolean): Self = this.set("endWithThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndWithThumbnail: Self = this.set("endWithThumbnail", js.undefined)
    
    @scala.inline
    def setFullScreenOnLongPress(value: Boolean): Self = this.set("fullScreenOnLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreenOnLongPress: Self = this.set("fullScreenOnLongPress", js.undefined)
    
    @scala.inline
    def setHideControlsOnStart(value: Boolean): Self = this.set("hideControlsOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideControlsOnStart: Self = this.set("hideControlsOnStart", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setOnEnd(value: /* event */ js.Any => _): Self = this.set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnHideControls(value: () => _): Self = this.set("onHideControls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHideControls: Self = this.set("onHideControls", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* event */ js.Any => _): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnMutePress(value: () => _): Self = this.set("onMutePress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMutePress: Self = this.set("onMutePress", js.undefined)
    
    @scala.inline
    def setOnPlayPress(value: () => _): Self = this.set("onPlayPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPlayPress: Self = this.set("onPlayPress", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* event */ js.Any => _): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnShowControls(value: () => _): Self = this.set("onShowControls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShowControls: Self = this.set("onShowControls", js.undefined)
    
    @scala.inline
    def setOnStart(value: () => _): Self = this.set("onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setPauseOnPress(value: Boolean): Self = this.set("pauseOnPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnPress: Self = this.set("pauseOnPress", js.undefined)
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    
    @scala.inline
    def setResizeMode(value: stretch | contain | cover | none): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setThumbnailVarargs(value: ImageURISource*): Self = this.set("thumbnail", js.Array(value :_*))
    
    @scala.inline
    def setThumbnail(value: ImageSourcePropType): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setVideo(value: MainVer | Double): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setVideoHeight(value: Double): Self = this.set("videoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoHeight: Self = this.set("videoHeight", js.undefined)
    
    @scala.inline
    def setVideoWidth(value: Double): Self = this.set("videoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoWidth: Self = this.set("videoWidth", js.undefined)
  }
}
