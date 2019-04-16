package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "Client")
@js.native
class Client protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: SCBrokerClusterClientOptions) = this()
  var options: SCBrokerClusterClientOptions = js.native
  def destroy(): scala.Unit = js.native
  def destroy(callback: asyncLib.asyncMod.AsyncResultArrayCallback[SCExchange, stdLib.Error]): scala.Unit = js.native
  def exchange(): SCExchange = js.native
  def isSubscribed(channel: java.lang.String): scala.Boolean = js.native
  def isSubscribed(channel: java.lang.String, includePending: scala.Boolean): scala.Boolean = js.native
  @JSName("on")
  def on_error(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.error,
    listener: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.message,
    listener: js.Function1[/* packet */ MessagePacket, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ready(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.ready,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_warning(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.warning,
    listener: js.Function1[/* warning */ js.UndefOr[stdLib.Error], scala.Unit]
  ): this.type = js.native
  def setSCServer(
    scServer: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServer */ js.Any
  ): scala.Unit = js.native
  def subscribe(channel: java.lang.String): scala.Unit = js.native
  def subscribe(channel: java.lang.String, callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def subscribeSocket(
    socket: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServerSocket */ js.Any,
    channel: java.lang.String
  ): scala.Unit = js.native
  def subscribeSocket(
    socket: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServerSocket */ js.Any,
    channel: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def unsubscribe(channel: java.lang.String): scala.Unit = js.native
  def unsubscribe(channel: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def unsubscribeAll(): scala.Unit = js.native
  def unsubscribeAll(callback: asyncLib.asyncMod.AsyncResultArrayCallback[_, stdLib.Error]): scala.Unit = js.native
  def unsubscribeSocket(
    socket: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServerSocket */ js.Any,
    channel: java.lang.String
  ): scala.Unit = js.native
  def unsubscribeSocket(
    socket: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServerSocket */ js.Any,
    channel: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

