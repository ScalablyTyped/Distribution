package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typings.devtoolsProtocol.mod.Protocol.Network.Initiator
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.node.bufferMod.global.Buffer
import typings.puppeteerCore.anon.ErrorText
import typings.puppeteerCore.anon.PartialResponseForRequest
import typings.puppeteerCore.commonEventEmitterMod.EventEmitter
import typings.puppeteerCore.commonFrameMod.Frame
import typings.puppeteerCore.commonHttpresponseMod.HTTPResponse
import typings.puppeteerCore.puppeteerCoreStrings.abort_
import typings.std.Lowercase
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonHttprequestMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/HTTPRequest", "DEFAULT_INTERCEPT_RESOLUTION_PRIORITY")
  @js.native
  val DEFAULT_INTERCEPT_RESOLUTION_PRIORITY: /* 0 */ Double = js.native
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/HTTPRequest", "HTTPRequest")
  @js.native
  open class HTTPRequest protected () extends StObject {
    def this(
      client: CDPSession,
      frame: Null,
      interceptionId: String,
      allowInterception: Boolean,
      event: RequestWillBeSentEvent,
      redirectChain: js.Array[HTTPRequest]
    ) = this()
    def this(
      client: CDPSession,
      frame: Null,
      interceptionId: Unit,
      allowInterception: Boolean,
      event: RequestWillBeSentEvent,
      redirectChain: js.Array[HTTPRequest]
    ) = this()
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
    def this(
      client: CDPSession,
      frame: Frame,
      interceptionId: Unit,
      allowInterception: Boolean,
      event: RequestWillBeSentEvent,
      redirectChain: js.Array[HTTPRequest]
    ) = this()
    
    /**
      * @internal
      */
    var _failureText: String | Null = js.native
    
    /**
      * @internal
      */
    var _fromMemoryCache: Boolean = js.native
    
    /**
      * @internal
      */
    var _interceptionId: js.UndefOr[String] = js.native
    
    /**
      * @internal
      */
    var _redirectChain: js.Array[HTTPRequest] = js.native
    
    /**
      * @internal
      */
    var _requestId: String = js.native
    
    /**
      * @internal
      */
    var _response: HTTPResponse | Null = js.native
    
    /**
      * Aborts a request.
      *
      * @remarks
      * To use this, request interception should be enabled with
      * {@link Page.setRequestInterception}. If it is not enabled, this method will
      * throw an exception immediately.
      *
      * @param errorCode - optional error code to provide.
      * @param priority - If provided, intercept is resolved using
      * cooperative handling rules. Otherwise, intercept is resolved
      * immediately.
      */
    def abort(): js.Promise[Unit] = js.native
    def abort(errorCode: Unit, priority: Double): js.Promise[Unit] = js.native
    def abort(errorCode: ErrorCode): js.Promise[Unit] = js.native
    def abort(errorCode: ErrorCode, priority: Double): js.Promise[Unit] = js.native
    
    /**
      * @returns the most recent reason for aborting the request
      */
    def abortErrorReason(): ErrorReason | Null = js.native
    
    /**
      * Warning! Using this client can break Puppeteer. Use with caution.
      *
      * @experimental
      */
    def client: CDPSession = js.native
    
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
      *
      * ```ts
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
      * @param priority - If provided, intercept is resolved using
      * cooperative handling rules. Otherwise, intercept is resolved
      * immediately.
      */
    def continue(): js.Promise[Unit] = js.native
    def continue(overrides: Unit, priority: Double): js.Promise[Unit] = js.native
    def continue(overrides: ContinueRequestOverrides): js.Promise[Unit] = js.native
    def continue(overrides: ContinueRequestOverrides, priority: Double): js.Promise[Unit] = js.native
    
    /**
      * @returns the `ContinueRequestOverrides` that will be used
      * if the interception is allowed to continue (ie, `abort()` and
      * `respond()` aren't called).
      */
    def continueRequestOverrides(): ContinueRequestOverrides = js.native
    
    /**
      * Adds an async request handler to the processing queue.
      * Deferred handlers are not guaranteed to execute in any particular order,
      * but they are guaranteed to resolve before the request interception
      * is finalized.
      */
    def enqueueInterceptAction(pendingHandler: js.Function0[Unit | PromiseLike[Any]]): Unit = js.native
    
    /**
      * Access information about the request's failure.
      *
      * @remarks
      *
      * @example
      *
      * Example of logging all failed requests:
      *
      * ```ts
      * page.on('requestfailed', request => {
      *   console.log(request.url() + ' ' + request.failure().errorText);
      * });
      * ```
      *
      * @returns `null` unless the request failed. If the request fails this can
      * return an object with `errorText` containing a human-readable error
      * message, e.g. `net::ERR_FAILED`. It is not guaranteed that there will be
      * failure text if the request fails.
      */
    def failure(): ErrorText | Null = js.native
    
    /**
      * Awaits pending interception handlers and then decides how to fulfill
      * the request interception.
      */
    def finalizeInterceptions(): js.Promise[Unit] = js.native
    
    /**
      * @returns the frame that initiated the request, or null if navigating to
      * error pages.
      */
    def frame(): Frame | Null = js.native
    
    /**
      * @returns an object with HTTP headers associated with the request. All
      * header names are lower-case.
      */
    def headers(): Record[String, String] = js.native
    
    /**
      * @returns the initiator of the request.
      */
    def initiator(): Initiator = js.native
    
    /**
      * @returns An InterceptResolutionState object describing the current resolution
      * action and priority.
      *
      * InterceptResolutionState contains:
      * action: InterceptResolutionAction
      * priority?: number
      *
      * InterceptResolutionAction is one of: `abort`, `respond`, `continue`,
      * `disabled`, `none`, or `already-handled`.
      */
    def interceptResolutionState(): InterceptResolutionState = js.native
    
    /**
      * @returns `true` if the intercept resolution has already been handled,
      * `false` otherwise.
      */
    def isInterceptResolutionHandled(): Boolean = js.native
    
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
    
    /* private */ var `private`: Any = js.native
    
    /**
      * A `redirectChain` is a chain of requests initiated to fetch a resource.
      * @remarks
      *
      * `redirectChain` is shared between all the requests of the same chain.
      *
      * For example, if the website `http://example.com` has a single redirect to
      * `https://example.com`, then the chain will contain one request:
      *
      * ```ts
      * const response = await page.goto('http://example.com');
      * const chain = response.request().redirectChain();
      * console.log(chain.length); // 1
      * console.log(chain[0].url()); // 'http://example.com'
      * ```
      *
      * If the website `https://google.com` has no redirects, then the chain will be empty:
      *
      * ```ts
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
      */
    def resourceType(): ResourceType = js.native
    
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
      *
      * ```ts
      * await page.setRequestInterception(true);
      * page.on('request', request => {
      *   request.respond({
      *     status: 404,
      *     contentType: 'text/plain',
      *     body: 'Not Found!',
      *   });
      * });
      * ```
      *
      * NOTE: Mocking responses for dataURL requests is not supported.
      * Calling `request.respond` for a dataURL request is a noop.
      *
      * @param response - the response to fulfill the request with.
      * @param priority - If provided, intercept is resolved using
      * cooperative handling rules. Otherwise, intercept is resolved
      * immediately.
      */
    def respond(response: PartialResponseForRequest): js.Promise[Unit] = js.native
    def respond(response: PartialResponseForRequest, priority: Double): js.Promise[Unit] = js.native
    
    /**
      * @returns A matching `HTTPResponse` object, or null if the response has not
      * been received yet.
      */
    def response(): HTTPResponse | Null = js.native
    
    /**
      * @returns The `ResponseForRequest` that gets used if the
      * interception is allowed to respond (ie, `abort()` is not called).
      */
    def responseForRequest(): PartialResponseForRequest | Null = js.native
    
    /**
      * @returns the URL of the request
      */
    def url(): String = js.native
  }
  
  @js.native
  sealed trait InterceptResolutionAction extends StObject
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/HTTPRequest", "InterceptResolutionAction")
  @js.native
  object InterceptResolutionAction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InterceptResolutionAction & String] = js.native
    
    @js.native
    sealed trait Abort
      extends StObject
         with InterceptResolutionAction
    /* "abort" */ val Abort: typings.puppeteerCore.commonHttprequestMod.InterceptResolutionAction.Abort & String = js.native
    
    @js.native
    sealed trait AlreadyHandled
      extends StObject
         with InterceptResolutionAction
    /* "already-handled" */ val AlreadyHandled: typings.puppeteerCore.commonHttprequestMod.InterceptResolutionAction.AlreadyHandled & String = js.native
    
    @js.native
    sealed trait Continue
      extends StObject
         with InterceptResolutionAction
    /* "continue" */ val Continue: typings.puppeteerCore.commonHttprequestMod.InterceptResolutionAction.Continue & String = js.native
    
    @js.native
    sealed trait Disabled
      extends StObject
         with InterceptResolutionAction
    /* "disabled" */ val Disabled: typings.puppeteerCore.commonHttprequestMod.InterceptResolutionAction.Disabled & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with InterceptResolutionAction
    /* "none" */ val None: typings.puppeteerCore.commonHttprequestMod.InterceptResolutionAction.None & String = js.native
    
    @js.native
    sealed trait Respond
      extends StObject
         with InterceptResolutionAction
    /* "respond" */ val Respond: typings.puppeteerCore.commonHttprequestMod.InterceptResolutionAction.Respond & String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.continue
    - typings.puppeteerCore.puppeteerCoreStrings.abort_
    - typings.puppeteerCore.puppeteerCoreStrings.respond
  */
  trait ActionResult extends StObject
  object ActionResult {
    
    inline def abort: abort_ = "abort".asInstanceOf[abort_]
    
    inline def continue: typings.puppeteerCore.puppeteerCoreStrings.continue = "continue".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.continue]
    
    inline def respond: typings.puppeteerCore.puppeteerCoreStrings.respond = "respond".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.respond]
  }
  
  @js.native
  trait CDPSession extends EventEmitter {
    
    @JSName("send")
    def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 536 */ Any */](
      method: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
      ] = js.native
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
    
    inline def apply(): ContinueRequestOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContinueRequestOverrides]
    }
    
    extension [Self <: ContinueRequestOverrides](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    inline def aborted: typings.puppeteerCore.puppeteerCoreStrings.aborted = "aborted".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.aborted]
    
    inline def accessdenied: typings.puppeteerCore.puppeteerCoreStrings.accessdenied = "accessdenied".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.accessdenied]
    
    inline def addressunreachable: typings.puppeteerCore.puppeteerCoreStrings.addressunreachable = "addressunreachable".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.addressunreachable]
    
    inline def blockedbyclient: typings.puppeteerCore.puppeteerCoreStrings.blockedbyclient = "blockedbyclient".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.blockedbyclient]
    
    inline def blockedbyresponse: typings.puppeteerCore.puppeteerCoreStrings.blockedbyresponse = "blockedbyresponse".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.blockedbyresponse]
    
    inline def connectionaborted: typings.puppeteerCore.puppeteerCoreStrings.connectionaborted = "connectionaborted".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionaborted]
    
    inline def connectionclosed: typings.puppeteerCore.puppeteerCoreStrings.connectionclosed = "connectionclosed".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionclosed]
    
    inline def connectionfailed: typings.puppeteerCore.puppeteerCoreStrings.connectionfailed = "connectionfailed".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionfailed]
    
    inline def connectionrefused: typings.puppeteerCore.puppeteerCoreStrings.connectionrefused = "connectionrefused".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionrefused]
    
    inline def connectionreset: typings.puppeteerCore.puppeteerCoreStrings.connectionreset = "connectionreset".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.connectionreset]
    
    inline def failed: typings.puppeteerCore.puppeteerCoreStrings.failed = "failed".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.failed]
    
    inline def internetdisconnected: typings.puppeteerCore.puppeteerCoreStrings.internetdisconnected = "internetdisconnected".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.internetdisconnected]
    
    inline def namenotresolved: typings.puppeteerCore.puppeteerCoreStrings.namenotresolved = "namenotresolved".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.namenotresolved]
    
    inline def timedout: typings.puppeteerCore.puppeteerCoreStrings.timedout = "timedout".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.timedout]
  }
  
  trait InterceptResolutionState extends StObject {
    
    var action: InterceptResolutionAction
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object InterceptResolutionState {
    
    inline def apply(action: InterceptResolutionAction): InterceptResolutionState = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterceptResolutionState]
    }
    
    extension [Self <: InterceptResolutionState](x: Self) {
      
      inline def setAction(value: InterceptResolutionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  type InterceptResolutionStrategy = InterceptResolutionAction
  
  type ResourceType = Lowercase[typings.devtoolsProtocol.mod.Protocol.Network.ResourceType]
  
  trait ResponseForRequest extends StObject {
    
    var body: String | Buffer
    
    var contentType: String
    
    /**
      * Optional response headers. All values are converted to strings.
      */
    var headers: Record[String, Any]
    
    var status: Double
  }
  object ResponseForRequest {
    
    inline def apply(body: String | Buffer, contentType: String, headers: Record[String, Any], status: Double): ResponseForRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseForRequest]
    }
    
    extension [Self <: ResponseForRequest](x: Self) {
      
      inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
