package typings.scDashBrokerDashCluster.scDashBrokerDashClusterMod

import typings.async.asyncMod.AsyncResultArrayCallback
import typings.node.eventsMod.EventEmitter
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.error
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.message
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.ready
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.warning
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
  def setSCServer(
    scServer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer */ js.Any
  ): Unit = js.native
  def subscribe(channel: String): Unit = js.native
  def subscribe(channel: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def subscribeSocket(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServerSocket */ js.Any,
    channel: String
  ): Unit = js.native
  def subscribeSocket(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServerSocket */ js.Any,
    channel: String,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def unsubscribe(channel: String): Unit = js.native
  def unsubscribe(channel: String, callback: js.Function0[Unit]): Unit = js.native
  def unsubscribeAll(): Unit = js.native
  def unsubscribeAll(callback: AsyncResultArrayCallback[_, Error]): Unit = js.native
  def unsubscribeSocket(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServerSocket */ js.Any,
    channel: String
  ): Unit = js.native
  def unsubscribeSocket(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServerSocket */ js.Any,
    channel: String,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

