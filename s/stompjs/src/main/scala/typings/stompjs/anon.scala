package typings.stompjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var login: String = js.native
    
    var passcode: String = js.native
  }
  object Host {
    
    @scala.inline
    def apply(login: String, passcode: String): Host = {
      val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], passcode = passcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasscode(value: String): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Incoming extends StObject {
    
    var incoming: Double = js.native
    
    var outgoing: Double = js.native
  }
  object Incoming {
    
    @scala.inline
    def apply(incoming: Double, outgoing: Double): Incoming = {
      val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Incoming]
    }
    
    @scala.inline
    implicit class IncomingMutableBuilder[Self <: Incoming] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncoming(value: Double): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing(value: Double): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
    }
  }
}
