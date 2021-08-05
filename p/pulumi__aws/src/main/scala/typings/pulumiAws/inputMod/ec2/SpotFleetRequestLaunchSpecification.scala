package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchSpecification extends StObject {
  
  var ami: Input[String]
  
  var associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.undefined
  
  var ebsBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]]]] = js.undefined
  
  var ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
  
  var ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]]]] = js.undefined
  
  var iamInstanceProfile: js.UndefOr[Input[String]] = js.undefined
  
  var iamInstanceProfileArn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The type of instance to request.
    */
  var instanceType: Input[String]
  
  var keyName: js.UndefOr[Input[String]] = js.undefined
  
  var monitoring: js.UndefOr[Input[Boolean]] = js.undefined
  
  var placementGroup: js.UndefOr[Input[String]] = js.undefined
  
  var placementTenancy: js.UndefOr[Input[String]] = js.undefined
  
  var rootBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]]]] = js.undefined
  
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A map of tags to assign to the resource.
    */
  var tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  var userData: js.UndefOr[Input[String]] = js.undefined
  
  var vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: js.UndefOr[Input[String]] = js.undefined
}
object SpotFleetRequestLaunchSpecification {
  
  inline def apply(ami: Input[String], instanceType: Input[String]): SpotFleetRequestLaunchSpecification = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecification]
  }
  
  extension [Self <: SpotFleetRequestLaunchSpecification](x: Self) {
    
    inline def setAmi(value: Input[String]): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddress(value: Input[Boolean]): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
    
    inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setEbsBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]]]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
    
    inline def setEbsBlockDevicesUndefined: Self = StObject.set(x, "ebsBlockDevices", js.undefined)
    
    inline def setEbsBlockDevicesVarargs(value: Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
    
    inline def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
    
    inline def setEphemeralBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]]]): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
    
    inline def setEphemeralBlockDevicesUndefined: Self = StObject.set(x, "ephemeralBlockDevices", js.undefined)
    
    inline def setEphemeralBlockDevicesVarargs(value: Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
    
    inline def setIamInstanceProfile(value: Input[String]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileArn(value: Input[String]): Self = StObject.set(x, "iamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileArnUndefined: Self = StObject.set(x, "iamInstanceProfileArn", js.undefined)
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
    
    inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    inline def setMonitoring(value: Input[Boolean]): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setPlacementGroup(value: Input[String]): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupUndefined: Self = StObject.set(x, "placementGroup", js.undefined)
    
    inline def setPlacementTenancy(value: Input[String]): Self = StObject.set(x, "placementTenancy", value.asInstanceOf[js.Any])
    
    inline def setPlacementTenancyUndefined: Self = StObject.set(x, "placementTenancy", js.undefined)
    
    inline def setRootBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]]]): Self = StObject.set(x, "rootBlockDevices", value.asInstanceOf[js.Any])
    
    inline def setRootBlockDevicesUndefined: Self = StObject.set(x, "rootBlockDevices", js.undefined)
    
    inline def setRootBlockDevicesVarargs(value: Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]*): Self = StObject.set(x, "rootBlockDevices", js.Array(value :_*))
    
    inline def setSpotPrice(value: Input[String]): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
    
    inline def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    
    inline def setWeightedCapacity(value: Input[String]): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacityUndefined: Self = StObject.set(x, "weightedCapacity", js.undefined)
  }
}
