package typings.raven.ravenMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.raven.ravenNumbers.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def captureBreadcrumb(breadcrumb: js.Any): Unit = js.native
  def captureException(e: Error): String = js.native
  def captureException(e: Error, cb: CaptureCallback): String = js.native
  def captureException(e: Error, options: CaptureOptions): String = js.native
  def captureException(e: Error, options: CaptureOptions, cb: CaptureCallback): String = js.native
  def captureMessage(message: String): String = js.native
  def captureMessage(message: String, cb: CaptureCallback): String = js.native
  def captureMessage(message: String, options: CaptureOptions): String = js.native
  def captureMessage(message: String, options: CaptureOptions, cb: CaptureCallback): String = js.native
  def config(): Client = js.native
  def config(dsn: String): Client = js.native
  def config(dsn: String, options: ConstructorOptions): Client = js.native
  def config(options: ConstructorOptions): Client = js.native
  @JSName("config")
  def config_false(dsn: `false`): Client = js.native
  @JSName("config")
  def config_false(dsn: `false`, options: ConstructorOptions): Client = js.native
  def context[T](ctx: js.Any, func: js.Function0[T]): T = js.native
  def context[T](func: js.Function0[T]): T = js.native
  def disableConsoleAlerts(): Unit = js.native
  def errorHandler(): js.Function4[
    /* e */ Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  def getContext(): js.Any = js.native
  def install(): Client = js.native
  def install(cb: FatalErrorCallback): Client = js.native
  def interceptErr(ctx: js.Any): Client = js.native
  def mergeContext(ctx: js.Any): Client = js.native
  def requestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  def setContext(ctx: js.Any): Client = js.native
  def setDataCallback(fn: DataCallback): Client = js.native
  def setShouldSendCallback(fn: ShouldSendCallback): Client = js.native
  def uninstall(): Client = js.native
  def wrap[T](func: js.Function0[T]): js.Function0[T] = js.native
  def wrap[T](options: js.Any, func: js.Function0[T]): js.Function0[T] = js.native
}

