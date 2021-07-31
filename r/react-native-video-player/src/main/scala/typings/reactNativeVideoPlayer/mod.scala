package typings.reactNativeVideoPlayer

import typings.react.mod.Component
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-video-player", JSImport.Default)
  @js.native
  class default protected () extends VideoPlayer {
    def this(props: js.Object) = this()
  }
  
  @js.native
  trait VideoPlayer
    extends Component[VideoPlayerProps, VideoPlayerState, js.Any] {
    
    /* private */ def getSizeStyles(): js.Any = js.native
    
    /* private */ def hideControls(): js.Any = js.native
    
    /* private */ def onEnd(event: js.Any): js.Any = js.native
    
    /* private */ def onLayout(event: js.Any): js.Any = js.native
    
    /* private */ def onLoad(event: js.Any): js.Any = js.native
    
    /* private */ def onMutePress(): js.Any = js.native
    
    /* private */ def onPlayPress(): js.Any = js.native
    
    /* private */ def onProgress(event: js.Any): js.Any = js.native
    
    /* private */ def onSeek(event: js.Any): js.Any = js.native
    
    /* private */ def onSeekBarLayout(event: js.Any): js.Any = js.native
    
    /* private */ def onSeekGrant(event: js.Any): js.Any = js.native
    
    /* private */ def onSeekRelease(): js.Any = js.native
    
    /* private */ def onStartPress(): js.Any = js.native
    
    /* private */ def onToggleFullScreen(): js.Any = js.native
    
    def pause(): js.Any = js.native
    
    def resume(): js.Any = js.native
    
    def seek(t: Double): js.Any = js.native
    
    var seekBarWidth: Double = js.native
    
    var seekProgressStart: Double = js.native
    
    var seekTouchStart: Double = js.native
    
    /* private */ def showControls(): js.Any = js.native
    
    def stop(): js.Any = js.native
    
    var wasPlayingBeforeSeek: Boolean = js.native
  }
  
  trait VideoPlayerProps extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var controlsTimeout: js.UndefOr[Double] = js.undefined
    
    var customStyles: js.UndefOr[ControlButton] = js.undefined
    
    var defaultMuted: js.UndefOr[Boolean] = js.undefined
    
    var disableControlsAutoHide: js.UndefOr[Boolean] = js.undefined
    
    var disableFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var disableSeek: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var endThumbnail: js.UndefOr[ImageSourcePropType] = js.undefined
    
    var endWithThumbnail: js.UndefOr[Boolean] = js.undefined
    
    var fullScreenOnLongPress: js.UndefOr[Boolean] = js.undefined
    
    var hideControlsOnStart: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
    
    var onHideControls: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
    
    var onMutePress: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onPlayPress: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* event */ js.Any, js.Any]] = js.undefined
    
    var onShowControls: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onStart: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var pauseOnPress: js.UndefOr[Boolean] = js.undefined
    
    var paused: js.UndefOr[Boolean] = js.undefined
    
    var resizeMode: js.UndefOr[stretch | contain | cover | none] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var thumbnail: js.UndefOr[ImageSourcePropType] = js.undefined
    
    var video: js.UndefOr[MainVer | Double] = js.undefined
    
    var videoHeight: js.UndefOr[Double] = js.undefined
    
    var videoWidth: js.UndefOr[Double] = js.undefined
  }
  object VideoPlayerProps {
    
    @scala.inline
    def apply(): VideoPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoPlayerProps]
    }
    
    @scala.inline
    implicit class VideoPlayerPropsMutableBuilder[Self <: VideoPlayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setControlsTimeout(value: Double): Self = StObject.set(x, "controlsTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsTimeoutUndefined: Self = StObject.set(x, "controlsTimeout", js.undefined)
      
      @scala.inline
      def setCustomStyles(value: ControlButton): Self = StObject.set(x, "customStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomStylesUndefined: Self = StObject.set(x, "customStyles", js.undefined)
      
      @scala.inline
      def setDefaultMuted(value: Boolean): Self = StObject.set(x, "defaultMuted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMutedUndefined: Self = StObject.set(x, "defaultMuted", js.undefined)
      
      @scala.inline
      def setDisableControlsAutoHide(value: Boolean): Self = StObject.set(x, "disableControlsAutoHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableControlsAutoHideUndefined: Self = StObject.set(x, "disableControlsAutoHide", js.undefined)
      
      @scala.inline
      def setDisableFullscreen(value: Boolean): Self = StObject.set(x, "disableFullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFullscreenUndefined: Self = StObject.set(x, "disableFullscreen", js.undefined)
      
      @scala.inline
      def setDisableSeek(value: Boolean): Self = StObject.set(x, "disableSeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSeekUndefined: Self = StObject.set(x, "disableSeek", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEndThumbnail(value: ImageSourcePropType): Self = StObject.set(x, "endThumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndThumbnailUndefined: Self = StObject.set(x, "endThumbnail", js.undefined)
      
      @scala.inline
      def setEndThumbnailVarargs(value: ImageURISource*): Self = StObject.set(x, "endThumbnail", js.Array(value :_*))
      
      @scala.inline
      def setEndWithThumbnail(value: Boolean): Self = StObject.set(x, "endWithThumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndWithThumbnailUndefined: Self = StObject.set(x, "endWithThumbnail", js.undefined)
      
      @scala.inline
      def setFullScreenOnLongPress(value: Boolean): Self = StObject.set(x, "fullScreenOnLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenOnLongPressUndefined: Self = StObject.set(x, "fullScreenOnLongPress", js.undefined)
      
      @scala.inline
      def setHideControlsOnStart(value: Boolean): Self = StObject.set(x, "hideControlsOnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideControlsOnStartUndefined: Self = StObject.set(x, "hideControlsOnStart", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnHideControls(value: () => js.Any): Self = StObject.set(x, "onHideControls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideControlsUndefined: Self = StObject.set(x, "onHideControls", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnMutePress(value: () => js.Any): Self = StObject.set(x, "onMutePress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMutePressUndefined: Self = StObject.set(x, "onMutePress", js.undefined)
      
      @scala.inline
      def setOnPlayPress(value: () => js.Any): Self = StObject.set(x, "onPlayPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPlayPressUndefined: Self = StObject.set(x, "onPlayPress", js.undefined)
      
      @scala.inline
      def setOnProgress(value: /* event */ js.Any => js.Any): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnShowControls(value: () => js.Any): Self = StObject.set(x, "onShowControls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowControlsUndefined: Self = StObject.set(x, "onShowControls", js.undefined)
      
      @scala.inline
      def setOnStart(value: () => js.Any): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setPauseOnPress(value: Boolean): Self = StObject.set(x, "pauseOnPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnPressUndefined: Self = StObject.set(x, "pauseOnPress", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setResizeMode(value: stretch | contain | cover | none): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setThumbnail(value: ImageSourcePropType): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      @scala.inline
      def setThumbnailVarargs(value: ImageURISource*): Self = StObject.set(x, "thumbnail", js.Array(value :_*))
      
      @scala.inline
      def setVideo(value: MainVer | Double): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoHeight(value: Double): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoHeightUndefined: Self = StObject.set(x, "videoHeight", js.undefined)
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      @scala.inline
      def setVideoWidth(value: Double): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoWidthUndefined: Self = StObject.set(x, "videoWidth", js.undefined)
    }
  }
  
  trait VideoPlayerState extends StObject {
    
    var duration: Double
    
    var hasEnded: Boolean
    
    var isControlsVisible: Boolean
    
    var isMuted: Boolean
    
    var isPlaying: Boolean
    
    var isSeeking: Boolean
    
    var isStarted: Boolean
    
    var progress: Double
    
    var width: Double
  }
  object VideoPlayerState {
    
    @scala.inline
    def apply(
      duration: Double,
      hasEnded: Boolean,
      isControlsVisible: Boolean,
      isMuted: Boolean,
      isPlaying: Boolean,
      isSeeking: Boolean,
      isStarted: Boolean,
      progress: Double,
      width: Double
    ): VideoPlayerState = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], hasEnded = hasEnded.asInstanceOf[js.Any], isControlsVisible = isControlsVisible.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], isSeeking = isSeeking.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoPlayerState]
    }
    
    @scala.inline
    implicit class VideoPlayerStateMutableBuilder[Self <: VideoPlayerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasEnded(value: Boolean): Self = StObject.set(x, "hasEnded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsControlsVisible(value: Boolean): Self = StObject.set(x, "isControlsVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSeeking(value: Boolean): Self = StObject.set(x, "isSeeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStarted(value: Boolean): Self = StObject.set(x, "isStarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
