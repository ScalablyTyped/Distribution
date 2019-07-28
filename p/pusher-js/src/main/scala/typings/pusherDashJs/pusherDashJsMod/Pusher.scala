package typings.pusherDashJs.pusherDashJsMod

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
  var key: String = js.native
  var sessionID: Double = js.native
  var timeline: js.Any = js.native
  def allChannels(): js.Array[Channel] = js.native
  def channel(name: String): Channel = js.native
  def connect(): Unit = js.native
  def disconnect(): Unit = js.native
  def isEncrypted(): Boolean = js.native
  def subscribe(name: String): Channel = js.native
  def subscribeAll(): Unit = js.native
  def unsubscribe(name: String): Unit = js.native
}

