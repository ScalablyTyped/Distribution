package typings
package atPulumiAwsLib.ec2LaunchConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/launchConfiguration", "LaunchConfiguration")
@js.native
class LaunchConfiguration protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LaunchConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LaunchConfigurationArgs) = this()
  def this(name: java.lang.String, args: LaunchConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Associate a public ip address with an instance in a VPC.
    */
  val associatePublicIpAddress: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDevice]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Enables/disables detailed monitoring. This is enabled by default.
    */
  val enableMonitoring: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_DeviceName]]] = js.native
  /**
    * The name attribute of the IAM instance profile to associate
    * with launched instances.
    */
  val iamInstanceProfile: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The EC2 image ID to launch.
    */
  val imageId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The size of instance to launch.
    */
  val instanceType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The key name that should be used for the instance.
    */
  val keyName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the launch configuration. If you leave
    * this blank, Terraform will auto-generate a unique name.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The tenancy of the instance. Valid values are
    * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
    * for more details
    */
  val placementTenancy: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeSizeVolumeType] = js.native
  /**
    * A list of associated security group IDS.
    */
  val securityGroups: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The maximum price to use for reserving spot instances.
    */
  val spotPrice: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `user_data_base64` instead.
    */
  val userData: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Can be used instead of `user_data` to pass base64-encoded binary data directly. Use this instead of `user_data` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
    */
  val vpcClassicLinkId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
    */
  val vpcClassicLinkSecurityGroups: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfigurationState
  ): atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfigurationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2LaunchConfigurationMod.LaunchConfiguration = js.native
  /**
    * Returns true if the given object is an instance of LaunchConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchConfiguration.LaunchConfiguration */ scala.Boolean = js.native
}

