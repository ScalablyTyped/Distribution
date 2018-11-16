package typings
package signalrLib.SignalRNs.HubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Proxy extends js.Object {
  var connection: Connection
  var hubName: java.lang.String
  var state: js.Any
  def hasSubscriptions(): scala.Boolean
  def init(connection: Connection, hubName: java.lang.String): scala.Unit
  /**
              * Invokes a server hub method with the given arguments.
              *
              * @param methodName The name of the server hub method.
              */
  def invoke(methodName: java.lang.String, args: js.Any*): jqueryLib.JQueryPromise[_]
  /**
              * Removes the callback invocation request from the server hub for the given event name.
              *
              * @param eventName The name of the hub event to unregister the callback for.
              * @param callback The callback to be invoked.
              */
  def off(eventName: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): Proxy
  /**
              * Wires up a callback to be invoked when a invocation request is received from the server hub.
              *
              * @param eventName The name of the hub event to register the callback for.
              * @param callback The callback to be invoked.
              */
  def on(eventName: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): Proxy
}

