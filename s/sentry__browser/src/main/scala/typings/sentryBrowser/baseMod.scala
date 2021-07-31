package typings.sentryBrowser

import typings.sentryBrowser.anon.Headers
import typings.sentryCore.mod.API
import typings.sentryTypes.responseMod.Response
import typings.sentryTypes.transportMod.Transport
import typings.sentryTypes.transportMod.TransportOptions
import typings.sentryUtils.mod.PromiseBuffer
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@sentry/browser/dist/transports/base", "BaseTransport")
  @js.native
  abstract class BaseTransport protected ()
    extends StObject
       with Transport {
    def this(options: TransportOptions) = this()
    
    /** Helper to get Sentry API endpoints. */
    val _api: API = js.native
    
    /** A simple buffer holding all requests. */
    val _buffer: PromiseBuffer[Response] = js.native
    
    /**
      * Gets the time that given category is disabled until for rate limiting
      */
    /* protected */ def _disabledUntil(category: String): Date = js.native
    
    /**
      * Sets internal _rateLimits from incoming headers. Returns true if headers contains a non-empty rate limiting header.
      */
    /* protected */ def _handleRateLimit(headers: Record[String, String | Null]): Boolean = js.native
    
    /**
      * Handle Sentry repsonse for promise-based transports.
      */
    /* protected */ def _handleResponse(hasRequestTypeResponseHeadersResolveReject: Headers): Unit = js.native
    
    /**
      * Checks if a category is rate limited
      */
    /* protected */ def _isRateLimited(category: String): Boolean = js.native
    
    /** Locks transport after receiving rate limits in a response */
    val _rateLimits: Record[String, Date] = js.native
    
    var options: TransportOptions = js.native
    
    /**
      * @deprecated
      */
    var url: String = js.native
  }
}
