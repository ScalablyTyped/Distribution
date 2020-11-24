package typings.reactMdTransition.getClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<react-transition-group.react-transition-group/CSSTransition.CSSTransitionClassNames> */
@js.native
trait DefinedCSSTransitionClassNames extends js.Object {
  
  var appear: String = js.native
  
  var appearActive: String = js.native
  
  var appearDone: String = js.native
  
  var enter: String = js.native
  
  var enterActive: String = js.native
  
  var enterDone: String = js.native
  
  var exit: String = js.native
  
  var exitActive: String = js.native
  
  var exitDone: String = js.native
}
object DefinedCSSTransitionClassNames {
  
  @scala.inline
  def apply(
    appear: String,
    appearActive: String,
    appearDone: String,
    enter: String,
    enterActive: String,
    enterDone: String,
    exit: String,
    exitActive: String,
    exitDone: String
  ): DefinedCSSTransitionClassNames = {
    val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], appearActive = appearActive.asInstanceOf[js.Any], appearDone = appearDone.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], enterActive = enterActive.asInstanceOf[js.Any], enterDone = enterDone.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], exitActive = exitActive.asInstanceOf[js.Any], exitDone = exitDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedCSSTransitionClassNames]
  }
  
  @scala.inline
  implicit class DefinedCSSTransitionClassNamesOps[Self <: DefinedCSSTransitionClassNames] (val x: Self) extends AnyVal {
    
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
    def setAppear(value: String): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearActive(value: String): Self = this.set("appearActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearDone(value: String): Self = this.set("appearDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: String): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterActive(value: String): Self = this.set("enterActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterDone(value: String): Self = this.set("enterDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: String): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitActive(value: String): Self = this.set("exitActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitDone(value: String): Self = this.set("exitDone", value.asInstanceOf[js.Any])
  }
}
