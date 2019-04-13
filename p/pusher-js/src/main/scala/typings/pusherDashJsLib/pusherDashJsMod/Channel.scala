package typings
package pusherDashJsLib.pusherDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends EventsDispatcher {
  var name: java.lang.String = js.native
  var pusher: Pusher = js.native
  var subscribed: scala.Boolean = js.native
  /**
    * Authenticates the connection as a member of the channel.
    */
  def authorize(socketId: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Triggers an event */
  def trigger(eventName: java.lang.String): scala.Boolean = js.native
  def trigger(eventName: java.lang.String, data: js.Any): scala.Boolean = js.native
}

