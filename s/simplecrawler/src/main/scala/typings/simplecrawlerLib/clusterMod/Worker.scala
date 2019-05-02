package typings
package simplecrawlerLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "Worker")
@js.native
class Worker ()
  extends simplecrawlerLib.eventsMod.EventEmitter {
  var exitedAfterDisconnect: scala.Boolean = js.native
  var id: scala.Double = js.native
  var process: simplecrawlerLib.childUnderscoreProcessMod.ChildProcess = js.native
  var suicide: scala.Boolean = js.native
  @JSName("addListener")
  def addListener_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function1[/* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_online(event: simplecrawlerLib.simplecrawlerLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  def destroy(): scala.Unit = js.native
  def destroy(signal: java.lang.String): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  @JSName("emit")
  def emit_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function1[/* address */ Address, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_online(event: simplecrawlerLib.simplecrawlerLibStrings.online, listener: js.Function0[scala.Unit]): scala.Boolean = js.native
  def isConnected(): scala.Boolean = js.native
  def isDead(): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def kill(signal: java.lang.String): scala.Unit = js.native
  @JSName("on")
  def on_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function1[/* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("on")
  def on_online(event: simplecrawlerLib.simplecrawlerLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function1[/* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("once")
  def once_online(event: simplecrawlerLib.simplecrawlerLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function1[/* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_online(event: simplecrawlerLib.simplecrawlerLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: simplecrawlerLib.simplecrawlerLibStrings.disconnect, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: simplecrawlerLib.simplecrawlerLibStrings.error,
    listener: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: simplecrawlerLib.simplecrawlerLibStrings.exit,
    listener: js.Function2[/* code */ scala.Double, /* signal */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(
    event: simplecrawlerLib.simplecrawlerLibStrings.listening,
    listener: js.Function1[/* address */ Address, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: simplecrawlerLib.simplecrawlerLibStrings.message,
    listener: js.Function2[
      /* message */ js.Any, 
      /* handle */ simplecrawlerLib.netMod.Socket | simplecrawlerLib.netMod.Server, 
      scala.Unit
    ]
  ): this.type = js.native
    // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: simplecrawlerLib.simplecrawlerLibStrings.online, listener: js.Function0[scala.Unit]): this.type = js.native
  def send(message: js.Any): scala.Boolean = js.native
  def send(message: js.Any, sendHandle: js.Any): scala.Boolean = js.native
  def send(
    message: js.Any,
    sendHandle: js.Any,
    callback: js.Function1[/* error */ simplecrawlerLib.Error, scala.Unit]
  ): scala.Boolean = js.native
}

