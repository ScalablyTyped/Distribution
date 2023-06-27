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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer) */
  /* standard dom */
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob) */
  /* standard dom */
  /* CompleteClass */
  override def blob(): js.Promise[typings.std.Blob] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body) */
  /* standard dom */
  /* CompleteClass */
  override val body: typings.std.ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed) */
  /* standard dom */
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  
  /**
    * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache)
    */
  /* standard dom */
  /* CompleteClass */
  override val cache: RequestCache = js.native
  
  /**
    * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials)
    */
  /* standard dom */
  /* CompleteClass */
  override val credentials: RequestCredentials = js.native
  
  /**
    * Returns the kind of resource requested by request, e.g., "document" or "script".
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/destination)
    */
  /* standard dom */
  /* CompleteClass */
  override val destination: RequestDestination = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData) */
  /* standard dom */
  /* CompleteClass */
  override def formData(): js.Promise[typings.std.FormData] = js.native
  
  /**
    * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/headers)
    */
  /* standard dom */
  /* CompleteClass */
  override val headers: typings.std.Headers = js.native
  
  /**
    * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/integrity)
    */
  /* standard dom */
  /* CompleteClass */
  override val integrity: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json) */
  /* standard dom */
  /* CompleteClass */
  override def json(): js.Promise[Any] = js.native
  
  /**
    * Returns a boolean indicating whether or not request can outlive the global in which it was created.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/keepalive)
    */
  /* standard dom */
  /* CompleteClass */
  override val keepalive: scala.Boolean = js.native
  
  /**
    * Returns request's HTTP method, which is "GET" by default.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/method)
    */
  /* standard dom */
  /* CompleteClass */
  override val method: java.lang.String = js.native
  
  /**
    * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode)
    */
  /* standard dom */
  /* CompleteClass */
  override val mode: RequestMode = js.native
  
  /**
    * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect)
    */
  /* standard dom */
  /* CompleteClass */
  override val redirect: RequestRedirect = js.native
  
  /**
    * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrer)
    */
  /* standard dom */
  /* CompleteClass */
  override val referrer: java.lang.String = js.native
  
  /**
    * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrerPolicy)
    */
  /* standard dom */
  /* CompleteClass */
  override val referrerPolicy: ReferrerPolicy = js.native
  
  /**
    * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/signal)
    */
  /* standard dom */
  /* CompleteClass */
  override val signal: typings.std.AbortSignal = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text) */
  /* standard dom */
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
  
  /**
    * Returns the URL of request as a string.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/url)
    */
  /* standard dom */
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
