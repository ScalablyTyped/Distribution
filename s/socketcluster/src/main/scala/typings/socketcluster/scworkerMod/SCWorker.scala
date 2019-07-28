package typings.socketcluster.scworkerMod

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.Server
import typings.scDashAuth.scDashAuthMod.SCAuthEngine
import typings.socketcluster.Anon_ClientCount
import typings.socketcluster.socketclusterStrings.connection
import typings.socketcluster.socketclusterStrings.error
import typings.socketcluster.socketclusterStrings.exit
import typings.socketcluster.socketclusterStrings.masterMessage
import typings.socketcluster.socketclusterStrings.ready
import typings.socketcluster.socketclusterStrings.start
import typings.socketcluster.socketclusterStrings.warning
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCWorker extends EventEmitter {
  val EVENT_CONNECTION: connection = js.native
  val EVENT_ERROR: error = js.native
  val EVENT_EXIT: exit = js.native
  val EVENT_READY: ready = js.native
  val EVENT_WARNING: warning = js.native
  val MIDDLEWARE_START: start = js.native
  var auth: SCAuthEngine = js.native
  var exchange: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCExchange */ js.Any = js.native
  var httpServer: Server | typings.node.httpsMod.Server = js.native
  var id: Double = js.native
  var isLeader: Boolean = js.native
  var options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ js.Any = js.native
  var scServer: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServer */ js.Any = js.native
  @JSName("addMiddleware")
  def addMiddleware_start(`type`: start, middlewareFn: middlewareFunction): Unit = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def getHTTPServer(): Server | typings.node.httpsMod.Server = js.native
  def getSCServer(): js.Any = js.native
  def getSocketPath(): String = js.native
  def getStatus(): Anon_ClientCount = js.native
  @JSName("on")
  def on_connection(
    event: connection,
    listener: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServerSocket */ /* scSocket */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_masterMessage(
    event: masterMessage,
    listener: js.Function2[
      /* data */ js.Any, 
      /* respond */ js.Function2[/* err */ Error | Null, /* responseData */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* warning */ Error, Unit]): this.type = js.native
  def open(): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_start(`type`: start, middlewareFn: middlewareFunction): Unit = js.native
  def respondToMaster(err: Null, data: js.Any, rid: Double): Unit = js.native
  def respondToMaster(err: Error, data: js.Any, rid: Double): Unit = js.native
  def run(): Unit = js.native
  def sendToMaster(data: js.Any, callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]): Unit = js.native
  def setAuthEngine(authEngine: SCAuthEngine): Unit = js.native
  def setCodecEngine(
    codecEngine: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SCServer.SCCodecEngine */ js.Any
  ): Unit = js.native
  def start(): js.Promise[Unit] = js.native
  def startHTTPServer(): Unit = js.native
}

