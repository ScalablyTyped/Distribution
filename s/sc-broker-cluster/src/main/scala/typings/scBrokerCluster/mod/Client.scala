package typings.scBrokerCluster.mod

import typings.async.mod.AsyncResultArrayCallback
import typings.node.eventsMod.EventEmitter
import typings.scBrokerCluster.scBrokerClusterStrings.error
import typings.scBrokerCluster.scBrokerClusterStrings.message
import typings.scBrokerCluster.scBrokerClusterStrings.ready
import typings.scBrokerCluster.scBrokerClusterStrings.warning
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(options: SCBrokerClusterClientOptions) = this()
  var options: SCBrokerClusterClientOptions = js.native
  def destroy(): Unit = js.native
  def destroy(callback: AsyncResultArrayCallback[SCExchange, Error]): Unit = js.native
  def exchange(): SCExchange = js.native
  def isSubscribed(channel: String): Boolean = js.native
  def isSubscribed(channel: String, includePending: Boolean): Boolean = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* packet */ MessagePacket, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* warning */ js.UndefOr[Error], Unit]): this.type = js.native
  def setSCServer(scServer: SCServer): Unit = js.native
  def subscribe(channel: String): Unit = js.native
  def subscribe(channel: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def subscribeSocket(socket: ServerSocket, channel: String): Unit = js.native
  def subscribeSocket(socket: ServerSocket, channel: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def unsubscribe(channel: String): Unit = js.native
  def unsubscribe(channel: String, callback: js.Function0[Unit]): Unit = js.native
  def unsubscribeAll(): Unit = js.native
  def unsubscribeAll(callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def unsubscribeSocket(socket: ServerSocket, channel: String): Unit = js.native
  def unsubscribeSocket(socket: ServerSocket, channel: String, callback: js.Function0[Unit]): Unit = js.native
}

