package typings
package atPulumiAwsLib.opsworksInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/instance", "Instance")
@js.native
class Instance protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Instance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: InstanceArgs) = this()
  def this(name: java.lang.String, args: InstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
    */
  val agentVersion: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
    */
  val amiId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Machine architecture for created instances.  Can be either `"x86_64"` (the default) or `"i386"`
    */
  val architecture: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
    */
  val autoScalingType: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default.
    */
  val availabilityZone: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val createdAt: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val deleteEbs: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val deleteEip: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameIops]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * EC2 instance ID
    */
  val ec2InstanceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val ecsClusterArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val elasticIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DeviceName]] = js.native
  /**
    * The instance's host name.
    */
  val hostname: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val infrastructureClass: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
    */
  val installUpdatesOnBoot: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val instanceProfileArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type of instance to start
    */
  val instanceType: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val lastServiceErrorId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ids of the layers the instance will belong to.
    */
  val layerIds: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Name of operating system that will be installed.
    */
  val os: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val platform: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The private IP address assigned to the instance
    */
  val privateIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val registeredBy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val reportedAgentVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val reportedOsFamily: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val reportedOsName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val reportedOsVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevices: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeSizeVolumeType]] = js.native
  /**
    * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
    */
  val rootDeviceType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val rootDeviceVolumeId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The associated security groups.
    */
  val securityGroupIds: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  val sshHostDsaKeyFingerprint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val sshHostRsaKeyFingerprint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val sshKeyName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The id of the stack the instance will belong to.
    */
  val stackId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
    */
  val state: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val status: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
    */
  val tenancy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either `"paravirtual"` or `"hvm"`.
    */
  val virtualizationType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/opsworks/instance", "Instance")
@js.native
object Instance extends js.Object {
  /**
    * Get an existing Instance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksInstanceMod.InstanceState
  ): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksInstanceMod.InstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ scala.Boolean = js.native
}

