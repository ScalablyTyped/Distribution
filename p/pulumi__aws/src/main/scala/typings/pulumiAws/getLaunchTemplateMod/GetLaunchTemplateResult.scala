package typings.pulumiAws.getLaunchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateBlockDeviceMapping
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateCreditSpecification
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateElasticGpuSpecification
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateIamInstanceProfile
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateInstanceMarketOption
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateMonitoring
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateNetworkInterface
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplatePlacement
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateTagSpecification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  val arn: String = js.native
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    */
  val blockDeviceMappings: js.Array[GetLaunchTemplateBlockDeviceMapping] = js.native
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecifications: js.Array[GetLaunchTemplateCreditSpecification] = js.native
  /**
    * The default version of the launch template.
    */
  val defaultVersion: Double = js.native
  /**
    * Description of the launch template.
    */
  val description: String = js.native
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: Boolean = js.native
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: String = js.native
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: js.Array[GetLaunchTemplateElasticGpuSpecification] = js.native
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfiles: js.Array[GetLaunchTemplateIamInstanceProfile] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: String = js.native
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: String = js.native
  /**
    * The market (purchasing) option for the instance.
    * below for details.
    */
  val instanceMarketOptions: js.Array[GetLaunchTemplateInstanceMarketOption] = js.native
  /**
    * The type of the instance.
    */
  val instanceType: String = js.native
  /**
    * The kernel ID.
    */
  val kernelId: String = js.native
  /**
    * The key name to use for the instance.
    */
  val keyName: String = js.native
  /**
    * The latest version of the launch template.
    */
  val latestVersion: Double = js.native
  /**
    * The monitoring option for the instance.
    */
  val monitorings: js.Array[GetLaunchTemplateMonitoring] = js.native
  val name: String = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: js.Array[GetLaunchTemplateNetworkInterface] = js.native
  /**
    * The placement of the instance.
    */
  val placements: js.Array[GetLaunchTemplatePlacement] = js.native
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: String = js.native
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpcSecurityGroupIds` instead.
    */
  val securityGroupNames: js.Array[String] = js.native
  /**
    * The tags to apply to the resources during launch.
    */
  val tagSpecifications: js.Array[GetLaunchTemplateTagSpecification] = js.native
  /**
    * (Optional) A mapping of tags to assign to the launch template.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: String = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.Array[String] = js.native
}

object GetLaunchTemplateResult {
  @scala.inline
  def apply(
    arn: String,
    blockDeviceMappings: js.Array[GetLaunchTemplateBlockDeviceMapping],
    creditSpecifications: js.Array[GetLaunchTemplateCreditSpecification],
    defaultVersion: Double,
    description: String,
    disableApiTermination: Boolean,
    ebsOptimized: String,
    elasticGpuSpecifications: js.Array[GetLaunchTemplateElasticGpuSpecification],
    iamInstanceProfiles: js.Array[GetLaunchTemplateIamInstanceProfile],
    id: String,
    imageId: String,
    instanceInitiatedShutdownBehavior: String,
    instanceMarketOptions: js.Array[GetLaunchTemplateInstanceMarketOption],
    instanceType: String,
    kernelId: String,
    keyName: String,
    latestVersion: Double,
    monitorings: js.Array[GetLaunchTemplateMonitoring],
    name: String,
    networkInterfaces: js.Array[GetLaunchTemplateNetworkInterface],
    placements: js.Array[GetLaunchTemplatePlacement],
    ramDiskId: String,
    securityGroupNames: js.Array[String],
    tagSpecifications: js.Array[GetLaunchTemplateTagSpecification],
    tags: StringDictionary[js.Any],
    userData: String,
    vpcSecurityGroupIds: js.Array[String]
  ): GetLaunchTemplateResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], blockDeviceMappings = blockDeviceMappings.asInstanceOf[js.Any], creditSpecifications = creditSpecifications.asInstanceOf[js.Any], defaultVersion = defaultVersion.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disableApiTermination = disableApiTermination.asInstanceOf[js.Any], ebsOptimized = ebsOptimized.asInstanceOf[js.Any], elasticGpuSpecifications = elasticGpuSpecifications.asInstanceOf[js.Any], iamInstanceProfiles = iamInstanceProfiles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.asInstanceOf[js.Any], instanceMarketOptions = instanceMarketOptions.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], kernelId = kernelId.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], monitorings = monitorings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkInterfaces = networkInterfaces.asInstanceOf[js.Any], placements = placements.asInstanceOf[js.Any], ramDiskId = ramDiskId.asInstanceOf[js.Any], securityGroupNames = securityGroupNames.asInstanceOf[js.Any], tagSpecifications = tagSpecifications.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateResult]
  }
}

