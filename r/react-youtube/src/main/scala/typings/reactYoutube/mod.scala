package typings.reactYoutube

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.Requireable
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactYoutube.reactYoutubeStrings.`lazy`
import typings.reactYoutube.reactYoutubeStrings.eager
import typings.std.HTMLDivElement
import typings.youtubePlayer.distTypesMod.Options
import typings.youtubePlayer.distTypesMod.YouTubePlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-youtube", JSImport.Default)
  @js.native
  open class default protected () extends YouTube {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("react-youtube", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Expose PlayerState constants for convenience. These constants can also be
      * accessed through the global YT object after the YouTube IFrame API is instantiated.
      * https://developers.google.com/youtube/iframe_api_reference#onStateChange
      */
    /* static member */
    object PlayerState {
      
      @JSImport("react-youtube", "default.PlayerState")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-youtube", "default.PlayerState.BUFFERING")
      @js.native
      def BUFFERING: Double = js.native
      inline def BUFFERING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFERING")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.PlayerState.CUED")
      @js.native
      def CUED: Double = js.native
      inline def CUED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CUED")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.PlayerState.ENDED")
      @js.native
      def ENDED: Double = js.native
      inline def ENDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENDED")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.PlayerState.PAUSED")
      @js.native
      def PAUSED: Double = js.native
      inline def PAUSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSED")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.PlayerState.PLAYING")
      @js.native
      def PLAYING: Double = js.native
      inline def PLAYING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAYING")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.PlayerState.UNSTARTED")
      @js.native
      def UNSTARTED: Double = js.native
      inline def UNSTARTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSTARTED")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("react-youtube", "default.defaultProps")
    @js.native
    def defaultProps: YouTubeProps = js.native
    inline def defaultProps_=(x: YouTubeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("react-youtube", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-youtube", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.iframeClassName")
      @js.native
      def iframeClassName: Requireable[String] = js.native
      inline def iframeClassName_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iframeClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.loading")
      @js.native
      def loading: Requireable[String] = js.native
      inline def loading_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.onEnd")
      @js.native
      def onEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onEnd_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.onError")
      @js.native
      def onError: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onError_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.onPause")
      @js.native
      def onPause: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onPause_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPause")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.onPlay")
      @js.native
      def onPlay: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onPlay_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.onPlaybackQualityChange")
      @js.native
      def onPlaybackQualityChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onPlaybackQualityChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackQualityChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.onPlaybackRateChange")
      @js.native
      def onPlaybackRateChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onPlaybackRateChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackRateChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.onReady")
      @js.native
      def onReady: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onReady_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReady")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.onStateChange")
      @js.native
      def onStateChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onStateChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.opts")
      @js.native
      def opts: Requireable[StringDictionary[Any]] = js.native
      inline def opts_=(x: Requireable[StringDictionary[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opts")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.style")
      @js.native
      def style: Requireable[js.Object] = js.native
      inline def style_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.title")
      @js.native
      def title: Requireable[String] = js.native
      inline def title_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSImport("react-youtube", "default.propTypes.videoId")
      @js.native
      def videoId: Requireable[String] = js.native
      inline def videoId_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videoId")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait YouTube
    extends Component[YouTubeProps, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MYouTube(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MYouTube(prevProps: YouTubeProps): js.Promise[Unit] = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MYouTube(): Unit = js.native
    
    var container: HTMLDivElement | Null = js.native
    
    /**
      * Initialize the YouTube Player API on the container and attach event handlers
      */
    def createPlayer(): Unit = js.native
    
    /**
      * Destroy the YouTube Player using its async API and store the promise so we
      * can await before re-creating it.
      */
    def destroyPlayer(): js.Promise[Unit] = js.native
    
    /**
      * Note: The `youtube-player` package that is used promisifies all YouTube
      * Player API calls, which introduces a delay of a tick before it actually
      * gets destroyed.
      *
      * The promise to destroy the player is stored here so we can make sure to
      * only re-create the Player after it's been destroyed.
      *
      * See: https://github.com/tjallingt/react-youtube/issues/355
      */
    var destroyPlayerPromise: js.UndefOr[js.Promise[Unit]] = js.native
    
    /**
      *  Method to return the internalPlayer object.
      */
    def getInternalPlayer(): YouTubePlayer | Null = js.native
    
    var internalPlayer: YouTubePlayer | Null = js.native
    
    /**
      * This event fires if an error occurs in the player.
      * https://developers.google.com/youtube/iframe_api_reference#onError
      */
    def onPlayerError(event: YouTubeEvent[Double]): js.UndefOr[Unit] = js.native
    
    /**
      * This event fires whenever the video playback rate changes.
      * https://developers.google.com/youtube/iframe_api_reference#onPlaybackQualityChange
      */
    def onPlayerPlaybackQualityChange(event: YouTubeEvent[String]): js.UndefOr[Unit] = js.native
    
    /**
      * This event fires whenever the video playback quality changes.
      * https://developers.google.com/youtube/iframe_api_reference#onPlaybackRateChange
      */
    def onPlayerPlaybackRateChange(event: YouTubeEvent[Double]): js.UndefOr[Unit] = js.native
    
    /**
      * This event fires whenever a player has finished loading and is ready to begin receiving API calls.
      * https://developers.google.com/youtube/iframe_api_reference#onReady
      */
    def onPlayerReady(event: YouTubeEvent[Any]): js.UndefOr[Unit] = js.native
    
    /**
      * This event fires whenever the video playback quality changes.
      * https://developers.google.com/youtube/iframe_api_reference#onStateChange
      */
    def onPlayerStateChange(event: YouTubeEvent[Double]): Unit = js.native
    
    def refContainer(container: HTMLDivElement): Unit = js.native
    
    /**
      * Shorthand for destroying and then re-creating the YouTube Player
      */
    def resetPlayer(): js.Promise[Unit] = js.native
    
    /**
      * Method to update the id and class of the YouTube Player iframe.
      * React should update this automatically but since the YouTube Player API
      * replaced the DIV that is mounted by React we need to do this manually.
      */
    def updatePlayer(): Unit = js.native
    
    /**
      * Call YouTube Player API methods to update the currently playing video.
      * Depending on the `opts.playerVars.autoplay` this function uses one of two
      * YouTube Player API methods to update the video.
      */
    def updateVideo(): Unit = js.native
  }
  
  trait YouTubeEvent[T] extends StObject {
    
    var data: T
    
    var target: YouTubePlayer
  }
  object YouTubeEvent {
    
    inline def apply[T](data: T, target: YouTubePlayer): YouTubeEvent[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[YouTubeEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YouTubeEvent[?], T] (val x: Self & YouTubeEvent[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: YouTubePlayer): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait YouTubeProps extends StObject {
    
    /**
      * Custom class name for the player element
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Custom ID for the player element
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Custom class name for the iframe element
      */
    var iframeClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates how the browser should load the iframe
      * {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe#attr-loading}
      */
    var loading: js.UndefOr[eager | `lazy`] = js.undefined
    
    /**
      * This event fires when the layer's state changes to PlayerState.ENDED.
      */
    var onEnd: js.UndefOr[js.Function1[/* event */ YouTubeEvent[Double], Unit]] = js.undefined
    
    /**
      * This event fires if an error occurs in the player.
      * {@link https://developers.google.com/youtube/iframe_api_reference#onError}
      */
    var onError: js.UndefOr[js.Function1[/* event */ YouTubeEvent[Double], Unit]] = js.undefined
    
    /**
      * This event fires when the layer's state changes to PlayerState.PAUSED.
      */
    var onPause: js.UndefOr[js.Function1[/* event */ YouTubeEvent[Double], Unit]] = js.undefined
    
    /**
      * This event fires when the layer's state changes to PlayerState.PLAYING.
      */
    var onPlay: js.UndefOr[js.Function1[/* event */ YouTubeEvent[Double], Unit]] = js.undefined
    
    /**
      * This event fires whenever the video playback rate changes.
      * {@link https://developers.google.com/youtube/iframe_api_reference#onPlaybackQualityChange}
      */
    var onPlaybackQualityChange: js.UndefOr[js.Function1[/* event */ YouTubeEvent[String], Unit]] = js.undefined
    
    /**
      * This event fires whenever the video playback quality changes.
      * {@link https://developers.google.com/youtube/iframe_api_reference#onPlaybackRateChange}
      */
    var onPlaybackRateChange: js.UndefOr[js.Function1[/* event */ YouTubeEvent[Double], Unit]] = js.undefined
    
    /**
      * This event fires whenever a player has finished loading and is ready to begin receiving API calls.
      * {@link https://developers.google.com/youtube/iframe_api_reference#onReady}
      */
    var onReady: js.UndefOr[js.Function1[/* event */ YouTubeEvent[Any], Unit]] = js.undefined
    
    /**
      * This event fires whenever the player's state changes.
      * {@link https://developers.google.com/youtube/iframe_api_reference#onStateChange}
      */
    var onStateChange: js.UndefOr[js.Function1[/* event */ YouTubeEvent[Double], Unit]] = js.undefined
    
    /**
      * An object that specifies player options
      * {@link https://developers.google.com/youtube/iframe_api_reference#Loading_a_Video_Player}
      */
    var opts: js.UndefOr[Options] = js.undefined
    
    /**
      * Custom style for the player container element
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Title of the video for the iframe's title tag.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The YouTube video ID.
      *
      * Examples
      * - https://www.youtube.com/watch?v=XxVg_s8xAms (`XxVg_s8xAms` is the ID)
      * - https://www.youtube.com/embed/-DX3vJiqxm4 (`-DX3vJiqxm4` is the ID)
      */
    var videoId: js.UndefOr[String] = js.undefined
  }
  object YouTubeProps {
    
    inline def apply(): YouTubeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YouTubeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YouTubeProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIframeClassName(value: String): Self = StObject.set(x, "iframeClassName", value.asInstanceOf[js.Any])
      
      inline def setIframeClassNameUndefined: Self = StObject.set(x, "iframeClassName", js.undefined)
      
      inline def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnEnd(value: /* event */ YouTubeEvent[Double] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnError(value: /* event */ YouTubeEvent[Double] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnPause(value: /* event */ YouTubeEvent[Double] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: /* event */ YouTubeEvent[Double] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaybackQualityChange(value: /* event */ YouTubeEvent[String] => Unit): Self = StObject.set(x, "onPlaybackQualityChange", js.Any.fromFunction1(value))
      
      inline def setOnPlaybackQualityChangeUndefined: Self = StObject.set(x, "onPlaybackQualityChange", js.undefined)
      
      inline def setOnPlaybackRateChange(value: /* event */ YouTubeEvent[Double] => Unit): Self = StObject.set(x, "onPlaybackRateChange", js.Any.fromFunction1(value))
      
      inline def setOnPlaybackRateChangeUndefined: Self = StObject.set(x, "onPlaybackRateChange", js.undefined)
      
      inline def setOnReady(value: /* event */ YouTubeEvent[Any] => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnStateChange(value: /* event */ YouTubeEvent[Double] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setOpts(value: Options): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
      
      inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    }
  }
}
