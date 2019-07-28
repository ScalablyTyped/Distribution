package typings.scDashBrokerDashCluster.scDashBrokerDashClusterMod

import typings.node.eventsMod.EventEmitter
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.brokerExit
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.brokerMessage
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.brokerStart
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.error
import typings.scDashBrokerDashCluster.scDashBrokerDashClusterStrings.ready
import typings.socketcluster.socketclusterMod.BrokerExitInfo
import typings.socketcluster.socketclusterMod.BrokerStartInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(options: SCBrokerClusterServerOptions) = this()
  def destroy(): Unit = js.native
  def killBrokers(): Unit = js.native
  @JSName("on")
  def on_brokerExit(event: brokerExit, listener: js.Function1[/* brokerInfo */ BrokerExitInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_brokerMessage(
    event: brokerMessage,
    listener: js.Function3[
      /* brokerId */ String, 
      /* data */ js.Any, 
      /* callback */ js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_brokerStart(event: brokerStart, listener: js.Function1[/* brokerInfo */ BrokerStartInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  def sendToBroker(brokerId: String, data: js.Any): Unit = js.native
  def sendToBroker(
    brokerId: String,
    data: js.Any,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
}

