package typings.reactMdTransition.useTransitionGroupMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionActions * / any */ @js.native
trait TransitionGroupOptions extends js.Object {
  
  /**
    * The children **must** be a list of React elements that are either a
    * `Transition`, `CSSTransition`, or a component that passes the `onEnter`,
    * `appear`, `enter`, `exit`, and `transitionIn` props to one of those
    * components. Each child must also have a persistent/unique key since it is
    * used for storing which components should be rendered and eventually
    * unmounted.
    */
  var children: ReactNode = js.native
}
object TransitionGroupOptions {
  
  @scala.inline
  def apply(): TransitionGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionGroupOptions]
  }
  
  @scala.inline
  implicit class TransitionGroupOptionsOps[Self <: TransitionGroupOptions] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
