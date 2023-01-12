package typings.reactMdTransition

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typings.reactMdTransition.typesTypesMod.TransitionExitHandler
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCollapseMod {
  
  @JSImport("@react-md/transition/types/Collapse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Collapse[E /* <: HTMLElement */](param0: CollapseProps[E]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Collapse")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  /* Inlined parent std.Omit<@react-md/transition.@react-md/transition/types/useCollapseTransition.CollapseTransitionHookOptions<E>, 'transitionIn'> */
  trait CollapseProps[E /* <: HTMLElement */] extends StObject {
    
    var appear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The child element that should have a `ref` and the `style`, `className` and
      * `hidden` props cloned into using the `cloneElement` API. If the child is a
      * custom component, you **must** use `React.forwardRef` and pass the `ref`
      * and the other props for the transition to work correctly.
      */
    var children: ReactElement
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the element should be collapsed.
      *
      * @see {@link CollapseTransitionHookOptions.transitionIn}
      */
    var collapsed: Boolean
    
    var enter: js.UndefOr[Boolean] = js.undefined
    
    var exit: js.UndefOr[Boolean] = js.undefined
    
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    var minPaddingBottom: js.UndefOr[Double | String] = js.undefined
    
    var minPaddingTop: js.UndefOr[Double | String] = js.undefined
    
    var nodeRef: js.UndefOr[Ref[E]] = js.undefined
    
    var onEnter: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    var onEntered: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    var onEntering: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    var onExit: js.UndefOr[TransitionExitHandler] = js.undefined
    
    var onExited: js.UndefOr[TransitionExitHandler] = js.undefined
    
    var onExiting: js.UndefOr[TransitionExitHandler] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var temporary: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object CollapseProps {
    
    inline def apply[E /* <: HTMLElement */](children: ReactElement, collapsed: Boolean): CollapseProps[E] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseProps[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollapseProps[?], E /* <: HTMLElement */] (val x: Self & CollapseProps[E]) extends AnyVal {
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinPaddingBottom(value: Double | String): Self = StObject.set(x, "minPaddingBottom", value.asInstanceOf[js.Any])
      
      inline def setMinPaddingBottomUndefined: Self = StObject.set(x, "minPaddingBottom", js.undefined)
      
      inline def setMinPaddingTop(value: Double | String): Self = StObject.set(x, "minPaddingTop", value.asInstanceOf[js.Any])
      
      inline def setMinPaddingTopUndefined: Self = StObject.set(x, "minPaddingTop", js.undefined)
      
      inline def setNodeRef(value: Ref[E]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      inline def setNodeRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "nodeRef", js.Any.fromFunction1(value))
      
      inline def setNodeRefNull: Self = StObject.set(x, "nodeRef", null)
      
      inline def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
      
      inline def setOnEnter(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: () => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction0(value))
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
