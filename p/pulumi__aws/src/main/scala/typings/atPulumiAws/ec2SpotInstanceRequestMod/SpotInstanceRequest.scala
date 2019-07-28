package typings.atPulumiAws.ec2SpotInstanceRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_CpuCreditsString
import typings.atPulumiAws.Anon_DeleteOnTerminationDeviceIndex
import typings.atPulumiAws.Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeId
import typings.atPulumiAws.Anon_DeleteOnTerminationIopsVolumeId
import typings.atPulumiAws.Anon_DeviceNameNoDevice
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/spotInstanceRequest", "SpotInstanceRequest")
@js.native
class SpotInstanceRequest protected () extends CustomResource {
  /**
    * Create a SpotInstanceRequest resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SpotInstanceRequestArgs) = this()
  def this(name: String, args: SpotInstanceRequestArgs, opts: CustomResourceOptions) = this()
  /**
    * The AMI to use for the instance.
    */
  val ami: Output[String] = js.native
  val arn: Output[String] = js.native
  /**
    * Associate a public ip address with an instance in a VPC.  Boolean value.
    */
  val associatePublicIpAddress: Output[Boolean] = js.native
  /**
    * The AZ to start the instance in.
    */
  val availabilityZone: Output[String] = js.native
  /**
    * The required duration for the Spot instances, in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
    * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
    */
  val blockDurationMinutes: Output[js.UndefOr[Double]] = js.native
  /**
    * Sets the number of CPU cores for an instance. This option is
    * only supported on creation of instance type that support CPU Options
    * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
    */
  val cpuCoreCount: Output[Double] = js.native
  /**
    * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
    */
  val cpuThreadsPerCore: Output[Double] = js.native
  /**
    * Customize the credit specification of the instance. See Credit Specification below for more details.
    */
  val creditSpecification: Output[js.UndefOr[Anon_CpuCreditsString]] = js.native
  /**
    * If true, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
    */
  val ebsBlockDevices: Output[js.Array[Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeId]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    * Note that if this is not set on an instance type that is optimized by default then
    * this will show as disabled but if the instance type is optimized by default then
    * there is no need to set this and there is no effect to disabling it.
    * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
    */
  val ebsOptimized: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: Output[js.Array[Anon_DeviceNameNoDevice]] = js.native
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `password_data` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
    */
  val hostId: Output[String] = js.native
  /**
    * The IAM Instance Profile to
    * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
    * * `ipv6_address_count`- (Optional) A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
    */
  val iamInstanceProfile: Output[js.UndefOr[String]] = js.native
  /**
    * Shutdown behavior for the
    * instance. Amazon defaults this to `stop` for EBS-backed instances and
    * `terminate` for instance-store instances. Cannot be set on instance-store
    * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
    */
  val instanceInitiatedShutdownBehavior: Output[js.UndefOr[String]] = js.native
  /**
    * Indicates whether a Spot instance stops or terminates when it is interrupted. Default is `terminate` as this is the current AWS behaviour.
    */
  val instanceInterruptionBehaviour: Output[js.UndefOr[String]] = js.native
  val instanceState: Output[String] = js.native
  /**
    * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
    */
  val instanceType: Output[String] = js.native
  val ipv6AddressCount: Output[Double] = js.native
  /**
    * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
    */
  val ipv6Addresses: Output[js.Array[String]] = js.native
  /**
    * The key name of the Key Pair to use for the instance; which can be managed using the `aws_key_pair` resource.
    */
  val keyName: Output[String] = js.native
  /**
    * A launch group is a group of spot instances that launch together and terminate together.
    * If left empty instances are launched and terminated individually.
    */
  val launchGroup: Output[js.UndefOr[String]] = js.native
  /**
    * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
    */
  val monitoring: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
    */
  val networkInterfaces: Output[js.Array[Anon_DeleteOnTerminationDeviceIndex]] = js.native
  val passwordData: Output[String] = js.native
  /**
    * The Placement Group to start the instance in.
    */
  val placementGroup: Output[String] = js.native
  val primaryNetworkInterfaceId: Output[String] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: Output[String] = js.native
  /**
    * Private IP address to associate with the
    * instance in a VPC.
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
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: Output[Anon_DeleteOnTerminationIopsVolumeId] = js.native
  /**
    * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
    */
  val securityGroups: Output[js.Array[String]] = js.native
  /**
    * Controls if traffic is routed to the instance when
    * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
    */
  val sourceDestCheck: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The current [bid
    * status](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html)
    * of the Spot Instance Request.
    * * `spot_request_state` The current [request
    * state](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html#creating-spot-request-status)
    * of the Spot Instance Request.
    */
  val spotBidStatus: Output[String] = js.native
  /**
    * The Instance ID (if any) that is currently fulfilling
    * the Spot Instance request.
    */
  val spotInstanceId: Output[String] = js.native
  /**
    * The maximum price to request on the spot market.
    */
  val spotPrice: Output[js.UndefOr[String]] = js.native
  val spotRequestState: Output[String] = js.native
  /**
    * If set to `one-time`, after
    * the instance is terminated, the spot request will be closed.
    */
  val spotType: Output[js.UndefOr[String]] = js.native
  /**
    * The VPC Subnet ID to launch in.
    */
  val subnetId: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
    */
  val tenancy: Output[String] = js.native
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `user_data_base64` instead.
    */
  val userData: Output[js.UndefOr[String]] = js.native
  /**
    * Can be used instead of `user_data` to pass base64-encoded binary data directly. Use this instead of `user_data` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: Output[js.UndefOr[String]] = js.native
  /**
    * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  val validFrom: Output[String] = js.native
  /**
    * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. The default end date is 7 days from the current date.
    */
  val validUntil: Output[String] = js.native
  /**
    * A mapping of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: Output[js.Array[String]] = js.native
  val waitForFulfillment: Output[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/spotInstanceRequest", "SpotInstanceRequest")
@js.native
object SpotInstanceRequest extends js.Object {
  /**
    * Get an existing SpotInstanceRequest resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SpotInstanceRequest = js.native
  def get(name: String, id: Input[ID], state: SpotInstanceRequestState): SpotInstanceRequest = js.native
  def get(name: String, id: Input[ID], state: SpotInstanceRequestState, opts: CustomResourceOptions): SpotInstanceRequest = js.native
  /**
    * Returns true if the given object is an instance of SpotInstanceRequest.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotInstanceRequest.SpotInstanceRequest */ Boolean = js.native
}

