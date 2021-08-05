package typings.reactMdTransition

import typings.react.mod.Ref
import typings.reactMdTransition.typesMod.EnterHandler
import typings.reactMdTransition.typesMod.ExitHandler
import typings.reactMdTransition.useCSSTransitionMod.CSSTransitionReturnValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCrossFadeMod {
  
  @JSImport("@react-md/transition/types/useCrossFade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCrossFade[E /* <: HTMLElement */](): CSSTransitionReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCrossFade")().asInstanceOf[CSSTransitionReturnValue[E]]
  inline def useCrossFade[E /* <: HTMLElement */](
    hasAppearTemporaryTransitionInClassNameOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: CrossFadeOptions[E]
  ): CSSTransitionReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCrossFade")(hasAppearTemporaryTransitionInClassNameOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionReturnValue[E]]
  
  /* Inlined parent std.Omit<@react-md/transition.@react-md/transition/types/types.CSSTransitionOptions<E>, 'timeout' | 'classNames' | 'transitionIn'> */
  trait CrossFadeOptions[E /* <: HTMLElement */] extends StObject {
    
    var appear: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var enter: js.UndefOr[Boolean] = js.undefined
    
    var exit: js.UndefOr[Boolean] = js.undefined
    
    var onEnter: js.UndefOr[EnterHandler[E]] = js.undefined
    
    var onEntered: js.UndefOr[EnterHandler[E]] = js.undefined
    
    var onEntering: js.UndefOr[EnterHandler[E]] = js.undefined
    
    var onExit: js.UndefOr[ExitHandler[E]] = js.undefined
    
    var onExited: js.UndefOr[ExitHandler[E]] = js.undefined
    
    var onExiting: js.UndefOr[ExitHandler[E]] = js.undefined
    
    var ref: js.UndefOr[Ref[E]] = js.undefined
    
    var temporary: js.UndefOr[Boolean] = js.undefined
    
    var transitionIn: js.UndefOr[Boolean] = js.undefined
  }
  object CrossFadeOptions {
    
    inline def apply[E /* <: HTMLElement */](): CrossFadeOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossFadeOptions[E]]
    }
    
    extension [Self <: CrossFadeOptions[?], E /* <: HTMLElement */](x: Self & CrossFadeOptions[E]) {
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setOnEnter(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction2(value))
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction2(value))
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: E => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: E => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: E => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setRef(value: Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      inline def setTransitionIn(value: Boolean): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
    }
  }
}
