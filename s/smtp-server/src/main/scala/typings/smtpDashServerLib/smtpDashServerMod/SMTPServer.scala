package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smtp-server", "SMTPServer")
@js.native
class SMTPServer ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: SMTPServerOptions) = this()
  var connections: nodeLib.Set[_] = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  var options: SMTPServerOptions = js.native
  var secureContext: nodeLib.Map[java.lang.String, nodeLib.tlsMod.SecureContext] = js.native
  var server: nodeLib.netMod.Server = js.native
  @JSName("addListener")
  def addListener_close(event: smtpDashServerLib.smtpDashServerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: smtpDashServerLib.smtpDashServerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
   // tslint:disable-line unified-signatures
  /** Closes the server */
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("emit")
  def emit_close(event: smtpDashServerLib.smtpDashServerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: smtpDashServerLib.smtpDashServerLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
  /** Start listening on selected port and interface */
  def listen(): nodeLib.netMod.Server = js.native
  def listen(handle: js.Any): nodeLib.netMod.Server = js.native
  def listen(handle: js.Any, backlog: scala.Double): nodeLib.netMod.Server = js.native
  def listen(handle: js.Any, backlog: scala.Double, listeningListener: js.Function0[scala.Unit]): nodeLib.netMod.Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function0[scala.Unit]): nodeLib.netMod.Server = js.native
  def listen(options: nodeLib.netMod.ListenOptions): nodeLib.netMod.Server = js.native
  def listen(options: nodeLib.netMod.ListenOptions, listeningListener: js.Function0[scala.Unit]): nodeLib.netMod.Server = js.native
  def listen(path: java.lang.String): nodeLib.netMod.Server = js.native
  def listen(path: java.lang.String, backlog: scala.Double): nodeLib.netMod.Server = js.native
  def listen(path: java.lang.String, backlog: scala.Double, listeningListener: js.Function0[scala.Unit]): nodeLib.netMod.Server = js.native
  def listen(path: java.lang.String, listeningListener: js.Function0[scala.Unit]): scala.Unit = js.native
  def listen(port: scala.Double): nodeLib.netMod.Server = js.native
  def listen(port: scala.Double, backlog: scala.Double): nodeLib.netMod.Server = js.native
  def listen(port: scala.Double, backlog: scala.Double, listeningListener: js.Function0[scala.Unit]): nodeLib.netMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String): nodeLib.netMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double): nodeLib.netMod.Server = js.native
  def listen(
    port: scala.Double,
    hostname: java.lang.String,
    backlog: scala.Double,
    listeningListener: js.Function0[scala.Unit]
  ): nodeLib.netMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, listeningListener: js.Function0[scala.Unit]): nodeLib.netMod.Server = js.native
  def listen(port: scala.Double, listeningListener: js.Function0[scala.Unit]): nodeLib.netMod.Server = js.native
  @JSName("listen")
  def listen_Unit(path: java.lang.String): scala.Unit = js.native
  @JSName("listenerCount")
  def listenerCount_close(event: smtpDashServerLib.smtpDashServerLibStrings.close): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_error(event: smtpDashServerLib.smtpDashServerLibStrings.error): scala.Double = js.native
  @JSName("listeners")
  def listeners_close(event: smtpDashServerLib.smtpDashServerLibStrings.close): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_error(event: smtpDashServerLib.smtpDashServerLibStrings.error): js.Array[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.native
  @JSName("off")
  def off_close(event: smtpDashServerLib.smtpDashServerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("off")
  def off_error(
    event: smtpDashServerLib.smtpDashServerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /** Authentication handler. Override this */
  def onAuth(
    auth: SMTPServerAuthentication,
    session: SMTPServerSession,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
      /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Override this */
  def onClose(
    session: SMTPServerSession,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /** Override this */
  def onConnect(
    session: SMTPServerSession,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /** Override this */
  def onData(
    stream: SMTPServerDataStream,
    session: SMTPServerSession,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /** Override this */
  def onMailFrom(
    address: SMTPServerAddress,
    session: SMTPServerSession,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /** Override this */
  def onRcptTo(
    address: SMTPServerAddress,
    session: SMTPServerSession,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_close(event: smtpDashServerLib.smtpDashServerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: smtpDashServerLib.smtpDashServerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: smtpDashServerLib.smtpDashServerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: smtpDashServerLib.smtpDashServerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: smtpDashServerLib.smtpDashServerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: smtpDashServerLib.smtpDashServerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: smtpDashServerLib.smtpDashServerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: smtpDashServerLib.smtpDashServerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_close(event: smtpDashServerLib.smtpDashServerLibStrings.close): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_error(event: smtpDashServerLib.smtpDashServerLibStrings.error): js.Array[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.native
  @JSName("removeAllListener")
  def removeAllListener_close(event: smtpDashServerLib.smtpDashServerLibStrings.close): this.type = js.native
  @JSName("removeAllListener")
  def removeAllListener_error(event: smtpDashServerLib.smtpDashServerLibStrings.error): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: smtpDashServerLib.smtpDashServerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: smtpDashServerLib.smtpDashServerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  def updateSecureContext(options: nodeLib.tlsMod.TlsOptions): scala.Unit = js.native
}

