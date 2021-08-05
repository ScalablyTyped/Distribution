package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplatePlacement extends StObject {
  
  var affinity: String
  
  var availabilityZone: String
  
  var groupName: String
  
  var hostId: String
  
  var partitionNumber: Double
  
  var spreadDomain: String
  
  var tenancy: String
}
object GetLaunchTemplatePlacement {
  
  inline def apply(
    affinity: String,
    availabilityZone: String,
    groupName: String,
    hostId: String,
    partitionNumber: Double,
    spreadDomain: String,
    tenancy: String
  ): GetLaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], partitionNumber = partitionNumber.asInstanceOf[js.Any], spreadDomain = spreadDomain.asInstanceOf[js.Any], tenancy = tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplatePlacement]
  }
  
  extension [Self <: GetLaunchTemplatePlacement](x: Self) {
    
    inline def setAffinity(value: String): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    inline def setPartitionNumber(value: Double): Self = StObject.set(x, "partitionNumber", value.asInstanceOf[js.Any])
    
    inline def setSpreadDomain(value: String): Self = StObject.set(x, "spreadDomain", value.asInstanceOf[js.Any])
    
    inline def setTenancy(value: String): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
  }
}
