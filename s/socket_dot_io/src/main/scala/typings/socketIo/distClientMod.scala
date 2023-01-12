package typings.socketIo

import typings.node.httpMod.IncomingMessage
import typings.socketIo.distSocketMod.Socket
import typings.socketIo.distTypedEventsMod.EventsMap
import typings.socketIo.mod.Server
import typings.socketIoParser.mod.Packet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientMod {
  
  @JSImport("socket.io/dist/client", "Client")
  @js.native
  open class Client[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] protected () extends StObject {
    /**
      * Client constructor.
      *
      * @param server instance
      * @param conn
      * @package
      */
    def this(server: Server[ListenEvents, EmitEvents, ServerSideEvents, SocketData], conn: Any) = this()
    
    /**
      * Disconnects from all namespaces and closes transport.
      *
      * @private
      */
    def _disconnect(): Unit = js.native
    
    def _packet(packet: js.Array[Any]): Unit = js.native
    def _packet(packet: js.Array[Any], opts: WriteOptions): Unit = js.native
    /**
      * Writes a packet to the transport.
      *
      * @param {Object} packet object
      * @param {Object} opts
      * @private
      */
    def _packet(packet: Packet): Unit = js.native
    def _packet(packet: Packet, opts: WriteOptions): Unit = js.native
    
    /**
      * Removes a socket. Called by each `Socket`.
      *
      * @private
      */
    def _remove(socket: Socket[ListenEvents, EmitEvents, ServerSideEvents, SocketData]): Unit = js.native
    
    /**
      * Closes the underlying connection.
      *
      * @private
      */
    /* private */ var close: Any = js.native
    
    val conn: typings.engineIo.mod.Socket = js.native
    
    /**
      * Connects a client to a namespace.
      *
      * @param {String} name - the namespace
      * @param {Object} auth - the auth parameters
      * @private
      */
    /* private */ var connect: Any = js.native
    
    /* private */ var connectTimeout: Any = js.native
    
    /* private */ val decoder: Any = js.native
    
    /**
      * Cleans up event listeners.
      * @private
      */
    /* private */ var destroy: Any = js.native
    
    /**
      * Connects a client to a namespace.
      *
      * @param name - the namespace
      * @param {Object} auth - the auth parameters
      *
      * @private
      */
    /* private */ var doConnect: Any = js.native
    
    /* private */ val encoder: Any = js.native
    
    /* private */ val id: Any = js.native
    
    /* private */ var nsps: Any = js.native
    
    /**
      * Called upon transport close.
      *
      * @param reason
      * @private
      */
    /* private */ var onclose: Any = js.native
    
    /**
      * Called with incoming transport data.
      *
      * @private
      */
    /* private */ var ondata: Any = js.native
    
    /**
      * Called when parser fully decodes a packet.
      *
      * @private
      */
    /* private */ var ondecoded: Any = js.native
    
    /**
      * Handles an error.
      *
      * @param {Object} err object
      * @private
      */
    /* private */ var onerror: Any = js.native
    
    /**
      * @return the reference to the request that originated the Engine.IO connection
      *
      * @public
      */
    def request: IncomingMessage = js.native
    
    /* private */ val server: Any = js.native
    
    /**
      * Sets up event listeners.
      *
      * @private
      */
    /* private */ var setup: Any = js.native
    
    /* private */ var sockets: Any = js.native
    
    /* private */ var writeToEngine: Any = js.native
  }
  
  trait WriteOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var preEncoded: js.UndefOr[Boolean] = js.undefined
    
    var volatile: js.UndefOr[Boolean] = js.undefined
    
    var wsPreEncoded: js.UndefOr[String] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setPreEncoded(value: Boolean): Self = StObject.set(x, "preEncoded", value.asInstanceOf[js.Any])
      
      inline def setPreEncodedUndefined: Self = StObject.set(x, "preEncoded", js.undefined)
      
      inline def setVolatile(value: Boolean): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
      
      inline def setVolatileUndefined: Self = StObject.set(x, "volatile", js.undefined)
      
      inline def setWsPreEncoded(value: String): Self = StObject.set(x, "wsPreEncoded", value.asInstanceOf[js.Any])
      
      inline def setWsPreEncodedUndefined: Self = StObject.set(x, "wsPreEncoded", js.undefined)
    }
  }
}
