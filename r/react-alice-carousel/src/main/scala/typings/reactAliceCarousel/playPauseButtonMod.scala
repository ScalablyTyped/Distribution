package typings.reactAliceCarousel

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playPauseButtonMod {
  
  @JSImport("react-alice-carousel/lib/views/PlayPauseButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PlayPauseButton(hasIsPlayingOnClick: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PlayPauseButton")(hasIsPlayingOnClick.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var isPlaying: Boolean
    
    def onClick(e: js.Any): Unit
  }
  object Props {
    
    inline def apply(isPlaying: Boolean, onClick: js.Any => Unit): Props = {
      val __obj = js.Dynamic.literal(isPlaying = isPlaying.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
}
