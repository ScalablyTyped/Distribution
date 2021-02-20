package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTransitionGroupMod {
  
  @JSImport("@react-md/transition/types/useTransitionGroup", "useTransitionGroup")
  @js.native
  def useTransitionGroup[E /* <: HTMLElement */](hasAppearEnterExitChildren: TransitionGroupOptions): ReactNode = js.native
  
  type TransitionGroupChild[E /* <: HTMLElement */] = ReactElement
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionActions * / any */ @js.native
  trait TransitionGroupOptions extends StObject {
    
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
    implicit class TransitionGroupOptionsMutableBuilder[Self <: TransitionGroupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
