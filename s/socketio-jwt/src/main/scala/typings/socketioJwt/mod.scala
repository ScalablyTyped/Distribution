package typings.socketioJwt

import typings.socketioJwt.anon.Code
import typings.socketioJwt.anon.Message
import typings.socketioJwt.socketioJwtBooleans.`false`
import typings.socketioJwt.socketioJwtStrings.authenticated
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketio-jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("socketio-jwt", "UnauthorizedError")
  @js.native
  open class UnauthorizedErrorCls protected ()
    extends StObject
       with UnauthorizedError {
    def this(code: String, error: Message) = this()
    
    /* CompleteClass */
    override val data: Code = js.native
    
    /* CompleteClass */
    override val inner: js.Object = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def authorize(options: IOptions): ISocketIOMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(options.asInstanceOf[js.Any]).asInstanceOf[ISocketIOMiddleware]
  
  trait IOptions extends StObject {
    
    var additional_auth: js.UndefOr[
        js.Function3[
          /* decoded */ js.Object, 
          /* onSuccess */ js.Function0[Unit], 
          /* onError */ js.Function2[/* err */ String | ISocketIOError, /* code */ String, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var auth_header_required: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[`false` | Double] = js.undefined
    
    var cookie: js.UndefOr[String] = js.undefined
    
    var customDecoded: js.UndefOr[js.Function1[/* decoded */ js.Object, js.Object]] = js.undefined
    
    var decodedPropertyName: js.UndefOr[String] = js.undefined
    
    var encodedPropertyName: js.UndefOr[String] = js.undefined
    
    var handshake: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var secret: String | (js.Function3[/* request */ Any, /* decodedToken */ js.Object, /* callback */ ISocketCallback, Unit])
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IOptions {
    
    inline def apply(
      secret: String | (js.Function3[/* request */ Any, /* decodedToken */ js.Object, /* callback */ ISocketCallback, Unit])
    ): IOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditional_auth(
        value: (/* decoded */ js.Object, /* onSuccess */ js.Function0[Unit], /* onError */ js.Function2[/* err */ String | ISocketIOError, /* code */ String, Unit]) => Unit
      ): Self = StObject.set(x, "additional_auth", js.Any.fromFunction3(value))
      
      inline def setAdditional_authUndefined: Self = StObject.set(x, "additional_auth", js.undefined)
      
      inline def setAuth_header_required(value: Boolean): Self = StObject.set(x, "auth_header_required", value.asInstanceOf[js.Any])
      
      inline def setAuth_header_requiredUndefined: Self = StObject.set(x, "auth_header_required", js.undefined)
      
      inline def setCallback(value: `false` | Double): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setCustomDecoded(value: /* decoded */ js.Object => js.Object): Self = StObject.set(x, "customDecoded", js.Any.fromFunction1(value))
      
      inline def setCustomDecodedUndefined: Self = StObject.set(x, "customDecoded", js.undefined)
      
      inline def setDecodedPropertyName(value: String): Self = StObject.set(x, "decodedPropertyName", value.asInstanceOf[js.Any])
      
      inline def setDecodedPropertyNameUndefined: Self = StObject.set(x, "decodedPropertyName", js.undefined)
      
      inline def setEncodedPropertyName(value: String): Self = StObject.set(x, "encodedPropertyName", value.asInstanceOf[js.Any])
      
      inline def setEncodedPropertyNameUndefined: Self = StObject.set(x, "encodedPropertyName", js.undefined)
      
      inline def setHandshake(value: Boolean): Self = StObject.set(x, "handshake", value.asInstanceOf[js.Any])
      
      inline def setHandshakeUndefined: Self = StObject.set(x, "handshake", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSecret(
        value: String | (js.Function3[/* request */ Any, /* decodedToken */ js.Object, /* callback */ ISocketCallback, Unit])
      ): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretFunction3(value: (/* request */ Any, /* decodedToken */ js.Object, /* callback */ ISocketCallback) => Unit): Self = StObject.set(x, "secret", js.Any.fromFunction3(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /**
    * Callback gets called, if secret is given dynamically.
    */
  type ISocketCallback = js.Function2[/* err */ ISocketIOError, /* success */ String, Unit]
  
  /**
    * Defines possible errors for the secret-callback.
    */
  trait ISocketIOError extends StObject {
    
    val code: String
    
    val message: String
  }
  object ISocketIOError {
    
    inline def apply(code: String, message: String): ISocketIOError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISocketIOError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISocketIOError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type ISocketIOMiddleware = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any, 
    /* fn */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server * / any */ @js.native
  trait JWTServer extends StObject {
    
    /**
      * The event gets fired when a new connection is authenticated via JWT.
      * @param event The event being fired: 'authenticated'
      * @param listener A listener that should take one parameter of type Socket
      * @return The default '/' Namespace
      */
    def on(
      event: String,
      listener: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any, 
          Unit
        ]
    ): Any = js.native
    @JSName("on")
    def on_authenticated(
      event: authenticated,
      listener: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any, 
          Unit
        ]
    ): Any = js.native
  }
  
  trait UnauthorizedError
    extends StObject
       with Error {
    
    val data: Code
    
    val inner: js.Object
  }
  object UnauthorizedError {
    
    inline def apply(data: Code, inner: js.Object, message: String, name: String): UnauthorizedError = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnauthorizedError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnauthorizedError] (val x: Self) extends AnyVal {
      
      inline def setData(value: Code): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInner(value: js.Object): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    }
  }
}
