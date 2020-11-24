package typings.pulumiAws.launchTemplateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.LaunchTemplateBlockDeviceMapping
import typings.pulumiAws.outputMod.ec2.LaunchTemplateCapacityReservationSpecification
import typings.pulumiAws.outputMod.ec2.LaunchTemplateCpuOptions
import typings.pulumiAws.outputMod.ec2.LaunchTemplateCreditSpecification
import typings.pulumiAws.outputMod.ec2.LaunchTemplateElasticGpuSpecification
import typings.pulumiAws.outputMod.ec2.LaunchTemplateElasticInferenceAccelerator
import typings.pulumiAws.outputMod.ec2.LaunchTemplateHibernationOptions
import typings.pulumiAws.outputMod.ec2.LaunchTemplateIamInstanceProfile
import typings.pulumiAws.outputMod.ec2.LaunchTemplateInstanceMarketOptions
import typings.pulumiAws.outputMod.ec2.LaunchTemplateLicenseSpecification
import typings.pulumiAws.outputMod.ec2.LaunchTemplateMetadataOptions
import typings.pulumiAws.outputMod.ec2.LaunchTemplateMonitoring
import typings.pulumiAws.outputMod.ec2.LaunchTemplateNetworkInterface
import typings.pulumiAws.outputMod.ec2.LaunchTemplatePlacement
import typings.pulumiAws.outputMod.ec2.LaunchTemplateTagSpecification
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/launchTemplate", "LaunchTemplate")
@js.native
class LaunchTemplate protected () extends CustomResource {
  /**
    * Create a LaunchTemplate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: LaunchTemplateArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: LaunchTemplateArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    * See Block Devices below for details.
    */
  val blockDeviceMappings: Output_[js.UndefOr[js.Array[LaunchTemplateBlockDeviceMapping]]] = js.native
  
  /**
    * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
    */
  val capacityReservationSpecification: Output_[js.UndefOr[LaunchTemplateCapacityReservationSpecification]] = js.native
  
  /**
    * The CPU options for the instance. See CPU Options below for more details.
    */
  val cpuOptions: Output_[js.UndefOr[LaunchTemplateCpuOptions]] = js.native
  
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecification: Output_[js.UndefOr[LaunchTemplateCreditSpecification]] = js.native
  
  /**
    * Default Version of the launch template.
    */
  val defaultVersion: Output_[Double] = js.native
  
  /**
    * Description of the launch template.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: Output_[js.UndefOr[js.Array[LaunchTemplateElasticGpuSpecification]]] = js.native
  
  /**
    * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
    */
  val elasticInferenceAccelerator: Output_[js.UndefOr[LaunchTemplateElasticInferenceAccelerator]] = js.native
  
  /**
    * The hibernation options for the instance. See Hibernation Options below for more details.
    */
  val hibernationOptions: Output_[js.UndefOr[LaunchTemplateHibernationOptions]] = js.native
  
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfile: Output_[js.UndefOr[LaunchTemplateIamInstanceProfile]] = js.native
  
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The market (purchasing) option for the instance. See Market Options
    * below for details.
    */
  val instanceMarketOptions: Output_[js.UndefOr[LaunchTemplateInstanceMarketOptions]] = js.native
  
  /**
    * The type of the instance.
    */
  val instanceType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The kernel ID.
    */
  val kernelId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The key name to use for the instance.
    */
  val keyName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The latest version of the launch template.
    */
  val latestVersion: Output_[Double] = js.native
  
  /**
    * A list of license specifications to associate with. See License Specification below for more details.
    */
  val licenseSpecifications: Output_[js.UndefOr[js.Array[LaunchTemplateLicenseSpecification]]] = js.native
  
  /**
    * Customize the metadata options for the instance. See Metadata Options below for more details.
    */
  val metadataOptions: Output_[LaunchTemplateMetadataOptions] = js.native
  
  /**
    * The monitoring option for the instance. See Monitoring below for more details.
    */
  val monitoring: Output_[js.UndefOr[LaunchTemplateMonitoring]] = js.native
  
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  val name: Output_[String] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: Output_[js.UndefOr[js.Array[LaunchTemplateNetworkInterface]]] = js.native
  
  /**
    * The placement of the instance. See Placement below for more details.
    */
  val placement: Output_[js.UndefOr[LaunchTemplatePlacement]] = js.native
  
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpcSecurityGroupIds` instead.
    */
  val securityGroupNames: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The tags to apply to the resources during launch. See Tag Specifications below for more details.
    */
  val tagSpecifications: Output_[js.UndefOr[js.Array[LaunchTemplateTagSpecification]]] = js.native
  
  /**
    * A map of tags to assign to the launch template.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Whether to update Default Version each update. Conflicts with `defaultVersion`.
    */
  val updateDefaultVersion: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/launchTemplate", "LaunchTemplate")
@js.native
object LaunchTemplate extends js.Object {
  
  /**
    * Get an existing LaunchTemplate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LaunchTemplate = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LaunchTemplate = js.native
  def get(name: String, id: Input[ID], state: LaunchTemplateState): LaunchTemplate = js.native
  def get(name: String, id: Input[ID], state: LaunchTemplateState, opts: CustomResourceOptions): LaunchTemplate = js.native
  
  /**
    * Returns true if the given object is an instance of LaunchTemplate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchTemplate.LaunchTemplate */ Boolean = js.native
}
