package typings.raven.mod

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.raven.ravenBooleans.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raven", "Client")
@js.native
class Client () extends EventEmitter {
  def this(dsn: String) = this()
  def this(dsn: `false`) = this()
  def this(options: ConstructorOptions) = this()
  def this(dsn: js.UndefOr[scala.Nothing], options: ConstructorOptions) = this()
  def this(dsn: String, options: ConstructorOptions) = this()
  def this(dsn: `false`, options: ConstructorOptions) = this()
  
  def captureBreadcrumb(breadcrumb: js.Any): Unit = js.native
  
  def captureException(error: Error): String = js.native
  def captureException(error: Error, cb: CaptureCallback): String = js.native
  def captureException(error: Error, options: js.UndefOr[scala.Nothing], cb: CaptureCallback): String = js.native
  def captureException(error: Error, options: CaptureOptions): String = js.native
  def captureException(error: Error, options: CaptureOptions, cb: CaptureCallback): String = js.native
  
  def captureMessage(message: String): String = js.native
  def captureMessage(message: String, cb: CaptureCallback): String = js.native
  def captureMessage(message: String, options: js.UndefOr[scala.Nothing], cb: CaptureCallback): String = js.native
  def captureMessage(message: String, options: CaptureOptions): String = js.native
  def captureMessage(message: String, options: CaptureOptions, cb: CaptureCallback): String = js.native
  
  def config(): this.type = js.native
  def config(dsn: js.UndefOr[scala.Nothing], options: ConstructorOptions): this.type = js.native
  def config(dsn: String): this.type = js.native
  def config(dsn: String, options: ConstructorOptions): this.type = js.native
  def config(options: ConstructorOptions): this.type = js.native
  @JSName("config")
  def config_false(dsn: `false`): this.type = js.native
  @JSName("config")
  def config_false(dsn: `false`, options: ConstructorOptions): this.type = js.native
  
  def context[T](ctx: js.Any, func: js.Function0[T]): T = js.native
  def context[T](func: js.Function0[T]): T = js.native
  
  def errorHandler(): js.Function4[
    /* e */ Error, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  def getContext(): js.Any = js.native
  
  def install(): this.type = js.native
  def install(cb: FatalErrorCallback): this.type = js.native
  
  def mergeContext(ctx: js.Any): this.type = js.native
  
   // todo: part of public API?
  def process(eventId: String, kwargs: js.Any): Unit = js.native
  def process(eventId: String, kwargs: js.Any, cb: js.Function0[Unit]): Unit = js.native
  def process(kwargs: js.Any): Unit = js.native
  def process(kwargs: js.Any, cb: js.Function0[Unit]): Unit = js.native
  
  def requestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = js.native
  
  def setContext(ctx: js.Any): this.type = js.native
  
  def setDataCallback(fn: DataCallback): this.type = js.native
  
  def setShouldSendCallback(fn: ShouldSendCallback): this.type = js.native
  
  def uninstall(): this.type = js.native
  
  def wrap[T](func: js.Function0[T]): js.Function0[T] = js.native
  def wrap[T](options: js.Any, func: js.Function0[T]): js.Function0[T] = js.native
}
