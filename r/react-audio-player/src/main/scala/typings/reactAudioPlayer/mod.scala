package typings.reactAudioPlayer

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLAudioElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-audio-player", JSImport.Default)
  @js.native
  class default () extends ReactAudioPlayer
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAudioPlayer.reactAudioPlayerStrings._empty
    - typings.reactAudioPlayer.reactAudioPlayerStrings.none
    - typings.reactAudioPlayer.reactAudioPlayerStrings.metadata
    - typings.reactAudioPlayer.reactAudioPlayerStrings.auto
  */
  trait Preload extends StObject
  object Preload {
    
    inline def _empty: typings.reactAudioPlayer.reactAudioPlayerStrings._empty = "".asInstanceOf[typings.reactAudioPlayer.reactAudioPlayerStrings._empty]
    
    inline def auto: typings.reactAudioPlayer.reactAudioPlayerStrings.auto = "auto".asInstanceOf[typings.reactAudioPlayer.reactAudioPlayerStrings.auto]
    
    inline def metadata: typings.reactAudioPlayer.reactAudioPlayerStrings.metadata = "metadata".asInstanceOf[typings.reactAudioPlayer.reactAudioPlayerStrings.metadata]
    
    inline def none: typings.reactAudioPlayer.reactAudioPlayerStrings.none = "none".asInstanceOf[typings.reactAudioPlayer.reactAudioPlayerStrings.none]
  }
  
  @js.native
  trait ReactAudioPlayer
    extends Component[ReactAudioPlayerProps, js.Any, js.Any] {
    
    var audioEl: HTMLAudioElement = js.native
    
    def clearListenTrack(): Unit = js.native
    
    def setListenTrack(): Unit = js.native
    
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
    
    var onAbort: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onCanPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onEnded: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onListen: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onSeeked: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var onVolumeChanged: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLAudioElement, Event], Unit]] = js.undefined
    
    var preload: js.UndefOr[Preload] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object ReactAudioPlayerProps {
    
    inline def apply(): ReactAudioPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactAudioPlayerProps]
    }
    
    extension [Self <: ReactAudioPlayerProps](x: Self) {
      
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
      
      inline def setOnAbort(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnCanPlay(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThrough(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnEnded(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnListen(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onListen", js.Any.fromFunction1(value))
      
      inline def setOnListenUndefined: Self = StObject.set(x, "onListen", js.undefined)
      
      inline def setOnLoadedMetadata(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnPause(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnSeeked(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnVolumeChanged(value: /* event */ SyntheticEvent[HTMLAudioElement, Event] => Unit): Self = StObject.set(x, "onVolumeChanged", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangedUndefined: Self = StObject.set(x, "onVolumeChanged", js.undefined)
      
      inline def setPreload(value: Preload): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
}
