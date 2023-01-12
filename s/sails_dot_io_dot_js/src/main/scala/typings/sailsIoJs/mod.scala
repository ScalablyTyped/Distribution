package typings.sailsIoJs

import org.scalablytyped.runtime.StringDictionary
import typings.sailsIoJs.anon.Body
import typings.sailsIoJs.sailsIoJsStrings.browser
import typings.sailsIoJs.sailsIoJsStrings.connect
import typings.sailsIoJs.sailsIoJsStrings.disconnect
import typings.sailsIoJs.sailsIoJsStrings.error
import typings.sailsIoJs.sailsIoJsStrings.node
import typings.sailsIoJs.sailsIoJsStrings.polling
import typings.sailsIoJs.sailsIoJsStrings.production
import typings.sailsIoJs.sailsIoJsStrings.reconnect
import typings.sailsIoJs.sailsIoJsStrings.reconnecting
import typings.sailsIoJs.sailsIoJsStrings.websocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClientStatic */ Any
  ): Client = ^.asInstanceOf[js.Dynamic].apply(client.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  @JSImport("sails.io.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Client extends StObject {
    
    var sails: ClientSails
    
    var socket: Socket
  }
  object Client {
    
    inline def apply(sails: ClientSails, socket: Socket): Client = {
      val __obj = js.Dynamic.literal(sails = sails.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      inline def setSails(value: ClientSails): Self = StObject.set(x, "sails", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientSails extends StObject {
    
    var autoConnect: js.UndefOr[Boolean] = js.native
    
    def connect(): Socket = js.native
    def connect(url: String): Socket = js.native
    def connect(url: String, config: ConnectConfig): Socket = js.native
    def connect(url: Unit, config: ConnectConfig): Socket = js.native
    
    // All logs are disabled when `io.sails.environment = 'production'`
    var environment: js.UndefOr[production | String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var initialConnectionHeaders: js.UndefOr[InitialConnectionHeaders] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var query: js.UndefOr[String] = js.native
    
    var reconnection: js.UndefOr[Boolean] = js.native
    
    var reconnectionAttempts: js.UndefOr[Double] = js.native
    
    var reconnectionDelay: js.UndefOr[Double] = js.native
    
    var reconnectionDelayMax: js.UndefOr[Double] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var sdk: js.UndefOr[SDKInfo] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
    
    var transports: js.UndefOr[js.Array[websocket | polling]] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var useCORSRouteToGetCookie: js.UndefOr[Boolean] = js.native
  }
  
  trait ConnectConfig extends StObject {
    
    var initialConnectionHeaders: js.UndefOr[InitialConnectionHeaders] = js.undefined
  }
  object ConnectConfig {
    
    inline def apply(): ConnectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectConfig] (val x: Self) extends AnyVal {
      
      inline def setInitialConnectionHeaders(value: InitialConnectionHeaders): Self = StObject.set(x, "initialConnectionHeaders", value.asInstanceOf[js.Any])
      
      inline def setInitialConnectionHeadersUndefined: Self = StObject.set(x, "initialConnectionHeaders", js.undefined)
    }
  }
  
  type Data = js.Object | String
  
  type Headers = StringDictionary[String]
  
  trait InitialConnectionHeaders
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var nosession: js.UndefOr[Boolean] = js.undefined
  }
  object InitialConnectionHeaders {
    
    inline def apply(): InitialConnectionHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialConnectionHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitialConnectionHeaders] (val x: Self) extends AnyVal {
      
      inline def setNosession(value: Boolean): Self = StObject.set(x, "nosession", value.asInstanceOf[js.Any])
      
      inline def setNosessionUndefined: Self = StObject.set(x, "nosession", js.undefined)
    }
  }
  
  trait JWR extends StObject {
    
    var body: Any
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var headers: Headers
    
    def pipe(): js.Error
    
    var statusCode: Double
    
    def toPOJO(): Body
  }
  object JWR {
    
    inline def apply(body: Any, headers: Headers, pipe: () => js.Error, statusCode: Double, toPOJO: () => Body): JWR = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], pipe = js.Any.fromFunction0(pipe), statusCode = statusCode.asInstanceOf[js.Any], toPOJO = js.Any.fromFunction0(toPOJO))
      __obj.asInstanceOf[JWR]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JWR] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPipe(value: () => js.Error): Self = StObject.set(x, "pipe", js.Any.fromFunction0(value))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setToPOJO(value: () => Body): Self = StObject.set(x, "toPOJO", js.Any.fromFunction0(value))
    }
  }
  
  type RequestCallback = js.Function2[/* body */ Any, /* jwr */ JWR, Any]
  
  trait RequestOptions extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var url: String
  }
  object RequestOptions {
    
    inline def apply(url: String): RequestOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SDKInfo extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[browser | node] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var versionString: js.UndefOr[String] = js.undefined
  }
  object SDKInfo {
    
    inline def apply(): SDKInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SDKInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SDKInfo] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPlatform(value: browser | node): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionString(value: String): Self = StObject.set(x, "versionString", value.asInstanceOf[js.Any])
      
      inline def setVersionStringUndefined: Self = StObject.set(x, "versionString", js.undefined)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Socket extends StObject {
    
    def delete(url: String): Unit = js.native
    def delete(url: String, cb: RequestCallback): Unit = js.native
    def delete(url: String, data: Data): Unit = js.native
    def delete(url: String, data: Data, cb: RequestCallback): Unit = js.native
    
    def get(url: String): Unit = js.native
    def get(url: String, cb: RequestCallback): Unit = js.native
    def get(url: String, data: Data): Unit = js.native
    def get(url: String, data: Data, cb: RequestCallback): Unit = js.native
    
    def isConnected(): Boolean = js.native
    
    def isConnecting(): Boolean = js.native
    
    def mightBeAboutToAutoConnect(): Boolean = js.native
    
    def off(event: String, cb: js.Function1[/* repeated */ Any, Any]): Socket = js.native
    
    def on(event: String, cb: js.Function1[/* repeated */ Any, Any]): Socket = js.native
    @JSName("on")
    def on_connect(event: connect, cb: js.Function0[Any]): Socket = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, cb: js.Function0[Any]): Socket = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* err */ Any, Any]): Socket = js.native
    @JSName("on")
    def on_reconnect(event: reconnect, cb: js.Function2[/* transport */ String, /* numAttempts */ Double, Any]): Socket = js.native
    @JSName("on")
    def on_reconnecting(event: reconnecting, cb: js.Function1[/* numAttempts */ Double, Any]): Socket = js.native
    
    def post(url: String): Unit = js.native
    def post(url: String, cb: RequestCallback): Unit = js.native
    def post(url: String, data: Data): Unit = js.native
    def post(url: String, data: Data, cb: RequestCallback): Unit = js.native
    
    def put(url: String): Unit = js.native
    def put(url: String, cb: RequestCallback): Unit = js.native
    def put(url: String, data: Data): Unit = js.native
    def put(url: String, data: Data, cb: RequestCallback): Unit = js.native
    
    def reconnect(): Socket = js.native
    
    def removeAllListeners(): Socket = js.native
    
    def replay(): Socket = js.native
    
    def request(options: RequestOptions): Unit = js.native
    def request(options: RequestOptions, cb: RequestCallback): Unit = js.native
  }
}
