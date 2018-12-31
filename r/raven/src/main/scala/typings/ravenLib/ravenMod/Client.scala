package typings
package ravenLib.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "Client")
@js.native
class Client ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(dsn: java.lang.String) = this()
  def this(dsn: ravenLib.ravenLibNumbers.`false`) = this()
  def this(options: ConstructorOptions) = this()
  def this(dsn: java.lang.String, options: ConstructorOptions) = this()
  def this(dsn: ravenLib.ravenLibNumbers.`false`, options: ConstructorOptions) = this()
  def captureBreadcrumb(breadcrumb: js.Any): scala.Unit = js.native
  def captureException(error: nodeLib.Error): java.lang.String = js.native
  def captureException(error: nodeLib.Error, cb: CaptureCallback): java.lang.String = js.native
  def captureException(error: nodeLib.Error, options: CaptureOptions): java.lang.String = js.native
  def captureException(error: nodeLib.Error, options: CaptureOptions, cb: CaptureCallback): java.lang.String = js.native
  def captureMessage(message: java.lang.String): java.lang.String = js.native
  def captureMessage(message: java.lang.String, cb: CaptureCallback): java.lang.String = js.native
  def captureMessage(message: java.lang.String, options: CaptureOptions): java.lang.String = js.native
  def captureMessage(message: java.lang.String, options: CaptureOptions, cb: CaptureCallback): java.lang.String = js.native
  def config(): this.type = js.native
  def config(dsn: java.lang.String): this.type = js.native
  def config(dsn: java.lang.String, options: ConstructorOptions): this.type = js.native
  def config(dsn: ravenLib.ravenLibNumbers.`false`): this.type = js.native
  def config(dsn: ravenLib.ravenLibNumbers.`false`, options: ConstructorOptions): this.type = js.native
  def config(options: ConstructorOptions): this.type = js.native
  def context[T](ctx: js.Any, func: js.Function0[T]): T = js.native
  def context[T](func: js.Function0[T]): T = js.native
  def errorHandler(): js.Function4[
    /* e */ nodeLib.Error, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ] = js.native
  def getContext(): js.Any = js.native
  def install(): this.type = js.native
  def install(cb: FatalErrorCallback): this.type = js.native
  def mergeContext(ctx: js.Any): this.type = js.native
   // todo: part of public API?
  def process(eventId: java.lang.String, kwargs: js.Any): scala.Unit = js.native
  def process(eventId: java.lang.String, kwargs: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def process(kwargs: js.Any): scala.Unit = js.native
  def process(kwargs: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def requestHandler(): js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ] = js.native
  def setContext(ctx: js.Any): this.type = js.native
  def setDataCallback(fn: DataCallback): this.type = js.native
  def setShouldSendCallback(fn: ShouldSendCallback): this.type = js.native
  def uninstall(): this.type = js.native
  def wrap[T](func: js.Function0[T]): js.Function0[T] = js.native
  def wrap[T](options: js.Any, func: js.Function0[T]): js.Function0[T] = js.native
}

