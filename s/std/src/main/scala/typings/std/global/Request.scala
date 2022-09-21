package typings.std.global

import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestDestination
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Request")
@js.native
open class Request protected ()
  extends StObject
     with typings.std.Request {
  /* standard dom */
  def this(input: RequestInfo) = this()
  def this(input: typings.std.URL) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
  def this(input: typings.std.URL, init: RequestInit) = this()
  
  /* standard dom */
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def blob(): js.Promise[typings.std.Blob] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val body: typings.std.ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  
  /** Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching. */
  /* standard dom */
  /* CompleteClass */
  override val cache: RequestCache = js.native
  
  /** Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. */
  /* standard dom */
  /* CompleteClass */
  override val credentials: RequestCredentials = js.native
  
  /** Returns the kind of resource requested by request, e.g., "document" or "script". */
  /* standard dom */
  /* CompleteClass */
  override val destination: RequestDestination = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def formData(): js.Promise[typings.std.FormData] = js.native
  
  /** Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header. */
  /* standard dom */
  /* CompleteClass */
  override val headers: typings.std.Headers = js.native
  
  /** Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI] */
  /* standard dom */
  /* CompleteClass */
  override val integrity: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def json(): js.Promise[Any] = js.native
  
  /** Returns a boolean indicating whether or not request can outlive the global in which it was created. */
  /* standard dom */
  /* CompleteClass */
  override val keepalive: scala.Boolean = js.native
  
  /** Returns request's HTTP method, which is "GET" by default. */
  /* standard dom */
  /* CompleteClass */
  override val method: java.lang.String = js.native
  
  /** Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs. */
  /* standard dom */
  /* CompleteClass */
  override val mode: RequestMode = js.native
  
  /** Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default. */
  /* standard dom */
  /* CompleteClass */
  override val redirect: RequestRedirect = js.native
  
  /** Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made. */
  /* standard dom */
  /* CompleteClass */
  override val referrer: java.lang.String = js.native
  
  /** Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer. */
  /* standard dom */
  /* CompleteClass */
  override val referrerPolicy: ReferrerPolicy = js.native
  
  /** Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler. */
  /* standard dom */
  /* CompleteClass */
  override val signal: typings.std.AbortSignal = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
  
  /** Returns the URL of request as a string. */
  /* standard dom */
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
