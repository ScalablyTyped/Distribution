package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "EventEmitter")
@js.native
// region Constructors
/**
  * @constructor
  */
open class EventEmitter () extends StObject {
  
  /**
    * Registers a listener.
    * @param {string} type The type of event to listen for.
    * @param {!Function} fn The function to invoke when the event is fired.
    * @param {Object=} opt_self The object in whose scope to invoke the listener.
    * @param {boolean=} opt_oneshot Whether the listener should b (e removed
    *     after
    *    the first event is fired.
    * @return {!EventEmitter} A self reference.
    * @private
    */
  def addListener(`type`: String, fn: js.Function): EventEmitter = js.native
  def addListener(`type`: String, fn: js.Function, opt_scope: Any): EventEmitter = js.native
  def addListener(`type`: String, fn: js.Function, opt_scope: Any, opt_oneshot: Boolean): EventEmitter = js.native
  def addListener(`type`: String, fn: js.Function, opt_scope: Unit, opt_oneshot: Boolean): EventEmitter = js.native
  
  // endregion
  // region Methods
  /**
    * Fires an event and calls all listeners.
    * @param {string} type The type of event to emit.
    * @param {...*} var_args Any arguments to pass to each listener.
    */
  def emit(`type`: String, var_args: Any*): Unit = js.native
  
  /**
    * Returns a mutable list of listeners for a specific type of event.
    * @param {string} type The type of event to retrieve the listeners for.
    * @return {!Set<!Listener>} The registered listeners for the given event
    *     type.
    */
  def listeners(`type`: String): Any = js.native
  
  /**
    * An alias for {@code #addListener()}.
    * @param {string} type The type of event to listen for.
    * @param {!Function} fn The function to invoke when the event is fired.
    * @param {Object=} opt_scope The object in whose scope to invoke the
    *     listener.
    * @return {!EventEmitter} A self reference.
    */
  def on(`type`: String, fn: js.Function): EventEmitter = js.native
  def on(`type`: String, fn: js.Function, opt_scope: Any): EventEmitter = js.native
  
  /**
    * Registers a one-time listener which will be called only the first time an
    * event is emitted, after which it will be removed.
    * @param {string} type The type of event to listen for.
    * @param {!Function} fn The function to invoke when the event is fired.
    * @param {Object=} opt_scope The object in whose scope to invoke the
    *     listener.
    * @return {!EventEmitter} A self reference.
    */
  def once(`type`: String, fn: Any): EventEmitter = js.native
  def once(`type`: String, fn: Any, opt_scope: Any): EventEmitter = js.native
  
  /**
    * Removes all listeners for a specific type of event. If no event is
    * specified, all listeners across all types will be removed.
    * @param {string=} opt_type The type of event to remove listeners from.
    * @return {!EventEmitter} A self reference.
    */
  def removeAllListeners(): EventEmitter = js.native
  def removeAllListeners(opt_type: String): EventEmitter = js.native
  
  /**
    * Removes a previously registered event listener.
    * @param {string} type The type of event to unregister.
    * @param {!Function} listenerFn The handler function to remove.
    * @return {!EventEmitter} A self reference.
    */
  def removeListener(`type`: String, listenerFn: js.Function): EventEmitter = js.native
}
