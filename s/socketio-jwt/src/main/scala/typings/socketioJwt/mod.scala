package typings.socketioJwt

import typings.socketIo.mod.Socket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketio-jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socketio-jwt", "UnauthorizedError")
  @js.native
  class UnauthorizedError protected ()
    extends StObject
       with Error {
    def this(code: String, error: Error) = this()
    
    var data: JwtData = js.native
    
    var inner: Error = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def authorize(options: JwtAuthOptions): js.Function1[/* socket */ Socket, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* socket */ Socket, Unit]]
  inline def authorize(options: JwtAuthOptions, callback: JwtAuthorizeCallback): js.Function1[/* socket */ Socket, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* socket */ Socket, Unit]]
  
  trait JwtAuthOptions extends StObject {
    
    // In milliseconds to handle the second round trip.
    var callback: js.UndefOr[Boolean] = js.undefined
    
    // To disconnect socket server-side without a client-side callback if no valid token.
    var decodedPropertyName: js.UndefOr[String] = js.undefined
    
    // Property to store the decoded token to.
    var handshake: js.UndefOr[Boolean] = js.undefined
    
    var secret: String | JwtSecretFunc
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object JwtAuthOptions {
    
    inline def apply(secret: String | JwtSecretFunc): JwtAuthOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtAuthOptions]
    }
    
    extension [Self <: JwtAuthOptions](x: Self) {
      
      inline def setCallback(value: Boolean): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDecodedPropertyName(value: String): Self = StObject.set(x, "decodedPropertyName", value.asInstanceOf[js.Any])
      
      inline def setDecodedPropertyNameUndefined: Self = StObject.set(x, "decodedPropertyName", js.undefined)
      
      inline def setHandshake(value: Boolean): Self = StObject.set(x, "handshake", value.asInstanceOf[js.Any])
      
      inline def setHandshakeUndefined: Self = StObject.set(x, "handshake", js.undefined)
      
      inline def setSecret(value: String | JwtSecretFunc): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretFunction3(value: (/* request */ js.Any, /* payload */ js.Any, /* callback */ JwtSecretFuncCallback) => Unit): Self = StObject.set(x, "secret", js.Any.fromFunction3(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type JwtAuthorizeCallback = js.Function0[Unit]
  
  trait JwtData extends StObject {
    
    var code: String
    
    var message: String
    
    var `type`: String
  }
  object JwtData {
    
    inline def apply(code: String, message: String, `type`: String): JwtData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwtData]
    }
    
    extension [Self <: JwtData](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type JwtSecretFunc = js.Function3[/* request */ js.Any, /* payload */ js.Any, /* callback */ JwtSecretFuncCallback, Unit]
  
  type JwtSecretFuncCallback = js.Function2[/* err */ Error | Null, /* secret */ String, Unit]
}
