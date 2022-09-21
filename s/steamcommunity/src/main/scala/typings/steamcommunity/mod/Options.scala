package typings.steamcommunity.mod

import typings.request.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /** The local IP address that `SteamCommunity` will use for its HTTP requests. Overrides an `localAddress` option that was set on the passed-in `request` object. */
  var localAddress: String
  
  /**
    * An instance of {@link https://www.npmjs.com/package/request|request} v2.x.x which will be used by `SteamCommunity` for its HTTP requests.
    * SteamCommunity` will create its own if omitted.
    */
  var request: Request
  
  /**
    * The time in milliseconds that `SteamCommunity` will wait for HTTP requests to complete.
    * Defaults to `50000` (50 seconds). Overrides any `timeout` option that was set on the passed-in `request` object.
    */
  var timeout: Double
  
  /**
    * The user-agent value that `SteamCommunity` will use for its HTTP requests. Defaults to Chrome v47's user-agent.
    * Overrides any `headers['User-Agent']` option that was set on the passed-in `request` object.
    */
  var userAgent: String
}
object Options {
  
  inline def apply(localAddress: String, request: Request, timeout: Double, userAgent: String): Options = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
