package typings
package atPulumiAwsLib.ec2InstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/instance", "Instance")
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
    * The AMI to use for the instance.
    */
  val ami: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the instance.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Associate a public ip address with an instance in a VPC.  Boolean value.
    */
  val associatePublicIpAddress: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The AZ to start the instance in.
    */
  val availabilityZone: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Sets the number of CPU cores for an instance. This option is
    * only supported on creation of instance type that support CPU Options
    * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
    */
  val cpuCoreCount: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
    */
  val cpuThreadsPerCore: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Customize the credit specification of the instance. See Credit Specification below for more details.
    */
  val creditSpecification: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_CpuCreditsString]] = js.native
  /**
    * If true, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
    */
  val ebsBlockDevices: atPulumiPulumiLib.outputMod.Output[
    js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeId]
  ] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    * Note that if this is not set on an instance type that is optimized by default then
    * this will show as disabled but if the instance type is optimized by default then
    * there is no need to set this and there is no effect to disabling it.
    * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
    */
  val ebsOptimized: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DeviceNameNoDevice]] = js.native
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `password_data` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
    */
  val hostId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The IAM Instance Profile to
    * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
    * * `ipv6_address_count`- (Optional) A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
    */
  val iamInstanceProfile: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Shutdown behavior for the
    * instance. Amazon defaults this to `stop` for EBS-backed instances and
    * `terminate` for instance-store instances. Cannot be set on instance-store
    * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
    */
  val instanceInitiatedShutdownBehavior: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val instanceState: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
    */
  val instanceType: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.ec2InstanceTypeMod.InstanceType] = js.native
  val ipv6AddressCount: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
    */
  val ipv6Addresses: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The key name of the Key Pair to use for the instance; which can be managed using the `aws_key_pair` resource.
    */
  val keyName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
    */
  val monitoring: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
    */
  val networkInterfaces: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceIndex]] = js.native
  /**
    * Base-64 encoded encrypted password data for the instance.
    * Useful for getting the administrator password for instances running Microsoft Windows.
    * This attribute is only exported if `get_password_data` is true.
    * Note that this encrypted value will be stored in the state file, as with all exported attributes.
    * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val passwordData: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Placement Group to start the instance in.
    */
  val placementGroup: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the instance's primary network interface.
    */
  val primaryNetworkInterfaceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Private IP address to associate with the
    * instance in a VPC.
    */
  val privateIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The public IP address assigned to the instance, if applicable. **NOTE**: If you are using an [`aws_eip`](https://www.terraform.io/docs/providers/aws/r/eip.html) with your instance, you should refer to the EIP's address directly and not use `public_ip`, as this field will change after the EIP is attached.
    */
  val publicIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeId] = js.native
  /**
    * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
    */
  val securityGroups: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Controls if traffic is routed to the instance when
    * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
    */
  val sourceDestCheck: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The VPC Subnet ID to launch in.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
    */
  val tenancy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `user_data_base64` instead.
    */
  val userData: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Can be used instead of `user_data` to pass base64-encoded binary data directly. Use this instead of `user_data` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A mapping of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: atPulumiPulumiLib.outputMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/instance", "Instance")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2InstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2InstanceMod.InstanceState
  ): atPulumiAwsLib.ec2InstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2InstanceMod.InstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2InstanceMod.Instance = js.native
}

