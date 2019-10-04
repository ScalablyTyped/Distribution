package typings.atPulumiAws.typesOutputMod.ec2Ns

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotFleetRequestLaunchSpecification extends js.Object {
  var ami: String
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  var availabilityZone: String
  var ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice]
  var ebsOptimized: js.UndefOr[Boolean] = js.undefined
  var ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]
  var iamInstanceProfile: js.UndefOr[String] = js.undefined
  var iamInstanceProfileArn: js.UndefOr[String] = js.undefined
  var instanceType: String
  var keyName: String
  var monitoring: js.UndefOr[Boolean] = js.undefined
  var placementGroup: String
  var placementTenancy: js.UndefOr[String] = js.undefined
  var rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice]
  /**
    * The maximum bid price per unit hour.
    */
  var spotPrice: js.UndefOr[String] = js.undefined
  var subnetId: String
  /**
    * A mapping of tags to assign to the resource.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var userData: js.UndefOr[String] = js.undefined
  var vpcSecurityGroupIds: js.Array[String]
  var weightedCapacity: js.UndefOr[String] = js.undefined
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
    val __obj = js.Dynamic.literal(ami = ami, availabilityZone = availabilityZone, ebsBlockDevices = ebsBlockDevices, ephemeralBlockDevices = ephemeralBlockDevices, instanceType = instanceType, keyName = keyName, placementGroup = placementGroup, rootBlockDevices = rootBlockDevices, subnetId = subnetId, vpcSecurityGroupIds = vpcSecurityGroupIds)
    if (!js.isUndefined(associatePublicIpAddress)) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress)
    if (!js.isUndefined(ebsOptimized)) __obj.updateDynamic("ebsOptimized")(ebsOptimized)
    if (iamInstanceProfile != null) __obj.updateDynamic("iamInstanceProfile")(iamInstanceProfile)
    if (iamInstanceProfileArn != null) __obj.updateDynamic("iamInstanceProfileArn")(iamInstanceProfileArn)
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring)
    if (placementTenancy != null) __obj.updateDynamic("placementTenancy")(placementTenancy)
    if (spotPrice != null) __obj.updateDynamic("spotPrice")(spotPrice)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    if (weightedCapacity != null) __obj.updateDynamic("weightedCapacity")(weightedCapacity)
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecification]
  }
}

