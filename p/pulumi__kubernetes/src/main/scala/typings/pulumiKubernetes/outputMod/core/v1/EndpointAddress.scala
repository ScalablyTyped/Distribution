package typings.pulumiKubernetes.outputMod.core.v1

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
  var hostname: String
  
  /**
    * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
    */
  var ip: String
  
  /**
    * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
    */
  var nodeName: String
  
  /**
    * Reference to object providing the endpoint.
    */
  var targetRef: ObjectReference
}
object EndpointAddress {
  
  @scala.inline
  def apply(hostname: String, ip: String, nodeName: String, targetRef: ObjectReference): EndpointAddress = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAddress]
  }
  
  @scala.inline
  implicit class EndpointAddressMutableBuilder[Self <: EndpointAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRef(value: ObjectReference): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
