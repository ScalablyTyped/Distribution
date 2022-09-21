package typings.reactHowler

import typings.howler.anon.Headers
import typings.howler.mod.Howl
import typings.howler.mod.HowlCallback
import typings.howler.mod.HowlErrorCallback
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-howler", JSImport.Default)
  @js.native
  open class default () extends ReactHowler
  
  @js.native
  sealed trait HOWLER_STATE extends StObject
  @JSImport("react-howler", "HOWLER_STATE")
  @js.native
  object HOWLER_STATE extends StObject {
    
    @js.native
    sealed trait LOADED
      extends StObject
         with HOWLER_STATE
    
    @js.native
    sealed trait LOADING
      extends StObject
         with HOWLER_STATE
    
    @js.native
    sealed trait UNLOADED
      extends StObject
         with HOWLER_STATE
  }
  
  trait PropTypes extends StObject {
    
    var format: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var html5: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var mute: js.UndefOr[Boolean] = js.undefined
    
    var onEnd: js.UndefOr[HowlCallback] = js.undefined
    
    var onLoad: js.UndefOr[HowlCallback] = js.undefined
    
    var onLoadError: js.UndefOr[HowlErrorCallback] = js.undefined
    
    var onPause: js.UndefOr[HowlCallback] = js.undefined
    
    var onPlay: js.UndefOr[HowlCallback] = js.undefined
    
    var onPlayError: js.UndefOr[HowlErrorCallback] = js.undefined
    
    var onSeek: js.UndefOr[HowlCallback] = js.undefined
    
    var onStop: js.UndefOr[HowlCallback] = js.undefined
    
    var onVolume: js.UndefOr[HowlCallback] = js.undefined
    
    var playing: js.UndefOr[Boolean] = js.undefined
    
    var preload: js.UndefOr[Boolean] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var src: String | js.Array[String]
    
    var volume: js.UndefOr[Double] = js.undefined
    
    var xhr: js.UndefOr[Headers] = js.undefined
  }
  object PropTypes {
    
    inline def apply(src: String | js.Array[String]): PropTypes = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropTypes]
    }
    
    extension [Self <: PropTypes](x: Self) {
      
      inline def setFormat(value: String | js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setHtml5(value: Boolean): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
      
      inline def setHtml5Undefined: Self = StObject.set(x, "html5", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setOnEnd(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnLoad(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadError(value: (/* soundId */ Double, /* error */ Any) => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction2(value))
      
      inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPause(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayError(value: (/* soundId */ Double, /* error */ Any) => Unit): Self = StObject.set(x, "onPlayError", js.Any.fromFunction2(value))
      
      inline def setOnPlayErrorUndefined: Self = StObject.set(x, "onPlayError", js.undefined)
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnSeek(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
      
      inline def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
      
      inline def setOnStop(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setOnVolume(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onVolume", js.Any.fromFunction1(value))
      
      inline def setOnVolumeUndefined: Self = StObject.set(x, "onVolume", js.undefined)
      
      inline def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      inline def setXhr(value: Headers): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  @js.native
  trait ReactHowler
    extends Component[PropTypes, js.Object, Any] {
    
    def duration(): Double = js.native
    def duration(id: Double): Double = js.native
    
    var howler: Howl = js.native
    
    def howlerState(): HOWLER_STATE = js.native
    
    def seek(): Double = js.native
    def seek(time: Double): Double = js.native
    
    def stop(): Unit = js.native
    def stop(id: Double): Unit = js.native
  }
}
