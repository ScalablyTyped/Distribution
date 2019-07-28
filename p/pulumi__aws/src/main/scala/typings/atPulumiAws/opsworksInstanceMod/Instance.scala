package typings.atPulumiAws.opsworksInstanceMod

import typings.atPulumiAws.Anon_DeleteOnTerminationDeviceNameIops
import typings.atPulumiAws.Anon_DeleteOnTerminationIopsVolumeSizeVolumeType
import typings.atPulumiAws.Anon_DeviceName
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/instance", "Instance")
@js.native
class Instance protected () extends CustomResource {
  /**
    * Create a Instance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InstanceArgs) = this()
  def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  /**
    * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
    */
  val agentVersion: Output[js.UndefOr[String]] = js.native
  /**
    * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
    */
  val amiId: Output[String] = js.native
  /**
    * Machine architecture for created instances.  Can be either `"x86_64"` (the default) or `"i386"`
    */
  val architecture: Output[js.UndefOr[String]] = js.native
  /**
    * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
    */
  val autoScalingType: Output[js.UndefOr[String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default.
    */
  val availabilityZone: Output[String] = js.native
  val createdAt: Output[String] = js.native
  val deleteEbs: Output[js.UndefOr[Boolean]] = js.native
  val deleteEip: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: Output[js.Array[Anon_DeleteOnTerminationDeviceNameIops]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: Output[js.UndefOr[Boolean]] = js.native
  /**
    * EC2 instance ID
    */
  val ec2InstanceId: Output[String] = js.native
  val ecsClusterArn: Output[String] = js.native
  val elasticIp: Output[String] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: Output[js.Array[Anon_DeviceName]] = js.native
  /**
    * The instance's host name.
    */
  val hostname: Output[String] = js.native
  val infrastructureClass: Output[String] = js.native
  /**
    * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
    */
  val installUpdatesOnBoot: Output[js.UndefOr[Boolean]] = js.native
  val instanceProfileArn: Output[String] = js.native
  /**
    * The type of instance to start
    */
  val instanceType: Output[js.UndefOr[String]] = js.native
  val lastServiceErrorId: Output[String] = js.native
  /**
    * The ids of the layers the instance will belong to.
    */
  val layerIds: Output[js.Array[String]] = js.native
  /**
    * Name of operating system that will be installed.
    */
  val os: Output[String] = js.native
  val platform: Output[String] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: Output[String] = js.native
  /**
    * The private IP address assigned to the instance
    */
  val privateIp: Output[String] = js.native
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: Output[String] = js.native
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: Output[String] = js.native
  val registeredBy: Output[String] = js.native
  val reportedAgentVersion: Output[String] = js.native
  val reportedOsFamily: Output[String] = js.native
  val reportedOsName: Output[String] = js.native
  val reportedOsVersion: Output[String] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevices: Output[js.Array[Anon_DeleteOnTerminationIopsVolumeSizeVolumeType]] = js.native
  /**
    * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
    */
  val rootDeviceType: Output[String] = js.native
  val rootDeviceVolumeId: Output[String] = js.native
  /**
    * The associated security groups.
    */
  val securityGroupIds: Output[js.Array[String]] = js.native
  val sshHostDsaKeyFingerprint: Output[String] = js.native
  val sshHostRsaKeyFingerprint: Output[String] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val sshKeyName: Output[String] = js.native
  /**
    * The id of the stack the instance will belong to.
    */
  val stackId: Output[String] = js.native
  /**
    * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
    */
  val state: Output[js.UndefOr[String]] = js.native
  val status: Output[String] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: Output[String] = js.native
  /**
    * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
    */
  val tenancy: Output[String] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either `"paravirtual"` or `"hvm"`.
    */
  val virtualizationType: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = js.native
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ Boolean = js.native
}

