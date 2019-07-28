package typings.scDashBroker.scDashBrokerMod

import typings.node.eventsMod.EventEmitter
import typings.scDashBroker.scDashBrokerStrings.brokerMessage
import typings.scDashBroker.scDashBrokerStrings.error
import typings.scDashBroker.scDashBrokerStrings.exit
import typings.scDashBroker.scDashBrokerStrings.ready
import typings.socketcluster.socketclusterMod.WorkerExitInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerServer extends EventEmitter {
  var ipcAckTimeout: Double = js.native
  var options: SCBrokerServerOptions = js.native
  var port: js.UndefOr[Double] = js.native
  var socketPath: js.UndefOr[String] = js.native
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
  def on_error(event: error, listener: js.Function1[/* err */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("on")
  def on_exit(event: exit, listener: js.Function1[/* data */ WorkerExitInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  def sendToBroker(data: js.Any): Unit = js.native
  def sendToBroker(
    data: js.Any,
    callback: js.Function3[/* err */ Error | Null, /* data */ js.Any, /* brokerId */ String, Unit]
  ): Unit = js.native
}

