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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sound", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ReactSoundProps, ComponentState, js.Any] {
    def this(props: ReactSoundProps) = this()
    def this(props: ReactSoundProps, context: js.Any) = this()
  }
  @JSImport("react-sound", JSImport.Default)
  @js.native
  val default: ComponentClass[ReactSoundProps, ComponentState] = js.native
  
  @js.native
  trait ReactSoundProps extends StObject {
    
    var autoLoad: js.UndefOr[Boolean] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var onBufferChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFinishedPlaying: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLoading: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPlaying: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onResume: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onStop: js.UndefOr[js.Function0[Unit]] = js.native
    
    var playFromPosition: js.UndefOr[Double] = js.native
    
    var playStatus: PLAYING | STOPPED | PAUSED = js.native
    
    var playbackRate: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    var url: String = js.native
    
    var volume: js.UndefOr[Double] = js.native
  }
  object ReactSoundProps {
    
    @scala.inline
    def apply(playStatus: PLAYING | STOPPED | PAUSED, url: String): ReactSoundProps = {
      val __obj = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactSoundProps]
    }
    
    @scala.inline
    implicit class ReactSoundPropsMutableBuilder[Self <: ReactSoundProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setOnBufferChange(value: () => Unit): Self = StObject.set(x, "onBufferChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBufferChangeUndefined: Self = StObject.set(x, "onBufferChange", js.undefined)
      
      @scala.inline
      def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFinishedPlaying(value: () => Unit): Self = StObject.set(x, "onFinishedPlaying", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFinishedPlayingUndefined: Self = StObject.set(x, "onFinishedPlaying", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoading(value: () => Unit): Self = StObject.set(x, "onLoading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadingUndefined: Self = StObject.set(x, "onLoading", js.undefined)
      
      @scala.inline
      def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: () => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnResume(value: () => Unit): Self = StObject.set(x, "onResume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
      
      @scala.inline
      def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setPlayFromPosition(value: Double): Self = StObject.set(x, "playFromPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayFromPositionUndefined: Self = StObject.set(x, "playFromPosition", js.undefined)
      
      @scala.inline
      def setPlayStatus(value: PLAYING | STOPPED | PAUSED): Self = StObject.set(x, "playStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  type _To = ComponentClass[ReactSoundProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[ReactSoundProps, ComponentState] = default
}
