package typings.reactMdMenu.anon

import typings.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typings.reactMdTransition.typesTypesMod.TransitionExitHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@react-md/transition.@react-md/transition.FixedPositioningTransitionCallbacks> */
trait RequiredFixedPositioningT extends StObject {
  
  var onEnter: TransitionEnterHandler
  
  var onEntered: TransitionEnterHandler
  
  var onEntering: TransitionEnterHandler
  
  var onExited: TransitionExitHandler
}
object RequiredFixedPositioningT {
  
  inline def apply(
    onEnter: /* appearing */ Boolean => Unit,
    onEntered: /* appearing */ Boolean => Unit,
    onEntering: /* appearing */ Boolean => Unit,
    onExited: () => Unit
  ): RequiredFixedPositioningT = {
    val __obj = js.Dynamic.literal(onEnter = js.Any.fromFunction1(onEnter), onEntered = js.Any.fromFunction1(onEntered), onEntering = js.Any.fromFunction1(onEntering), onExited = js.Any.fromFunction0(onExited))
    __obj.asInstanceOf[RequiredFixedPositioningT]
  }
  
  extension [Self <: RequiredFixedPositioningT](x: Self) {
    
    inline def setOnEnter(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
    
    inline def setOnEntered(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
    
    inline def setOnEntering(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
    
    inline def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
  }
}
