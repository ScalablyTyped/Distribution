package typings.reactPlayer

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactPlayer.anon.Children
import typings.reactPlayer.reactPlayerStrings.fraction
import typings.reactPlayer.reactPlayerStrings.seconds
import typings.std.MediaStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("react-player/base", JSImport.Default)
  @js.native
  open class default[T /* <: BaseReactPlayerProps */] () extends BaseReactPlayer[T]
  /* static members */
  object default {
    
    @JSImport("react-player/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addCustomPlayer(player: typings.reactPlayer.mod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomPlayer")(player.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def canEnablePIP(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canEnablePIP")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def canPlay(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canPlay")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def removeCustomPlayers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomPlayers")().asInstanceOf[Unit]
  }
  
  @js.native
  trait BaseReactPlayer[T /* <: BaseReactPlayerProps */] extends Component[T, Any, Any] {
    
    def getCurrentTime(): Double = js.native
    
    def getDuration(): Double = js.native
    
    def getInternalPlayer(): Record[String, Any] = js.native
    def getInternalPlayer(key: String): Record[String, Any] = js.native
    
    def getSecondsLoaded(): Double = js.native
    
    def seekTo(amount: Double): Unit = js.native
    def seekTo(amount: Double, `type`: seconds | fraction): Unit = js.native
    
    def showPreview(): Unit = js.native
  }
  
  trait BaseReactPlayerProps
    extends StObject
       with /* otherProps */ StringDictionary[Any] {
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var fallback: js.UndefOr[ReactElement] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var light: js.UndefOr[Boolean | String | ReactElement] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var onBuffer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onBufferEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClickPreview: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var onDisablePIP: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDuration: js.UndefOr[js.Function1[/* duration */ Double, Unit]] = js.undefined
    
    var onEnablePIP: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEnded: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[
        js.Function4[
          /* error */ Any, 
          /* data */ js.UndefOr[Any], 
          /* hlsInstance */ js.UndefOr[Any], 
          /* hlsGlobal */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* state */ OnProgressProps, Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.Function1[/* player */ typings.reactPlayer.mod.default, Unit]] = js.undefined
    
    var onSeek: js.UndefOr[js.Function1[/* seconds */ Double, Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pip: js.UndefOr[Boolean] = js.undefined
    
    var playIcon: js.UndefOr[ReactElement] = js.undefined
    
    var playbackRate: js.UndefOr[Double] = js.undefined
    
    var playing: js.UndefOr[Boolean] = js.undefined
    
    var playsinline: js.UndefOr[Boolean] = js.undefined
    
    var previewTabIndex: js.UndefOr[Double | Null] = js.undefined
    
    var progressInterval: js.UndefOr[Double] = js.undefined
    
    var stopOnUnmount: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var url: js.UndefOr[String | (js.Array[SourceProps | String]) | MediaStream] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var wrapper: js.UndefOr[ComponentType[Children]] = js.undefined
  }
  object BaseReactPlayerProps {
    
    inline def apply(): BaseReactPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseReactPlayerProps]
    }
    
    extension [Self <: BaseReactPlayerProps](x: Self) {
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLight(value: Boolean | String | ReactElement): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setOnBuffer(value: () => Unit): Self = StObject.set(x, "onBuffer", js.Any.fromFunction0(value))
      
      inline def setOnBufferEnd(value: () => Unit): Self = StObject.set(x, "onBufferEnd", js.Any.fromFunction0(value))
      
      inline def setOnBufferEndUndefined: Self = StObject.set(x, "onBufferEnd", js.undefined)
      
      inline def setOnBufferUndefined: Self = StObject.set(x, "onBuffer", js.undefined)
      
      inline def setOnClickPreview(value: /* event */ Any => Unit): Self = StObject.set(x, "onClickPreview", js.Any.fromFunction1(value))
      
      inline def setOnClickPreviewUndefined: Self = StObject.set(x, "onClickPreview", js.undefined)
      
      inline def setOnDisablePIP(value: () => Unit): Self = StObject.set(x, "onDisablePIP", js.Any.fromFunction0(value))
      
      inline def setOnDisablePIPUndefined: Self = StObject.set(x, "onDisablePIP", js.undefined)
      
      inline def setOnDuration(value: /* duration */ Double => Unit): Self = StObject.set(x, "onDuration", js.Any.fromFunction1(value))
      
      inline def setOnDurationUndefined: Self = StObject.set(x, "onDuration", js.undefined)
      
      inline def setOnEnablePIP(value: () => Unit): Self = StObject.set(x, "onEnablePIP", js.Any.fromFunction0(value))
      
      inline def setOnEnablePIPUndefined: Self = StObject.set(x, "onEnablePIP", js.undefined)
      
      inline def setOnEnded(value: () => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction0(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(
        value: (/* error */ Any, /* data */ js.UndefOr[Any], /* hlsInstance */ js.UndefOr[Any], /* hlsGlobal */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: () => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnProgress(value: /* state */ OnProgressProps => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnReady(value: /* player */ typings.reactPlayer.mod.default => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnSeek(value: /* seconds */ Double => Unit): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
      
      inline def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
      
      inline def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setPip(value: Boolean): Self = StObject.set(x, "pip", value.asInstanceOf[js.Any])
      
      inline def setPipUndefined: Self = StObject.set(x, "pip", js.undefined)
      
      inline def setPlayIcon(value: ReactElement): Self = StObject.set(x, "playIcon", value.asInstanceOf[js.Any])
      
      inline def setPlayIconUndefined: Self = StObject.set(x, "playIcon", js.undefined)
      
      inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
      
      inline def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
      
      inline def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      inline def setPreviewTabIndex(value: Double): Self = StObject.set(x, "previewTabIndex", value.asInstanceOf[js.Any])
      
      inline def setPreviewTabIndexNull: Self = StObject.set(x, "previewTabIndex", null)
      
      inline def setPreviewTabIndexUndefined: Self = StObject.set(x, "previewTabIndex", js.undefined)
      
      inline def setProgressInterval(value: Double): Self = StObject.set(x, "progressInterval", value.asInstanceOf[js.Any])
      
      inline def setProgressIntervalUndefined: Self = StObject.set(x, "progressInterval", js.undefined)
      
      inline def setStopOnUnmount(value: Boolean): Self = StObject.set(x, "stopOnUnmount", value.asInstanceOf[js.Any])
      
      inline def setStopOnUnmountUndefined: Self = StObject.set(x, "stopOnUnmount", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUrl(value: String | (js.Array[SourceProps | String]) | MediaStream): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrlVarargs(value: (SourceProps | String)*): Self = StObject.set(x, "url", js.Array(value*))
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapper(value: ComponentType[Children]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait OnProgressProps extends StObject {
    
    var loaded: Double
    
    var loadedSeconds: Double
    
    var played: Double
    
    var playedSeconds: Double
  }
  object OnProgressProps {
    
    inline def apply(loaded: Double, loadedSeconds: Double, played: Double, playedSeconds: Double): OnProgressProps = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], loadedSeconds = loadedSeconds.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], playedSeconds = playedSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnProgressProps]
    }
    
    extension [Self <: OnProgressProps](x: Self) {
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedSeconds(value: Double): Self = StObject.set(x, "loadedSeconds", value.asInstanceOf[js.Any])
      
      inline def setPlayed(value: Double): Self = StObject.set(x, "played", value.asInstanceOf[js.Any])
      
      inline def setPlayedSeconds(value: Double): Self = StObject.set(x, "playedSeconds", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceProps extends StObject {
    
    var media: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SourceProps {
    
    inline def apply(src: String): SourceProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceProps]
    }
    
    extension [Self <: SourceProps](x: Self) {
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
