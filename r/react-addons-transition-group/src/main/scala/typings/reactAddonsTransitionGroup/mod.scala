package typings.reactAddonsTransitionGroup

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactType
import typings.reactAddonsTransitionGroup.mod.reactAugmentingMod.TransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-addons-transition-group", JSImport.Namespace)
  @js.native
  val ^ : ReactTransitionGroup = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-addons-transition-group", JSImport.Namespace)
  @js.native
  class Class protected ()
    extends Component[TransitionGroupProps, ComponentState, js.Any] {
    def this(props: TransitionGroupProps) = this()
    def this(props: TransitionGroupProps, context: js.Any) = this()
  }
  
  type ReactTransitionGroup = ComponentClass[TransitionGroupProps, ComponentState]
  
  type _To = ReactTransitionGroup
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ReactTransitionGroup = ^
  
  /* augmented module */
  object reactAugmentingMod {
    
    @js.native
    trait HTMLTransitionGroupProps[T] extends HTMLAttributes[T] {
      
      var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.native
      
      var component: js.UndefOr[ReactType[_]] = js.native
    }
    object HTMLTransitionGroupProps {
      
      @scala.inline
      def apply[T](): HTMLTransitionGroupProps[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLTransitionGroupProps[T]]
      }
      
      @scala.inline
      implicit class HTMLTransitionGroupPropsMutableBuilder[Self <: HTMLTransitionGroupProps[_], T] (val x: Self with HTMLTransitionGroupProps[T]) extends AnyVal {
        
        @scala.inline
        def setChildFactory(value: /* child */ ReactElement => ReactElement): Self = StObject.set(x, "childFactory", js.Any.fromFunction1(value))
        
        @scala.inline
        def setChildFactoryUndefined: Self = StObject.set(x, "childFactory", js.undefined)
        
        @scala.inline
        def setComponent(value: ReactType[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      }
    }
    
    @js.native
    trait TransitionGroupProps extends HTMLTransitionGroupProps[ReactTransitionGroup]
    object TransitionGroupProps {
      
      @scala.inline
      def apply(): TransitionGroupProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransitionGroupProps]
      }
    }
  }
}
