package typings
package atPulumiAwsLib.ec2GetLaunchTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  val arn: java.lang.String
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    */
  val blockDeviceMappings: js.Array[atPulumiAwsLib.Anon_DeviceNameEbs]
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecifications: js.Array[atPulumiAwsLib.Anon_CpuCredits]
  /**
    * The default version of the launch template.
    */
  val defaultVersion: scala.Double
  /**
    * Description of the launch template.
    */
  val description: java.lang.String
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: scala.Boolean
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: java.lang.String
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: js.Array[atPulumiAwsLib.Anon_TypeString]
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfiles: js.Array[atPulumiAwsLib.Anon_Arn]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: java.lang.String
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: java.lang.String
  /**
    * The market (purchasing) option for the instance.
    * below for details.
    */
  val instanceMarketOptions: js.Array[atPulumiAwsLib.Anon_MarketType]
  /**
    * The type of the instance.
    */
  val instanceType: java.lang.String
  /**
    * The kernel ID.
    */
  val kernelId: java.lang.String
  /**
    * The key name to use for the instance.
    */
  val keyName: java.lang.String
  /**
    * The latest version of the launch template.
    */
  val latestVersion: scala.Double
  /**
    * The monitoring option for the instance.
    */
  val monitorings: js.Array[atPulumiAwsLib.Anon_EnabledBoolean_1082978225]
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: js.Array[atPulumiAwsLib.Anon_AssociatePublicIpAddress]
  /**
    * The placement of the instance.
    */
  val placements: js.Array[atPulumiAwsLib.Anon_Affinity]
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: java.lang.String
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpc_security_group_ids` instead.
    */
  val securityGroupNames: js.Array[java.lang.String]
  /**
    * The tags to apply to the resources during launch.
    */
  val tagSpecifications: js.Array[atPulumiAwsLib.Anon_KeyResourceType]
  /**
    * (Optional) A mapping of tags to assign to the launch template.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: java.lang.String
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.Array[java.lang.String]
}

object GetLaunchTemplateResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    blockDeviceMappings: js.Array[atPulumiAwsLib.Anon_DeviceNameEbs],
    creditSpecifications: js.Array[atPulumiAwsLib.Anon_CpuCredits],
    defaultVersion: scala.Double,
    description: java.lang.String,
    disableApiTermination: scala.Boolean,
    ebsOptimized: java.lang.String,
    elasticGpuSpecifications: js.Array[atPulumiAwsLib.Anon_TypeString],
    iamInstanceProfiles: js.Array[atPulumiAwsLib.Anon_Arn],
    id: java.lang.String,
    imageId: java.lang.String,
    instanceInitiatedShutdownBehavior: java.lang.String,
    instanceMarketOptions: js.Array[atPulumiAwsLib.Anon_MarketType],
    instanceType: java.lang.String,
    kernelId: java.lang.String,
    keyName: java.lang.String,
    latestVersion: scala.Double,
    monitorings: js.Array[atPulumiAwsLib.Anon_EnabledBoolean_1082978225],
    networkInterfaces: js.Array[atPulumiAwsLib.Anon_AssociatePublicIpAddress],
    placements: js.Array[atPulumiAwsLib.Anon_Affinity],
    ramDiskId: java.lang.String,
    securityGroupNames: js.Array[java.lang.String],
    tagSpecifications: js.Array[atPulumiAwsLib.Anon_KeyResourceType],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    userData: java.lang.String,
    vpcSecurityGroupIds: js.Array[java.lang.String]
  ): GetLaunchTemplateResult = {
    val __obj = js.Dynamic.literal(arn = arn, blockDeviceMappings = blockDeviceMappings, creditSpecifications = creditSpecifications, defaultVersion = defaultVersion, description = description, disableApiTermination = disableApiTermination, ebsOptimized = ebsOptimized, elasticGpuSpecifications = elasticGpuSpecifications, iamInstanceProfiles = iamInstanceProfiles, id = id, imageId = imageId, instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior, instanceMarketOptions = instanceMarketOptions, instanceType = instanceType, kernelId = kernelId, keyName = keyName, latestVersion = latestVersion, monitorings = monitorings, networkInterfaces = networkInterfaces, placements = placements, ramDiskId = ramDiskId, securityGroupNames = securityGroupNames, tagSpecifications = tagSpecifications, tags = tags, userData = userData, vpcSecurityGroupIds = vpcSecurityGroupIds)
  
    __obj.asInstanceOf[GetLaunchTemplateResult]
  }
}

