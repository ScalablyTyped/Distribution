package typings
package simplecrawlerLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends simplecrawlerLib.eventsMod.EventEmitter {
  var connections: scala.Double = js.native
  var listening: scala.Boolean = js.native
  var maxConnections: scala.Double = js.native
  @JSName("addListener")
  def addListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connection(
    event: simplecrawlerLib.simplecrawlerLibStrings.connection,
    listener: js.Function1[/* socket */ Socket, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  def address(): simplecrawlerLib.Anon_Address = js.native
  def close(): Server = js.native
  def close(callback: js.Function): Server = js.native
  @JSName("emit")
  def emit_close(event: simplecrawlerLib.simplecrawlerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_connection(event: simplecrawlerLib.simplecrawlerLibStrings.connection, socket: Socket): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: simplecrawlerLib.simplecrawlerLibStrings.error, err: simplecrawlerLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening): scala.Boolean = js.native
  def getConnections(cb: js.Function2[/* error */ simplecrawlerLib.Error, /* count */ scala.Double, scala.Unit]): scala.Unit = js.native
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, backlog: scala.Double): Server = js.native
  def listen(handle: js.Any, backlog: scala.Double, listeningListener: js.Function): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
  def listen(options: ListenOptions): Server = js.native
  def listen(options: ListenOptions, listeningListener: js.Function): Server = js.native
  def listen(path: java.lang.String): Server = js.native
  def listen(path: java.lang.String, backlog: scala.Double): Server = js.native
  def listen(path: java.lang.String, backlog: scala.Double, listeningListener: js.Function): Server = js.native
  def listen(path: java.lang.String, listeningListener: js.Function): Server = js.native
  def listen(port: scala.Double): Server = js.native
  def listen(port: scala.Double, backlog: scala.Double): Server = js.native
  def listen(port: scala.Double, backlog: scala.Double, listeningListener: js.Function): Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String): Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double): Server = js.native
  def listen(
    port: scala.Double,
    hostname: java.lang.String,
    backlog: scala.Double,
    listeningListener: js.Function
  ): Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, listeningListener: js.Function): Server = js.native
  def listen(port: scala.Double, listeningListener: js.Function): Server = js.native
  @JSName("on")
  def on_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_connection(
    event: simplecrawlerLib.simplecrawlerLibStrings.connection,
    listener: js.Function1[/* socket */ Socket, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_connection(
    event: simplecrawlerLib.simplecrawlerLibStrings.connection,
    listener: js.Function1[/* socket */ Socket, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_connection(
    event: simplecrawlerLib.simplecrawlerLibStrings.connection,
    listener: js.Function1[/* socket */ Socket, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connection(
    event: simplecrawlerLib.simplecrawlerLibStrings.connection,
    listener: js.Function1[/* socket */ Socket, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(event: simplecrawlerLib.simplecrawlerLibStrings.listening, listener: js.Function0[scala.Unit]): this.type = js.native
  def ref(): Server = js.native
  def unref(): Server = js.native
}

