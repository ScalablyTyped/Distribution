package typings.rest

import org.scalablytyped.runtime.StringDictionary
import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): ResponsePromise = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
  inline def apply(request: Request): ResponsePromise = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
  
  @JSImport("rest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultClient(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultClient")().asInstanceOf[Client]
  
  inline def resetDefaultClient(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDefaultClient")().asInstanceOf[Unit]
  
  inline def setDefaultClient(client: Client): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultClient")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wrap[T](interceptor: Interceptor[T]): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(interceptor.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def wrap[T](interceptor: Interceptor[T], config: T): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(interceptor.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  @js.native
  trait Client extends StObject {
    
    def apply(path: String): ResponsePromise = js.native
    def apply(request: Request): ResponsePromise = js.native
    
    def skip(): Client = js.native
    
    def wrap[T](interceptor: Interceptor[T]): Client = js.native
    def wrap[T](interceptor: Interceptor[T], config: T): Client = js.native
  }
  
  type Headers = StringDictionary[js.Any]
  
  type Interceptor[T] = js.Function2[/* parent */ js.UndefOr[Client], /* config */ js.UndefOr[T], Client]
  
  trait Meta extends StObject {
    
    var arguments: js.Any
    
    def client(path: String): ResponsePromise
    def client(request: Request): ResponsePromise
    @JSName("client")
    var client_Original: Client
  }
  object Meta {
    
    inline def apply(arguments: js.Any, client: Client): Meta = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
      inline def setArguments(value: js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var canceled: js.UndefOr[Boolean] = js.undefined
    
    var entity: js.UndefOr[js.Any] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mixin: js.UndefOr[js.Any] = js.undefined
    
    var originator: js.UndefOr[js.Function1[/* request */ js.UndefOr[this.type], ResponsePromise]] = js.undefined
    
    var params: js.UndefOr[js.Any] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
      
      inline def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
      
      inline def setEntity(value: js.Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMixin(value: js.Any): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
      
      inline def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
      
      inline def setOriginator(value: /* request */ js.UndefOr[Request] => ResponsePromise): Self = StObject.set(x, "originator", js.Any.fromFunction1(value))
      
      inline def setOriginatorUndefined: Self = StObject.set(x, "originator", js.undefined)
      
      inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Response extends StObject {
    
    var entity: js.Any
    
    var headers: Headers
    
    var raw: js.Any
    
    var request: Request
    
    var status: Status
  }
  object Response {
    
    inline def apply(entity: js.Any, headers: Headers, raw: js.Any, request: Request, status: Status): Response = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setEntity(value: js.Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponsePromise
    extends StObject
       with Promise[Response] {
    
    def entity(): Promise[js.Any] = js.native
    
    def header(headerName: String): Promise[js.Any] = js.native
    
    def headers(): Promise[Headers] = js.native
    
    def status(): Promise[Double] = js.native
  }
  
  trait Status extends StObject {
    
    var code: Double
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Status {
    
    inline def apply(code: Double): Status = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    extension [Self <: Status](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
