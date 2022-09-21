package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def addListener(eventType: String, listener: js.Function1[/* repeated */ Any, Any]): EmitterSubscription = js.native
  def addListener(eventType: String, listener: js.Function1[/* repeated */ Any, Any], context: Any): EmitterSubscription = js.native
  
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
  def emit(eventType: String, params: Any*): Unit = js.native
  
  /**
    * Returns the number of listeners that are currently registered for the given
    * event.
    *
    * @param eventType - Name of the event to query
    */
  def listenerCount(eventType: String): Double = js.native
  
  /**
    * Removes all of the registered listeners, including those registered as
    * listener maps.
    *
    * @param eventType - Optional name of the event whose registered
    *   listeners to remove
    */
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventType: String): Unit = js.native
}
