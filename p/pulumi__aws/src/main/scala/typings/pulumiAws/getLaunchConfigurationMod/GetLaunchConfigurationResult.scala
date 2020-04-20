package typings.pulumiAws.getLaunchConfigurationMod

import typings.pulumiAws.outputMod.ec2.GetLaunchConfigurationEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.GetLaunchConfigurationEphemeralBlockDevice
import typings.pulumiAws.outputMod.ec2.GetLaunchConfigurationRootBlockDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchConfigurationResult extends js.Object {
  /**
    * The Amazon Resource Name of the launch configuration.
    */
  val arn: String = js.native
  /**
    * Whether a Public IP address is associated with the instance.
    */
  val associatePublicIpAddress: Boolean = js.native
  /**
    * The EBS Block Devices attached to the instance.
    */
  val ebsBlockDevices: js.Array[GetLaunchConfigurationEbsBlockDevice] = js.native
  /**
    * Whether the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: Boolean = js.native
  /**
    * Whether Detailed Monitoring is Enabled.
    */
  val enableMonitoring: Boolean = js.native
  /**
    * The Ephemeral volumes on the instance.
    */
  val ephemeralBlockDevices: js.Array[GetLaunchConfigurationEphemeralBlockDevice] = js.native
  /**
    * The IAM Instance Profile to associate with launched instances.
    */
  val iamInstanceProfile: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The EC2 Image ID of the instance.
    */
  val imageId: String = js.native
  /**
    * The Instance Type of the instance to launch.
    */
  val instanceType: String = js.native
  /**
    * The Key Name that should be used for the instance.
    */
  val keyName: String = js.native
  /**
    * The Name of the launch configuration.
    */
  val name: String = js.native
  /**
    * The Tenancy of the instance.
    */
  val placementTenancy: String = js.native
  /**
    * The Root Block Device of the instance.
    */
  val rootBlockDevices: js.Array[GetLaunchConfigurationRootBlockDevice] = js.native
  /**
    * A list of associated Security Group IDS.
    */
  val securityGroups: js.Array[String] = js.native
  /**
    * The Price to use for reserving Spot instances.
    */
  val spotPrice: String = js.native
  /**
    * The User Data of the instance.
    */
  val userData: String = js.native
  /**
    * The ID of a ClassicLink-enabled VPC.
    */
  val vpcClassicLinkId: String = js.native
  /**
    * The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
    */
  val vpcClassicLinkSecurityGroups: js.Array[String] = js.native
}

object GetLaunchConfigurationResult {
  @scala.inline
  def apply(
    arn: String,
    associatePublicIpAddress: Boolean,
    ebsBlockDevices: js.Array[GetLaunchConfigurationEbsBlockDevice],
    ebsOptimized: Boolean,
    enableMonitoring: Boolean,
    ephemeralBlockDevices: js.Array[GetLaunchConfigurationEphemeralBlockDevice],
    iamInstanceProfile: String,
    id: String,
    imageId: String,
    instanceType: String,
    keyName: String,
    name: String,
    placementTenancy: String,
    rootBlockDevices: js.Array[GetLaunchConfigurationRootBlockDevice],
    securityGroups: js.Array[String],
    spotPrice: String,
    userData: String,
    vpcClassicLinkId: String,
    vpcClassicLinkSecurityGroups: js.Array[String]
  ): GetLaunchConfigurationResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], associatePublicIpAddress = associatePublicIpAddress.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ebsOptimized = ebsOptimized.asInstanceOf[js.Any], enableMonitoring = enableMonitoring.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], iamInstanceProfile = iamInstanceProfile.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], placementTenancy = placementTenancy.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], spotPrice = spotPrice.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], vpcClassicLinkId = vpcClassicLinkId.asInstanceOf[js.Any], vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationResult]
  }
}

