package typings.reactAddonsCssTransitionGroup.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLTransitionGroupProps<ReactCSSTransitionGroup> * / any */ @js.native
trait CSSTransitionGroupProps extends js.Object {
  
  var transitionAppear: js.UndefOr[Boolean] = js.native
  
  var transitionAppearTimeout: js.UndefOr[Double] = js.native
  
  var transitionEnter: js.UndefOr[Boolean] = js.native
  
  var transitionEnterTimeout: js.UndefOr[Double] = js.native
  
  var transitionLeave: js.UndefOr[Boolean] = js.native
  
  var transitionLeaveTimeout: js.UndefOr[Double] = js.native
  
  var transitionName: String | CSSTransitionGroupTransitionName = js.native
}
object CSSTransitionGroupProps {
  
  @scala.inline
  def apply(transitionName: String | CSSTransitionGroupTransitionName): CSSTransitionGroupProps = {
    val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionGroupProps]
  }
  
  @scala.inline
  implicit class CSSTransitionGroupPropsOps[Self <: CSSTransitionGroupProps] (val x: Self) extends AnyVal {
    
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
    def setTransitionName(value: String | CSSTransitionGroupTransitionName): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionAppear(value: Boolean): Self = this.set("transitionAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionAppear: Self = this.set("transitionAppear", js.undefined)
    
    @scala.inline
    def setTransitionAppearTimeout(value: Double): Self = this.set("transitionAppearTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionAppearTimeout: Self = this.set("transitionAppearTimeout", js.undefined)
    
    @scala.inline
    def setTransitionEnter(value: Boolean): Self = this.set("transitionEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEnter: Self = this.set("transitionEnter", js.undefined)
    
    @scala.inline
    def setTransitionEnterTimeout(value: Double): Self = this.set("transitionEnterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEnterTimeout: Self = this.set("transitionEnterTimeout", js.undefined)
    
    @scala.inline
    def setTransitionLeave(value: Boolean): Self = this.set("transitionLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionLeave: Self = this.set("transitionLeave", js.undefined)
    
    @scala.inline
    def setTransitionLeaveTimeout(value: Double): Self = this.set("transitionLeaveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionLeaveTimeout: Self = this.set("transitionLeaveTimeout", js.undefined)
  }
}
