package typings.reactHowler

import typings.howler.mod.Howl
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-howler", JSImport.Default)
  @js.native
  class default () extends ReactHowler
  
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
  
  trait Props extends StObject {
    
    var format: js.UndefOr[js.Array[String]] = js.undefined
    
    var html5: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var mute: js.UndefOr[Boolean] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoadError: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    var onStop: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    var onVolume: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    var playing: js.UndefOr[Boolean] = js.undefined
    
    var preload: js.UndefOr[Boolean] = js.undefined
    
    var src: String | js.Array[String]
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(src: String | js.Array[String]): Props = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      inline def setHtml5(value: Boolean): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
      
      inline def setHtml5Undefined: Self = StObject.set(x, "html5", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadError(value: /* id */ Double => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
      
      inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: /* id */ Double => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnStop(value: /* id */ Double => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setOnVolume(value: /* id */ Double => Unit): Self = StObject.set(x, "onVolume", js.Any.fromFunction1(value))
      
      inline def setOnVolumeUndefined: Self = StObject.set(x, "onVolume", js.undefined)
      
      inline def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  @js.native
  trait ReactHowler
    extends Component[Props, js.Object, js.Any] {
    
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
