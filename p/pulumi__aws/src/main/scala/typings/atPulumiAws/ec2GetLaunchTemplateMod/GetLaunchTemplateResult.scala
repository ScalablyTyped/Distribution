package typings.atPulumiAws.ec2GetLaunchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplateBlockDeviceMapping
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplateCreditSpecification
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplateElasticGpuSpecification
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplateIamInstanceProfile
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplateInstanceMarketOption
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplateMonitoring
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplateNetworkInterface
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplatePlacement
import typings.atPulumiAws.typesOutputMod.ec2.GetLaunchTemplateTagSpecification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  val arn: String
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    */
  val blockDeviceMappings: js.Array[GetLaunchTemplateBlockDeviceMapping]
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecifications: js.Array[GetLaunchTemplateCreditSpecification]
  /**
    * The default version of the launch template.
    */
  val defaultVersion: Double
  /**
    * Description of the launch template.
    */
  val description: String
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: Boolean
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: String
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: js.Array[GetLaunchTemplateElasticGpuSpecification]
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfiles: js.Array[GetLaunchTemplateIamInstanceProfile]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: String
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: String
  /**
    * The market (purchasing) option for the instance.
    * below for details.
    */
  val instanceMarketOptions: js.Array[GetLaunchTemplateInstanceMarketOption]
  /**
    * The type of the instance.
    */
  val instanceType: String
  /**
    * The kernel ID.
    */
  val kernelId: String
  /**
    * The key name to use for the instance.
    */
  val keyName: String
  /**
    * The latest version of the launch template.
    */
  val latestVersion: Double
  /**
    * The monitoring option for the instance.
    */
  val monitorings: js.Array[GetLaunchTemplateMonitoring]
  val name: String
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: js.Array[GetLaunchTemplateNetworkInterface]
  /**
    * The placement of the instance.
    */
  val placements: js.Array[GetLaunchTemplatePlacement]
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: String
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpcSecurityGroupIds` instead.
    */
  val securityGroupNames: js.Array[String]
  /**
    * The tags to apply to the resources during launch.
    */
  val tagSpecifications: js.Array[GetLaunchTemplateTagSpecification]
  /**
    * (Optional) A mapping of tags to assign to the launch template.
    */
  val tags: StringDictionary[js.Any]
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: String
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.Array[String]
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
    val __obj = js.Dynamic.literal(arn = arn, blockDeviceMappings = blockDeviceMappings, creditSpecifications = creditSpecifications, defaultVersion = defaultVersion, description = description, disableApiTermination = disableApiTermination, ebsOptimized = ebsOptimized, elasticGpuSpecifications = elasticGpuSpecifications, iamInstanceProfiles = iamInstanceProfiles, id = id, imageId = imageId, instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior, instanceMarketOptions = instanceMarketOptions, instanceType = instanceType, kernelId = kernelId, keyName = keyName, latestVersion = latestVersion, monitorings = monitorings, name = name, networkInterfaces = networkInterfaces, placements = placements, ramDiskId = ramDiskId, securityGroupNames = securityGroupNames, tagSpecifications = tagSpecifications, tags = tags, userData = userData, vpcSecurityGroupIds = vpcSecurityGroupIds)
  
    __obj.asInstanceOf[GetLaunchTemplateResult]
  }
}

