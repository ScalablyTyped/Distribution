package typings.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerSubnetMapping extends StObject {
  
  var allocationId: String = js.native
  
  var outpostId: String = js.native
  
  var privateIpv4Address: String = js.native
  
  var subnetId: String = js.native
}
object GetLoadBalancerSubnetMapping {
  
  @scala.inline
  def apply(allocationId: String, outpostId: String, privateIpv4Address: String, subnetId: String): GetLoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], outpostId = outpostId.asInstanceOf[js.Any], privateIpv4Address = privateIpv4Address.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerSubnetMapping]
  }
  
  @scala.inline
  implicit class GetLoadBalancerSubnetMappingMutableBuilder[Self <: GetLoadBalancerSubnetMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: String): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostId(value: String): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpv4Address(value: String): Self = StObject.set(x, "privateIpv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
