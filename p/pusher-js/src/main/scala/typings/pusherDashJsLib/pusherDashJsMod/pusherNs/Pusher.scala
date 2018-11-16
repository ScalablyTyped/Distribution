package typings
package pusherDashJsLib.pusherDashJsMod.pusherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pusher extends EventsDispatcher {
   // TODO: add GlobalConfig typings
  var channels: js.Any = js.native
  var config: Config = js.native
   // TODO: Type this
  var connection: ConnectionManager = js.native
   // TODO: Type this
  var global_emitter: EventsDispatcher = js.native
  var key: java.lang.String = js.native
  var sessionID: scala.Double = js.native
  var timeline: js.Any = js.native
  def allChannels(): js.Array[Channel] = js.native
  def channel(name: java.lang.String): Channel = js.native
  def connect(): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def isEncrypted(): scala.Boolean = js.native
  def subscribe(name: java.lang.String): Channel = js.native
  def subscribeAll(): scala.Unit = js.native
  def unsubscribe(name: java.lang.String): scala.Unit = js.native
}

