package typings.reactLeafletFullscreenPlugin

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EnterFullscreen extends StObject {
    
    var enterFullscreen: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var exitFullscreen: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object EnterFullscreen {
    
    inline def apply(): EnterFullscreen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnterFullscreen]
    }
    
    extension [Self <: EnterFullscreen](x: Self) {
      
      inline def setEnterFullscreen(value: /* event */ Event => Unit): Self = StObject.set(x, "enterFullscreen", js.Any.fromFunction1(value))
      
      inline def setEnterFullscreenUndefined: Self = StObject.set(x, "enterFullscreen", js.undefined)
      
      inline def setExitFullscreen(value: /* event */ Event => Unit): Self = StObject.set(x, "exitFullscreen", js.Any.fromFunction1(value))
      
      inline def setExitFullscreenUndefined: Self = StObject.set(x, "exitFullscreen", js.undefined)
    }
  }
}
