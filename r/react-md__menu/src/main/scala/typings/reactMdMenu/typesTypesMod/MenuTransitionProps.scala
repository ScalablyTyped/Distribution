package typings.reactMdMenu.typesTypesMod

import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typings.reactMdTransition.typesTypesMod.TransitionExitHandler
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-md/transition.@react-md/transition.ScaleTransitionHookOptions<std.HTMLDivElement>, 'transitionIn' | 'vertical' | 'nodeRef'> */
trait MenuTransitionProps extends StObject {
  
  var appear: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
  
  var enter: js.UndefOr[Boolean] = js.undefined
  
  var exit: js.UndefOr[Boolean] = js.undefined
  
  var onEnter: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onEntered: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onEntering: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onExit: js.UndefOr[TransitionExitHandler] = js.undefined
  
  var onExited: js.UndefOr[TransitionExitHandler] = js.undefined
  
  var onExiting: js.UndefOr[TransitionExitHandler] = js.undefined
  
  var temporary: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[TransitionTimeout] = js.undefined
}
object MenuTransitionProps {
  
  inline def apply(): MenuTransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuTransitionProps]
  }
  
  extension [Self <: MenuTransitionProps](x: Self) {
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
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
    
    inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
    
    inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    
    inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
