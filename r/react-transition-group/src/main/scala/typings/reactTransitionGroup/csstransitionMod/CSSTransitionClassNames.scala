package typings.reactTransitionGroup.csstransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSTransitionClassNames extends js.Object {
  
  var appear: js.UndefOr[String] = js.native
  
  var appearActive: js.UndefOr[String] = js.native
  
  var appearDone: js.UndefOr[String] = js.native
  
  var enter: js.UndefOr[String] = js.native
  
  var enterActive: js.UndefOr[String] = js.native
  
  var enterDone: js.UndefOr[String] = js.native
  
  var exit: js.UndefOr[String] = js.native
  
  var exitActive: js.UndefOr[String] = js.native
  
  var exitDone: js.UndefOr[String] = js.native
}
object CSSTransitionClassNames {
  
  @scala.inline
  def apply(): CSSTransitionClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSTransitionClassNames]
  }
  
  @scala.inline
  implicit class CSSTransitionClassNamesOps[Self <: CSSTransitionClassNames] (val x: Self) extends AnyVal {
    
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
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setAppearActive(value: String): Self = this.set("appearActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearActive: Self = this.set("appearActive", js.undefined)
    
    @scala.inline
    def setAppearDone(value: String): Self = this.set("appearDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearDone: Self = this.set("appearDone", js.undefined)
    
    @scala.inline
    def setEnter(value: String): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setEnterActive(value: String): Self = this.set("enterActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterActive: Self = this.set("enterActive", js.undefined)
    
    @scala.inline
    def setEnterDone(value: String): Self = this.set("enterDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterDone: Self = this.set("enterDone", js.undefined)
    
    @scala.inline
    def setExit(value: String): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    
    @scala.inline
    def setExitActive(value: String): Self = this.set("exitActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitActive: Self = this.set("exitActive", js.undefined)
    
    @scala.inline
    def setExitDone(value: String): Self = this.set("exitDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitDone: Self = this.set("exitDone", js.undefined)
  }
}
