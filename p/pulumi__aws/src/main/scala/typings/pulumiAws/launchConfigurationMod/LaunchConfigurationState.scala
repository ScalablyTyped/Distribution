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
  def apply(): LaunchConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchConfigurationState]
  }
  @scala.inline
  implicit class LaunchConfigurationStateOps[Self <: LaunchConfigurationState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAssociatePublicIpAddress(value: Input[Boolean]): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("associatePublicIpAddress", js.undefined)
    @scala.inline
    def setEbsBlockDevicesVarargs(value: Input[LaunchConfigurationEbsBlockDevice]*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDevices(value: Input[js.Array[Input[LaunchConfigurationEbsBlockDevice]]]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("ebsBlockDevices", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Input[Boolean]): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    @scala.inline
    def setEnableMonitoring(value: Input[Boolean]): Self = this.set("enableMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMonitoring: Self = this.set("enableMonitoring", js.undefined)
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: Input[LaunchConfigurationEphemeralBlockDevice]*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEphemeralBlockDevices(value: Input[js.Array[Input[LaunchConfigurationEphemeralBlockDevice]]]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEphemeralBlockDevices: Self = this.set("ephemeralBlockDevices", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: Input[String | InstanceProfile]): Self = this.set("iamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("iamInstanceProfile", js.undefined)
    @scala.inline
    def setImageId(value: Input[String]): Self = this.set("imageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setKeyName(value: Input[String]): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setPlacementTenancy(value: Input[String]): Self = this.set("placementTenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementTenancy: Self = this.set("placementTenancy", js.undefined)
    @scala.inline
    def setRootBlockDevice(value: Input[LaunchConfigurationRootBlockDevice]): Self = this.set("rootBlockDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootBlockDevice: Self = this.set("rootBlockDevice", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSpotPrice(value: Input[String]): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotPrice: Self = this.set("spotPrice", js.undefined)
    @scala.inline
    def setUserData(value: Input[String]): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
    @scala.inline
    def setUserDataBase64(value: Input[String]): Self = this.set("userDataBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDataBase64: Self = this.set("userDataBase64", js.undefined)
    @scala.inline
    def setVpcClassicLinkId(value: Input[String]): Self = this.set("vpcClassicLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcClassicLinkId: Self = this.set("vpcClassicLinkId", js.undefined)
    @scala.inline
    def setVpcClassicLinkSecurityGroupsVarargs(value: Input[String]*): Self = this.set("vpcClassicLinkSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setVpcClassicLinkSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("vpcClassicLinkSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcClassicLinkSecurityGroups: Self = this.set("vpcClassicLinkSecurityGroups", js.undefined)
  }
  
}

