package typings
package atPulumiAwsLib.opsworksInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/instance", "Instance")
@js.native
class Instance protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
  val agentVersion: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
    */
  val amiId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Machine architecture for created instances.  Can be either `"x86_64"` (the default) or `"i386"`
    */
  val architecture: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
    */
  val autoScalingType: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default.
    */
  val availabilityZone: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val createdAt: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val deleteEbs: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val deleteEip: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_DeviceNameVolumeTypeIops]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * EC2 instance ID
    */
  val ec2InstanceId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val ecsClusterArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val elasticIp: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_DeviceNameVirtualName]] = js.native
  /**
    * The instance's host name.
    */
  val hostname: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val infrastructureClass: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
    */
  val installUpdatesOnBoot: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val instanceProfileArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The type of instance to start
    */
  val instanceType: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val lastServiceErrorId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ids of the layers the instance will belong to.
    */
  val layerIds: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Name of operating system that will be installed.
    */
  val os: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val platform: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The private IP address assigned to the instance
    */
  val privateIp: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val registeredBy: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val reportedAgentVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val reportedOsFamily: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val reportedOsName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val reportedOsVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevices: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationVolumeTypeIopsVolumeSize]] = js.native
  /**
    * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
    */
  val rootDeviceType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val rootDeviceVolumeId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The associated security groups.
    */
  val securityGroupIds: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  val sshHostDsaKeyFingerprint: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val sshHostRsaKeyFingerprint: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val sshKeyName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The id of the stack the instance will belong to.
    */
  val stackId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
    */
  val state: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
    */
  val tenancy: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either `"paravirtual"` or `"hvm"`.
    */
  val virtualizationType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksInstanceMod.InstanceState
  ): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksInstanceMod.InstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksInstanceMod.Instance = js.native
}

