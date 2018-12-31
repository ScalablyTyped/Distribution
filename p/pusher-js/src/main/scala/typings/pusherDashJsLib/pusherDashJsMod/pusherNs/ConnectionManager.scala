package typings
package pusherDashJsLib.pusherDashJsMod.pusherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionManager extends EventsDispatcher {
  var connection: js.Any = js.native
   // TODO: Type this
  var connectionCallbacks: pusherDashJsLib.Anon_Closed = js.native
   // TODO: Type this
  var encrypted: scala.Boolean = js.native
  var errorCallbacks: pusherDashJsLib.Anon_Backoff = js.native
  var handshakeCallbacks: pusherDashJsLib.Anon_Refused = js.native
  var key: java.lang.String = js.native
  var options: js.Any = js.native
  var socket_id: java.lang.String = js.native
   // TODO: Timeline.js
  var state: java.lang.String = js.native
  var timeline: js.Any = js.native
  /**
    * Establishes a connection to Pusher.
    *
    * Does nothing when connection is already established. See top-level doc
    * to find events emitted on connection attempts.
    */
  def connect(): scala.Unit = js.native
  /** Closes the connection. */
  def disconnect(): scala.Unit = js.native
  def isEncrypted(): scala.Boolean = js.native
  /**
    * Sends raw data.
    */
  def send(data: java.lang.String): scala.Boolean = js.native
  /**
    * Sends an event.
    */
  def send_event(name: java.lang.String, data: java.lang.String, channel: java.lang.String): scala.Boolean = js.native
}

