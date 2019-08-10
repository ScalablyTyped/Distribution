package typings.atPulumiAws.ec2LaunchConfigurationMod

import typings.atPulumiAws.Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDevice
import typings.atPulumiAws.Anon_DeleteOnTerminationEncryptedIopsVolumeSize
import typings.atPulumiAws.Anon_DeviceName
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/launchConfiguration", "LaunchConfiguration")
@js.native
class LaunchConfiguration protected () extends CustomResource {
  /**
    * Create a LaunchConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LaunchConfigurationArgs) = this()
  def this(name: String, args: LaunchConfigurationArgs, opts: CustomResourceOptions) = this()
  /**
    * Associate a public ip address with an instance in a VPC.
    */
  val associatePublicIpAddress: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: Output[js.Array[Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDevice]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: Output[Boolean] = js.native
  /**
    * Enables/disables detailed monitoring. This is enabled by default.
    */
  val enableMonitoring: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: Output[js.UndefOr[js.Array[Anon_DeviceName]]] = js.native
  /**
    * The name attribute of the IAM instance profile to associate
    * with launched instances.
    */
  val iamInstanceProfile: Output[js.UndefOr[String]] = js.native
  /**
    * The EC2 image ID to launch.
    */
  val imageId: Output[String] = js.native
  /**
    * The size of instance to launch.
    */
  val instanceType: Output[String] = js.native
  /**
    * The key name that should be used for the instance.
    */
  val keyName: Output[String] = js.native
  /**
    * The name of the launch configuration. If you leave
    * this blank, this provider will auto-generate a unique name.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * The tenancy of the instance. Valid values are
    * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
    * for more details
    */
  val placementTenancy: Output[js.UndefOr[String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: Output[Anon_DeleteOnTerminationEncryptedIopsVolumeSize] = js.native
  /**
    * A list of associated security group IDS.
    */
  val securityGroups: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The maximum price to use for reserving spot instances.
    */
  val spotPrice: Output[js.UndefOr[String]] = js.native
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
    */
  val userData: Output[js.UndefOr[String]] = js.native
  /**
    * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: Output[js.UndefOr[String]] = js.native
  /**
    * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
    */
  val vpcClassicLinkId: Output[js.UndefOr[String]] = js.native
  /**
    * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
    */
  val vpcClassicLinkSecurityGroups: Output[js.UndefOr[js.Array[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/launchConfiguration", "LaunchConfiguration")
@js.native
object LaunchConfiguration extends js.Object {
  /**
    * Get an existing LaunchConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LaunchConfiguration = js.native
  def get(name: String, id: Input[ID], state: LaunchConfigurationState): LaunchConfiguration = js.native
  def get(name: String, id: Input[ID], state: LaunchConfigurationState, opts: CustomResourceOptions): LaunchConfiguration = js.native
  /**
    * Returns true if the given object is an instance of LaunchConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchConfiguration.LaunchConfiguration */ Boolean = js.native
}

