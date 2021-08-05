package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerSubnetMapping extends StObject {
  
  /**
    * The allocation ID of the Elastic IP address.
    */
  var allocationId: js.UndefOr[String] = js.undefined
  
  var outpostId: String
  
  /**
    * A private ipv4 address within the subnet to assign to the internal-facing load balancer.
    */
  var privateIpv4Address: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
    */
  var subnetId: String
}
object LoadBalancerSubnetMapping {
  
  inline def apply(outpostId: String, subnetId: String): LoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(outpostId = outpostId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerSubnetMapping]
  }
  
  extension [Self <: LoadBalancerSubnetMapping](x: Self) {
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "allocationId", js.undefined)
    
    inline def setOutpostId(value: String): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv4Address(value: String): Self = StObject.set(x, "privateIpv4Address", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv4AddressUndefined: Self = StObject.set(x, "privateIpv4Address", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
