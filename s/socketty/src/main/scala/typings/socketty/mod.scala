package typings.socketty

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("socketty", JSImport.Namespace)
  @js.native
  val ^ : Socketty = js.native
  
  trait Socketty extends StObject {
    
    /**
      * Connect to a socketty server.
      * @param url The server url
      * @param callback The callback to be run when the connection is open
      * @return A Socket
      */
    def connect(url: String, callback: js.Function1[/* socket */ SockettySocket, Unit]): SockettySocket
    
    /**
      * Create a socketty server.
      * @param httpServer The HTTP server to use
      * @return A socketty server
      */
    def createServer(httpServer: js.Any): SockettyServer
  }
  object Socketty {
    
    inline def apply(
      connect: (String, js.Function1[/* socket */ SockettySocket, Unit]) => SockettySocket,
      createServer: js.Any => SockettyServer
    ): Socketty = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), createServer = js.Any.fromFunction1(createServer))
      __obj.asInstanceOf[Socketty]
    }
    
    extension [Self <: Socketty](x: Self) {
      
      inline def setConnect(value: (String, js.Function1[/* socket */ SockettySocket, Unit]) => SockettySocket): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      inline def setCreateServer(value: js.Any => SockettyServer): Self = StObject.set(x, "createServer", js.Any.fromFunction1(value))
    }
  }
  
  trait SockettyServer extends StObject {
    
    /**
      * Specify a callback to be run when a new socket connects to the server.
      * @param callback The callback
      */
    def connection(callback: js.Function1[/* socket */ SockettySocket, Unit]): Unit
  }
  object SockettyServer {
    
    inline def apply(connection: js.Function1[/* socket */ SockettySocket, Unit] => Unit): SockettyServer = {
      val __obj = js.Dynamic.literal(connection = js.Any.fromFunction1(connection))
      __obj.asInstanceOf[SockettyServer]
    }
    
    extension [Self <: SockettyServer](x: Self) {
      
      inline def setConnection(value: js.Function1[/* socket */ SockettySocket, Unit] => Unit): Self = StObject.set(x, "connection", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SockettySocket extends StObject {
    
    /**
      * Specify a callback to be run when the socket is disconnected.
      * @param callback The disconnect callback
      */
    def disconnect(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Listen for an action.
      * @param action The action to listen to
      * @param callback A callback to be run when the action is fired
      */
    def on(action: String, callback: js.Function1[/* message */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    /**
      * Send an action, as well as an optional message.
      * @param action The action to send
      * @param message The message to send
      */
    def send(action: String): Unit = js.native
    def send(action: String, message: js.Any): Unit = js.native
  }
  
  type _To = Socketty
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Socketty = ^
}
