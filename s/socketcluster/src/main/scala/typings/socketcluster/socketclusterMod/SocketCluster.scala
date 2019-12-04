package typings.socketcluster.socketclusterMod

import typings.node.eventsMod.EventEmitter
import typings.socketcluster.socketclusterStrings.brokerExit
import typings.socketcluster.socketclusterStrings.brokerStart
import typings.socketcluster.socketclusterStrings.fail
import typings.socketcluster.socketclusterStrings.ready
import typings.socketcluster.socketclusterStrings.warning
import typings.socketcluster.socketclusterStrings.workerClusterExit
import typings.socketcluster.socketclusterStrings.workerClusterReady
import typings.socketcluster.socketclusterStrings.workerClusterStart
import typings.socketcluster.socketclusterStrings.workerExit
import typings.socketcluster.socketclusterStrings.workerStart
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketCluster extends EventEmitter {
  val EVENT_BROKER_EXIT: brokerExit = js.native
  val EVENT_BROKER_START: brokerStart = js.native
  val EVENT_FAIL: fail = js.native
  val EVENT_READY: ready = js.native
  val EVENT_WARNING: warning = js.native
  val EVENT_WORKER_CLUSTER_EXIT: workerClusterExit = js.native
  val EVENT_WORKER_CLUSTER_READY: workerClusterReady = js.native
  val EVENT_WORKER_CLUSTER_START: workerClusterStart = js.native
  val EVENT_WORKER_EXIT: workerExit = js.native
  val EVENT_WORKER_START: workerStart = js.native
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ js.Any = js.native
  def colorText(message: String): String = js.native
  def colorText(message: String, color: Double): String = js.native
  def colorText(message: String, color: ColorCodes): String = js.native
  def destroy(): Unit = js.native
  def destroy(callback: js.Function0[Unit]): Unit = js.native
  def killBrokers(): Unit = js.native
  def killWorkers(): Unit = js.native
  def killWorkers(options: KillWorkersOptions): Unit = js.native
  def log(message: String): Unit = js.native
  def log(message: String, time: Double): Unit = js.native
  @JSName("on")
  def on_brokerExit(event: brokerExit, listener: js.Function1[/* brokerInfo */ BrokerExitInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_brokerStart(event: brokerStart, listener: js.Function1[/* brokerInfo */ BrokerStartInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_fail(event: fail, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* warning */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_workerClusterExit(
    event: workerClusterExit,
    listener: js.Function1[/* workerClusterInfo */ WorkerClusterExitInfo, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_workerClusterReady(
    event: workerClusterReady,
    listener: js.Function1[/* workerClusterInfo */ WorkerClusterReadyInfo, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_workerClusterStart(
    event: workerClusterStart,
    listener: js.Function1[/* workerClusterInfo */ WorkerClusterStartInfo, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_workerExit(event: workerExit, listener: js.Function1[/* workerInfo */ WorkerExitInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_workerStart(event: workerStart, listener: js.Function1[/* workerInfo */ WorkerStartInfo, Unit]): this.type = js.native
  def run(): Unit = js.native
  def sendToBroker(brokerId: Double, data: js.Any): Unit = js.native
  def sendToBroker(
    brokerId: Double,
    data: js.Any,
    callback: js.Function2[/* err */ Error | Null, /* responseData */ js.Any, Unit]
  ): Unit = js.native
  def sendToWorker(workerId: Double, data: js.Any): Unit = js.native
  def sendToWorker(
    workerId: Double,
    data: js.Any,
    callback: js.Function3[/* err */ Error, /* responseData */ js.Any, /* workerId */ Double, Unit]
  ): Unit = js.native
}

