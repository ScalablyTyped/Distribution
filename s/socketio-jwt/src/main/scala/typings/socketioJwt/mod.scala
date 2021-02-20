package typings.socketioJwt

import typings.socketIo.mod.Socket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketio-jwt", "UnauthorizedError")
  @js.native
  class UnauthorizedError protected () extends Error {
    def this(code: String, error: Error) = this()
    
    var data: JwtData = js.native
    
    var inner: Error = js.native
  }
  
  @JSImport("socketio-jwt", "authorize")
  @js.native
  def authorize(options: JwtAuthOptions): js.Function1[/* socket */ Socket, Unit] = js.native
  @JSImport("socketio-jwt", "authorize")
  @js.native
  def authorize(options: JwtAuthOptions, callback: JwtAuthorizeCallback): js.Function1[/* socket */ Socket, Unit] = js.native
  
  @js.native
  trait JwtAuthOptions extends StObject {
    
    // In milliseconds to handle the second round trip.
    var callback: js.UndefOr[Boolean] = js.native
    
    // To disconnect socket server-side without a client-side callback if no valid token.
    var decodedPropertyName: js.UndefOr[String] = js.native
    
    // Property to store the decoded token to.
    var handshake: js.UndefOr[Boolean] = js.native
    
    var secret: String | JwtSecretFunc = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object JwtAuthOptions {
    
    @scala.inline
    def apply(secret: String | JwtSecretFunc): JwtAuthOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtAuthOptions]
    }
    
    @scala.inline
    implicit class JwtAuthOptionsMutableBuilder[Self <: JwtAuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: Boolean): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDecodedPropertyName(value: String): Self = StObject.set(x, "decodedPropertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodedPropertyNameUndefined: Self = StObject.set(x, "decodedPropertyName", js.undefined)
      
      @scala.inline
      def setHandshake(value: Boolean): Self = StObject.set(x, "handshake", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandshakeUndefined: Self = StObject.set(x, "handshake", js.undefined)
      
      @scala.inline
      def setSecret(value: String | JwtSecretFunc): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretFunction3(value: (/* request */ js.Any, /* payload */ js.Any, /* callback */ JwtSecretFuncCallback) => Unit): Self = StObject.set(x, "secret", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type JwtAuthorizeCallback = js.Function0[Unit]
  
  @js.native
  trait JwtData extends StObject {
    
    var code: String = js.native
    
    var message: String = js.native
    
    var `type`: String = js.native
  }
  object JwtData {
    
    @scala.inline
    def apply(code: String, message: String, `type`: String): JwtData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtData]
    }
    
    @scala.inline
    implicit class JwtDataMutableBuilder[Self <: JwtData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type JwtSecretFunc = js.Function3[/* request */ js.Any, /* payload */ js.Any, /* callback */ JwtSecretFuncCallback, Unit]
  
  type JwtSecretFuncCallback = js.Function2[/* err */ Error | Null, /* secret */ String, Unit]
}
