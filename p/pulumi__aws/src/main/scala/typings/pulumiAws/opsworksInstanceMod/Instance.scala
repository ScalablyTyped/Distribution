package typings.pulumiAws.opsworksInstanceMod

import typings.pulumiAws.outputMod.opsworks.InstanceEbsBlockDevice
import typings.pulumiAws.outputMod.opsworks.InstanceEphemeralBlockDevice
import typings.pulumiAws.outputMod.opsworks.InstanceRootBlockDevice
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val agentVersion: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
    */
  val amiId: Output_[String] = js.native
  
  /**
    * Machine architecture for created instances.  Can be either `"x8664"` (the default) or `"i386"`
    */
  val architecture: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
    */
  val autoScalingType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Name of the availability zone where instances will be created
    * by default.
    */
  val availabilityZone: Output_[String] = js.native
  
  val createdAt: Output_[String] = js.native
  
  val deleteEbs: Output_[js.UndefOr[Boolean]] = js.native
  
  val deleteEip: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: Output_[js.Array[InstanceEbsBlockDevice]] = js.native
  
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * EC2 instance ID
    */
  val ec2InstanceId: Output_[String] = js.native
  
  val ecsClusterArn: Output_[String] = js.native
  
  val elasticIp: Output_[String] = js.native
  
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: Output_[js.Array[InstanceEphemeralBlockDevice]] = js.native
  
  /**
    * The instance's host name.
    */
  val hostname: Output_[String] = js.native
  
  val infrastructureClass: Output_[String] = js.native
  
  /**
    * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
    */
  val installUpdatesOnBoot: Output_[js.UndefOr[Boolean]] = js.native
  
  val instanceProfileArn: Output_[String] = js.native
  
  /**
    * The type of instance to start
    */
  val instanceType: Output_[js.UndefOr[String]] = js.native
  
  val lastServiceErrorId: Output_[String] = js.native
  
  /**
    * The ids of the layers the instance will belong to.
    */
  val layerIds: Output_[js.Array[String]] = js.native
  
  /**
    * Name of operating system that will be installed.
    */
  val os: Output_[String] = js.native
  
  val platform: Output_[String] = js.native
  
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: Output_[String] = js.native
  
  /**
    * The private IP address assigned to the instance
    */
  val privateIp: Output_[String] = js.native
  
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: Output_[String] = js.native
  
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: Output_[String] = js.native
  
  val registeredBy: Output_[String] = js.native
  
  val reportedAgentVersion: Output_[String] = js.native
  
  val reportedOsFamily: Output_[String] = js.native
  
  val reportedOsName: Output_[String] = js.native
  
  val reportedOsVersion: Output_[String] = js.native
  
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevices: Output_[js.Array[InstanceRootBlockDevice]] = js.native
  
  /**
    * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
    */
  val rootDeviceType: Output_[String] = js.native
  
  val rootDeviceVolumeId: Output_[String] = js.native
  
  /**
    * The associated security groups.
    */
  val securityGroupIds: Output_[js.Array[String]] = js.native
  
  val sshHostDsaKeyFingerprint: Output_[String] = js.native
  
  val sshHostRsaKeyFingerprint: Output_[String] = js.native
  
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val sshKeyName: Output_[String] = js.native
  
  /**
    * The id of the stack the instance will belong to.
    */
  val stackId: Output_[String] = js.native
  
  /**
    * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
    */
  val state: Output_[js.UndefOr[String]] = js.native
  
  val status: Output_[String] = js.native
  
  /**
    * Subnet ID to attach to
    */
  val subnetId: Output_[String] = js.native
  
  /**
    * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
    */
  val tenancy: Output_[String] = js.native
  
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either `"paravirtual"` or `"hvm"`.
    */
  val virtualizationType: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Instance = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState): Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = js.native
  
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/instance.Instance */ Boolean = js.native
}
