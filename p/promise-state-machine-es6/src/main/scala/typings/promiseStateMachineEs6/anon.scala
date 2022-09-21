package typings.promiseStateMachineEs6

import typings.promiseStateMachineEs6.mod.DotNode
import typings.promiseStateMachineEs6.mod.DotNodeStringified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Events[State, Transitions /* <: String */] extends StObject {
    
    var events: typings.promiseStateMachineEs6.mod.Events[State, Transitions]
    
    var initial: State
  }
  object Events {
    
    inline def apply[State, Transitions /* <: String */](events: typings.promiseStateMachineEs6.mod.Events[State, Transitions], initial: State): Events[State, Transitions] = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events[State, Transitions]]
    }
    
    extension [Self <: Events[?, ?], State, Transitions /* <: String */](x: Self & (Events[State, Transitions])) {
      
      inline def setEvents(value: typings.promiseStateMachineEs6.mod.Events[State, Transitions]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: State): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    }
  }
  
  trait Replacer[State, Transitions] extends StObject {
    
    def replacer(data: DotNode[State, Transitions]): DotNodeStringified
  }
  object Replacer {
    
    inline def apply[State, Transitions](replacer: DotNode[State, Transitions] => DotNodeStringified): Replacer[State, Transitions] = {
      val __obj = js.Dynamic.literal(replacer = js.Any.fromFunction1(replacer))
      __obj.asInstanceOf[Replacer[State, Transitions]]
    }
    
    extension [Self <: Replacer[?, ?], State, Transitions](x: Self & (Replacer[State, Transitions])) {
      
      inline def setReplacer(value: DotNode[State, Transitions] => DotNodeStringified): Self = StObject.set(x, "replacer", js.Any.fromFunction1(value))
    }
  }
}
