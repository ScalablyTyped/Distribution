package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var host: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    */
  var httpHeaders: js.UndefOr[Input[js.Array[Input[HTTPHeader]]]] = js.undefined
  
  /**
    * Path to access on the HTTP server.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Input[Double | String]
  
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP.
    */
  var scheme: js.UndefOr[Input[String]] = js.undefined
}
object HTTPGetAction {
  
  inline def apply(port: Input[Double | String]): HTTPGetAction = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPGetAction]
  }
  
  extension [Self <: HTTPGetAction](x: Self) {
    
    inline def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttpHeaders(value: Input[js.Array[Input[HTTPHeader]]]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    inline def setHttpHeadersVarargs(value: Input[HTTPHeader]*): Self = StObject.set(x, "httpHeaders", js.Array(value :_*))
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Input[Double | String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: Input[String]): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
