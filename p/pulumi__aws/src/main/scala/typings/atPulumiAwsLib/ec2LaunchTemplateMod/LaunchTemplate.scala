package typings
package atPulumiAwsLib.ec2LaunchTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/launchTemplate", "LaunchTemplate")
@js.native
class LaunchTemplate protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LaunchTemplate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: LaunchTemplateArgs) = this()
  def this(name: java.lang.String, args: LaunchTemplateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specify volumes to attach to the instance besides the volumes specified by the AMI.
    * See Block Devices below for details.
    */
  val blockDeviceMappings: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_DeviceNameEbsNoDevice]]] = js.native
  /**
    * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
    */
  val capacityReservationSpecification: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_CapacityReservationPreference]] = js.native
  /**
    * Customize the credit specification of the instance. See Credit
    * Specification below for more details.
    */
  val creditSpecification: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_CpuCreditsString]] = js.native
  /**
    * The default version of the launch template.
    */
  val defaultVersion: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Description of the launch template.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * If `true`, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * If `true`, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The elastic GPU to attach to the instance. See Elastic GPU
    * below for more details.
    */
  val elasticGpuSpecifications: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_TypeString]]] = js.native
  /**
    * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
    */
  val elasticInferenceAccelerator: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_TypeString]] = js.native
  /**
    * The IAM Instance Profile to launch the instance with. See Instance Profile
    * below for more details.
    */
  val iamInstanceProfile: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ArnName]] = js.native
  /**
    * The AMI from which to launch the instance.
    */
  val imageId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Shutdown behavior for the instance. Can be `stop` or `terminate`.
    * (Default: `stop`).
    */
  val instanceInitiatedShutdownBehavior: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The market (purchasing) option for the instance. See Market Options
    * below for details.
    */
  val instanceMarketOptions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_MarketTypeSpotOptions]] = js.native
  /**
    * The type of the instance.
    */
  val instanceType: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The kernel ID.
    */
  val kernelId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The key name to use for the instance.
    */
  val keyName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The latest version of the launch template.
    */
  val latestVersion: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * A list of license specifications to associate with. See License Specification below for more details.
    */
  val licenseSpecifications: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_LicenseConfigurationArn]]] = js.native
  /**
    * The monitoring option for the instance. See Monitoring below for more details.
    */
  val monitoring: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_EnabledBoolean]] = js.native
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network
    * Interfaces below for more details.
    */
  val networkInterfaces: atPulumiPulumiLib.outputMod.Output[
    js.UndefOr[js.Array[atPulumiAwsLib.Anon_AssociatePublicIpAddressDeleteOnTermination]]
  ] = js.native
  /**
    * The placement of the instance. See Placement below for more details.
    */
  val placement: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AffinityAvailabilityZone]] = js.native
  /**
    * The ID of the RAM disk.
    */
  val ramDiskId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of security group names to associate with. If you are creating Instances in a VPC, use
    * `vpc_security_group_ids` instead.
    */
  val securityGroupNames: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The tags to apply to the resources during launch. See Tag Specifications below for more details.
    */
  val tagSpecifications: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_KeyResourceTypeTags]]] = js.native
  /**
    * A mapping of tags to assign to the launch template.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The Base64-encoded user data to provide when launching the instance.
    */
  val userData: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplateState
  ): atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2LaunchTemplateMod.LaunchTemplate = js.native
  /**
    * Returns true if the given object is an instance of LaunchTemplate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchTemplate.LaunchTemplate */ scala.Boolean = js.native
}

