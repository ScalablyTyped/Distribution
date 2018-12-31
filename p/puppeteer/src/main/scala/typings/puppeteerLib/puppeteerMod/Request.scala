package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * Aborts request.
    * To use this, request interception should be enabled with `page.setRequestInterception`.
    * @throws An exception is immediately thrown if the request interception is not enabled.
    */
  def abort(): js.Promise[scala.Unit] = js.native
  def abort(errorCode: ErrorCode): js.Promise[scala.Unit] = js.native
  /**
    * Continues request with optional request overrides.
    * To use this, request interception should be enabled with `page.setRequestInterception`.
    * @throws An exception is immediately thrown if the request interception is not enabled.
    */
  def continue(): js.Promise[scala.Unit] = js.native
  def continue(overrides: Overrides): js.Promise[scala.Unit] = js.native
  /**
    * @returns An object if the request failed, null otherwise.
    */
  def failure(): puppeteerLib.Anon_ErrorText | scala.Null = js.native
  /**
    * @returns The `Frame` object that initiated the request, or `null` if navigating to error pages
    */
  def frame(): Frame | scala.Null = js.native
  /**
    * An object with HTTP headers associated with the request.
    * All header names are lower-case.
    */
  def headers(): Headers = js.native
  /** Whether this request is driving frame's navigation. */
  def isNavigationRequest(): scala.Boolean = js.native
  /** Returns the request's method (GET, POST, etc.) */
  def method(): HttpMethod = js.native
  /** Contains the request's post body, if any. */
  def postData(): js.UndefOr[java.lang.String] = js.native
  /**
    * A `redirectChain` is a chain of requests initiated to fetch a resource.
    *
    * - If there are no redirects and the request was successful, the chain will be empty.
    * - If a server responds with at least a single redirect, then the chain will contain all the requests that were redirected.
    *
    * `redirectChain` is shared between all the requests of the same chain.
    *
    * @since 1.2.0
    */
  def redirectChain(): js.Array[Request] = js.native
  /** Contains the request's resource type as it was perceived by the rendering engine.  */
  def resourceType(): ResourceType = js.native
  /**
    * Fulfills request with given response.
    * To use this, request interception should be enabled with `page.setRequestInterception`.
    * @throws An exception is immediately thrown if the request interception is not enabled.
    * @param response The response options that will fulfill this request.
    */
  def respond(response: RespondOptions): js.Promise[scala.Unit] = js.native
  /** A matching `Response` object, or `null` if the response has not been received yet. */
  def response(): Response | scala.Null = js.native
  /** Contains the URL of the request. */
  def url(): java.lang.String = js.native
}

