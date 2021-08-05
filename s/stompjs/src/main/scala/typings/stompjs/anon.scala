package typings.stompjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var login: String
    
    var passcode: String
  }
  object Host {
    
    inline def apply(login: String, passcode: String): Host = {
      val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], passcode = passcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setPasscode(value: String): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Incoming extends StObject {
    
    var incoming: Double
    
    var outgoing: Double
  }
  object Incoming {
    
    inline def apply(incoming: Double, outgoing: Double): Incoming = {
      val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Incoming]
    }
    
    extension [Self <: Incoming](x: Self) {
      
      inline def setIncoming(value: Double): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
      
      inline def setOutgoing(value: Double): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
    }
  }
}
