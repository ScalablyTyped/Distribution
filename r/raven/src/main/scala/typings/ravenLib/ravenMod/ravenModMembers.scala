package typings
package ravenLib.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", JSImport.Namespace)
@js.native
object ravenModMembers extends js.Object {
  val version: java.lang.String = js.native
  def captureBreadcrumb(breadcrumb: js.Any): scala.Unit = js.native
  def captureException(e: nodeLib.Error): java.lang.String = js.native
  def captureException(e: nodeLib.Error, cb: CaptureCallback): java.lang.String = js.native
  def captureException(e: nodeLib.Error, options: CaptureOptions): java.lang.String = js.native
  def captureException(e: nodeLib.Error, options: CaptureOptions, cb: CaptureCallback): java.lang.String = js.native
  def captureMessage(message: java.lang.String): java.lang.String = js.native
  def captureMessage(message: java.lang.String, cb: CaptureCallback): java.lang.String = js.native
  def captureMessage(message: java.lang.String, options: CaptureOptions): java.lang.String = js.native
  def captureMessage(message: java.lang.String, options: CaptureOptions, cb: CaptureCallback): java.lang.String = js.native
  def config(): Client = js.native
  def config(dsn: java.lang.String): Client = js.native
  def config(dsn: java.lang.String, options: ConstructorOptions): Client = js.native
  def config(dsn: ravenLib.ravenLibNumbers.`false`): Client = js.native
  def config(dsn: ravenLib.ravenLibNumbers.`false`, options: ConstructorOptions): Client = js.native
  def config(options: ConstructorOptions): Client = js.native
  def context[T](ctx: js.Any, func: js.Function0[T]): T = js.native
  def context[T](func: js.Function0[T]): T = js.native
  def disableConsoleAlerts(): scala.Unit = js.native
  def errorHandler(): js.Function4[
    /* e */ nodeLib.Error, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ] = js.native
  def getContext(): js.Any = js.native
  def install(): Client = js.native
  def install(cb: FatalErrorCallback): Client = js.native
  def interceptErr(ctx: js.Any): Client = js.native
  def mergeContext(ctx: js.Any): Client = js.native
  def requestHandler(): js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ] = js.native
  def setContext(ctx: js.Any): Client = js.native
  def setDataCallback(fn: DataCallback): Client = js.native
  def setShouldSendCallback(fn: ShouldSendCallback): Client = js.native
  def uninstall(): Client = js.native
  def wrap[T](func: js.Function0[T]): js.Function0[T] = js.native
  def wrap[T](options: js.Any, func: js.Function0[T]): js.Function0[T] = js.native
}

