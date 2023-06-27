package typings.sentryReplay.typesTypesReplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayNetworkOptions extends StObject {
  
  /**
    * If request & response bodies should be captured.
    * Only applies to URLs matched by `networkDetailAllowUrls`.
    * Defaults to true.
    */
  var networkCaptureBodies: Boolean
  
  /**
    * Capture request/response details for XHR/Fetch requests that match the given URLs.
    * The URLs can be strings or regular expressions.
    * When provided a string, we will match any URL that contains the given string.
    * You can use a Regex to handle exact matches or more complex matching.
    *
    * Only URLs matching these patterns will have bodies & additional headers captured.
    */
  var networkDetailAllowUrls: js.Array[String | js.RegExp]
  
  /**
    * Capture the following request headers, in addition to the default ones.
    * Only applies to URLs matched by `networkDetailAllowUrls`.
    * Any headers defined here will be captured in addition to the default headers.
    */
  var networkRequestHeaders: js.Array[String]
  
  /**
    * Capture the following response headers, in addition to the default ones.
    * Only applies to URLs matched by `networkDetailAllowUrls`.
    * Any headers defined here will be captured in addition to the default headers.
    */
  var networkResponseHeaders: js.Array[String]
}
object ReplayNetworkOptions {
  
  inline def apply(
    networkCaptureBodies: Boolean,
    networkDetailAllowUrls: js.Array[String | js.RegExp],
    networkRequestHeaders: js.Array[String],
    networkResponseHeaders: js.Array[String]
  ): ReplayNetworkOptions = {
    val __obj = js.Dynamic.literal(networkCaptureBodies = networkCaptureBodies.asInstanceOf[js.Any], networkDetailAllowUrls = networkDetailAllowUrls.asInstanceOf[js.Any], networkRequestHeaders = networkRequestHeaders.asInstanceOf[js.Any], networkResponseHeaders = networkResponseHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayNetworkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayNetworkOptions] (val x: Self) extends AnyVal {
    
    inline def setNetworkCaptureBodies(value: Boolean): Self = StObject.set(x, "networkCaptureBodies", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetailAllowUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "networkDetailAllowUrls", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetailAllowUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "networkDetailAllowUrls", js.Array(value*))
    
    inline def setNetworkRequestHeaders(value: js.Array[String]): Self = StObject.set(x, "networkRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestHeadersVarargs(value: String*): Self = StObject.set(x, "networkRequestHeaders", js.Array(value*))
    
    inline def setNetworkResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "networkResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setNetworkResponseHeadersVarargs(value: String*): Self = StObject.set(x, "networkResponseHeaders", js.Array(value*))
  }
}
