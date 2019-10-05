package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Fetch API interface represents a resource request. */
trait Request extends Body {
  /**
    * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
    */
  val cache: RequestCache
  /**
    * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
    */
  val credentials: RequestCredentials
  /**
    * Returns the kind of resource requested by request, e.g., "document" or "script".
    */
  val destination: RequestDestination
  /**
    * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
    */
  val headers: Headers
  /**
    * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
    */
  val integrity: java.lang.String
  /**
    * Returns a boolean indicating whether or not request is for a history navigation (a.k.a. back-foward navigation).
    */
  val isHistoryNavigation: scala.Boolean
  /**
    * Returns a boolean indicating whether or not request is for a reload navigation.
    */
  val isReloadNavigation: scala.Boolean
  /**
    * Returns a boolean indicating whether or not request can outlive the global in which it was created.
    */
  val keepalive: scala.Boolean
  /**
    * Returns request's HTTP method, which is "GET" by default.
    */
  val method: java.lang.String
  /**
    * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
    */
  val mode: RequestMode
  /**
    * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    */
  val redirect: RequestRedirect
  /**
    * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
    */
  val referrer: java.lang.String
  /**
    * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
    */
  val referrerPolicy: ReferrerPolicy
  /**
    * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
    */
  val signal: AbortSignal
  /**
    * Returns the URL of request as a string.
    */
  val url: java.lang.String
}

@JSGlobal("Request")
@js.native
object Request
  extends Instantiable1[/* input */ RequestInfo, Request]
     with Instantiable2[/* input */ RequestInfo, /* init */ RequestInit, Request]

