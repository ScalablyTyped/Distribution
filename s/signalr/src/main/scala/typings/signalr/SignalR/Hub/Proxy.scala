package typings.signalr.SignalR.Hub

import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  var connection: typings.signalr.SignalR.Hub.Connection
  var hubName: String
  var state: js.Any
  def hasSubscriptions(): Boolean
  def init(connection: typings.signalr.SignalR.Hub.Connection, hubName: String): Unit
  /**
    * Invokes a server hub method with the given arguments.
    *
    * @param methodName The name of the server hub method.
    */
  def invoke(methodName: String, args: js.Any*): JQueryPromise[_]
  /**
    * Removes the callback invocation request from the server hub for the given event name.
    *
    * @param eventName The name of the hub event to unregister the callback for.
    * @param callback The callback to be invoked.
    */
  def off(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy
  /**
    * Wires up a callback to be invoked when a invocation request is received from the server hub.
    *
    * @param eventName The name of the hub event to register the callback for.
    * @param callback The callback to be invoked.
    */
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy
}

object Proxy {
  @scala.inline
  def apply(
    connection: typings.signalr.SignalR.Hub.Connection,
    hasSubscriptions: () => Boolean,
    hubName: String,
    init: (typings.signalr.SignalR.Hub.Connection, String) => Unit,
    invoke: (String, /* repeated */ js.Any) => JQueryPromise[_],
    off: (String, js.Function1[/* repeated */ js.Any, Unit]) => Proxy,
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => Proxy,
    state: js.Any
  ): Proxy = {
    val __obj = js.Dynamic.literal(connection = connection, hasSubscriptions = js.Any.fromFunction0(hasSubscriptions), hubName = hubName, init = js.Any.fromFunction2(init), invoke = js.Any.fromFunction2(invoke), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), state = state)
  
    __obj.asInstanceOf[Proxy]
  }
}

