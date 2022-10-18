package typings.restfulJs

import org.scalablytyped.runtime.StringDictionary
import typings.restfulJs.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restful.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(endpoint: String): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Api]
  
  @js.native
  trait Api
    extends StObject
       with Endpoint[Api] {
    
    def all(name: String): CollectionEndpoint = js.native
    
    def allUrl(name: String, url: String): CollectionEndpoint = js.native
    
    def baseUrl(): String = js.native
    def baseUrl(protocol: String): Api = js.native
    
    def customUrl(): String = js.native
    def customUrl(url: String): Api = js.native
    
    def one(name: String, id: Any): MemberEndpoint = js.native
    
    def oneUrl(name: String, url: String): MemberEndpoint = js.native
    
    def port(): Double = js.native
    def port(port: Double): Api = js.native
    
    def prefixUrl(): String = js.native
    def prefixUrl(prefix: String): Api = js.native
    
    def protocol(): String = js.native
    def protocol(protocol: String): Api = js.native
  }
  
  @js.native
  trait CollectionEndpoint
    extends StObject
       with Endpoint[CollectionEndpoint] {
    
    /**
      * Delete a member in a collection. Returns a promise with the response.
      * @param id
      * @param data
      * @param headers
      */
    def delete[T](id: Any): js.Promise[MemberResponse[T]] = js.native
    def delete[T](id: Any, data: Any): js.Promise[MemberResponse[T]] = js.native
    def delete[T](id: Any, data: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    def delete[T](id: Any, data: Unit, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Get a member in a collection. Returns a promise with an entity.
      * @param id
      */
    def get[T](id: Any): js.Promise[MemberResponse[T]] = js.native
    def get[T](id: Any, params: Any): js.Promise[MemberResponse[T]] = js.native
    def get[T](id: Any, params: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    def get[T](id: Any, params: Unit, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Get a full collection. Returns a promise with an array of entities.
      */
    def getAll[T](): js.Promise[CollectionResponse[T]] = js.native
    def getAll[T](params: Any): js.Promise[CollectionResponse[T]] = js.native
    def getAll[T](params: Any, headers: Headers): js.Promise[CollectionResponse[T]] = js.native
    def getAll[T](params: Unit, headers: Headers): js.Promise[CollectionResponse[T]] = js.native
    
    /**
      * Perform a HEAD request on a member in a collection. Returns a promise with the response.
      * @param id
      * @param headers
      */
    def head[T](id: Any): js.Promise[MemberResponse[T]] = js.native
    def head[T](id: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Patch a member in a collection. Returns a promise with the response.
      * @param id
      * @param data
      * @param headers
      */
    def patch[T](id: Any, data: Any): js.Promise[MemberResponse[T]] = js.native
    def patch[T](id: Any, data: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Create a member in a collection. Returns a promise with the response.
      */
    def post[T](data: Any): js.Promise[MemberResponse[T]] = js.native
    def post[T](data: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Update a member in a collection. Returns a promise with the response.
      * @param id
      * @param data
      * @param headers
      */
    def put[T](id: Any, data: Any): js.Promise[MemberResponse[T]] = js.native
    def put[T](id: Any, data: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  }
  
  @js.native
  trait CollectionResponse[T]
    extends StObject
       with ResponseBase {
    
    def apply(): Data[T] = js.native
    
    def body(): js.Array[ResponseBody[T]] = js.native
  }
  
  trait Endpoint[Self] extends StObject {
    
    /**
      * Add a full request interceptor. You can alter params, headers, data, method and url.
      */
    def addFullRequestInterceptor(interceptor: FullRequestInterceptor): Self
    
    /**
      * Add a full response interceptor. You can alter data and headers.
      */
    def addFullResponseInterceptor(interceptor: ResponseInterceptor): Self
    
    /**
      * Add a request interceptor.
      */
    def addRequestInterceptor(interceptor: RequestInterceptor): Self
    
    /**
      * Add a response interceptor. You can only alter data and headers.
      */
    def addResponseInterceptor(interceptor: ResponseInterceptor): Self
    
    def fullRequestInterceptors(): js.Array[FullRequestInterceptor]
    
    def fullResponseInterceptors(): js.Array[ResponseInterceptor]
    
    /**
      * Add a header.
      * @param name
      * @param value
      */
    def header(name: String, value: Any): Self
    
    def headers(): Headers
    
    def requestInterceptors(): js.Array[RequestInterceptor]
    
    def responseInterceptors(): js.Array[ResponseInterceptor]
    
    /**
      * Get the url.
      */
    def url(): String
  }
  object Endpoint {
    
    inline def apply[Self](
      addFullRequestInterceptor: FullRequestInterceptor => Self,
      addFullResponseInterceptor: ResponseInterceptor => Self,
      addRequestInterceptor: RequestInterceptor => Self,
      addResponseInterceptor: ResponseInterceptor => Self,
      fullRequestInterceptors: () => js.Array[FullRequestInterceptor],
      fullResponseInterceptors: () => js.Array[ResponseInterceptor],
      header: (String, Any) => Self,
      headers: () => Headers,
      requestInterceptors: () => js.Array[RequestInterceptor],
      responseInterceptors: () => js.Array[ResponseInterceptor],
      url: () => String
    ): Endpoint[Self] = {
      val __obj = js.Dynamic.literal(addFullRequestInterceptor = js.Any.fromFunction1(addFullRequestInterceptor), addFullResponseInterceptor = js.Any.fromFunction1(addFullResponseInterceptor), addRequestInterceptor = js.Any.fromFunction1(addRequestInterceptor), addResponseInterceptor = js.Any.fromFunction1(addResponseInterceptor), fullRequestInterceptors = js.Any.fromFunction0(fullRequestInterceptors), fullResponseInterceptors = js.Any.fromFunction0(fullResponseInterceptors), header = js.Any.fromFunction2(header), headers = js.Any.fromFunction0(headers), requestInterceptors = js.Any.fromFunction0(requestInterceptors), responseInterceptors = js.Any.fromFunction0(responseInterceptors), url = js.Any.fromFunction0(url))
      __obj.asInstanceOf[Endpoint[Self]]
    }
    
    extension [Self_ <: Endpoint[?], Self](x: Self_ & Endpoint[Self]) {
      
      inline def setAddFullRequestInterceptor(value: FullRequestInterceptor => Self): Self_ = StObject.set(x, "addFullRequestInterceptor", js.Any.fromFunction1(value))
      
      inline def setAddFullResponseInterceptor(value: ResponseInterceptor => Self): Self_ = StObject.set(x, "addFullResponseInterceptor", js.Any.fromFunction1(value))
      
      inline def setAddRequestInterceptor(value: RequestInterceptor => Self): Self_ = StObject.set(x, "addRequestInterceptor", js.Any.fromFunction1(value))
      
      inline def setAddResponseInterceptor(value: ResponseInterceptor => Self): Self_ = StObject.set(x, "addResponseInterceptor", js.Any.fromFunction1(value))
      
      inline def setFullRequestInterceptors(value: () => js.Array[FullRequestInterceptor]): Self_ = StObject.set(x, "fullRequestInterceptors", js.Any.fromFunction0(value))
      
      inline def setFullResponseInterceptors(value: () => js.Array[ResponseInterceptor]): Self_ = StObject.set(x, "fullResponseInterceptors", js.Any.fromFunction0(value))
      
      inline def setHeader(value: (String, Any) => Self): Self_ = StObject.set(x, "header", js.Any.fromFunction2(value))
      
      inline def setHeaders(value: () => Headers): Self_ = StObject.set(x, "headers", js.Any.fromFunction0(value))
      
      inline def setRequestInterceptors(value: () => js.Array[RequestInterceptor]): Self_ = StObject.set(x, "requestInterceptors", js.Any.fromFunction0(value))
      
      inline def setResponseInterceptors(value: () => js.Array[ResponseInterceptor]): Self_ = StObject.set(x, "responseInterceptors", js.Any.fromFunction0(value))
      
      inline def setUrl(value: () => String): Self_ = StObject.set(x, "url", js.Any.fromFunction0(value))
    }
  }
  
  type FullRequestInterceptor = js.Function5[
    /* params */ Any, 
    /* headers */ Headers, 
    /* data */ Any, 
    /* method */ String, 
    /* url */ String, 
    FullRequestInterceptorReturnValue
  ]
  
  trait FullRequestInterceptorReturnValue extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object FullRequestInterceptorReturnValue {
    
    inline def apply(): FullRequestInterceptorReturnValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullRequestInterceptorReturnValue]
    }
    
    extension [Self <: FullRequestInterceptorReturnValue](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type Headers = StringDictionary[Any]
  
  @js.native
  trait MemberEndpoint
    extends StObject
       with Endpoint[MemberEndpoint] {
    
    /**
      * Target a child collection name.
      * @param name
      */
    def all(name: String): CollectionEndpoint = js.native
    
    def allUrl(name: String, url: String): CollectionEndpoint = js.native
    
    def customUrl(): String = js.native
    def customUrl(url: String): MemberEndpoint = js.native
    
    /**
      * Delete a member. Returns a promise with the response.
      * @param data
      * @param headers
      */
    def delete[T](): js.Promise[MemberResponse[T]] = js.native
    def delete[T](data: Any): js.Promise[MemberResponse[T]] = js.native
    def delete[T](data: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    def delete[T](data: Unit, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Get a member. Returns a promise with an entity.
      * @param params
      * @param headers
      */
    def get[T](): js.Promise[MemberResponse[T]] = js.native
    def get[T](params: Any): js.Promise[MemberResponse[T]] = js.native
    def get[T](params: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    def get[T](params: Unit, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Perform a HEAD request on a member. Returns a promise with the response.
      * @param headers
      */
    def head[T](): js.Promise[MemberResponse[T]] = js.native
    def head[T](headers: Any): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Target a child member in a collection name.
      * @param name
      * @param id
      */
    def one(name: String, id: Any): MemberEndpoint = js.native
    
    def oneUrl(name: String, url: String): MemberEndpoint = js.native
    
    /**
      * Patch a member. Returns a promise with the response.
      * @param data
      * @param headers
      */
    def patch[T](data: Any): js.Promise[MemberResponse[T]] = js.native
    def patch[T](data: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Update a member. Returns a promise with the response.
      * @param data
      * @param headers
      */
    def put[T](data: Any): js.Promise[MemberResponse[T]] = js.native
    def put[T](data: Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  }
  
  @js.native
  trait MemberResponse[T]
    extends StObject
       with ResponseBase {
    
    def apply(): typings.restfulJs.anon.Headers[T] = js.native
    
    def body(): ResponseBody[T] = js.native
  }
  
  type RequestInterceptor = js.Function4[/* data */ Any, /* headers */ Headers, /* method */ String, /* url */ String, Any]
  
  trait ResponseBase extends StObject {
    
    def config(): Any
    
    def headers(): Headers
    
    def status(): Double
  }
  object ResponseBase {
    
    inline def apply(config: () => Any, headers: () => Headers, status: () => Double): ResponseBase = {
      val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config), headers = js.Any.fromFunction0(headers), status = js.Any.fromFunction0(status))
      __obj.asInstanceOf[ResponseBase]
    }
    
    extension [Self <: ResponseBase](x: Self) {
      
      inline def setConfig(value: () => Any): Self = StObject.set(x, "config", js.Any.fromFunction0(value))
      
      inline def setHeaders(value: () => Headers): Self = StObject.set(x, "headers", js.Any.fromFunction0(value))
      
      inline def setStatus(value: () => Double): Self = StObject.set(x, "status", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ResponseBody[T] extends StObject {
    
    def apply(): T = js.native
    
    /**
      * Query a collection child of the entity.
      * @param entity
      */
    def all(entity: String): CollectionEndpoint = js.native
    
    /**
      * Get the JS object unserialized from the response body (which must be in JSON)
      */
    def data(): T = js.native
    
    /**
      * Get the id of the entity.
      */
    def id(): Any = js.native
    
    /**
      * Query a member child of the entity.
      * @param entity
      * @param id
      */
    def one(entity: String, id: Any): MemberEndpoint = js.native
    
    /**
      * Delete the member link to the entity. Returns a promise with the response.
      */
    def remove(): Unit = js.native
    def remove(headers: Headers): Unit = js.native
    
    /**
      * Update the member link to the entity. Returns a promise with the response.
      * @param headers
      */
    def save(): Unit = js.native
    def save(headers: Headers): Unit = js.native
    
    /**
      * Get the entity url.
      */
    def url(): String = js.native
  }
  
  type ResponseInterceptor = js.Function4[
    /* data */ Any, 
    /* headers */ Headers, 
    /* method */ String, 
    /* url */ String, 
    ResponseInterceptorReturnValue
  ]
  
  trait ResponseInterceptorReturnValue extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ResponseInterceptorReturnValue {
    
    inline def apply(): ResponseInterceptorReturnValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInterceptorReturnValue]
    }
    
    extension [Self <: ResponseInterceptorReturnValue](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
