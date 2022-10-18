package typings.reactMdUtils

import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsUtilsMod {
  
  @JSImport("@react-md/utils/types/events/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delegateEvent(eventType: String): DelegatedEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Unit,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  
  trait DelegatableEvent extends StObject {
    
    var handler: DelegatedEventHandler
    
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.undefined
    
    var target: DelegatedEventTarget
    
    var throttle: Boolean
    
    var `type`: String
  }
  object DelegatableEvent {
    
    inline def apply(handler: DelegatedEventHandler, target: DelegatedEventTarget, throttle: Boolean, `type`: String): DelegatableEvent = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelegatableEvent]
    }
    
    extension [Self <: DelegatableEvent](x: Self) {
      
      inline def setHandler(value: DelegatedEventHandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTarget(value: DelegatedEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setThrottle(value: Boolean): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DelegatedEventHandler extends StObject {
    
    /**
      * Adds the provided callback to the throttled event listener.
      */
    def add(callback: EventListener): Unit
    
    /**
      * Attempts to remove the provided callback from the throttled event listener.
      */
    def remove(callback: EventListener): Unit
  }
  object DelegatedEventHandler {
    
    inline def apply(add: EventListener => Unit, remove: EventListener => Unit): DelegatedEventHandler = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[DelegatedEventHandler]
    }
    
    extension [Self <: DelegatedEventHandler](x: Self) {
      
      inline def setAdd(value: EventListener => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setRemove(value: EventListener => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  type DelegatedEventTarget = Window | Document | HTMLElement
}
