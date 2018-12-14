package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  def addEventListener(`type`: java.lang.String): scala.Unit = js.native
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  def addEventListener(`type`: java.lang.String, listener: scala.Null, options: scala.Boolean): scala.Unit = js.native
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  def addEventListener(`type`: java.lang.String, listener: scala.Null, options: AddEventListenerOptions): scala.Unit = js.native
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
       * Dispatches a synthetic event event to target and returns true
       * if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
       */
  def dispatchEvent(event: Event): scala.Boolean = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  def removeEventListener(`type`: java.lang.String): scala.Unit = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  def removeEventListener(`type`: java.lang.String, callback: scala.Null, options: scala.Boolean): scala.Unit = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  def removeEventListener(`type`: java.lang.String, callback: scala.Null, options: EventListenerOptions): scala.Unit = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("EventTarget")
@js.native
object EventTarget
  extends org.scalablytyped.runtime.Instantiable0[EventTarget]

