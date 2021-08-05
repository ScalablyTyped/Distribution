package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchSpecification extends StObject {
  
  var ami: String
  
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: String
  
  var ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice]
  
  var ebsOptimized: js.UndefOr[Boolean] = js.undefined
  
  var ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]
  
  var iamInstanceProfile: js.UndefOr[String] = js.undefined
  
  var iamInstanceProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * The type of instance to request.
    */
  var instanceType: String
  
  var keyName: String
  
  var monitoring: js.UndefOr[Boolean] = js.undefined
  
  var placementGroup: String
  
  var placementTenancy: js.UndefOr[String] = js.undefined
  
  var rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice]
  
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: String
  
  /**
    * A map of tags to assign to the resource.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var userData: js.UndefOr[String] = js.undefined
  
  var vpcSecurityGroupIds: js.Array[String]
  
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: js.UndefOr[String] = js.undefined
}
object SpotFleetRequestLaunchSpecification {
  
  inline def apply(
    ami: String,
    availabilityZone: String,
    ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice],
    ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice],
    instanceType: String,
    keyName: String,
    placementGroup: String,
    rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice],
    subnetId: String,
    vpcSecurityGroupIds: js.Array[String]
  ): SpotFleetRequestLaunchSpecification = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecification]
  }
  
  extension [Self <: SpotFleetRequestLaunchSpecification](x: Self) {
    
    inline def setAmi(value: String): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setEbsBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
    
    inline def setEbsBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationEbsBlockDevice*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
    
    inline def setEphemeralBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
    
    inline def setEphemeralBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationEphemeralBlockDevice*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
    
    inline def setIamInstanceProfile(value: String): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileArn(value: String): Self = StObject.set(x, "iamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileArnUndefined: Self = StObject.set(x, "iamInstanceProfileArn", js.undefined)
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setPlacementGroup(value: String): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
    
    inline def setPlacementTenancy(value: String): Self = StObject.set(x, "placementTenancy", value.asInstanceOf[js.Any])
    
    inline def setPlacementTenancyUndefined: Self = StObject.set(x, "placementTenancy", js.undefined)
    
    inline def setRootBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice]): Self = StObject.set(x, "rootBlockDevices", value.asInstanceOf[js.Any])
    
    inline def setRootBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationRootBlockDevice*): Self = StObject.set(x, "rootBlockDevices", js.Array(value :_*))
    
    inline def setSpotPrice(value: String): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    
    inline def setWeightedCapacity(value: String): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacityUndefined: Self = StObject.set(x, "weightedCapacity", js.undefined)
  }
}
