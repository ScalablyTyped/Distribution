package typings.reactOverlays

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait TransitionCallbacks extends StObject {
    
    var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
    
    var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  }
  object TransitionCallbacks {
    
    @scala.inline
    def apply(): TransitionCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionCallbacks]
    }
    
    @scala.inline
    implicit class TransitionCallbacksMutableBuilder[Self <: TransitionCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEnter(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: /* node */ HTMLElement => js.Any): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    }
  }
}
