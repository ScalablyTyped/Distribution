package typings.reactMdUtils

import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delegateEventMod {
  
  @JSImport("@react-md/utils/types/events/delegateEvent", "delegateEvent")
  @js.native
  def delegateEvent(eventType: String): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils/types/events/delegateEvent", "delegateEvent")
  @js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: js.UndefOr[scala.Nothing],
    options: Boolean
  ): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils/types/events/delegateEvent", "delegateEvent")
  @js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: js.UndefOr[scala.Nothing],
    options: AddEventListenerOptions
  ): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils/types/events/delegateEvent", "delegateEvent")
  @js.native
  def delegateEvent(eventType: String, eventTarget: js.UndefOr[DelegatedEventTarget], throttle: Boolean): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils/types/events/delegateEvent", "delegateEvent")
  @js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: Boolean,
    options: Boolean
  ): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils/types/events/delegateEvent", "delegateEvent")
  @js.native
  def delegateEvent(
    eventType: String,
    eventTarget: js.UndefOr[DelegatedEventTarget],
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = js.native
  @JSImport("@react-md/utils/types/events/delegateEvent", "delegateEvent")
  @js.native
  def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = js.native
  
  @js.native
  trait DelegatableEvent extends StObject {
    
    var handler: DelegatedEventHandler = js.native
    
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.native
    
    var target: DelegatedEventTarget = js.native
    
    var throttle: Boolean = js.native
    
    var `type`: String = js.native
  }
  object DelegatableEvent {
    
    @scala.inline
    def apply(handler: DelegatedEventHandler, target: DelegatedEventTarget, throttle: Boolean, `type`: String): DelegatableEvent = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelegatableEvent]
    }
    
    @scala.inline
    implicit class DelegatableEventMutableBuilder[Self <: DelegatableEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: DelegatedEventHandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setTarget(value: DelegatedEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottle(value: Boolean): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DelegatedEventHandler extends StObject {
    
    /**
      * Adds the provided callback to the throttled event listener.
      */
    def add(callback: EventListener): Unit = js.native
    
    /**
      * Attempts to remove the provided callback from the throttled event listener.
      */
    def remove(callback: EventListener): Unit = js.native
  }
  object DelegatedEventHandler {
    
    @scala.inline
    def apply(add: EventListener => Unit, remove: EventListener => Unit): DelegatedEventHandler = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[DelegatedEventHandler]
    }
    
    @scala.inline
    implicit class DelegatedEventHandlerMutableBuilder[Self <: DelegatedEventHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: EventListener => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: EventListener => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  type DelegatedEventTarget = Window | Document | HTMLElement
}
