package typings.reactAudioPlayer

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactAudioPlayer.reactAudioPlayerStrings._empty
import typings.reactAudioPlayer.reactAudioPlayerStrings.auto
import typings.reactAudioPlayer.reactAudioPlayerStrings.metadata
import typings.reactAudioPlayer.reactAudioPlayerStrings.none
import typings.std.Event
import typings.std.HTMLAudioElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-audio-player", JSImport.Default)
  @js.native
  open class default () extends ReactAudioPlayer
  object default {
    
    @JSImport("react-audio-player", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-audio-player", "default.defaultProps")
    @js.native
    def defaultProps: ReactAudioPlayerProps = js.native
    inline def defaultProps_=(x: ReactAudioPlayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("react-audio-player", "default.propTypes")
    @js.native
    def propTypes: js.Object = js.native
    inline def propTypes_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ReactAudioPlayer
    extends Component[ReactAudioPlayerProps, js.Object, Any] {
    
    var audioEl: RefObject[HTMLAudioElement] = js.native
    
    /**
      * Clear the onListen interval
      */
    def clearListenTrack(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactAudioPlayer(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactAudioPlayer(prevProps: ReactAudioPlayerProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactAudioPlayer(): Unit = js.native
    
    var listenTracker: js.UndefOr[Double] = js.native
    
    def onAbort(e: Event): Unit = js.native
    
    def onCanPlay(e: Event): js.UndefOr[Unit] = js.native
    
    def onCanPlayThrough(e: Event): js.UndefOr[Unit] = js.native
    
    def onEnded(e: Event): Unit = js.native
    
    def onError(e: Event): js.UndefOr[Unit] = js.native
    
    def onLoadedMetadata(e: Event): Unit = js.native
    
    def onPause(e: Event): Unit = js.native
    
    def onPlay(e: Event): Unit = js.native
    
    def onSeeked(e: Event): Unit = js.native
    
    def onVolumeChanged(e: Event): Unit = js.native
    
    /**
      * Set an interval to call props.onListen every props.listenInterval time period
      */
    def setListenTrack(): Unit = js.native
    
    /**
      * Set the volume on the audio element from props
      * @param {Number} volume
      */
    def updateVolume(volume: Double): Unit = js.native
  }
  
  trait ReactAudioPlayerProps extends StObject {
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var controlsList: js.UndefOr[String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var listenInterval: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var muted: js.UndefOr[Boolean] = js.undefined
    
    var onAbort: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onCanPlay: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onEnded: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onListen: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onSeeked: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onVolumeChanged: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var preload: js.UndefOr[_empty | none | metadata | auto] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var volume: Double
  }
  object ReactAudioPlayerProps {
    
    inline def apply(volume: Double): ReactAudioPlayerProps = {
      val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactAudioPlayerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactAudioPlayerProps] (val x: Self) extends AnyVal {
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsList(value: String): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
      
      inline def setControlsListUndefined: Self = StObject.set(x, "controlsList", js.undefined)
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setListenInterval(value: Double): Self = StObject.set(x, "listenInterval", value.asInstanceOf[js.Any])
      
      inline def setListenIntervalUndefined: Self = StObject.set(x, "listenInterval", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setOnAbort(value: /* e */ Event => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnCanPlay(value: /* e */ Event => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: /* e */ Event => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnEnded(value: /* e */ Event => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: /* e */ Event => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnListen(value: /* time */ Double => Unit): Self = StObject.set(x, "onListen", js.Any.fromFunction1(value))
      
      inline def setOnListenUndefined: Self = StObject.set(x, "onListen", js.undefined)
      
      inline def setOnLoadedMetadata(value: /* e */ Event => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnPause(value: /* e */ Event => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: /* e */ Event => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnSeeked(value: /* e */ Event => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnVolumeChanged(value: /* e */ Event => Unit): Self = StObject.set(x, "onVolumeChanged", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangedUndefined: Self = StObject.set(x, "onVolumeChanged", js.undefined)
      
      inline def setPreload(value: _empty | none | metadata | auto): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
}
