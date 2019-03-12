package typings
package scDashBrokerLib.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerServer
  extends nodeLib.eventsMod.EventEmitter {
  var ipcAckTimeout: scala.Double = js.native
  var options: SCBrokerServerOptions = js.native
  var port: js.UndefOr[scala.Double] = js.native
  var socketPath: js.UndefOr[java.lang.String] = js.native
  @JSName("on")
  def on_brokerMessage(
    event: scDashBrokerLib.scDashBrokerLibStrings.brokerMessage,
    listener: js.Function3[
      /* brokerId */ java.lang.String, 
      /* data */ js.Any, 
      /* callback */ js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: scDashBrokerLib.scDashBrokerLibStrings.error,
    listener: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exit(
    event: scDashBrokerLib.scDashBrokerLibStrings.exit,
    listener: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WorkerExitInfo */ /* data */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_ready(
    event: scDashBrokerLib.scDashBrokerLibStrings.ready,
    listener: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  def sendToBroker(data: js.Any): scala.Unit = js.native
  def sendToBroker(
    data: js.Any,
    callback: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* data */ js.Any, 
      /* brokerId */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

