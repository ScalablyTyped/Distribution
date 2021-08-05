package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkInterfaceAssociation extends StObject {
  
  /**
    * The allocation ID.
    */
  var allocationId: String
  
  /**
    * The association ID.
    */
  var associationId: String
  
  /**
    * The ID of the Elastic IP address owner.
    */
  var ipOwnerId: String
  
  /**
    * The public DNS name.
    */
  var publicDnsName: String
  
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var publicIp: String
}
object GetNetworkInterfaceAssociation {
  
  inline def apply(
    allocationId: String,
    associationId: String,
    ipOwnerId: String,
    publicDnsName: String,
    publicIp: String
  ): GetNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], associationId = associationId.asInstanceOf[js.Any], ipOwnerId = ipOwnerId.asInstanceOf[js.Any], publicDnsName = publicDnsName.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceAssociation]
  }
  
  extension [Self <: GetNetworkInterfaceAssociation](x: Self) {
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationId(value: String): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
    
    inline def setIpOwnerId(value: String): Self = StObject.set(x, "ipOwnerId", value.asInstanceOf[js.Any])
    
    inline def setPublicDnsName(value: String): Self = StObject.set(x, "publicDnsName", value.asInstanceOf[js.Any])
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
  }
}
