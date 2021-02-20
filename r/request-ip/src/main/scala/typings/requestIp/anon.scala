package typings.requestIp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait RemoteAddress extends StObject {
    
    var remoteAddress: js.UndefOr[String] = js.native
  }
  object RemoteAddress {
    
    @scala.inline
    def apply(): RemoteAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteAddress]
    }
    
    @scala.inline
    implicit class RemoteAddressMutableBuilder[Self <: RemoteAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
    }
  }
  
  @js.native
  trait Socket extends StObject {
    
    var remoteAddress: js.UndefOr[String] = js.native
    
    var socket: js.UndefOr[RemoteAddress] = js.native
  }
  object Socket {
    
    @scala.inline
    def apply(): Socket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Socket]
    }
    
    @scala.inline
    implicit class SocketMutableBuilder[Self <: Socket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      @scala.inline
      def setSocket(value: RemoteAddress): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
}
