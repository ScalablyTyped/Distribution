package typings
package socketclusterLib.scworkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCWorker
  extends nodeLib.eventsMod.EventEmitter {
  val EVENT_CONNECTION: socketclusterLib.socketclusterLibStrings.connection = js.native
  val EVENT_ERROR: socketclusterLib.socketclusterLibStrings.error = js.native
  val EVENT_EXIT: socketclusterLib.socketclusterLibStrings.exit = js.native
  val EVENT_READY: socketclusterLib.socketclusterLibStrings.ready = js.native
  val EVENT_WARNING: socketclusterLib.socketclusterLibStrings.warning = js.native
  val MIDDLEWARE_START: socketclusterLib.socketclusterLibStrings.start = js.native
  var auth: scDashAuthLib.scDashAuthMod.SCAuthEngine = js.native
  var exchange: js.Any = js.native
  var httpServer: nodeLib.httpMod.Server | nodeLib.httpsMod.Server = js.native
  var id: scala.Double = js.native
  var isLeader: scala.Boolean = js.native
  var options: js.Any = js.native
  var scServer: js.Any = js.native
  @JSName("addMiddleware")
  def addMiddleware_start(`type`: socketclusterLib.socketclusterLibStrings.start, middlewareFn: middlewareFunction): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getHTTPServer(): nodeLib.httpMod.Server | nodeLib.httpsMod.Server = js.native
  def getSCServer(): js.Any = js.native
  def getSocketPath(): java.lang.String = js.native
  def getStatus(): socketclusterLib.Anon_HttpRPM = js.native
  @JSName("on")
  def on_connection(
    event: socketclusterLib.socketclusterLibStrings.connection,
    listener: js.Function1[/* scSocket */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: socketclusterLib.socketclusterLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_masterMessage(
    event: socketclusterLib.socketclusterLibStrings.masterMessage,
    listener: js.Function2[
      /* data */ js.Any, 
      /* respond */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* responseData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_ready(event: socketclusterLib.socketclusterLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_warning(
    event: socketclusterLib.socketclusterLibStrings.warning,
    listener: js.Function1[/* warning */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  def open(): scala.Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_start(`type`: socketclusterLib.socketclusterLibStrings.start, middlewareFn: middlewareFunction): scala.Unit = js.native
  def respondToMaster(err: nodeLib.Error, data: js.Any, rid: scala.Double): scala.Unit = js.native
  def respondToMaster(err: scala.Null, data: js.Any, rid: scala.Double): scala.Unit = js.native
  def run(): scala.Unit = js.native
  def sendToMaster(
    data: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setAuthEngine(authEngine: scDashAuthLib.scDashAuthMod.SCAuthEngine): scala.Unit = js.native
  def setCodecEngine(codecEngine: js.Any): scala.Unit = js.native
  def start(): js.Promise[scala.Unit] = js.native
  def startHTTPServer(): scala.Unit = js.native
}

