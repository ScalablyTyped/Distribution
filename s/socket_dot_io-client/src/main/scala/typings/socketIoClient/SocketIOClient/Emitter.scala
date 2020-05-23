package typings.socketIoClient.SocketIOClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base emiter class, used by Socket and Manager
  */
@js.native
trait Emitter extends js.Object {
  /**
    * @see on( event, fn )
    */
  def addEventListener(event: String, fn: js.Function): Emitter = js.native
  /**
    * Emits 'event' with the given args
    * @param event The event that we want to emit
    * @param args Optional arguments to emit with the event
    * @return Emitter
    */
  def emit(event: String, args: js.Any*): Emitter = js.native
  /**
    * Returns if we have listeners for a particular event
    * @param event The event that we want to check if we've listeners for
    * @return True if we have listeners for this event, false otherwise
    */
  def hasListeners(event: String): Boolean = js.native
  /**
    * Returns all the callbacks for a particular event
    * @param event The event that we're looking for the callbacks of
    * @return An array of callback Functions, or an empty array if we don't have any
    */
  def listeners(event: String): js.Array[js.Function] = js.native
  /**
    * Removes a listener for a particular type of event. This will either
    * remove a specific listener, or all listeners for this type of event
    * @param event The event that we want to remove the listener of
    * @param fn The function to remove, or null if we want to remove all functions
    * @return This Emitter
    */
  def off(event: String): Emitter = js.native
  def off(event: String, fn: js.Function): Emitter = js.native
  /**
    * Adds a listener for a particular event. Calling multiple times will add
    * multiple listeners
    * @param event The event that we're listening for
    * @param fn The function to call when we get the event. Parameters depend on the
    * event in question
    * @return This Emitter
    */
  def on(event: String, fn: js.Function): Emitter = js.native
  /**
    * Adds a listener for a particular event that will be invoked
    * a single time before being automatically removed
    * @param event The event that we're listening for
    * @param fn The function to call when we get the event. Parameters depend on
    * the event in question
    * @return This Emitter
    */
  def once(event: String, fn: js.Function): Emitter = js.native
  /**
    * Removes all event listeners on this object
    * @return This Emitter
    */
  def removeAllListeners(): Emitter = js.native
  /**
    * @see off( event, fn )
    */
  def removeEventListener(event: String): Emitter = js.native
  def removeEventListener(event: String, fn: js.Function): Emitter = js.native
  /**
    * @see off( event, fn )
    */
  def removeListener(event: String): Emitter = js.native
  def removeListener(event: String, fn: js.Function): Emitter = js.native
}

