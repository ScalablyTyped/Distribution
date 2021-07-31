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
    
    @scala.inline
    def apply(): AckTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AckTimeout]
    }
    
    @scala.inline
    implicit class AckTimeoutMutableBuilder[Self <: AckTimeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
    }
  }
  
  trait Channel extends StObject {
    
    var channel: String
    
    var data: js.Any
  }
  object Channel {
    
    @scala.inline
    def apply(channel: String, data: js.Any): Channel = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: typings.std.Error
  }
  object Error {
    
    @scala.inline
    def apply(error: typings.std.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait OldAuthToken extends StObject {
    
    var oldAuthToken: AuthToken
  }
  object OldAuthToken {
    
    @scala.inline
    def apply(oldAuthToken: AuthToken): OldAuthToken = {
      val __obj = js.Dynamic.literal(oldAuthToken = oldAuthToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[OldAuthToken]
    }
    
    @scala.inline
    implicit class OldAuthTokenMutableBuilder[Self <: OldAuthToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOldAuthToken(value: AuthToken): Self = StObject.set(x, "oldAuthToken", value.asInstanceOf[js.Any])
    }
  }
}
