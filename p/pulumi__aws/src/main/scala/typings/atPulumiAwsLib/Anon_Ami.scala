package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ami extends js.Object {
  var ami: java.lang.String
  var associatePublicIpAddress: js.UndefOr[scala.Boolean] = js.undefined
  var availabilityZone: java.lang.String
  var ebsBlockDevices: js.Array[Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeSize]
  var ebsOptimized: js.UndefOr[scala.Boolean] = js.undefined
  var ephemeralBlockDevices: js.Array[Anon_DeviceName]
  var iamInstanceProfile: js.UndefOr[java.lang.String] = js.undefined
  var iamInstanceProfileArn: js.UndefOr[java.lang.String] = js.undefined
  var instanceType: java.lang.String
  var keyName: java.lang.String
  var monitoring: js.UndefOr[scala.Boolean] = js.undefined
  var placementGroup: java.lang.String
  var placementTenancy: js.UndefOr[java.lang.String] = js.undefined
  var rootBlockDevices: js.Array[Anon_DeleteOnTerminationIopsVolumeSizeVolumeType]
  var spotPrice: js.UndefOr[java.lang.String] = js.undefined
  var subnetId: java.lang.String
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var userData: js.UndefOr[java.lang.String] = js.undefined
  var vpcSecurityGroupIds: js.Array[java.lang.String]
  var weightedCapacity: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Ami {
  @scala.inline
  def apply(
    ami: java.lang.String,
    availabilityZone: java.lang.String,
    ebsBlockDevices: js.Array[Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeSize],
    ephemeralBlockDevices: js.Array[Anon_DeviceName],
    instanceType: java.lang.String,
    keyName: java.lang.String,
    placementGroup: java.lang.String,
    rootBlockDevices: js.Array[Anon_DeleteOnTerminationIopsVolumeSizeVolumeType],
    subnetId: java.lang.String,
    vpcSecurityGroupIds: js.Array[java.lang.String],
    associatePublicIpAddress: js.UndefOr[scala.Boolean] = js.undefined,
    ebsOptimized: js.UndefOr[scala.Boolean] = js.undefined,
    iamInstanceProfile: java.lang.String = null,
    iamInstanceProfileArn: java.lang.String = null,
    monitoring: js.UndefOr[scala.Boolean] = js.undefined,
    placementTenancy: java.lang.String = null,
    spotPrice: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    userData: java.lang.String = null,
    weightedCapacity: java.lang.String = null
  ): Anon_Ami = {
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
    __obj.asInstanceOf[Anon_Ami]
  }
}

