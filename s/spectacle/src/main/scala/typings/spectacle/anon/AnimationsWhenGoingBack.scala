package typings.spectacle.anon

import typings.react.mod.ReactNode
import typings.spectacle.mod.TemplateFn
import typings.spectacle.mod.TransitionEffect
import typings.spectacle.spectacleStrings.arrows
import typings.spectacle.spectacleStrings.space
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationsWhenGoingBack extends js.Object {
  
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
  implicit class AnimationsWhenGoingBackOps[Self <: AnimationsWhenGoingBack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationsWhenGoingBack(value: Boolean): Self = this.set("animationsWhenGoingBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationsWhenGoingBack: Self = this.set("animationsWhenGoingBack", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setKeyboardControls(value: arrows | space): Self = this.set("keyboardControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardControls: Self = this.set("keyboardControls", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setTemplate(value: /* options */ CurrentSlide => ReactNode): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTheme(value: Record[String, _]): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTransitionEffect(value: TransitionEffect): Self = this.set("transitionEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEffect: Self = this.set("transitionEffect", js.undefined)
  }
}
