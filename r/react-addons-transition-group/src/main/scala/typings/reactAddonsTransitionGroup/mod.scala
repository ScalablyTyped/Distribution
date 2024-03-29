package typings.reactAddonsTransitionGroup

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.reactAddonsTransitionGroup.mod.reactAugmentingMod.TransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-addons-transition-group", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ReactTransitionGroup = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-addons-transition-group", JSImport.Namespace)
  @js.native
  open class Class protected () extends Component[TransitionGroupProps, ComponentState, Any] {
    def this(props: TransitionGroupProps) = this()
    def this(props: TransitionGroupProps, context: Any) = this()
  }
  
  type ReactTransitionGroup = ComponentClass[TransitionGroupProps, ComponentState]
  
  type _To = js.Object & ReactTransitionGroup
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ReactTransitionGroup = ^
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait HTMLTransitionGroupProps[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.undefined
      
      var component: js.UndefOr[ElementType[Any]] = js.undefined
    }
    object HTMLTransitionGroupProps {
      
      inline def apply[T](): HTMLTransitionGroupProps[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLTransitionGroupProps[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLTransitionGroupProps[?], T] (val x: Self & HTMLTransitionGroupProps[T]) extends AnyVal {
        
        inline def setChildFactory(value: /* child */ ReactElement => ReactElement): Self = StObject.set(x, "childFactory", js.Any.fromFunction1(value))
        
        inline def setChildFactoryUndefined: Self = StObject.set(x, "childFactory", js.undefined)
        
        inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
        
        inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      }
    }
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type TransitionGroupProps = react-addons-transition-group.react-addons-transition-group.react.HTMLTransitionGroupProps<react-addons-transition-group.react-addons-transition-group.ReactTransitionGroup>
    }}}
    to avoid circular code involving: 
    - react-addons-transition-group.react-addons-transition-group.ReactTransitionGroup
    - react-addons-transition-group.react-addons-transition-group.react.TransitionGroupProps
    */
    trait TransitionGroupProps
      extends StObject
         with HTMLTransitionGroupProps[ReactTransitionGroup]
    object TransitionGroupProps {
      
      inline def apply(): TransitionGroupProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransitionGroupProps]
      }
    }
  }
}
