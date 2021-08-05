package typings.spectacle.anon

import typings.react.mod.ReactNode
import typings.spectacle.mod.TemplateFn
import typings.spectacle.mod.TransitionEffect
import typings.spectacle.spectacleStrings.arrows
import typings.spectacle.spectacleStrings.space
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationsWhenGoingBack extends StObject {
  
  var animationsWhenGoingBack: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var children: ReactNode
  
  var keyboardControls: js.UndefOr[arrows | space] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[TemplateFn] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var transitionEffect: js.UndefOr[TransitionEffect] = js.undefined
}
object AnimationsWhenGoingBack {
  
  inline def apply(): AnimationsWhenGoingBack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationsWhenGoingBack]
  }
  
  extension [Self <: AnimationsWhenGoingBack](x: Self) {
    
    inline def setAnimationsWhenGoingBack(value: Boolean): Self = StObject.set(x, "animationsWhenGoingBack", value.asInstanceOf[js.Any])
    
    inline def setAnimationsWhenGoingBackUndefined: Self = StObject.set(x, "animationsWhenGoingBack", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setKeyboardControls(value: arrows | space): Self = StObject.set(x, "keyboardControls", value.asInstanceOf[js.Any])
    
    inline def setKeyboardControlsUndefined: Self = StObject.set(x, "keyboardControls", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setTemplate(value: /* options */ CurrentSlide => ReactNode): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTheme(value: Record[String, js.Any]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTransitionEffect(value: TransitionEffect): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
    
    inline def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
  }
}
