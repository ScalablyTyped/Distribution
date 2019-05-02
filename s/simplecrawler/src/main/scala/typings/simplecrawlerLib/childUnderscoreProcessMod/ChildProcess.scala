package typings
package simplecrawlerLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcess
  extends simplecrawlerLib.eventsMod.EventEmitter {
  var connected: scala.Boolean = js.native
  var killed: scala.Boolean = js.native
  var pid: scala.Double = js.native
  var stderr: simplecrawlerLib.streamMod.Readable = js.native
  var stdin: simplecrawlerLib.streamMod.Writable = js.native
  var stdio: StdioStreams = js.native
  var stdout: simplecrawlerLib.streamMod.Readable = js.native
  @JSName("addListener")
  def addListener_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  def disconnect(): scala.Unit = js.native
  @JSName("emit")
  def emit_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    code: scala.Double,
    signal: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: simplecrawlerLib.simplecrawlerLibStrings.error, err: simplecrawlerLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: simplecrawlerLib.simplecrawlerLibStrings.exit, code: scala.Double, signal: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    message: js.Any,
    sendHandle: simplecrawlerLib.netMod.Server
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    message: js.Any,
    sendHandle: simplecrawlerLib.netMod.Socket
  ): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def kill(signal: java.lang.String): scala.Unit = js.native
  @JSName("on")
  def on_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(
    event: simplecrawlerLib.simplecrawlerLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* err */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* sendHandle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
  def ref(): scala.Unit = js.native
  def send(message: js.Any): scala.Boolean = js.native
  def send(message: js.Any, sendHandle: js.Any): scala.Boolean = js.native
  def unref(): scala.Unit = js.native
}

