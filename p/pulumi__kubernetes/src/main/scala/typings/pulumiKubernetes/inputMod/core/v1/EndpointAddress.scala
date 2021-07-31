package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointAddress is a tuple that describes single IP address.
  */
trait EndpointAddress extends StObject {
  
  /**
    * The Hostname of this endpoint
    */
  var hostname: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
    */
  var ip: Input[String]
  
  /**
    * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
    */
  var nodeName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Reference to object providing the endpoint.
    */
  var targetRef: js.UndefOr[Input[ObjectReference]] = js.undefined
}
object EndpointAddress {
  
  @scala.inline
  def apply(ip: Input[String]): EndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAddress]
  }
  
  @scala.inline
  implicit class EndpointAddressMutableBuilder[Self <: EndpointAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: Input[String]): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setIp(value: Input[String]): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: Input[String]): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
    
    @scala.inline
    def setTargetRef(value: Input[ObjectReference]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
  }
}
