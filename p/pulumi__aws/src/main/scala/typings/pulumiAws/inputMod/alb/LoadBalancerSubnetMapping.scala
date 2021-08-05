package typings.pulumiAws.inputMod.alb

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerSubnetMapping extends StObject {
  
  /**
    * The allocation ID of the Elastic IP address.
    */
  var allocationId: js.UndefOr[Input[String]] = js.undefined
  
  var outpostId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A private ipv4 address within the subnet to assign to the internal-facing load balancer.
    */
  var privateIpv4Address: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
    */
  var subnetId: Input[String]
}
object LoadBalancerSubnetMapping {
  
  inline def apply(subnetId: Input[String]): LoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerSubnetMapping]
  }
  
  extension [Self <: LoadBalancerSubnetMapping](x: Self) {
    
    inline def setAllocationId(value: Input[String]): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "allocationId", js.undefined)
    
    inline def setOutpostId(value: Input[String]): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdUndefined: Self = StObject.set(x, "outpostId", js.undefined)
    
    inline def setPrivateIpv4Address(value: Input[String]): Self = StObject.set(x, "privateIpv4Address", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv4AddressUndefined: Self = StObject.set(x, "privateIpv4Address", js.undefined)
    
    inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
