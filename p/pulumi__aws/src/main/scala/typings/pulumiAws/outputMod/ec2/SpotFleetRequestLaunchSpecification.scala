package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestLaunchSpecification extends js.Object {
  var ami: String = js.native
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.native
  var availabilityZone: String = js.native
  var ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice] = js.native
  var ebsOptimized: js.UndefOr[Boolean] = js.native
  var ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice] = js.native
  var iamInstanceProfile: js.UndefOr[String] = js.native
  var iamInstanceProfileArn: js.UndefOr[String] = js.native
  var instanceType: String = js.native
  var keyName: String = js.native
  var monitoring: js.UndefOr[Boolean] = js.native
  var placementGroup: String = js.native
  var placementTenancy: js.UndefOr[String] = js.native
  var rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice] = js.native
  /**
    * The maximum bid price per unit hour.
    */
  var spotPrice: js.UndefOr[String] = js.native
  var subnetId: String = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  var userData: js.UndefOr[String] = js.native
  var vpcSecurityGroupIds: js.Array[String] = js.native
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
    vpcSecurityGroupIds: js.Array[String],
    associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
    ebsOptimized: js.UndefOr[Boolean] = js.undefined,
    iamInstanceProfile: String = null,
    iamInstanceProfileArn: String = null,
    monitoring: js.UndefOr[Boolean] = js.undefined,
    placementTenancy: String = null,
    spotPrice: String = null,
    tags: StringDictionary[js.Any] = null,
    userData: String = null,
    weightedCapacity: String = null
  ): SpotFleetRequestLaunchSpecification = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    if (!js.isUndefined(associatePublicIpAddress)) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ebsOptimized)) __obj.updateDynamic("ebsOptimized")(ebsOptimized.get.asInstanceOf[js.Any])
    if (iamInstanceProfile != null) __obj.updateDynamic("iamInstanceProfile")(iamInstanceProfile.asInstanceOf[js.Any])
    if (iamInstanceProfileArn != null) __obj.updateDynamic("iamInstanceProfileArn")(iamInstanceProfileArn.asInstanceOf[js.Any])
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring.get.asInstanceOf[js.Any])
    if (placementTenancy != null) __obj.updateDynamic("placementTenancy")(placementTenancy.asInstanceOf[js.Any])
    if (spotPrice != null) __obj.updateDynamic("spotPrice")(spotPrice.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (weightedCapacity != null) __obj.updateDynamic("weightedCapacity")(weightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecification]
  }
}

