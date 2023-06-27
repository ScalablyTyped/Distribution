package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Fetch API interface represents a resource request.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request)
  */
trait Request
  extends StObject
     with Body {
  
  /**
    * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache)
    */
  /* standard dom */
  val cache: RequestCache
  
  /**
    * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials)
    */
  /* standard dom */
  val credentials: RequestCredentials
  
  /**
    * Returns the kind of resource requested by request, e.g., "document" or "script".
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/destination)
    */
  /* standard dom */
  val destination: RequestDestination
  
  /**
    * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/headers)
    */
  /* standard dom */
  val headers: Headers
  
  /**
    * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/integrity)
    */
  /* standard dom */
  val integrity: java.lang.String
  
  /**
    * Returns a boolean indicating whether or not request can outlive the global in which it was created.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/keepalive)
    */
  /* standard dom */
  val keepalive: scala.Boolean
  
  /**
    * Returns request's HTTP method, which is "GET" by default.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/method)
    */
  /* standard dom */
  val method: java.lang.String
  
  /**
    * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode)
    */
  /* standard dom */
  val mode: RequestMode
  
  /**
    * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect)
    */
  /* standard dom */
  val redirect: RequestRedirect
  
  /**
    * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrer)
    */
  /* standard dom */
  val referrer: java.lang.String
  
  /**
    * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrerPolicy)
    */
  /* standard dom */
  val referrerPolicy: ReferrerPolicy
  
  /**
    * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/signal)
    */
  /* standard dom */
  val signal: AbortSignal
  
  /**
    * Returns the URL of request as a string.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/url)
    */
  /* standard dom */
  val url: java.lang.String
}
object Request {
  
  inline def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: scala.Boolean,
    cache: RequestCache,
    credentials: RequestCredentials,
    destination: RequestDestination,
    formData: () => js.Promise[FormData],
    headers: Headers,
    integrity: java.lang.String,
    json: () => js.Promise[Any],
    keepalive: scala.Boolean,
    method: java.lang.String,
    mode: RequestMode,
    redirect: RequestRedirect,
    referrer: java.lang.String,
    referrerPolicy: ReferrerPolicy,
    signal: AbortSignal,
    text: () => js.Promise[java.lang.String],
    url: java.lang.String
  ): Request = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: RequestDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIntegrity(value: java.lang.String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setKeepalive(value: scala.Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: java.lang.String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setReferrer(value: java.lang.String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
