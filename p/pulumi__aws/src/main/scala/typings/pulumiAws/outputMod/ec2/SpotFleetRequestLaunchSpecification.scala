package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestLaunchSpecification extends js.Object {
  var ami: String = js.native
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.native
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: String = js.native
  var ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice] = js.native
  var ebsOptimized: js.UndefOr[Boolean] = js.native
  var ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice] = js.native
  var iamInstanceProfile: js.UndefOr[String] = js.native
  var iamInstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * The type of instance to request.
    */
  var instanceType: String = js.native
  var keyName: String = js.native
  var monitoring: js.UndefOr[Boolean] = js.native
  var placementGroup: String = js.native
  var placementTenancy: js.UndefOr[String] = js.native
  var rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice] = js.native
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: js.UndefOr[String] = js.native
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: String = js.native
  /**
    * A map of tags to assign to the resource.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  var userData: js.UndefOr[String] = js.native
  var vpcSecurityGroupIds: js.Array[String] = js.native
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: js.UndefOr[String] = js.native
}

object SpotFleetRequestLaunchSpecification {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class SpotFleetRequestLaunchSpecificationOps[Self <: SpotFleetRequestLaunchSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmi(value: String): Self = this.set("ami", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setEbsBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationEbsBlockDevice*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationEphemeralBlockDevice*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEphemeralBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacementGroup(value: String): Self = this.set("placementGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationRootBlockDevice*): Self = this.set("rootBlockDevices", js.Array(value :_*))
    @scala.inline
    def setRootBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice]): Self = this.set("rootBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: js.Array[String]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("associatePublicIpAddress", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: String): Self = this.set("iamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("iamInstanceProfile", js.undefined)
    @scala.inline
    def setIamInstanceProfileArn(value: String): Self = this.set("iamInstanceProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfileArn: Self = this.set("iamInstanceProfileArn", js.undefined)
    @scala.inline
    def setMonitoring(value: Boolean): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    @scala.inline
    def setPlacementTenancy(value: String): Self = this.set("placementTenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementTenancy: Self = this.set("placementTenancy", js.undefined)
    @scala.inline
    def setSpotPrice(value: String): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotPrice: Self = this.set("spotPrice", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUserData(value: String): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
    @scala.inline
    def setWeightedCapacity(value: String): Self = this.set("weightedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("weightedCapacity", js.undefined)
  }
  
}

