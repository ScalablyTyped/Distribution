package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typings.devtoolsProtocol.mod.Protocol.Network.Initiator
import typings.puppeteerCore.anon.ErrorText
import typings.puppeteerCore.anon.PartialResponseForRequest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "HTTPRequest")
@js.native
open class HTTPRequest () extends StObject {
  
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
  
  /* Excluded from this release type: _requestId */
  /* Excluded from this release type: _interceptionId */
  /* Excluded from this release type: _failureText */
  /* Excluded from this release type: _response */
  /* Excluded from this release type: _fromMemoryCache */
  /* Excluded from this release type: _redirectChain */
  /**
    * Warning! Using this client can break Puppeteer. Use with caution.
    *
    * @experimental
    */
  def client: CDPSession3 = js.native
  
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
  def enqueueInterceptAction(pendingHandler: js.Function0[Unit | js.Thenable[Any]]): Unit = js.native
  
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
  
  /* Excluded from this release type: __constructor */
  /**
    * @returns the URL of the request
    */
  def url(): String = js.native
}
