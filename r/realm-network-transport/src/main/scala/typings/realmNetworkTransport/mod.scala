package typings.realmNetworkTransport

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("realm-network-transport", "DefaultNetworkTransport")
  @js.native
  class DefaultNetworkTransport () extends NetworkTransport {
    
    var createTimeoutSignal: js.Any = js.native
    
    var fetch: js.Any = js.native
  }
  object DefaultNetworkTransport {
    
    @JSImport("realm-network-transport", "DefaultNetworkTransport")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("realm-network-transport", "DefaultNetworkTransport.AbortController")
    @js.native
    /**
      * Constructs an AbortController.
      */
    class AbortController ()
      extends typings.realmNetworkTransport.mod.AbortController
    /* static member */
    @JSImport("realm-network-transport", "DefaultNetworkTransport.AbortController")
    @js.native
    def AbortController: typings.realmNetworkTransport.mod.AbortController = js.native
    @scala.inline
    def AbortController_=(x: typings.realmNetworkTransport.mod.AbortController): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AbortController")(x.asInstanceOf[js.Any])
    
    /* static member */
    object DEFAULT_HEADERS {
      
      @JSImport("realm-network-transport", "DefaultNetworkTransport.DEFAULT_HEADERS")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("realm-network-transport", "DefaultNetworkTransport.DEFAULT_HEADERS.Accept")
      @js.native
      def Accept: String = js.native
      @scala.inline
      def Accept_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Accept")(x.asInstanceOf[js.Any])
      
      @JSImport("realm-network-transport", "DefaultNetworkTransport.DEFAULT_HEADERS.Content-Type")
      @js.native
      def ContentType: String = js.native
      
      @scala.inline
      def ContentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content-Type")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("realm-network-transport", "DefaultNetworkTransport.fetch")
    @js.native
    def fetch: Fetch = js.native
    @scala.inline
    def fetch_=(x: Fetch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fetch")(x.asInstanceOf[js.Any])
  }
  
  /**
    * TODO: Determine if the shape of an error response is specific to each service or widely used
    */
  @JSImport("realm-network-transport", "MongoDBRealmError")
  @js.native
  class MongoDBRealmError protected () extends Error {
    def this(method: Method, url: String, statusCode: Double, statusText: String, response: js.Any) = this()
    
    val errorCode: js.UndefOr[String] = js.native
    
    val link: js.UndefOr[String] = js.native
    
    val method: Method = js.native
    
    val statusCode: Double = js.native
    
    val statusText: String = js.native
    
    val url: String = js.native
  }
  
  /** A controller object that allows you to abort one or more DOM requests as and when desired. */
  @js.native
  trait AbortController
    extends /**
    * Constructs an AbortController.
    */
  Instantiable0[AbortController] {
    
    /**
      * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
      */
    def abort(): Unit = js.native
    
    /**
      * Returns the AbortSignal object associated with this object.
      */
    val signal: AbortSignal = js.native
  }
  
  type AbortSignal = js.Any
  
  type ErrorCallback = js.Function1[/* err */ Error, Unit]
  
  type Fetch = js.Function2[
    /* input */ FetchRequestInfo, 
    /* init */ js.UndefOr[FetchRequestInit], 
    js.Promise[FetchResponse]
  ]
  
  @js.native
  trait FetchBody extends StObject {
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    def blob(): js.Promise[_] = js.native
    
    val body: js.Any | Null = js.native
    
    val bodyUsed: Boolean = js.native
    
    def json(): js.Promise[_] = js.native
    
    def text(): js.Promise[String] = js.native
  }
  object FetchBody {
    
    @scala.inline
    def apply(
      arrayBuffer: () => js.Promise[ArrayBuffer],
      blob: () => js.Promise[_],
      bodyUsed: Boolean,
      json: () => js.Promise[_],
      text: () => js.Promise[String]
    ): FetchBody = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[FetchBody]
    }
    
    @scala.inline
    implicit class FetchBodyMutableBuilder[Self <: FetchBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayBuffer(value: () => js.Promise[ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBlob(value: () => js.Promise[_]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: () => js.Promise[_]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      @scala.inline
      def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  type FetchBodyInit = js.Any
  
  @js.native
  trait FetchHeaders extends StObject {
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def set(name: String, value: String): Unit = js.native
  }
  object FetchHeaders {
    
    @scala.inline
    def apply(
      append: (String, String) => Unit,
      delete: String => Unit,
      forEach: js.Function2[/* value */ String, /* name */ String, Unit] => Unit,
      get: String => String | Null,
      has: String => Boolean,
      set: (String, String) => Unit
    ): FetchHeaders = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), delete = js.Any.fromFunction1(delete), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[FetchHeaders]
    }
    
    @scala.inline
    implicit class FetchHeadersMutableBuilder[Self <: FetchHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: (String, String) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function2[/* value */ String, /* name */ String, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, String) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type FetchHeadersInit = FetchHeaders | js.Array[js.Array[String]] | (Record[String, String])
  
  /** This Fetch API interface represents a resource request. */
  @js.native
  trait FetchRequest extends FetchBody {
    
    /**
      * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
      */
    val headers: FetchHeaders = js.native
    
    /**
      * Returns a boolean indicating whether or not request can outlive the global in which it was created.
      */
    val keepalive: Boolean = js.native
    
    /**
      * Returns request's HTTP method, which is "GET" by default.
      */
    val method: String = js.native
    
    /**
      * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
      */
    val signal: AbortSignal = js.native
    
    /**
      * Returns the URL of request as a string.
      */
    val url: String = js.native
  }
  object FetchRequest {
    
    @scala.inline
    def apply(
      arrayBuffer: () => js.Promise[ArrayBuffer],
      blob: () => js.Promise[_],
      bodyUsed: Boolean,
      headers: FetchHeaders,
      json: () => js.Promise[_],
      keepalive: Boolean,
      method: String,
      signal: AbortSignal,
      text: () => js.Promise[String],
      url: String
    ): FetchRequest = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchRequest]
    }
    
    @scala.inline
    implicit class FetchRequestMutableBuilder[Self <: FetchRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: FetchHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type FetchRequestInfo = FetchRequest | String
  
  @js.native
  trait FetchRequestInit extends StObject {
    
    /**
      * A BodyInit object or null to set request's body.
      */
    var body: js.UndefOr[FetchBodyInit | Null] = js.native
    
    /**
      * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
      */
    var headers: js.UndefOr[FetchHeadersInit] = js.native
    
    /**
      * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
      */
    var integrity: js.UndefOr[String] = js.native
    
    /**
      * A boolean to set request's keepalive.
      */
    var keepalive: js.UndefOr[Boolean] = js.native
    
    /**
      * A string to set request's method.
      */
    var method: js.UndefOr[String] = js.native
    
    /**
      * An AbortSignal to set request's signal.
      */
    var signal: js.UndefOr[AbortSignal | Null] = js.native
  }
  object FetchRequestInit {
    
    @scala.inline
    def apply(): FetchRequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchRequestInit]
    }
    
    @scala.inline
    implicit class FetchRequestInitMutableBuilder[Self <: FetchRequestInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: FetchBodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: FetchHeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalNull: Self = StObject.set(x, "signal", null)
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  @js.native
  trait FetchResponse extends FetchBody {
    
    val headers: FetchHeaders = js.native
    
    val ok: Boolean = js.native
    
    val redirected: Boolean = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    val `type`: js.Any = js.native
    
    val url: String = js.native
  }
  object FetchResponse {
    
    @scala.inline
    def apply(
      arrayBuffer: () => js.Promise[ArrayBuffer],
      blob: () => js.Promise[_],
      bodyUsed: Boolean,
      headers: FetchHeaders,
      json: () => js.Promise[_],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      `type`: js.Any,
      url: String
    ): FetchResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    @scala.inline
    implicit class FetchResponseMutableBuilder[Self <: FetchResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: FetchHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.realmNetworkTransport.realmNetworkTransportStrings.GET
    - typings.realmNetworkTransport.realmNetworkTransportStrings.POST
    - typings.realmNetworkTransport.realmNetworkTransportStrings.DELETE
    - typings.realmNetworkTransport.realmNetworkTransportStrings.PUT
  */
  trait Method extends StObject
  object Method {
    
    @scala.inline
    def DELETE: typings.realmNetworkTransport.realmNetworkTransportStrings.DELETE = "DELETE".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.DELETE]
    
    @scala.inline
    def GET: typings.realmNetworkTransport.realmNetworkTransportStrings.GET = "GET".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.GET]
    
    @scala.inline
    def POST: typings.realmNetworkTransport.realmNetworkTransportStrings.POST = "POST".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.POST]
    
    @scala.inline
    def PUT: typings.realmNetworkTransport.realmNetworkTransportStrings.PUT = "PUT".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.PUT]
  }
  
  @js.native
  trait NetworkTransport extends StObject {
    
    def fetchAndParse[RequestBody /* <: js.Any */, ResponseBody /* <: js.Any */](request: Request[RequestBody]): js.Promise[ResponseBody] = js.native
    
    def fetchWithCallbacks[RequestBody /* <: js.Any */](request: Request[RequestBody], handler: ResponseHandler): Unit = js.native
  }
  object NetworkTransport {
    
    @scala.inline
    def apply(
      fetchAndParse: Request[js.Any] => js.Promise[js.Any],
      fetchWithCallbacks: (Request[js.Any], ResponseHandler) => Unit
    ): NetworkTransport = {
      val __obj = js.Dynamic.literal(fetchAndParse = js.Any.fromFunction1(fetchAndParse), fetchWithCallbacks = js.Any.fromFunction2(fetchWithCallbacks))
      __obj.asInstanceOf[NetworkTransport]
    }
    
    @scala.inline
    implicit class NetworkTransportMutableBuilder[Self <: NetworkTransport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchAndParse(value: Request[js.Any] => js.Promise[js.Any]): Self = StObject.set(x, "fetchAndParse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchWithCallbacks(value: (Request[js.Any], ResponseHandler) => Unit): Self = StObject.set(x, "fetchWithCallbacks", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Request[RequestBody] extends StObject {
    
    var body: js.UndefOr[RequestBody | String] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var method: Method = js.native
    
    var timeoutMs: js.UndefOr[Double] = js.native
    
    var url: String = js.native
  }
  object Request {
    
    @scala.inline
    def apply[RequestBody](method: Method, url: String): Request[RequestBody] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request[RequestBody]]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request[_], RequestBody] (val x: Self with Request[RequestBody]) extends AnyVal {
      
      @scala.inline
      def setBody(value: RequestBody | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var body: String = js.native
    
    var headers: Headers = js.native
    
    var statusCode: Double = js.native
  }
  object Response {
    
    @scala.inline
    def apply(body: String, headers: Headers, statusCode: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponseHandler extends StObject {
    
    def onError(err: Error): Unit = js.native
    @JSName("onError")
    var onError_Original: ErrorCallback = js.native
    
    def onSuccess(response: Response): Unit = js.native
    @JSName("onSuccess")
    var onSuccess_Original: SuccessCallback = js.native
  }
  
  type SuccessCallback = js.Function1[/* response */ Response, Unit]
}
