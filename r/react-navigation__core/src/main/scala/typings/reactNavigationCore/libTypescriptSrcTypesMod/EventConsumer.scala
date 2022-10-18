package typings.reactNavigationCore.libTypescriptSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventConsumer[EventMap /* <: EventMapBase */] extends StObject {
  
  /**
    * Subscribe to events from the parent navigator.
    *
    * @param type Type of the event (e.g. `focus`, `blur`)
    * @param callback Callback listener which is executed upon receiving the event.
    */
  def addListener[EventName /* <: Keyof[EventMap] */](`type`: EventName, callback: EventListenerCallback[EventMap, EventName]): js.Function0[Unit]
  
  def removeListener[EventName /* <: Keyof[EventMap] */](`type`: EventName, callback: EventListenerCallback[EventMap, EventName]): Unit
}
object EventConsumer {
  
  inline def apply[EventMap /* <: EventMapBase */](
    addListener: (Any, EventListenerCallback[EventMap, Any]) => js.Function0[Unit],
    removeListener: (Any, EventListenerCallback[EventMap, Any]) => Unit
  ): EventConsumer[EventMap] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[EventConsumer[EventMap]]
  }
  
  extension [Self <: EventConsumer[?], EventMap /* <: EventMapBase */](x: Self & EventConsumer[EventMap]) {
    
    inline def setAddListener(value: (Any, EventListenerCallback[EventMap, Any]) => js.Function0[Unit]): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setRemoveListener(value: (Any, EventListenerCallback[EventMap, Any]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
  }
}
