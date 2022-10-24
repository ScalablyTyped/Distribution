package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.IsPlaying
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsPlayPauseButtonMod {
  
  @JSImport("react-alice-carousel/lib/views/PlayPauseButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PlayPauseButton(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PlayPauseButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var isPlaying: Boolean
    
    def onClick(e: Any): Unit
    
    var renderPlayPauseButton: js.UndefOr[js.Function1[/* param0 */ IsPlaying, Any]] = js.undefined
  }
  object Props {
    
    inline def apply(isPlaying: Boolean, onClick: Any => Unit): Props = {
      val __obj = js.Dynamic.literal(isPlaying = isPlaying.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setRenderPlayPauseButton(value: /* param0 */ IsPlaying => Any): Self = StObject.set(x, "renderPlayPauseButton", js.Any.fromFunction1(value))
      
      inline def setRenderPlayPauseButtonUndefined: Self = StObject.set(x, "renderPlayPauseButton", js.undefined)
    }
  }
}
