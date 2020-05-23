package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestDestination
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Request")
@js.native
class Request protected ()
  extends typings.std.Request {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
  /* CompleteClass */
  override val body: typings.std.ReadableStream[typings.std.Uint8Array] | Null = js.native
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /**
    * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
    */
  /* CompleteClass */
  override val cache: RequestCache = js.native
  /**
    * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
    */
  /* CompleteClass */
  override val credentials: RequestCredentials = js.native
  /**
    * Returns the kind of resource requested by request, e.g., "document" or "script".
    */
  /* CompleteClass */
  override val destination: RequestDestination = js.native
  /**
    * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
    */
  /* CompleteClass */
  override val headers: typings.std.Headers = js.native
  /**
    * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
    */
  /* CompleteClass */
  override val integrity: java.lang.String = js.native
  /**
    * Returns a boolean indicating whether or not request is for a history navigation (a.k.a. back-foward navigation).
    */
  /* CompleteClass */
  override val isHistoryNavigation: scala.Boolean = js.native
  /**
    * Returns a boolean indicating whether or not request is for a reload navigation.
    */
  /* CompleteClass */
  override val isReloadNavigation: scala.Boolean = js.native
  /**
    * Returns a boolean indicating whether or not request can outlive the global in which it was created.
    */
  /* CompleteClass */
  override val keepalive: scala.Boolean = js.native
  /**
    * Returns request's HTTP method, which is "GET" by default.
    */
  /* CompleteClass */
  override val method: java.lang.String = js.native
  /**
    * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
    */
  /* CompleteClass */
  override val mode: RequestMode = js.native
  /**
    * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    */
  /* CompleteClass */
  override val redirect: RequestRedirect = js.native
  /**
    * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
    */
  /* CompleteClass */
  override val referrer: java.lang.String = js.native
  /**
    * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
    */
  /* CompleteClass */
  override val referrerPolicy: ReferrerPolicy = js.native
  /**
    * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
    */
  /* CompleteClass */
  override val signal: typings.std.AbortSignal = js.native
  /**
    * Returns the URL of request as a string.
    */
  /* CompleteClass */
  override val url: java.lang.String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[typings.std.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[typings.std.Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[typings.std.FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
}

@JSGlobal("Request")
@js.native
object Request
  extends Instantiable1[/* input */ RequestInfo, typings.std.Request]
     with Instantiable2[/* input */ RequestInfo, /* init */ RequestInit, typings.std.Request]

