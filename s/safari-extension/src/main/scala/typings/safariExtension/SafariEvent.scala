package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafariEvent extends StObject {
  
  /**
    * A Boolean value that indicates whether the event goes through the bubbling phase.
    */
  var bubbles: Boolean
  
  /**
    * A Boolean value that indicates whether the event can be canceled.
    */
  var cancelable: Boolean
  
  /**
    * The object that the event is currently being sent to.
    * This attribute varies as the event progresses through the phases, changing as the event moves through the event-dispatch hierarchy.
    */
  var currentTarget: SafariEventTarget
  
  /**
    * A Boolean value that indicates whether the event’s default action has been prevented.
    */
  var defaultPrevented: Boolean
  
  /**
    * The event-handling phase that the event is in.
    * The values for this property are the same as the values used by Webkit to identify the event-handling phases.
    */
  var eventPhase: Double
  
  /**
    * Prevents the browser from performing the default action for an event.
    * Use this method to indicate that your extension has already fully handled the event; you don’t want the browser to do anything. Note that preventing the default action does not stop an event from propagating.
    */
  def preventDefault(): Unit
  
  /**
    * Prevents the event from any further propagation.
    * Propagation can be stopped only fon cancelable events. After propagation is stopped, the event is not sent to any other targets.
    */
  def stopPropagation(): Unit
  
  /**
    * The target of the event.
    * This attribute stays the same as the event moves through the event-dispatch hierarchy. Its value is the same as the object that the event is sent to during the targeting phase.
    */
  var target: SafariEventTarget
  
  /**
    * The time and date that the event was created.
    */
  var timestamp: Double
  
  /**
    * The type of the event.
    * The string used to identify a particular type of event is documented in the reference for that class.
    */
  var `type`: String
}
object SafariEvent {
  
  inline def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: SafariEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: SafariEventTarget,
    timestamp: Double,
    `type`: String
  ): SafariEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariEvent]
  }
  
  extension [Self <: SafariEvent](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: SafariEventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setTarget(value: SafariEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
