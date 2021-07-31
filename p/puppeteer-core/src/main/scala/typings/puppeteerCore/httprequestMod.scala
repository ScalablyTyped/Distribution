package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.node.Buffer
import typings.puppeteerCore.anon.ErrorText
import typings.puppeteerCore.connectionMod.CDPSession
import typings.puppeteerCore.frameManagerMod.Frame
import typings.puppeteerCore.httpresponseMod.HTTPResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httprequestMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/HTTPRequest", "HTTPRequest")
  @js.native
  class HTTPRequest protected () extends StObject {
    /**
      * @internal
      */
    def this(
      client: CDPSession,
      frame: Frame,
      interceptionId: String,
      allowInterception: Boolean,
      event: RequestWillBeSentEvent,
      redirectChain: js.Array[HTTPRequest]
    ) = this()
    
    var _allowInterception: js.Any = js.native
    
    var _client: js.Any = js.native
    
    /**
      * @internal
      */
    var _failureText: js.Any = js.native
    
    var _frame: js.Any = js.native
    
    /**
      * @internal
      */
    var _fromMemoryCache: Boolean = js.native
    
    var _headers: js.Any = js.native
    
    var _interceptionHandled: js.Any = js.native
    
    /**
      * @internal
      */
    var _interceptionId: String = js.native
    
    var _isNavigationRequest: js.Any = js.native
    
    var _method: js.Any = js.native
    
    var _postData: js.Any = js.native
    
    /**
      * @internal
      */
    var _redirectChain: js.Array[HTTPRequest] = js.native
    
    /**
      * @internal
      */
    var _requestId: String = js.native
    
    var _resourceType: js.Any = js.native
    
    /**
      * @internal
      */
    var _response: HTTPResponse | Null = js.native
    
    var _url: js.Any = js.native
    
    /**
      * Aborts a request.
      *
      * @remarks
      * To use this, request interception should be enabled with
      * {@link Page.setRequestInterception}. If it is not enabled, this method will
      * throw an exception immediately.
      *
      * @param errorCode - optional error code to provide.
      */
    def abort(): js.Promise[Unit] = js.native
    def abort(errorCode: ErrorCode): js.Promise[Unit] = js.native
    
    /**
      * Continues request with optional request overrides.
      *
      * @remarks
      *
      * To use this, request
      * interception should be enabled with {@link Page.setRequestInterception}.
      *
      * Exception is immediately thrown if the request interception is not enabled.
      *
      * @example
      * ```js
      * await page.setRequestInterception(true);
      * page.on('request', request => {
      *   // Override headers
      *   const headers = Object.assign({}, request.headers(), {
      *     foo: 'bar', // set "foo" header
      *     origin: undefined, // remove "origin" header
      *   });
      *   request.continue({headers});
      * });
      * ```
      *
      * @param overrides - optional overrides to apply to the request.
      */
    def continue(): js.Promise[Unit] = js.native
    def continue(overrides: ContinueRequestOverrides): js.Promise[Unit] = js.native
    
    /**
      * Access information about the request's failure.
      *
      * @remarks
      *
      * @example
      *
      * Example of logging all failed requests:
      *
      * ```js
      * page.on('requestfailed', request => {
      *   console.log(request.url() + ' ' + request.failure().errorText);
      * });
      * ```
      *
      * @returns `null` unless the request failed. If the request fails this can
      * return an object with `errorText` containing a human-readable error
      * message, e.g. `net::ERR_FAILED`. It is not guaranteeded that there will be
      * failure text if the request fails.
      */
    def failure(): ErrorText | Null = js.native
    
    /**
      * @returns the frame that initiated the request.
      */
    def frame(): Frame | Null = js.native
    
    /**
      * @returns an object with HTTP headers associated with the request. All
      * header names are lower-case.
      */
    def headers(): Record[String, String] = js.native
    
    /**
      * @returns true if the request is the driver of the current frame's navigation.
      */
    def isNavigationRequest(): Boolean = js.native
    
    /**
      * @returns the method used (`GET`, `POST`, etc.)
      */
    def method(): String = js.native
    
    /**
      * @returns the request's post body, if any.
      */
    def postData(): js.UndefOr[String] = js.native
    
    /**
      * @remarks
      *
      * `redirectChain` is shared between all the requests of the same chain.
      *
      * For example, if the website `http://example.com` has a single redirect to
      * `https://example.com`, then the chain will contain one request:
      *
      * ```js
      * const response = await page.goto('http://example.com');
      * const chain = response.request().redirectChain();
      * console.log(chain.length); // 1
      * console.log(chain[0].url()); // 'http://example.com'
      * ```
      *
      * If the website `https://google.com` has no redirects, then the chain will be empty:
      *
      * ```js
      * const response = await page.goto('https://google.com');
      * const chain = response.request().redirectChain();
      * console.log(chain.length); // 0
      * ```
      *
      * @returns the chain of requests - if a server responds with at least a
      * single redirect, this chain will contain all requests that were redirected.
      */
    def redirectChain(): js.Array[HTTPRequest] = js.native
    
    /**
      * Contains the request's resource type as it was perceived by the rendering
      * engine.
      * @remarks
      * @returns one of the following: `document`, `stylesheet`, `image`, `media`,
      * `font`, `script`, `texttrack`, `xhr`, `fetch`, `eventsource`, `websocket`,
      * `manifest`, `other`.
      */
    def resourceType(): String = js.native
    
    /**
      * Fulfills a request with the given response.
      *
      * @remarks
      *
      * To use this, request
      * interception should be enabled with {@link Page.setRequestInterception}.
      *
      * Exception is immediately thrown if the request interception is not enabled.
      *
      * @example
      * An example of fulfilling all requests with 404 responses:
      * ```js
      * await page.setRequestInterception(true);
      * page.on('request', request => {
      *   request.respond({
      *     status: 404,
      *     contentType: 'text/plain',
      *     body: 'Not Found!'
      *   });
      * });
      * ```
      *
      * NOTE: Mocking responses for dataURL requests is not supported.
      * Calling `request.respond` for a dataURL request is a noop.
      *
      * @param response - the response to fulfill the request with.
      */
    def respond(response: ResponseForRequest): js.Promise[Unit] = js.native
    
    /**
      * @returns the response for this request, if a response has been received.
      */
    def response(): HTTPResponse | Null = js.native
    
    /**
      * @returns the URL of the request
      */
    def url(): String = js.native
  }
  
  trait ContinueRequestOverrides extends StObject {
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var postData: js.UndefOr[String] = js.undefined
    
    /**
      * If set, the request URL will change. This is not a redirect.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ContinueRequestOverrides {
    
    @scala.inline
    def apply(): ContinueRequestOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContinueRequestOverrides]
    }
    
    @scala.inline
    implicit class ContinueRequestOverridesMutableBuilder[Self <: ContinueRequestOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.aborted
    - typings.puppeteerCore.puppeteerCoreStrings.accessdenied
    - typings.puppeteerCore.puppeteerCoreStrings.addressunreachable
    - typings.puppeteerCore.puppeteerCoreStrings.blockedbyclient
    - typings.puppeteerCore.puppeteerCoreStrings.blockedbyresponse
    - typings.puppeteerCore.puppeteerCoreStrings.connectionaborted
    - typings.puppeteerCore.puppeteerCoreStrings.connectionclosed
    - typings.puppeteerCore.puppeteerCoreStrings.connectionfailed
    - typings.puppeteerCore.puppeteerCoreStrings.connectionrefused
    - typings.puppeteerCore.puppeteerCoreStrings.connectionreset
    - typings.puppeteerCore.puppeteerCoreStrings.internetdisconnected
    - typings.puppeteerCore.puppeteerCoreStrings.namenotresolved
    - typings.puppeteerCore.puppeteerCoreStrings.timedout
    - typings.puppeteerCore.puppeteerCoreStrings.failed
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    @scala.inline
    def aborted: typings.puppeteerCore.puppeteerCoreStrings.aborted = "aborted".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.aborted]
    
    @scala.inline
    def accessdenied: typings.puppeteerCore.puppeteerCoreStrings.accessdenied = "accessdenied".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.accessdenied]
    
    @scala.inline
    def addressunreachable: typings.puppeteerCore.puppeteerCoreStrings.addressunreachable = "addressunreachable".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.addressunreachable]
    
    @scala.inline
    def blockedbyclient: typings.puppeteerCore.puppeteerCoreStrings.blockedbyclient = "blockedbyclient".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.blockedbyclient]
    
    @scala.inline
    def blockedbyresponse: typings.puppeteerCore.puppeteerCoreStrings.blockedbyresponse = "blockedbyresponse".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.blockedbyresponse]
    
    @scala.inline
    def connectionaborted: typings.puppeteerCore.puppeteerCoreStrings.connectionaborted = "connectionaborted".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionaborted]
    
    @scala.inline
    def connectionclosed: typings.puppeteerCore.puppeteerCoreStrings.connectionclosed = "connectionclosed".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionclosed]
    
    @scala.inline
    def connectionfailed: typings.puppeteerCore.puppeteerCoreStrings.connectionfailed = "connectionfailed".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionfailed]
    
    @scala.inline
    def connectionrefused: typings.puppeteerCore.puppeteerCoreStrings.connectionrefused = "connectionrefused".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionrefused]
    
    @scala.inline
    def connectionreset: typings.puppeteerCore.puppeteerCoreStrings.connectionreset = "connectionreset".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionreset]
    
    @scala.inline
    def failed: typings.puppeteerCore.puppeteerCoreStrings.failed = "failed".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.failed]
    
    @scala.inline
    def internetdisconnected: typings.puppeteerCore.puppeteerCoreStrings.internetdisconnected = "internetdisconnected".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.internetdisconnected]
    
    @scala.inline
    def namenotresolved: typings.puppeteerCore.puppeteerCoreStrings.namenotresolved = "namenotresolved".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.namenotresolved]
    
    @scala.inline
    def timedout: typings.puppeteerCore.puppeteerCoreStrings.timedout = "timedout".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.timedout]
  }
  
  trait ResponseForRequest extends StObject {
    
    var body: String | Buffer
    
    var contentType: String
    
    var headers: Record[String, String]
    
    var status: Double
  }
  object ResponseForRequest {
    
    @scala.inline
    def apply(body: String | Buffer, contentType: String, headers: Record[String, String], status: Double): ResponseForRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseForRequest]
    }
    
    @scala.inline
    implicit class ResponseForRequestMutableBuilder[Self <: ResponseForRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
