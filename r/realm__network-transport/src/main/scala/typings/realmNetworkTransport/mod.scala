package typings.realmNetworkTransport

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@realm/network-transport", "DefaultNetworkTransport")
  @js.native
  open class DefaultNetworkTransport ()
    extends StObject
       with NetworkTransport {
    
    /* private */ var createTimeoutSignal: Any = js.native
    
    /* CompleteClass */
    override def fetch[RequestBody](request: Request[RequestBody]): js.Promise[FetchResponse] = js.native
    
    /* CompleteClass */
    override def fetchWithCallbacks[RequestBody](request: Request[RequestBody], handler: ResponseHandler): Unit = js.native
  }
  object DefaultNetworkTransport {
    
    @JSImport("@realm/network-transport", "DefaultNetworkTransport")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@realm/network-transport", "DefaultNetworkTransport.AbortController")
    @js.native
    /**
      * Constructs an AbortController.
      */
    open class AbortController ()
      extends StObject
         with typings.realmNetworkTransport.mod.AbortController
    /* static member */
    @JSImport("@realm/network-transport", "DefaultNetworkTransport.AbortController")
    @js.native
    def AbortController: typings.realmNetworkTransport.mod.AbortController = js.native
    inline def AbortController_=(x: typings.realmNetworkTransport.mod.AbortController): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AbortController")(x.asInstanceOf[js.Any])
    
    /* static member */
    object DEFAULT_HEADERS {
      
      @JSImport("@realm/network-transport", "DefaultNetworkTransport.DEFAULT_HEADERS")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@realm/network-transport", "DefaultNetworkTransport.DEFAULT_HEADERS.Content-Type")
      @js.native
      def ContentType: String = js.native
      
      inline def ContentType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content-Type")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("@realm/network-transport", "DefaultNetworkTransport.extraFetchOptions")
    @js.native
    def extraFetchOptions: js.UndefOr[Record[String, Any]] = js.native
    inline def extraFetchOptions_=(x: js.UndefOr[Record[String, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraFetchOptions")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@realm/network-transport", "DefaultNetworkTransport.fetch")
    @js.native
    def fetch: Fetch = js.native
    inline def fetch_=(x: Fetch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fetch")(x.asInstanceOf[js.Any])
  }
  
  /** A controller object that allows you to abort one or more DOM requests as and when desired. */
  @js.native
  trait AbortController
    extends StObject
       with /**
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
  
  type AbortSignal = Any
  
  trait CallbackResponse extends StObject {
    
    var body: String
    
    var headers: Headers
    
    var statusCode: Double
  }
  object CallbackResponse {
    
    inline def apply(body: String, headers: Headers, statusCode: Double): CallbackResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  
  type Fetch = js.Function2[
    /* input */ FetchRequestInfo, 
    /* init */ js.UndefOr[FetchRequestInit[Any]], 
    js.Promise[FetchResponse]
  ]
  
  trait FetchBody extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    def blob(): js.Promise[Any]
    
    val body: FetchReadableStream | Null
    
    val bodyUsed: Boolean
    
    def json[ResponseBody](): js.Promise[ResponseBody]
    
    def text(): js.Promise[String]
  }
  object FetchBody {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Any],
      bodyUsed: Boolean,
      json: () => js.Promise[Any],
      text: () => js.Promise[String]
    ): FetchBody = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text), body = null)
      __obj.asInstanceOf[FetchBody]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchBody] (val x: Self) extends AnyVal {
      
      inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setBlob(value: () => js.Promise[Any]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      inline def setBody(value: FetchReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  trait FetchHeaders extends StObject {
    
    def append(name: String, value: String): Unit
    
    def delete(name: String): Unit
    
    def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit
    
    def get(name: String): String | Null
    
    def has(name: String): Boolean
    
    def set(name: String, value: String): Unit
  }
  object FetchHeaders {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: FetchHeaders] (val x: Self) extends AnyVal {
      
      inline def setAppend(value: (String, String) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
      
      inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function2[/* value */ String, /* name */ String, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type FetchHeadersInit = FetchHeaders | js.Array[js.Array[String]] | (Record[String, String])
  
  type FetchReadableStream = Any
  
  /** This Fetch API interface represents a resource request. */
  trait FetchRequest
    extends StObject
       with FetchBody {
    
    /**
      * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
      */
    val headers: FetchHeaders
    
    /**
      * Returns a boolean indicating whether or not request can outlive the global in which it was created.
      */
    val keepalive: Boolean
    
    /**
      * Returns request's HTTP method, which is "GET" by default.
      */
    val method: String
    
    /**
      * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
      */
    val signal: AbortSignal
    
    /**
      * Returns the URL of request as a string.
      */
    val url: String
  }
  object FetchRequest {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Any],
      bodyUsed: Boolean,
      headers: FetchHeaders,
      json: () => js.Promise[Any],
      keepalive: Boolean,
      method: String,
      signal: AbortSignal,
      text: () => js.Promise[String],
      url: String
    ): FetchRequest = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.asInstanceOf[FetchRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchRequest] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: FetchHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.realmNetworkTransport.realmNetworkTransportStrings.include
    - typings.realmNetworkTransport.realmNetworkTransportStrings.omit
    - typings.realmNetworkTransport.realmNetworkTransportStrings.`same-origin`
  */
  trait FetchRequestCredentials extends StObject
  object FetchRequestCredentials {
    
    inline def include: typings.realmNetworkTransport.realmNetworkTransportStrings.include = "include".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.include]
    
    inline def omit: typings.realmNetworkTransport.realmNetworkTransportStrings.omit = "omit".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.omit]
    
    inline def `same-origin`: typings.realmNetworkTransport.realmNetworkTransportStrings.`same-origin` = "same-origin".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.`same-origin`]
  }
  
  type FetchRequestInfo = FetchRequest | String
  
  trait FetchRequestInit[RequestBody] extends StObject {
    
    /**
      * A BodyInit object or null to set request's body.
      */
    var body: js.UndefOr[RequestBody] = js.undefined
    
    /**
      * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
      */
    var credentials: js.UndefOr[FetchRequestCredentials] = js.undefined
    
    /**
      * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
      */
    var headers: js.UndefOr[FetchHeadersInit] = js.undefined
    
    /**
      * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
      */
    var integrity: js.UndefOr[String] = js.undefined
    
    /**
      * A boolean to set request's keepalive.
      */
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string to set request's method.
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
      */
    var mode: js.UndefOr[FetchRequestMode] = js.undefined
    
    /**
      * An AbortSignal to set request's signal.
      */
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
  }
  object FetchRequestInit {
    
    inline def apply[RequestBody](): FetchRequestInit[RequestBody] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchRequestInit[RequestBody]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchRequestInit[?], RequestBody] (val x: Self & FetchRequestInit[RequestBody]) extends AnyVal {
      
      inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCredentials(value: FetchRequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: FetchHeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: FetchRequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.realmNetworkTransport.realmNetworkTransportStrings.cors
    - typings.realmNetworkTransport.realmNetworkTransportStrings.navigate
    - typings.realmNetworkTransport.realmNetworkTransportStrings.`no-cors`
    - typings.realmNetworkTransport.realmNetworkTransportStrings.`same-origin`
  */
  trait FetchRequestMode extends StObject
  object FetchRequestMode {
    
    inline def cors: typings.realmNetworkTransport.realmNetworkTransportStrings.cors = "cors".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.cors]
    
    inline def navigate: typings.realmNetworkTransport.realmNetworkTransportStrings.navigate = "navigate".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.navigate]
    
    inline def `no-cors`: typings.realmNetworkTransport.realmNetworkTransportStrings.`no-cors` = "no-cors".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.`no-cors`]
    
    inline def `same-origin`: typings.realmNetworkTransport.realmNetworkTransportStrings.`same-origin` = "same-origin".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.`same-origin`]
  }
  
  trait FetchResponse
    extends StObject
       with FetchBody {
    
    val headers: FetchHeaders
    
    val ok: Boolean
    
    val redirected: Boolean
    
    val status: Double
    
    val statusText: String
    
    val `type`: Any
    
    val url: String
  }
  object FetchResponse {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Any],
      bodyUsed: Boolean,
      headers: FetchHeaders,
      json: () => js.Promise[Any],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      `type`: Any,
      url: String
    ): FetchResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: FetchHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
    
    inline def DELETE: typings.realmNetworkTransport.realmNetworkTransportStrings.DELETE = "DELETE".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.DELETE]
    
    inline def GET: typings.realmNetworkTransport.realmNetworkTransportStrings.GET = "GET".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.GET]
    
    inline def POST: typings.realmNetworkTransport.realmNetworkTransportStrings.POST = "POST".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.POST]
    
    inline def PUT: typings.realmNetworkTransport.realmNetworkTransportStrings.PUT = "PUT".asInstanceOf[typings.realmNetworkTransport.realmNetworkTransportStrings.PUT]
  }
  
  trait NetworkTransport extends StObject {
    
    def fetch[RequestBody](request: Request[RequestBody]): js.Promise[FetchResponse]
    
    def fetchWithCallbacks[RequestBody](request: Request[RequestBody], handler: ResponseHandler): Unit
  }
  object NetworkTransport {
    
    inline def apply(
      fetch: Request[Any] => js.Promise[FetchResponse],
      fetchWithCallbacks: (Request[Any], ResponseHandler) => Unit
    ): NetworkTransport = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch), fetchWithCallbacks = js.Any.fromFunction2(fetchWithCallbacks))
      __obj.asInstanceOf[NetworkTransport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkTransport] (val x: Self) extends AnyVal {
      
      inline def setFetch(value: Request[Any] => js.Promise[FetchResponse]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      inline def setFetchWithCallbacks(value: (Request[Any], ResponseHandler) => Unit): Self = StObject.set(x, "fetchWithCallbacks", js.Any.fromFunction2(value))
    }
  }
  
  trait Request[RequestBody]
    extends StObject
       with FetchRequestInit[RequestBody] {
    
    @JSName("method")
    var method_Request: Method
    
    var timeoutMs: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object Request {
    
    inline def apply[RequestBody](method: Method, url: String): Request[RequestBody] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request[RequestBody]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request[?], RequestBody] (val x: Self & Request[RequestBody]) extends AnyVal {
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseHandler extends StObject {
    
    def onError(err: js.Error): Unit
    @JSName("onError")
    var onError_Original: ErrorCallback
    
    def onSuccess(response: CallbackResponse): Unit
    @JSName("onSuccess")
    var onSuccess_Original: SuccessCallback
  }
  object ResponseHandler {
    
    inline def apply(onError: /* err */ js.Error => Unit, onSuccess: /* response */ CallbackResponse => Unit): ResponseHandler = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onSuccess = js.Any.fromFunction1(onSuccess))
      __obj.asInstanceOf[ResponseHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseHandler] (val x: Self) extends AnyVal {
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnSuccess(value: /* response */ CallbackResponse => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    }
  }
  
  type SuccessCallback = js.Function1[/* response */ CallbackResponse, Unit]
}
