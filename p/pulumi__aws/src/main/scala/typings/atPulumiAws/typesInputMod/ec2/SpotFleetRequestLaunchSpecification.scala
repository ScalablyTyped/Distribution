package typings.atPulumiAws.typesInputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotFleetRequestLaunchSpecification extends js.Object {
  var ami: Input[String]
  var associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.undefined
  var availabilityZone: js.UndefOr[Input[String]] = js.undefined
  var ebsBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]]]] = js.undefined
  var ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
  var ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]]]] = js.undefined
  var iamInstanceProfile: js.UndefOr[Input[String]] = js.undefined
  var iamInstanceProfileArn: js.UndefOr[Input[String]] = js.undefined
  var instanceType: Input[String]
  var keyName: js.UndefOr[Input[String]] = js.undefined
  var monitoring: js.UndefOr[Input[Boolean]] = js.undefined
  var placementGroup: js.UndefOr[Input[String]] = js.undefined
  var placementTenancy: js.UndefOr[Input[String]] = js.undefined
  var rootBlockDevices: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]]]] = js.undefined
  /**
    * The maximum bid price per unit hour.
    */
  var spotPrice: js.UndefOr[Input[String]] = js.undefined
  var subnetId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var userData: js.UndefOr[Input[String]] = js.undefined
  var vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var weightedCapacity: js.UndefOr[Input[String]] = js.undefined
}

object SpotFleetRequestLaunchSpecification {
  @scala.inline
  def apply(
    ami: Input[String],
    instanceType: Input[String],
    associatePublicIpAddress: Input[Boolean] = null,
    availabilityZone: Input[String] = null,
    ebsBlockDevices: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEbsBlockDevice]]] = null,
    ebsOptimized: Input[Boolean] = null,
    ephemeralBlockDevices: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]]] = null,
    iamInstanceProfile: Input[String] = null,
    iamInstanceProfileArn: Input[String] = null,
    keyName: Input[String] = null,
    monitoring: Input[Boolean] = null,
    placementGroup: Input[String] = null,
    placementTenancy: Input[String] = null,
    rootBlockDevices: Input[js.Array[Input[SpotFleetRequestLaunchSpecificationRootBlockDevice]]] = null,
    spotPrice: Input[String] = null,
    subnetId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    userData: Input[String] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null,
    weightedCapacity: Input[String] = null
  ): SpotFleetRequestLaunchSpecification = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (associatePublicIpAddress != null) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (iamInstanceProfile != null) __obj.updateDynamic("iamInstanceProfile")(iamInstanceProfile.asInstanceOf[js.Any])
    if (iamInstanceProfileArn != null) __obj.updateDynamic("iamInstanceProfileArn")(iamInstanceProfileArn.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (monitoring != null) __obj.updateDynamic("monitoring")(monitoring.asInstanceOf[js.Any])
    if (placementGroup != null) __obj.updateDynamic("placementGroup")(placementGroup.asInstanceOf[js.Any])
    if (placementTenancy != null) __obj.updateDynamic("placementTenancy")(placementTenancy.asInstanceOf[js.Any])
    if (rootBlockDevices != null) __obj.updateDynamic("rootBlockDevices")(rootBlockDevices.asInstanceOf[js.Any])
    if (spotPrice != null) __obj.updateDynamic("spotPrice")(spotPrice.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    if (weightedCapacity != null) __obj.updateDynamic("weightedCapacity")(weightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecification]
  }
}

