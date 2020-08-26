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
    * The provider-assigned unique ID for this managed resource.
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
  @scala.inline
  implicit class GetLaunchConfigurationResultOps[Self <: GetLaunchConfigurationResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setEbsBlockDevicesVarargs(value: GetLaunchConfigurationEbsBlockDevice*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDevices(value: js.Array[GetLaunchConfigurationEbsBlockDevice]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableMonitoring(value: Boolean): Self = this.set("enableMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: GetLaunchConfigurationEphemeralBlockDevice*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEphemeralBlockDevices(value: js.Array[GetLaunchConfigurationEphemeralBlockDevice]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setIamInstanceProfile(value: String): Self = this.set("iamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacementTenancy(value: String): Self = this.set("placementTenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootBlockDevicesVarargs(value: GetLaunchConfigurationRootBlockDevice*): Self = this.set("rootBlockDevices", js.Array(value :_*))
    @scala.inline
    def setRootBlockDevices(value: js.Array[GetLaunchConfigurationRootBlockDevice]): Self = this.set("rootBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotPrice(value: String): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserData(value: String): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcClassicLinkId(value: String): Self = this.set("vpcClassicLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcClassicLinkSecurityGroupsVarargs(value: String*): Self = this.set("vpcClassicLinkSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setVpcClassicLinkSecurityGroups(value: js.Array[String]): Self = this.set("vpcClassicLinkSecurityGroups", value.asInstanceOf[js.Any])
  }
  
}

