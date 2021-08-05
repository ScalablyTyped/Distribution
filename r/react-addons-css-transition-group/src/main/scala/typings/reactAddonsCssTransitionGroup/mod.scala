package typings.reactAddonsCssTransitionGroup

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-addons-css-transition-group", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ReactCSSTransitionGroup = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-addons-css-transition-group", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends Component[CSSTransitionGroupProps, ComponentState, js.Any] {
    def this(props: CSSTransitionGroupProps) = this()
    def this(props: CSSTransitionGroupProps, context: js.Any) = this()
  }
  
  type ReactCSSTransitionGroup = ComponentClass[CSSTransitionGroupProps, ComponentState]
  
  type _To = js.Object & ReactCSSTransitionGroup
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ReactCSSTransitionGroup = ^
  
  /* augmented module */
  object reactAugmentingMod {
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLTransitionGroupProps<ReactCSSTransitionGroup> * / any */ trait CSSTransitionGroupProps extends StObject {
      
      var transitionAppear: js.UndefOr[Boolean] = js.undefined
      
      var transitionAppearTimeout: js.UndefOr[Double] = js.undefined
      
      var transitionEnter: js.UndefOr[Boolean] = js.undefined
      
      var transitionEnterTimeout: js.UndefOr[Double] = js.undefined
      
      var transitionLeave: js.UndefOr[Boolean] = js.undefined
      
      var transitionLeaveTimeout: js.UndefOr[Double] = js.undefined
      
      var transitionName: String | CSSTransitionGroupTransitionName
    }
    object CSSTransitionGroupProps {
      
      inline def apply(transitionName: String | CSSTransitionGroupTransitionName): CSSTransitionGroupProps = {
        val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
        __obj.asInstanceOf[CSSTransitionGroupProps]
      }
      
      extension [Self <: CSSTransitionGroupProps](x: Self) {
        
        inline def setTransitionAppear(value: Boolean): Self = StObject.set(x, "transitionAppear", value.asInstanceOf[js.Any])
        
        inline def setTransitionAppearTimeout(value: Double): Self = StObject.set(x, "transitionAppearTimeout", value.asInstanceOf[js.Any])
        
        inline def setTransitionAppearTimeoutUndefined: Self = StObject.set(x, "transitionAppearTimeout", js.undefined)
        
        inline def setTransitionAppearUndefined: Self = StObject.set(x, "transitionAppear", js.undefined)
        
        inline def setTransitionEnter(value: Boolean): Self = StObject.set(x, "transitionEnter", value.asInstanceOf[js.Any])
        
        inline def setTransitionEnterTimeout(value: Double): Self = StObject.set(x, "transitionEnterTimeout", value.asInstanceOf[js.Any])
        
        inline def setTransitionEnterTimeoutUndefined: Self = StObject.set(x, "transitionEnterTimeout", js.undefined)
        
        inline def setTransitionEnterUndefined: Self = StObject.set(x, "transitionEnter", js.undefined)
        
        inline def setTransitionLeave(value: Boolean): Self = StObject.set(x, "transitionLeave", value.asInstanceOf[js.Any])
        
        inline def setTransitionLeaveTimeout(value: Double): Self = StObject.set(x, "transitionLeaveTimeout", value.asInstanceOf[js.Any])
        
        inline def setTransitionLeaveTimeoutUndefined: Self = StObject.set(x, "transitionLeaveTimeout", js.undefined)
        
        inline def setTransitionLeaveUndefined: Self = StObject.set(x, "transitionLeave", js.undefined)
        
        inline def setTransitionName(value: String | CSSTransitionGroupTransitionName): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      }
    }
    
    trait CSSTransitionGroupTransitionName extends StObject {
      
      var appear: js.UndefOr[String] = js.undefined
      
      var appearActive: js.UndefOr[String] = js.undefined
      
      var enter: String
      
      var enterActive: js.UndefOr[String] = js.undefined
      
      var leave: String
      
      var leaveActive: js.UndefOr[String] = js.undefined
    }
    object CSSTransitionGroupTransitionName {
      
      inline def apply(enter: String, leave: String): CSSTransitionGroupTransitionName = {
        val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any])
        __obj.asInstanceOf[CSSTransitionGroupTransitionName]
      }
      
      extension [Self <: CSSTransitionGroupTransitionName](x: Self) {
        
        inline def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
        
        inline def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
        
        inline def setAppearActiveUndefined: Self = StObject.set(x, "appearActive", js.undefined)
        
        inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
        
        inline def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
        
        inline def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
        
        inline def setEnterActiveUndefined: Self = StObject.set(x, "enterActive", js.undefined)
        
        inline def setLeave(value: String): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
        
        inline def setLeaveActive(value: String): Self = StObject.set(x, "leaveActive", value.asInstanceOf[js.Any])
        
        inline def setLeaveActiveUndefined: Self = StObject.set(x, "leaveActive", js.undefined)
      }
    }
  }
}
