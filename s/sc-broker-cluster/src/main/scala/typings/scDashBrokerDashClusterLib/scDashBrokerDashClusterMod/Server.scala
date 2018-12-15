package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker-cluster", "Server")
@js.native
class Server protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: SCBrokerClusterServerOptions) = this()
  def destroy(): scala.Unit = js.native
  def killBrokers(): scala.Unit = js.native
  @JSName("on")
  def on_brokerExit(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.brokerExit,
    listener: js.Function1[/* brokerInfo */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_brokerMessage(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.brokerMessage,
    listener: js.Function3[
      /* brokerId */ java.lang.String, 
      /* data */ js.Any, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_brokerStart(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.brokerStart,
    listener: js.Function1[/* brokerInfo */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.error,
    listener: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ready(
    event: scDashBrokerDashClusterLib.scDashBrokerDashClusterLibStrings.ready,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  def sendToBroker(
    brokerId: java.lang.String,
    data: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

