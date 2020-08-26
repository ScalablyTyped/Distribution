package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestLaunchSpecification extends js.Object {
  var ami: Input[String] = js.native
  var associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  var ebsBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]]]] = js.native
  var ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  var ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]]]] = js.native
  var iamInstanceProfile: js.UndefOr[Input[String]] = js.native
  var iamInstanceProfileArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to request.
    */
  var instanceType: Input[String] = js.native
  var keyName: js.UndefOr[Input[String]] = js.native
  var monitoring: js.UndefOr[Input[Boolean]] = js.native
  var placementGroup: js.UndefOr[Input[String]] = js.native
  var placementTenancy: js.UndefOr[Input[String]] = js.native
  var rootBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]]]] = js.native
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: js.UndefOr[Input[String]] = js.native
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  var tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  var userData: js.UndefOr[Input[String]] = js.native
  var vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: js.UndefOr[Input[String]] = js.native
}

object SpotFleetRequestLaunchSpecification {
  @scala.inline
  def apply(ami: Input[String], instanceType: Input[String]): SpotFleetRequestLaunchSpecification = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
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
    def setAmi(value: Input[String]): Self = this.set("ami", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociatePublicIpAddress(value: Input[Boolean]): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("associatePublicIpAddress", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setEbsBlockDevicesVarargs(value: Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]]]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("ebsBlockDevices", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Input[Boolean]): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEphemeralBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]]]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEphemeralBlockDevices: Self = this.set("ephemeralBlockDevices", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: Input[String]): Self = this.set("iamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("iamInstanceProfile", js.undefined)
    @scala.inline
    def setIamInstanceProfileArn(value: Input[String]): Self = this.set("iamInstanceProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfileArn: Self = this.set("iamInstanceProfileArn", js.undefined)
    @scala.inline
    def setKeyName(value: Input[String]): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    @scala.inline
    def setMonitoring(value: Input[Boolean]): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    @scala.inline
    def setPlacementGroup(value: Input[String]): Self = this.set("placementGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementGroup: Self = this.set("placementGroup", js.undefined)
    @scala.inline
    def setPlacementTenancy(value: Input[String]): Self = this.set("placementTenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementTenancy: Self = this.set("placementTenancy", js.undefined)
    @scala.inline
    def setRootBlockDevicesVarargs(value: Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]*): Self = this.set("rootBlockDevices", js.Array(value :_*))
    @scala.inline
    def setRootBlockDevices(value: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]]]): Self = this.set("rootBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootBlockDevices: Self = this.set("rootBlockDevices", js.undefined)
    @scala.inline
    def setSpotPrice(value: Input[String]): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotPrice: Self = this.set("spotPrice", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUserData(value: Input[String]): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
    @scala.inline
    def setWeightedCapacity(value: Input[String]): Self = this.set("weightedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("weightedCapacity", js.undefined)
  }
  
}

