package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoadBalancerSubnetMapping extends StObject {
  
  var allocationId: String
  
  var outpostId: String
  
  var privateIpv4Address: String
  
  var subnetId: String
}
object GetLoadBalancerSubnetMapping {
  
  inline def apply(allocationId: String, outpostId: String, privateIpv4Address: String, subnetId: String): GetLoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], outpostId = outpostId.asInstanceOf[js.Any], privateIpv4Address = privateIpv4Address.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerSubnetMapping]
  }
  
  extension [Self <: GetLoadBalancerSubnetMapping](x: Self) {
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
    
    inline def setOutpostId(value: String): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpv4Address(value: String): Self = StObject.set(x, "privateIpv4Address", value.asInstanceOf[js.Any])
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
