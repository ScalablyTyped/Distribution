package typings.pusherDashJs.pusherDashJsMod

import typings.pusherDashJs.Anon_Activity
import typings.pusherDashJs.Anon_Backoff
import typings.pusherDashJs.Anon_BackoffConnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionManager extends EventsDispatcher {
  var connection: js.Any = js.native
   // TODO: Type this
  var connectionCallbacks: Anon_Activity = js.native
   // TODO: Type this
  var encrypted: Boolean = js.native
  var errorCallbacks: Anon_Backoff = js.native
  var handshakeCallbacks: Anon_BackoffConnected = js.native
  var key: String = js.native
  var options: js.Any = js.native
  var socket_id: String = js.native
   // TODO: Timeline.js
  var state: String = js.native
  var timeline: js.Any = js.native
  /**
    * Establishes a connection to Pusher.
    *
    * Does nothing when connection is already established. See top-level doc
    * to find events emitted on connection attempts.
    */
  def connect(): Unit = js.native
  /** Closes the connection. */
  def disconnect(): Unit = js.native
  def isEncrypted(): Boolean = js.native
  /**
    * Sends raw data.
    */
  def send(data: String): Boolean = js.native
  /**
    * Sends an event.
    */
  def send_event(name: String, data: String, channel: String): Boolean = js.native
}

