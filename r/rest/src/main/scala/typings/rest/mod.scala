package typings.rest

import org.scalablytyped.runtime.StringDictionary
import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rest", JSImport.Namespace)
  @js.native
  def apply(path: String): ResponsePromise = js.native
  @JSImport("rest", JSImport.Namespace)
  @js.native
  def apply(request: Request): ResponsePromise = js.native
  
  @JSImport("rest", "getDefaultClient")
  @js.native
  def getDefaultClient(): Client = js.native
  
  @JSImport("rest", "resetDefaultClient")
  @js.native
  def resetDefaultClient(): Unit = js.native
  
  @JSImport("rest", "setDefaultClient")
  @js.native
  def setDefaultClient(client: Client): Unit = js.native
  
  @JSImport("rest", "wrap")
  @js.native
  def wrap[T](interceptor: Interceptor[T]): Client = js.native
  @JSImport("rest", "wrap")
  @js.native
  def wrap[T](interceptor: Interceptor[T], config: T): Client = js.native
  
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
  
  @js.native
  trait Meta extends StObject {
    
    var arguments: js.Any = js.native
    
    def client(path: String): ResponsePromise = js.native
    def client(request: Request): ResponsePromise = js.native
    @JSName("client")
    var client_Original: Client = js.native
  }
  
  @js.native
  trait Request extends StObject {
    
    var cancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    var canceled: js.UndefOr[Boolean] = js.native
    
    var entity: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var mixin: js.UndefOr[js.Any] = js.native
    
    var originator: js.UndefOr[js.Function1[/* request */ js.UndefOr[this.type], ResponsePromise]] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanceledUndefined: Self = StObject.set(x, "canceled", js.undefined)
      
      @scala.inline
      def setEntity(value: js.Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMixin(value: js.Any): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
      
      @scala.inline
      def setOriginator(value: /* request */ js.UndefOr[Request] => ResponsePromise): Self = StObject.set(x, "originator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOriginatorUndefined: Self = StObject.set(x, "originator", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var entity: js.Any = js.native
    
    var headers: Headers = js.native
    
    var raw: js.Any = js.native
    
    var request: Request = js.native
    
    var status: Status = js.native
  }
  object Response {
    
    @scala.inline
    def apply(entity: js.Any, headers: Headers, raw: js.Any, request: Request, status: Status): Response = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntity(value: js.Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponsePromise extends Promise[Response] {
    
    def entity(): Promise[_] = js.native
    
    def header(headerName: String): Promise[_] = js.native
    
    def headers(): Promise[Headers] = js.native
    
    def status(): Promise[Double] = js.native
  }
  
  @js.native
  trait Status extends StObject {
    
    var code: Double = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object Status {
    
    @scala.inline
    def apply(code: Double): Status = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
