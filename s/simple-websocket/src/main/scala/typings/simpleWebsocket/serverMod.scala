package typings.simpleWebsocket

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.netMod.Socket
import typings.simpleWebsocket.simpleWebsocketStrings.connection
import typings.simpleWebsocket.simpleWebsocketStrings.error
import typings.simpleWebsocket.simpleWebsocketStrings.headers
import typings.simpleWebsocket.simpleWebsocketStrings.listening
import typings.std.Set
import typings.ws.mod.ServerOptions
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("simple-websocket/server", JSImport.Namespace)
  @js.native
  open class ^ () extends SocketServer {
    def this(options: Options) = this()
    def this(options: Unit, callback: js.Function0[Unit]) = this()
    def this(options: Options, callback: js.Function0[Unit]) = this()
  }
  
  type Options = ServerOptions
  
  @js.native
  trait SocketServer extends EventEmitter {
    
    // Events
    @JSName("addListener")
    def addListener_connection(event: connection, cb: js.Function1[/* client */ typings.simpleWebsocket.mod.^, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
    
    var clients: Set[WebSocket] = js.native
    
    def close(): Unit = js.native
    def close(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    @JSName("emit")
    def emit_connection(event: connection, socket: typings.simpleWebsocket.mod.^): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, error: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_headers(event: headers, headers: js.Array[String], request: IncomingMessage): Boolean = js.native
    @JSName("emit")
    def emit_listening(event: listening): Boolean = js.native
    
    def handleUpgrade(
      request: IncomingMessage,
      socket: Socket,
      upgradeHead: Buffer,
      callback: js.Function1[/* client */ WebSocket, Unit]
    ): Unit = js.native
    
    @JSName("listeners")
    def listeners_connection(event: connection): js.Array[
        js.Function2[/* socket */ typings.simpleWebsocket.mod.^, /* request */ IncomingMessage, Unit]
      ] = js.native
    @JSName("listeners")
    def listeners_error(event: error): js.Array[js.Function1[/* error */ js.Error, Unit]] = js.native
    @JSName("listeners")
    def listeners_headers(event: headers): js.Array[
        js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
      ] = js.native
    @JSName("listeners")
    def listeners_listening(event: listening): js.Array[js.Function0[Unit]] = js.native
    
    @JSName("off")
    def off_connection(
      event: connection,
      cb: js.Function2[/* socket */ typings.simpleWebsocket.mod.^, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("off")
    def off_error(event: error, cb: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("off")
    def off_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("off")
    def off_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
    
    @JSName("on")
    def on_connection(
      event: connection,
      cb: js.Function2[/* socket */ typings.simpleWebsocket.mod.^, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_connection(
      event: connection,
      cb: js.Function2[/* socket */ typings.simpleWebsocket.mod.^, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
    
    var options: Options = js.native
    
    var path: String = js.native
    
    @JSName("prependListener")
    def prependListener_connection(event: connection, cb: js.Function1[/* client */ typings.simpleWebsocket.mod.^, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_connection(event: connection, cb: js.Function1[/* client */ typings.simpleWebsocket.mod.^, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
    
    @JSName("rawListeners")
    def rawListeners_connection(event: connection): js.Array[
        js.Function2[/* socket */ typings.simpleWebsocket.mod.^, /* request */ IncomingMessage, Unit]
      ] = js.native
    @JSName("rawListeners")
    def rawListeners_error(event: error): js.Array[js.Function1[/* error */ js.Error, Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_headers(event: headers): js.Array[
        js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
      ] = js.native
    @JSName("rawListeners")
    def rawListeners_listening(event: listening): js.Array[js.Function0[Unit]] = js.native
    
    @JSName("removeListener")
    def removeListener_connection(event: connection, cb: js.Function1[/* client */ typings.simpleWebsocket.mod.^, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
    
    def shouldHandle(request: IncomingMessage): Boolean = js.native
  }
}
