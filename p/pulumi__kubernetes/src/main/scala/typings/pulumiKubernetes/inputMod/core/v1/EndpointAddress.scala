package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointAddress is a tuple that describes single IP address.
  */
@js.native
trait EndpointAddress extends js.Object {
  
  /**
    * The Hostname of this endpoint
    */
  var hostname: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
    */
  var ip: Input[String] = js.native
  
  /**
    * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
    */
  var nodeName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Reference to object providing the endpoint.
    */
  var targetRef: js.UndefOr[Input[ObjectReference]] = js.native
}
object EndpointAddress {
  
  @scala.inline
  def apply(ip: Input[String]): EndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAddress]
  }
  
  @scala.inline
  implicit class EndpointAddressOps[Self <: EndpointAddress] (val x: Self) extends AnyVal {
    
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
    def setIp(value: Input[String]): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: Input[String]): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setNodeName(value: Input[String]): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeName: Self = this.set("nodeName", js.undefined)
    
    @scala.inline
    def setTargetRef(value: Input[ObjectReference]): Self = this.set("targetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRef: Self = this.set("targetRef", js.undefined)
  }
}
