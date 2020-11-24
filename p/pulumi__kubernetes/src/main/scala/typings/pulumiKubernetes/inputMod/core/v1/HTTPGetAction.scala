package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
@js.native
trait HTTPGetAction extends js.Object {
  
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
  implicit class HTTPGetActionOps[Self <: HTTPGetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPort(value: Input[Double | String]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Input[String]): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttpHeadersVarargs(value: Input[HTTPHeader]*): Self = this.set("httpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setHttpHeaders(value: Input[js.Array[Input[HTTPHeader]]]): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHeaders: Self = this.set("httpHeaders", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setScheme(value: Input[String]): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
}
