package typings.atPulumiAws.ec2GetLaunchConfigurationMod

import typings.atPulumiAws.Anon_DeleteOnTerminationDeviceNameEncrypted
import typings.atPulumiAws.Anon_DeleteOnTerminationIopsVolumeSize
import typings.atPulumiAws.Anon_DeviceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchConfigurationResult extends js.Object {
  /**
    * Whether a Public IP address is associated with the instance.
    */
  val associatePublicIpAddress: Boolean
  /**
    * The EBS Block Devices attached to the instance.
    */
  val ebsBlockDevices: js.Array[Anon_DeleteOnTerminationDeviceNameEncrypted]
  /**
    * Whether the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: Boolean
  /**
    * Whether Detailed Monitoring is Enabled.
    */
  val enableMonitoring: Boolean
  /**
    * The Ephemeral volumes on the instance.
    */
  val ephemeralBlockDevices: js.Array[Anon_DeviceName]
  /**
    * The IAM Instance Profile to associate with launched instances.
    */
  val iamInstanceProfile: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The EC2 Image ID of the instance.
    */
  val imageId: String
  /**
    * The Instance Type of the instance to launch.
    */
  val instanceType: String
  /**
    * The Key Name that should be used for the instance.
    */
  val keyName: String
  /**
    * The Name of the launch configuration.
    */
  val name: String
  /**
    * The Tenancy of the instance.
    */
  val placementTenancy: String
  /**
    * The Root Block Device of the instance.
    */
  val rootBlockDevices: js.Array[Anon_DeleteOnTerminationIopsVolumeSize]
  /**
    * A list of associated Security Group IDS.
    */
  val securityGroups: js.Array[String]
  /**
    * The Price to use for reserving Spot instances.
    */
  val spotPrice: String
  /**
    * The User Data of the instance.
    */
  val userData: String
  /**
    * The ID of a ClassicLink-enabled VPC.
    */
  val vpcClassicLinkId: String
  /**
    * The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
    */
  val vpcClassicLinkSecurityGroups: js.Array[String]
}

object GetLaunchConfigurationResult {
  @scala.inline
  def apply(
    associatePublicIpAddress: Boolean,
    ebsBlockDevices: js.Array[Anon_DeleteOnTerminationDeviceNameEncrypted],
    ebsOptimized: Boolean,
    enableMonitoring: Boolean,
    ephemeralBlockDevices: js.Array[Anon_DeviceName],
    iamInstanceProfile: String,
    id: String,
    imageId: String,
    instanceType: String,
    keyName: String,
    name: String,
    placementTenancy: String,
    rootBlockDevices: js.Array[Anon_DeleteOnTerminationIopsVolumeSize],
    securityGroups: js.Array[String],
    spotPrice: String,
    userData: String,
    vpcClassicLinkId: String,
    vpcClassicLinkSecurityGroups: js.Array[String]
  ): GetLaunchConfigurationResult = {
    val __obj = js.Dynamic.literal(associatePublicIpAddress = associatePublicIpAddress, ebsBlockDevices = ebsBlockDevices, ebsOptimized = ebsOptimized, enableMonitoring = enableMonitoring, ephemeralBlockDevices = ephemeralBlockDevices, iamInstanceProfile = iamInstanceProfile, id = id, imageId = imageId, instanceType = instanceType, keyName = keyName, name = name, placementTenancy = placementTenancy, rootBlockDevices = rootBlockDevices, securityGroups = securityGroups, spotPrice = spotPrice, userData = userData, vpcClassicLinkId = vpcClassicLinkId, vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups)
  
    __obj.asInstanceOf[GetLaunchConfigurationResult]
  }
}

