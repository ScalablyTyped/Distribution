package typings.reactOverlays.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  in :boolean | undefined,   appear :boolean | undefined} & react-overlays.react-overlays/esm/types.TransitionCallbacks */
trait inbooleanundefinedappearb extends StObject {
  
  var appear: js.UndefOr[Boolean] = js.undefined
  
  var in: js.UndefOr[Boolean] = js.undefined
  
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
  
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, js.Any]] = js.undefined
}
object inbooleanundefinedappearb {
  
  @scala.inline
  def apply(): inbooleanundefinedappearb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[inbooleanundefinedappearb]
  }
  
  @scala.inline
  implicit class inbooleanundefinedappearbMutableBuilder[Self <: inbooleanundefinedappearb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    @scala.inline
    def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
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
