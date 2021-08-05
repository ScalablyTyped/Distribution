package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
trait HTTPGetAction extends StObject {
  
  /**
    * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
    */
  var host: String
  
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    */
  var httpHeaders: js.Array[HTTPHeader]
  
  /**
    * Path to access on the HTTP server.
    */
  var path: String
  
  /**
    * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Double | String
  
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP.
    */
  var scheme: String
}
object HTTPGetAction {
  
  inline def apply(
    host: String,
    httpHeaders: js.Array[HTTPHeader],
    path: String,
    port: Double | String,
    scheme: String
  ): HTTPGetAction = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPGetAction]
  }
  
  extension [Self <: HTTPGetAction](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaders(value: js.Array[HTTPHeader]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpHeadersVarargs(value: HTTPHeader*): Self = StObject.set(x, "httpHeaders", js.Array(value :_*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
