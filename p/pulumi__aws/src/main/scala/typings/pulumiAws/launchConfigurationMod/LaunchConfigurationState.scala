package typings.pulumiAws.launchConfigurationMod

import typings.pulumiAws.iamMod.InstanceProfile
import typings.pulumiAws.inputMod.ec2.LaunchConfigurationEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.LaunchConfigurationEphemeralBlockDevice
import typings.pulumiAws.inputMod.ec2.LaunchConfigurationRootBlockDevice
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationState extends js.Object {
  /**
    * The Amazon Resource Name of the launch configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Associate a public ip address with an instance in a VPC.
    */
  val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[LaunchConfigurationEbsBlockDevice]]]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enables/disables detailed monitoring. This is enabled by default.
    */
  val enableMonitoring: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[LaunchConfigurationEphemeralBlockDevice]]]] = js.native
  /**
    * The name attribute of the IAM instance profile to associate
    * with launched instances.
    */
  val iamInstanceProfile: js.UndefOr[Input[String | InstanceProfile]] = js.native
  /**
    * The EC2 image ID to launch.
    */
  val imageId: js.UndefOr[Input[String]] = js.native
  /**
    * The size of instance to launch.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  /**
    * The key name that should be used for the instance.
    */
  val keyName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the launch configuration. If you leave
    * this blank, this provider will auto-generate a unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The tenancy of the instance. Valid values are
    * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
    * for more details
    */
  val placementTenancy: js.UndefOr[Input[String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: js.UndefOr[Input[LaunchConfigurationRootBlockDevice]] = js.native
  /**
    * A list of associated security group IDS.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The maximum price to use for reserving spot instances.
    */
  val spotPrice: js.UndefOr[Input[String]] = js.native
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
    */
  val userData: js.UndefOr[Input[String]] = js.native
  /**
    * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
    */
  val vpcClassicLinkId: js.UndefOr[Input[String]] = js.native
  /**
    * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
    */
  val vpcClassicLinkSecurityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object LaunchConfigurationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    associatePublicIpAddress: Input[Boolean] = null,
    ebsBlockDevices: Input[js.Array[Input[LaunchConfigurationEbsBlockDevice]]] = null,
    ebsOptimized: Input[Boolean] = null,
    enableMonitoring: Input[Boolean] = null,
    ephemeralBlockDevices: Input[js.Array[Input[LaunchConfigurationEphemeralBlockDevice]]] = null,
    iamInstanceProfile: Input[String | InstanceProfile] = null,
    imageId: Input[String] = null,
    instanceType: Input[String] = null,
    keyName: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    placementTenancy: Input[String] = null,
    rootBlockDevice: Input[LaunchConfigurationRootBlockDevice] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    spotPrice: Input[String] = null,
    userData: Input[String] = null,
    userDataBase64: Input[String] = null,
    vpcClassicLinkId: Input[String] = null,
    vpcClassicLinkSecurityGroups: Input[js.Array[Input[String]]] = null
  ): LaunchConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (associatePublicIpAddress != null) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (enableMonitoring != null) __obj.updateDynamic("enableMonitoring")(enableMonitoring.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (iamInstanceProfile != null) __obj.updateDynamic("iamInstanceProfile")(iamInstanceProfile.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (placementTenancy != null) __obj.updateDynamic("placementTenancy")(placementTenancy.asInstanceOf[js.Any])
    if (rootBlockDevice != null) __obj.updateDynamic("rootBlockDevice")(rootBlockDevice.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (spotPrice != null) __obj.updateDynamic("spotPrice")(spotPrice.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (userDataBase64 != null) __obj.updateDynamic("userDataBase64")(userDataBase64.asInstanceOf[js.Any])
    if (vpcClassicLinkId != null) __obj.updateDynamic("vpcClassicLinkId")(vpcClassicLinkId.asInstanceOf[js.Any])
    if (vpcClassicLinkSecurityGroups != null) __obj.updateDynamic("vpcClassicLinkSecurityGroups")(vpcClassicLinkSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationState]
  }
}

