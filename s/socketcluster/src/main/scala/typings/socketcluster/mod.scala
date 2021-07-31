package typings.socketcluster

import typings.node.childProcessMod.ChildProcess
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster", JSImport.Namespace)
  @js.native
  class ^ () extends SocketCluster {
    def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ js.Any) = this()
  }
  @JSImport("socketcluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def create(): SocketCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SocketCluster]
  @scala.inline
  def create(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ js.Any
  ): SocketCluster = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[SocketCluster]
  
  trait BrokerExitInfo extends StObject {
    
    var code: Double
    
    var id: Double
    
    var pid: Double
    
    var signal: String
  }
  object BrokerExitInfo {
    
    @scala.inline
    def apply(code: Double, id: Double, pid: Double, signal: String): BrokerExitInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerExitInfo]
    }
    
    @scala.inline
    implicit class BrokerExitInfoMutableBuilder[Self <: BrokerExitInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrokerStartInfo extends StObject {
    
    var id: Double
    
    var pid: Double
    
    var respawn: Boolean
  }
  object BrokerStartInfo {
    
    @scala.inline
    def apply(id: Double, pid: Double, respawn: Boolean): BrokerStartInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], respawn = respawn.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrokerStartInfo]
    }
    
    @scala.inline
    implicit class BrokerStartInfoMutableBuilder[Self <: BrokerStartInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespawn(value: Boolean): Self = StObject.set(x, "respawn", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.socketcluster.socketclusterStrings.red
    - typings.socketcluster.socketclusterStrings.green
    - typings.socketcluster.socketclusterStrings.yellow
  */
  trait ColorCodes extends StObject
  object ColorCodes {
    
    @scala.inline
    def green: typings.socketcluster.socketclusterStrings.green = "green".asInstanceOf[typings.socketcluster.socketclusterStrings.green]
    
    @scala.inline
    def red: typings.socketcluster.socketclusterStrings.red = "red".asInstanceOf[typings.socketcluster.socketclusterStrings.red]
    
    @scala.inline
    def yellow: typings.socketcluster.socketclusterStrings.yellow = "yellow".asInstanceOf[typings.socketcluster.socketclusterStrings.yellow]
  }
  
  trait KillWorkersOptions extends StObject {
    
    // Shut down the workers immediately without waiting for termination timeout.
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    // Shut down the cluster master (load balancer) as well as all the workers.
    var killClusterMaster: js.UndefOr[Boolean] = js.undefined
  }
  object KillWorkersOptions {
    
    @scala.inline
    def apply(): KillWorkersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KillWorkersOptions]
    }
    
    @scala.inline
    implicit class KillWorkersOptionsMutableBuilder[Self <: KillWorkersOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      @scala.inline
      def setKillClusterMaster(value: Boolean): Self = StObject.set(x, "killClusterMaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillClusterMasterUndefined: Self = StObject.set(x, "killClusterMaster", js.undefined)
    }
  }
  
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
    
    var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ js.Any = js.native
    
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
  
  trait WorkerClusterExitInfo extends StObject {
    
    var childProcess: ChildProcess
    
    var code: Double
    
    var pid: Double
    
    var signal: String
  }
  object WorkerClusterExitInfo {
    
    @scala.inline
    def apply(childProcess: ChildProcess, code: Double, pid: Double, signal: String): WorkerClusterExitInfo = {
      val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerClusterExitInfo]
    }
    
    @scala.inline
    implicit class WorkerClusterExitInfoMutableBuilder[Self <: WorkerClusterExitInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildProcess(value: ChildProcess): Self = StObject.set(x, "childProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerClusterReadyInfo extends StObject {
    
    var childProcess: ChildProcess
    
    var pid: Double
  }
  object WorkerClusterReadyInfo {
    
    @scala.inline
    def apply(childProcess: ChildProcess, pid: Double): WorkerClusterReadyInfo = {
      val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerClusterReadyInfo]
    }
    
    @scala.inline
    implicit class WorkerClusterReadyInfoMutableBuilder[Self <: WorkerClusterReadyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildProcess(value: ChildProcess): Self = StObject.set(x, "childProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerClusterStartInfo extends StObject {
    
    var childProcess: ChildProcess
    
    var pid: Double
  }
  object WorkerClusterStartInfo {
    
    @scala.inline
    def apply(childProcess: ChildProcess, pid: Double): WorkerClusterStartInfo = {
      val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerClusterStartInfo]
    }
    
    @scala.inline
    implicit class WorkerClusterStartInfoMutableBuilder[Self <: WorkerClusterStartInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildProcess(value: ChildProcess): Self = StObject.set(x, "childProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerExitInfo extends StObject {
    
    var code: Double
    
    var id: Double
    
    var pid: Double
    
    var signal: String
  }
  object WorkerExitInfo {
    
    @scala.inline
    def apply(code: Double, id: Double, pid: Double, signal: String): WorkerExitInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerExitInfo]
    }
    
    @scala.inline
    implicit class WorkerExitInfoMutableBuilder[Self <: WorkerExitInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerStartInfo extends StObject {
    
    var id: Double
    
    var pid: Double
    
    var respawn: Boolean
  }
  object WorkerStartInfo {
    
    @scala.inline
    def apply(id: Double, pid: Double, respawn: Boolean): WorkerStartInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], respawn = respawn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerStartInfo]
    }
    
    @scala.inline
    implicit class WorkerStartInfoMutableBuilder[Self <: WorkerStartInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRespawn(value: Boolean): Self = StObject.set(x, "respawn", value.asInstanceOf[js.Any])
    }
  }
}
