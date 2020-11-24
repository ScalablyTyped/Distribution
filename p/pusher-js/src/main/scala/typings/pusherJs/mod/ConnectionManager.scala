package typings.pusherJs.mod

import typings.pusherJs.anon.Activity
import typings.pusherJs.anon.Backoff
import typings.pusherJs.anon.Connected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionManager extends EventsDispatcher {
  
  /**
    * Establishes a connection to Pusher.
    *
    * Does nothing when connection is already established. See top-level doc
    * to find events emitted on connection attempts.
    */
  def connect(): Unit = js.native
  
  var connection: js.Any = js.native
  
   // TODO: Type this
  var connectionCallbacks: Activity = js.native
  
  /** Closes the connection. */
  def disconnect(): Unit = js.native
  
   // TODO: Type this
  var encrypted: Boolean = js.native
  
  var errorCallbacks: Backoff = js.native
  
  var handshakeCallbacks: Connected = js.native
  
  def isEncrypted(): Boolean = js.native
  
  var key: String = js.native
  
  var options: js.Any = js.native
  
  /**
    * Sends raw data.
    */
  def send(data: String): Boolean = js.native
  
  /**
    * Sends an event.
    */
  def send_event(name: String, data: String, channel: String): Boolean = js.native
  
  var socket_id: String = js.native
  
   // TODO: Timeline.js
  var state: String = js.native
  
  var timeline: js.Any = js.native
}
