package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter extends StObject {
  
  /**
    * Adds a listener to be invoked when events of the specified type are
    * emitted. An optional calling context may be provided. The data arguments
    * emitted will be passed to the listener function.
    *
    * @param eventType - Name of the event to listen to
    * @param listener - Function to invoke when the specified event is
    *   emitted
    * @param context - Optional context object to use when invoking the
    *   listener
    */
  def addListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _]): EmitterSubscription = js.native
  def addListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _], context: js.Any): EmitterSubscription = js.native
  
  /**
    * Emits an event of the given type with the given data. All handlers of that
    * particular type will be notified.
    *
    * @param eventType - Name of the event to emit
    * @param Arbitrary arguments to be passed to each registered listener
    *
    * @example
    *   emitter.addListener('someEvent', function(message) {
    *     console.log(message);
    *   });
    *
    *   emitter.emit('someEvent', 'abc'); // logs 'abc'
    */
  def emit(eventType: String, params: js.Any*): Unit = js.native
  
  /**
    * Returns an array of listeners that are currently registered for the given
    * event.
    *
    * @param eventType - Name of the event to query
    */
  def listeners(eventType: String): js.Array[EmitterSubscription] = js.native
  
  /**
    * Similar to addListener, except that the listener is removed after it is
    * invoked once.
    *
    * @param eventType - Name of the event to listen to
    * @param listener - Function to invoke only once when the
    *   specified event is emitted
    * @param context - Optional context object to use when invoking the
    *   listener
    */
  def once(eventType: String, listener: js.Function1[/* repeated */ js.Any, _], context: js.Any): EmitterSubscription = js.native
  
  /**
    * Removes all of the registered listeners, including those registered as
    * listener maps.
    *
    * @param eventType - Optional name of the event whose registered
    *   listeners to remove
    */
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventType: String): Unit = js.native
  
  /**
    * Provides an API that can be called during an eventing cycle to remove the
    * last listener that was invoked. This allows a developer to provide an event
    * object that can remove the listener (or listener map) during the
    * invocation.
    *
    * If it is called when not inside of an emitting cycle it will throw.
    *
    * @throws {Error} When called not during an eventing cycle
    *
    * @example
    *   const subscription = emitter.addListenerMap({
    *     someEvent: function(data, event) {
    *       console.log(data);
    *       emitter.removeCurrentListener();
    *     }
    *   });
    *
    *   emitter.emit('someEvent', 'abc'); // logs 'abc'
    *   emitter.emit('someEvent', 'def'); // does not log anything
    */
  def removeCurrentListener(): Unit = js.native
  
  /**
    * Removes the given listener for event of specific type.
    *
    * @param eventType - Name of the event to emit
    * @param listener - Function to invoke when the specified event is
    *   emitted
    *
    * @example
    *   emitter.removeListener('someEvent', function(message) {
    *     console.log(message);
    *   }); // removes the listener if already registered
    *
    */
  def removeListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /**
    * Removes a specific subscription. Called by the `remove()` method of the
    * subscription itself to ensure any necessary cleanup is performed.
    */
  def removeSubscription(subscription: EmitterSubscription): Unit = js.native
}
