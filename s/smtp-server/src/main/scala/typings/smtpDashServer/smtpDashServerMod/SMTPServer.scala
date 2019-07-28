package typings.smtpDashServer.smtpDashServerMod

import typings.node.eventsMod.EventEmitter
import typings.node.netMod.ListenOptions
import typings.node.netMod.Server
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.TlsOptions
import typings.nodemailer.libSharedMod.Logger
import typings.smtpDashServer.smtpDashServerStrings.close
import typings.smtpDashServer.smtpDashServerStrings.error
import typings.std.Error
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smtp-server", "SMTPServer")
@js.native
class SMTPServer () extends EventEmitter {
  def this(options: SMTPServerOptions) = this()
  var connections: Set[_] = js.native
  var logger: Logger = js.native
  var options: SMTPServerOptions = js.native
  var secureContext: Map[String, SecureContext] = js.native
  var server: Server = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
   // tslint:disable-line unified-signatures
  /** Closes the server */
  def close(callback: js.Function0[Unit]): Unit = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: Error): Boolean = js.native
  /** Start listening on selected port and interface */
  def listen(): Server = js.native
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, backlog: Double): Server = js.native
  def listen(handle: js.Any, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(options: ListenOptions): Server = js.native
  def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(path: String): Server = js.native
  def listen(path: String, backlog: Double): Server = js.native
  def listen(path: String, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(path: String, listeningListener: js.Function0[Unit]): Unit = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, backlog: Double): Server = js.native
  def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(port: Double, hostname: String): Server = js.native
  def listen(port: Double, hostname: String, backlog: Double): Server = js.native
  def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(port: Double, hostname: String, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): Server = js.native
  @JSName("listen")
  def listen_Unit(path: String): Unit = js.native
  @JSName("listenerCount")
  def listenerCount_close(event: close): Double = js.native
  @JSName("listenerCount")
  def listenerCount_error(event: error): Double = js.native
  @JSName("listeners")
  def listeners_close(event: close): js.Array[js.Function0[Unit]] = js.native
  @JSName("listeners")
  def listeners_error(event: error): js.Array[js.Function1[/* err */ Error, Unit]] = js.native
  @JSName("off")
  def off_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /** Authentication handler. Override this */
  def onAuth(
    auth: SMTPServerAuthentication,
    session: SMTPServerSession,
    callback: js.Function2[
      /* err */ js.UndefOr[Error | Null], 
      /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
      Unit
    ]
  ): Unit = js.native
  /** Override this */
  def onClose(session: SMTPServerSession, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  /** Override this */
  def onConnect(session: SMTPServerSession, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  /** Override this */
  def onData(
    stream: SMTPServerDataStream,
    session: SMTPServerSession,
    callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  /** Override this */
  def onMailFrom(
    address: SMTPServerAddress,
    session: SMTPServerSession,
    callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  /** Override this */
  def onRcptTo(
    address: SMTPServerAddress,
    session: SMTPServerSession,
    callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_close(event: close): js.Array[js.Function0[Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_error(event: error): js.Array[js.Function1[/* err */ Error, Unit]] = js.native
  @JSName("removeAllListener")
  def removeAllListener_close(event: close): this.type = js.native
  @JSName("removeAllListener")
  def removeAllListener_error(event: error): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  def updateSecureContext(options: TlsOptions): Unit = js.native
}

