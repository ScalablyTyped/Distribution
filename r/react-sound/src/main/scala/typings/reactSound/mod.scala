package typings.reactSound

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactSound.reactSoundStrings.PAUSED
import typings.reactSound.reactSoundStrings.PLAYING
import typings.reactSound.reactSoundStrings.STOPPED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sound", JSImport.Default)
  @js.native
  open class default protected () extends Component[ReactSoundProps, ComponentState, Any] {
    def this(props: ReactSoundProps) = this()
    def this(props: ReactSoundProps, context: Any) = this()
  }
  @JSImport("react-sound", JSImport.Default)
  @js.native
  val default: ComponentClass[ReactSoundProps, ComponentState] = js.native
  
  trait ReactSoundProps extends StObject {
    
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onBufferChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFinishedPlaying: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoading: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPlaying: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onResume: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var playFromPosition: js.UndefOr[Double] = js.undefined
    
    var playStatus: PLAYING | STOPPED | PAUSED
    
    var playbackRate: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var url: String
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object ReactSoundProps {
    
    inline def apply(playStatus: PLAYING | STOPPED | PAUSED, url: String): ReactSoundProps = {
      val __obj = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactSoundProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactSoundProps] (val x: Self) extends AnyVal {
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnBufferChange(value: () => Unit): Self = StObject.set(x, "onBufferChange", js.Any.fromFunction0(value))
      
      inline def setOnBufferChangeUndefined: Self = StObject.set(x, "onBufferChange", js.undefined)
      
      inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFinishedPlaying(value: () => Unit): Self = StObject.set(x, "onFinishedPlaying", js.Any.fromFunction0(value))
      
      inline def setOnFinishedPlayingUndefined: Self = StObject.set(x, "onFinishedPlaying", js.undefined)
      
      inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoading(value: () => Unit): Self = StObject.set(x, "onLoading", js.Any.fromFunction0(value))
      
      inline def setOnLoadingUndefined: Self = StObject.set(x, "onLoading", js.undefined)
      
      inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlaying(value: () => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction0(value))
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnResume(value: () => Unit): Self = StObject.set(x, "onResume", js.Any.fromFunction0(value))
      
      inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
      
      inline def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setPlayFromPosition(value: Double): Self = StObject.set(x, "playFromPosition", value.asInstanceOf[js.Any])
      
      inline def setPlayFromPositionUndefined: Self = StObject.set(x, "playFromPosition", js.undefined)
      
      inline def setPlayStatus(value: PLAYING | STOPPED | PAUSED): Self = StObject.set(x, "playStatus", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  type _To = ComponentClass[ReactSoundProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[ReactSoundProps, ComponentState] = default
}
