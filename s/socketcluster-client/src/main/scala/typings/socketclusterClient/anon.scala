package typings.socketclusterClient

import typings.socketclusterClient.authMod.AuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AckTimeout extends StObject {
    
    var ackTimeout: js.UndefOr[Double] = js.undefined
  }
  object AckTimeout {
    
    inline def apply(): AckTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AckTimeout]
    }
    
    extension [Self <: AckTimeout](x: Self) {
      
      inline def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
      
      inline def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
    }
  }
  
  trait Channel extends StObject {
    
    var channel: String
    
    var data: js.Any
  }
  object Channel {
    
    inline def apply(channel: String, data: js.Any): Channel = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: typings.std.Error
  }
  object Error {
    
    inline def apply(error: typings.std.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait OldAuthToken extends StObject {
    
    var oldAuthToken: AuthToken
  }
  object OldAuthToken {
    
    inline def apply(oldAuthToken: AuthToken): OldAuthToken = {
      val __obj = js.Dynamic.literal(oldAuthToken = oldAuthToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[OldAuthToken]
    }
    
    extension [Self <: OldAuthToken](x: Self) {
      
      inline def setOldAuthToken(value: AuthToken): Self = StObject.set(x, "oldAuthToken", value.asInstanceOf[js.Any])
    }
  }
}
