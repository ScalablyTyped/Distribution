package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmiAssociatePublicIpAddress extends js.Object {
  var ami: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var associatePublicIpAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var ebsBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DeleteOnTerminationDeviceName]]]
  ] = js.undefined
  var ebsOptimized: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var ephemeralBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DeviceNameVirtualName]]]
  ] = js.undefined
  var iamInstanceProfile: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var iamInstanceProfileArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var keyName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var monitoring: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var placementGroup: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var placementTenancy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var rootBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[Anon_DeleteOnTerminationIopsVolumeSizeVolumeTypeBoolean]
      ]
    ]
  ] = js.undefined
  var spotPrice: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var userData: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var vpcSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var weightedCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AmiAssociatePublicIpAddress {
  @scala.inline
  def apply(
    ami: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    associatePublicIpAddress: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ebsBlockDevices: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DeleteOnTerminationDeviceName]]] = null,
    ebsOptimized: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ephemeralBlockDevices: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_DeviceNameVirtualName]]] = null,
    iamInstanceProfile: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    iamInstanceProfileArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    keyName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    monitoring: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    placementGroup: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    placementTenancy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rootBlockDevices: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[Anon_DeleteOnTerminationIopsVolumeSizeVolumeTypeBoolean]
      ]
    ] = null,
    spotPrice: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    userData: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    weightedCapacity: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AmiAssociatePublicIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ami")(ami.asInstanceOf[js.Any])
    __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Anon_AmiAssociatePublicIpAddress]
  }
}

