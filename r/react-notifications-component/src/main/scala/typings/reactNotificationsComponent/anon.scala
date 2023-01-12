package typings.reactNotificationsComponent

import typings.reactNotificationsComponent.mod.TransitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fade extends StObject {
    
    var fade: js.UndefOr[TransitionOptions] = js.undefined
    
    var swipe: js.UndefOr[TransitionOptions] = js.undefined
  }
  object Fade {
    
    inline def apply(): Fade = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fade]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fade] (val x: Self) extends AnyVal {
      
      inline def setFade(value: TransitionOptions): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setSwipe(value: TransitionOptions): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    }
  }
}
