package typings.socketIoEmitter

import typings.socketIoEmitter.mod.SocketIORedisOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Host extends SocketIORedisOptions {
    
    var host: String = js.native
    
    var port: Double = js.native
  }
  object Host {
    
    @scala.inline
    def apply(host: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<'broadcast' | 'json' | 'volatile', boolean | undefined> */
  @js.native
  trait Recordbroadcastjsonvolati extends StObject {
    
    var broadcast: js.UndefOr[Boolean] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var volatile: js.UndefOr[Boolean] = js.native
  }
  object Recordbroadcastjsonvolati {
    
    @scala.inline
    def apply(): Recordbroadcastjsonvolati = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Recordbroadcastjsonvolati]
    }
    
    @scala.inline
    implicit class RecordbroadcastjsonvolatiMutableBuilder[Self <: Recordbroadcastjsonvolati] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcast(value: Boolean): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setVolatile(value: Boolean): Self = StObject.set(x, "volatile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolatileUndefined: Self = StObject.set(x, "volatile", js.undefined)
    }
  }
  
  @js.native
  trait Socket extends SocketIORedisOptions {
    
    var socket: String = js.native
  }
  object Socket {
    
    @scala.inline
    def apply(socket: String): Socket = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Socket]
    }
    
    @scala.inline
    implicit class SocketMutableBuilder[Self <: Socket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
}
