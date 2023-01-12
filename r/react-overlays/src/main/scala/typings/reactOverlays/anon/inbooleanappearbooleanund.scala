package typings.reactOverlays.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  in :boolean,   appear :boolean | undefined,   unmountOnExit :boolean | undefined} & react-overlays.react-overlays/esm/types.TransitionCallbacks */
trait inbooleanappearbooleanund extends StObject {
  
  var appear: js.UndefOr[Boolean] = js.undefined
  
  var in: Boolean
  
  var onEnter: js.UndefOr[js.Function2[/* node */ HTMLElement, /* isAppearing */ Boolean, Any]] = js.undefined
  
  var onEntered: js.UndefOr[js.Function2[/* node */ HTMLElement, /* isAppearing */ Boolean, Any]] = js.undefined
  
  var onEntering: js.UndefOr[js.Function2[/* node */ HTMLElement, /* isAppearing */ Boolean, Any]] = js.undefined
  
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
  
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
  
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
  
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}
object inbooleanappearbooleanund {
  
  inline def apply(in: Boolean): inbooleanappearbooleanund = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[inbooleanappearbooleanund]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: inbooleanappearbooleanund] (val x: Self) extends AnyVal {
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setOnEnter(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): Self = StObject.set(x, "onEntered", js.Any.fromFunction2(value))
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): Self = StObject.set(x, "onEntering", js.Any.fromFunction2(value))
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnExit(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExited(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOnExiting(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
    
    inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    
    inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
    
    inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
  }
}
