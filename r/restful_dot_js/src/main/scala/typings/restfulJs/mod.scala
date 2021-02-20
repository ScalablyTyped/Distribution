package typings.restfulJs

import org.scalablytyped.runtime.StringDictionary
import typings.restfulJs.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restful.js", JSImport.Default)
  @js.native
  def default(endpoint: String): Api = js.native
  
  @js.native
  trait Api extends Endpoint[Api] {
    
    def all(name: String): CollectionEndpoint = js.native
    
    def allUrl(name: String, url: String): CollectionEndpoint = js.native
    
    def baseUrl(): String = js.native
    def baseUrl(protocol: String): Api = js.native
    
    def customUrl(): String = js.native
    def customUrl(url: String): Api = js.native
    
    def one(name: String, id: js.Any): MemberEndpoint = js.native
    
    def oneUrl(name: String, url: String): MemberEndpoint = js.native
    
    def port(): Double = js.native
    def port(port: Double): Api = js.native
    
    def prefixUrl(): String = js.native
    def prefixUrl(prefix: String): Api = js.native
    
    def protocol(): String = js.native
    def protocol(protocol: String): Api = js.native
  }
  
  @js.native
  trait CollectionEndpoint extends Endpoint[CollectionEndpoint] {
    
    /**
      * Delete a member in a collection. Returns a promise with the response.
      * @param id
      * @param data
      * @param headers
      */
    def delete[T](id: js.Any): js.Promise[MemberResponse[T]] = js.native
    def delete[T](id: js.Any, data: js.UndefOr[scala.Nothing], headers: Headers): js.Promise[MemberResponse[T]] = js.native
    def delete[T](id: js.Any, data: js.Any): js.Promise[MemberResponse[T]] = js.native
    def delete[T](id: js.Any, data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Get a member in a collection. Returns a promise with an entity.
      * @param id
      */
    def get[T](id: js.Any): js.Promise[MemberResponse[T]] = js.native
    def get[T](id: js.Any, params: js.UndefOr[scala.Nothing], headers: Headers): js.Promise[MemberResponse[T]] = js.native
    def get[T](id: js.Any, params: js.Any): js.Promise[MemberResponse[T]] = js.native
    def get[T](id: js.Any, params: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Get a full collection. Returns a promise with an array of entities.
      */
    def getAll[T](): js.Promise[CollectionResponse[T]] = js.native
    def getAll[T](params: js.UndefOr[scala.Nothing], headers: Headers): js.Promise[CollectionResponse[T]] = js.native
    def getAll[T](params: js.Any): js.Promise[CollectionResponse[T]] = js.native
    def getAll[T](params: js.Any, headers: Headers): js.Promise[CollectionResponse[T]] = js.native
    
    /**
      * Perform a HEAD request on a member in a collection. Returns a promise with the response.
      * @param id
      * @param headers
      */
    def head[T](id: js.Any): js.Promise[MemberResponse[T]] = js.native
    def head[T](id: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Patch a member in a collection. Returns a promise with the response.
      * @param id
      * @param data
      * @param headers
      */
    def patch[T](id: js.Any, data: js.Any): js.Promise[MemberResponse[T]] = js.native
    def patch[T](id: js.Any, data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Create a member in a collection. Returns a promise with the response.
      */
    def post[T](data: js.Any): js.Promise[MemberResponse[T]] = js.native
    def post[T](data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Update a member in a collection. Returns a promise with the response.
      * @param id
      * @param data
      * @param headers
      */
    def put[T](id: js.Any, data: js.Any): js.Promise[MemberResponse[T]] = js.native
    def put[T](id: js.Any, data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  }
  
  @js.native
  trait CollectionResponse[T] extends ResponseBase {
    
    def apply(): typings.restfulJs.anon.Headers[T] = js.native
    
    def body(): js.Array[ResponseBody[T]] = js.native
  }
  
  @js.native
  trait Endpoint[Self] extends StObject {
    
    /**
      * Add a full request interceptor. You can alter params, headers, data, method and url.
      */
    def addFullRequestInterceptor(interceptor: FullRequestInterceptor): Self = js.native
    
    /**
      * Add a full response interceptor. You can alter data and headers.
      */
    def addFullResponseInterceptor(interceptor: ResponseInterceptor): Self = js.native
    
    /**
      * Add a request interceptor.
      */
    def addRequestInterceptor(interceptor: RequestInterceptor): Self = js.native
    
    /**
      * Add a response interceptor. You can only alter data and headers.
      */
    def addResponseInterceptor(interceptor: ResponseInterceptor): Self = js.native
    
    def fullRequestInterceptors(): js.Array[FullRequestInterceptor] = js.native
    
    def fullResponseInterceptors(): js.Array[ResponseInterceptor] = js.native
    
    /**
      * Add a header.
      * @param name
      * @param value
      */
    def header(name: String, value: js.Any): Self = js.native
    
    def headers(): Headers = js.native
    
    def requestInterceptors(): js.Array[RequestInterceptor] = js.native
    
    def responseInterceptors(): js.Array[ResponseInterceptor] = js.native
    
    /**
      * Get the url.
      */
    def url(): String = js.native
  }
  object Endpoint {
    
    @scala.inline
    def apply[Self](
      addFullRequestInterceptor: FullRequestInterceptor => Self,
      addFullResponseInterceptor: ResponseInterceptor => Self,
      addRequestInterceptor: RequestInterceptor => Self,
      addResponseInterceptor: ResponseInterceptor => Self,
      fullRequestInterceptors: () => js.Array[FullRequestInterceptor],
      fullResponseInterceptors: () => js.Array[ResponseInterceptor],
      header: (String, js.Any) => Self,
      headers: () => Headers,
      requestInterceptors: () => js.Array[RequestInterceptor],
      responseInterceptors: () => js.Array[ResponseInterceptor],
      url: () => String
    ): Endpoint[Self] = {
      val __obj = js.Dynamic.literal(addFullRequestInterceptor = js.Any.fromFunction1(addFullRequestInterceptor), addFullResponseInterceptor = js.Any.fromFunction1(addFullResponseInterceptor), addRequestInterceptor = js.Any.fromFunction1(addRequestInterceptor), addResponseInterceptor = js.Any.fromFunction1(addResponseInterceptor), fullRequestInterceptors = js.Any.fromFunction0(fullRequestInterceptors), fullResponseInterceptors = js.Any.fromFunction0(fullResponseInterceptors), header = js.Any.fromFunction2(header), headers = js.Any.fromFunction0(headers), requestInterceptors = js.Any.fromFunction0(requestInterceptors), responseInterceptors = js.Any.fromFunction0(responseInterceptors), url = js.Any.fromFunction0(url))
      __obj.asInstanceOf[Endpoint[Self]]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self_ <: Endpoint[_], Self] (val x: Self_ with Endpoint[Self]) extends AnyVal {
      
      @scala.inline
      def setAddFullRequestInterceptor(value: FullRequestInterceptor => Self): Self_ = StObject.set(x, "addFullRequestInterceptor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddFullResponseInterceptor(value: ResponseInterceptor => Self): Self_ = StObject.set(x, "addFullResponseInterceptor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddRequestInterceptor(value: RequestInterceptor => Self): Self_ = StObject.set(x, "addRequestInterceptor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddResponseInterceptor(value: ResponseInterceptor => Self): Self_ = StObject.set(x, "addResponseInterceptor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFullRequestInterceptors(value: () => js.Array[FullRequestInterceptor]): Self_ = StObject.set(x, "fullRequestInterceptors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFullResponseInterceptors(value: () => js.Array[ResponseInterceptor]): Self_ = StObject.set(x, "fullResponseInterceptors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeader(value: (String, js.Any) => Self): Self_ = StObject.set(x, "header", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaders(value: () => Headers): Self_ = StObject.set(x, "headers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequestInterceptors(value: () => js.Array[RequestInterceptor]): Self_ = StObject.set(x, "requestInterceptors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResponseInterceptors(value: () => js.Array[ResponseInterceptor]): Self_ = StObject.set(x, "responseInterceptors", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUrl(value: () => String): Self_ = StObject.set(x, "url", js.Any.fromFunction0(value))
    }
  }
  
  type FullRequestInterceptor = js.Function5[
    /* params */ js.Any, 
    /* headers */ Headers, 
    /* data */ js.Any, 
    /* method */ String, 
    /* url */ String, 
    FullRequestInterceptorReturnValue
  ]
  
  @js.native
  trait FullRequestInterceptorReturnValue extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object FullRequestInterceptorReturnValue {
    
    @scala.inline
    def apply(): FullRequestInterceptorReturnValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullRequestInterceptorReturnValue]
    }
    
    @scala.inline
    implicit class FullRequestInterceptorReturnValueMutableBuilder[Self <: FullRequestInterceptorReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type Headers = StringDictionary[js.Any]
  
  @js.native
  trait MemberEndpoint extends Endpoint[MemberEndpoint] {
    
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
    def delete[T](data: js.UndefOr[scala.Nothing], headers: Headers): js.Promise[MemberResponse[T]] = js.native
    def delete[T](data: js.Any): js.Promise[MemberResponse[T]] = js.native
    def delete[T](data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Get a member. Returns a promise with an entity.
      * @param params
      * @param headers
      */
    def get[T](): js.Promise[MemberResponse[T]] = js.native
    def get[T](params: js.UndefOr[scala.Nothing], headers: Headers): js.Promise[MemberResponse[T]] = js.native
    def get[T](params: js.Any): js.Promise[MemberResponse[T]] = js.native
    def get[T](params: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Perform a HEAD request on a member. Returns a promise with the response.
      * @param headers
      */
    def head[T](): js.Promise[MemberResponse[T]] = js.native
    def head[T](headers: js.Any): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Target a child member in a collection name.
      * @param name
      * @param id
      */
    def one(name: String, id: js.Any): MemberEndpoint = js.native
    
    def oneUrl(name: String, url: String): MemberEndpoint = js.native
    
    /**
      * Patch a member. Returns a promise with the response.
      * @param data
      * @param headers
      */
    def patch[T](data: js.Any): js.Promise[MemberResponse[T]] = js.native
    def patch[T](data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
    
    /**
      * Update a member. Returns a promise with the response.
      * @param data
      * @param headers
      */
    def put[T](data: js.Any): js.Promise[MemberResponse[T]] = js.native
    def put[T](data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  }
  
  @js.native
  trait MemberResponse[T] extends ResponseBase {
    
    def apply(): Data[T] = js.native
    
    def body(): ResponseBody[T] = js.native
  }
  
  type RequestInterceptor = js.Function4[/* data */ js.Any, /* headers */ Headers, /* method */ String, /* url */ String, js.Any]
  
  @js.native
  trait ResponseBase extends StObject {
    
    def config(): js.Any = js.native
    
    def headers(): Headers = js.native
    
    def status(): Double = js.native
  }
  object ResponseBase {
    
    @scala.inline
    def apply(config: () => js.Any, headers: () => Headers, status: () => Double): ResponseBase = {
      val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config), headers = js.Any.fromFunction0(headers), status = js.Any.fromFunction0(status))
      __obj.asInstanceOf[ResponseBase]
    }
    
    @scala.inline
    implicit class ResponseBaseMutableBuilder[Self <: ResponseBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: () => js.Any): Self = StObject.set(x, "config", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeaders(value: () => Headers): Self = StObject.set(x, "headers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStatus(value: () => Double): Self = StObject.set(x, "status", js.Any.fromFunction0(value))
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
    def id(): js.Any = js.native
    
    /**
      * Query a member child of the entity.
      * @param entity
      * @param id
      */
    def one(entity: String, id: js.Any): MemberEndpoint = js.native
    
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
    /* data */ js.Any, 
    /* headers */ Headers, 
    /* method */ String, 
    /* url */ String, 
    ResponseInterceptorReturnValue
  ]
  
  @js.native
  trait ResponseInterceptorReturnValue extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object ResponseInterceptorReturnValue {
    
    @scala.inline
    def apply(): ResponseInterceptorReturnValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInterceptorReturnValue]
    }
    
    @scala.inline
    implicit class ResponseInterceptorReturnValueMutableBuilder[Self <: ResponseInterceptorReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
