package typings
package simpleDashWebsocketLib.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketServer
  extends nodeLib.eventsMod.EventEmitter {
  var clients: stdLib.Set[wsLib.wsMod.^] = js.native
  var options: Options = js.native
  var path: java.lang.String = js.native
  // Events
  @JSName("addListener")
  def addListener_connection(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection,
    cb: js.Function1[/* client */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers,
    cb: js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  def close(): scala.Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  @JSName("emit")
  def emit_connection(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection,
    socket: simpleDashWebsocketLib.simpleDashWebsocketMod.^
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error, error: stdLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_headers(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers,
    headers: js.Array[java.lang.String],
    request: nodeLib.httpMod.IncomingMessage
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening): scala.Boolean = js.native
  def handleUpgrade(
    request: nodeLib.httpMod.IncomingMessage,
    socket: nodeLib.netMod.Socket,
    upgradeHead: nodeLib.Buffer,
    callback: js.Function1[/* client */ wsLib.wsMod.^, scala.Unit]
  ): scala.Unit = js.native
  @JSName("listeners")
  def listeners_connection(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection): js.Array[
    js.Function2[
      /* socket */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ] = js.native
  @JSName("listeners")
  def listeners_error(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error): js.Array[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_headers(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers): js.Array[
    js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ] = js.native
  @JSName("listeners")
  def listeners_listening(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("off")
  def off_connection(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection,
    cb: js.Function2[
      /* socket */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_error(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error,
    cb: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_headers(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers,
    cb: js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_listening(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connection(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection,
    cb: js.Function2[
      /* socket */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error,
    cb: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_headers(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers,
    cb: js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_listening(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connection(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection,
    cb: js.Function2[
      /* socket */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error,
    cb: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_headers(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers,
    cb: js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_listening(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_connection(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection,
    cb: js.Function1[/* client */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_headers(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers,
    cb: js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_listening(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connection(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection,
    cb: js.Function1[/* client */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_headers(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers,
    cb: js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_connection(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection): js.Array[
    js.Function2[
      /* socket */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ] = js.native
  @JSName("rawListeners")
  def rawListeners_error(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error): js.Array[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_headers(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers): js.Array[
    js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ] = js.native
  @JSName("rawListeners")
  def rawListeners_listening(event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("removeListener")
  def removeListener_connection(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.connection,
    cb: js.Function1[/* client */ simpleDashWebsocketLib.simpleDashWebsocketMod.^, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_headers(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.headers,
    cb: js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_listening(
    event: simpleDashWebsocketLib.simpleDashWebsocketLibStrings.listening,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  def shouldHandle(request: nodeLib.httpMod.IncomingMessage): scala.Boolean = js.native
}

