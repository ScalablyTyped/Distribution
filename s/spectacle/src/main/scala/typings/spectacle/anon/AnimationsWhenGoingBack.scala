package typings.spectacle.anon

import typings.react.mod.ReactNode
import typings.spectacle.mod.TemplateFn
import typings.spectacle.mod.TransitionEffect
import typings.spectacle.spectacleStrings.arrows
import typings.spectacle.spectacleStrings.space
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationsWhenGoingBack extends StObject {
  
  var animationsWhenGoingBack: js.UndefOr[Boolean] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var children: ReactNode = js.native
  
  var keyboardControls: js.UndefOr[arrows | space] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[TemplateFn] = js.native
  
  var textColor: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[Record[String, _]] = js.native
  
  var transitionEffect: js.UndefOr[TransitionEffect] = js.native
}
object AnimationsWhenGoingBack {
  
  @scala.inline
  def apply(): AnimationsWhenGoingBack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationsWhenGoingBack]
  }
  
  @scala.inline
  implicit class AnimationsWhenGoingBackMutableBuilder[Self <: AnimationsWhenGoingBack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationsWhenGoingBack(value: Boolean): Self = StObject.set(x, "animationsWhenGoingBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsWhenGoingBackUndefined: Self = StObject.set(x, "animationsWhenGoingBack", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setKeyboardControls(value: arrows | space): Self = StObject.set(x, "keyboardControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardControlsUndefined: Self = StObject.set(x, "keyboardControls", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setTemplate(value: /* options */ CurrentSlide => ReactNode): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTheme(value: Record[String, _]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTransitionEffect(value: TransitionEffect): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEffectUndefined: Self = StObject.set(x, "transitionEffect", js.undefined)
  }
}
