package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
@js.native
trait HTTPGetAction extends StObject {
  
  /**
    * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
    */
  var host: js.UndefOr[Input[String]] = js.native
  
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    */
  var httpHeaders: js.UndefOr[Input[js.Array[Input[HTTPHeader]]]] = js.native
  
  /**
    * Path to access on the HTTP server.
    */
  var path: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Input[Double | String] = js.native
  
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP.
    */
  var scheme: js.UndefOr[Input[String]] = js.native
}
object HTTPGetAction {
  
  @scala.inline
  def apply(port: Input[Double | String]): HTTPGetAction = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPGetAction]
  }
  
  @scala.inline
  implicit class HTTPGetActionMutableBuilder[Self <: HTTPGetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: Input[js.Array[Input[HTTPHeader]]]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    @scala.inline
    def setHttpHeadersVarargs(value: Input[HTTPHeader]*): Self = StObject.set(x, "httpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double | String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: Input[String]): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
