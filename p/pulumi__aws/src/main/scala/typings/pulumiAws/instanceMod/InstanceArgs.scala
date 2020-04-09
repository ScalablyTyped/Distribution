package typings.pulumiAws.instanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.iamMod.InstanceProfile
import typings.pulumiAws.inputMod.ec2.InstanceCreditSpecification
import typings.pulumiAws.inputMod.ec2.InstanceEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.InstanceEphemeralBlockDevice
import typings.pulumiAws.inputMod.ec2.InstanceMetadataOptions
import typings.pulumiAws.inputMod.ec2.InstanceNetworkInterface
import typings.pulumiAws.inputMod.ec2.InstanceRootBlockDevice
import typings.pulumiAws.instanceTypeMod.InstanceType
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceArgs extends js.Object {
  /**
    * The AMI to use for the instance.
    */
  val ami: Input[String] = js.native
  /**
    * Associate a public ip address with an instance in a VPC.  Boolean value.
    */
  val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AZ to start the instance in.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * Sets the number of CPU cores for an instance. This option is
    * only supported on creation of instance type that support CPU Options
    * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
    */
  val cpuCoreCount: js.UndefOr[Input[Double]] = js.native
  /**
    * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
    */
  val cpuThreadsPerCore: js.UndefOr[Input[Double]] = js.native
  /**
    * Customize the credit specification of the instance. See Credit Specification below for more details.
    */
  val creditSpecification: js.UndefOr[Input[InstanceCreditSpecification]] = js.native
  /**
    * If true, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceEbsBlockDevice]]]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    * Note that if this is not set on an instance type that is optimized by default then
    * this will show as disabled but if the instance type is optimized by default then
    * there is no need to set this and there is no effect to disabling it.
    * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceEphemeralBlockDevice]]]] = js.native
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If true, the launched EC2 instance will support hibernation.
    */
  val hibernation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
    */
  val hostId: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM Instance Profile to
    * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
    * * `ipv6AddressCount`- (Optional) A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
    */
  val iamInstanceProfile: js.UndefOr[Input[String | InstanceProfile]] = js.native
  /**
    * Shutdown behavior for the
    * instance. Amazon defaults this to `stop` for EBS-backed instances and
    * `terminate` for instance-store instances. Cannot be set on instance-store
    * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
    */
  val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
    */
  val instanceType: Input[InstanceType] = js.native
  val ipv6AddressCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
    */
  val ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The key name of the Key Pair to use for the instance; which can be managed using the `aws.ec2.KeyPair` resource.
    */
  val keyName: js.UndefOr[Input[String]] = js.native
  /**
    * Customize the metadata options of the instance. See Metadata Options below for more details.
    */
  val metadataOptions: js.UndefOr[Input[InstanceMetadataOptions]] = js.native
  /**
    * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
    */
  val monitoring: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[Input[js.Array[Input[InstanceNetworkInterface]]]] = js.native
  /**
    * The Placement Group to start the instance in.
    */
  val placementGroup: js.UndefOr[Input[String]] = js.native
  /**
    * Private IP address to associate with the
    * instance in a VPC.
    */
  val privateIp: js.UndefOr[Input[String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: js.UndefOr[Input[InstanceRootBlockDevice]] = js.native
  /**
    * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
    *
    * @deprecated Use of `securityGroups` is discouraged as it does not allow for changes and will force your instance to be replaced if changes are made. To avoid this, use `vpcSecurityGroupIds` which allows for updates.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Controls if traffic is routed to the instance when
    * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
    */
  val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The VPC Subnet ID to launch in.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
    */
  val tenancy: js.UndefOr[Input[String]] = js.native
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
    */
  val userData: js.UndefOr[Input[String]] = js.native
  /**
    * Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object InstanceArgs {
  @scala.inline
  def apply(
    ami: Input[String],
    instanceType: Input[InstanceType],
    associatePublicIpAddress: Input[Boolean] = null,
    availabilityZone: Input[String] = null,
    cpuCoreCount: Input[Double] = null,
    cpuThreadsPerCore: Input[Double] = null,
    creditSpecification: Input[InstanceCreditSpecification] = null,
    disableApiTermination: Input[Boolean] = null,
    ebsBlockDevices: Input[js.Array[Input[InstanceEbsBlockDevice]]] = null,
    ebsOptimized: Input[Boolean] = null,
    ephemeralBlockDevices: Input[js.Array[Input[InstanceEphemeralBlockDevice]]] = null,
    getPasswordData: Input[Boolean] = null,
    hibernation: Input[Boolean] = null,
    hostId: Input[String] = null,
    iamInstanceProfile: Input[String | InstanceProfile] = null,
    instanceInitiatedShutdownBehavior: Input[String] = null,
    ipv6AddressCount: Input[Double] = null,
    ipv6Addresses: Input[js.Array[Input[String]]] = null,
    keyName: Input[String] = null,
    metadataOptions: Input[InstanceMetadataOptions] = null,
    monitoring: Input[Boolean] = null,
    networkInterfaces: Input[js.Array[Input[InstanceNetworkInterface]]] = null,
    placementGroup: Input[String] = null,
    privateIp: Input[String] = null,
    rootBlockDevice: Input[InstanceRootBlockDevice] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    sourceDestCheck: Input[Boolean] = null,
    subnetId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    tenancy: Input[String] = null,
    userData: Input[String] = null,
    userDataBase64: Input[String] = null,
    volumeTags: Input[StringDictionary[_]] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null
  ): InstanceArgs = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (associatePublicIpAddress != null) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (cpuCoreCount != null) __obj.updateDynamic("cpuCoreCount")(cpuCoreCount.asInstanceOf[js.Any])
    if (cpuThreadsPerCore != null) __obj.updateDynamic("cpuThreadsPerCore")(cpuThreadsPerCore.asInstanceOf[js.Any])
    if (creditSpecification != null) __obj.updateDynamic("creditSpecification")(creditSpecification.asInstanceOf[js.Any])
    if (disableApiTermination != null) __obj.updateDynamic("disableApiTermination")(disableApiTermination.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (getPasswordData != null) __obj.updateDynamic("getPasswordData")(getPasswordData.asInstanceOf[js.Any])
    if (hibernation != null) __obj.updateDynamic("hibernation")(hibernation.asInstanceOf[js.Any])
    if (hostId != null) __obj.updateDynamic("hostId")(hostId.asInstanceOf[js.Any])
    if (iamInstanceProfile != null) __obj.updateDynamic("iamInstanceProfile")(iamInstanceProfile.asInstanceOf[js.Any])
    if (instanceInitiatedShutdownBehavior != null) __obj.updateDynamic("instanceInitiatedShutdownBehavior")(instanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (ipv6AddressCount != null) __obj.updateDynamic("ipv6AddressCount")(ipv6AddressCount.asInstanceOf[js.Any])
    if (ipv6Addresses != null) __obj.updateDynamic("ipv6Addresses")(ipv6Addresses.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (metadataOptions != null) __obj.updateDynamic("metadataOptions")(metadataOptions.asInstanceOf[js.Any])
    if (monitoring != null) __obj.updateDynamic("monitoring")(monitoring.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (placementGroup != null) __obj.updateDynamic("placementGroup")(placementGroup.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (rootBlockDevice != null) __obj.updateDynamic("rootBlockDevice")(rootBlockDevice.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (sourceDestCheck != null) __obj.updateDynamic("sourceDestCheck")(sourceDestCheck.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (userDataBase64 != null) __obj.updateDynamic("userDataBase64")(userDataBase64.asInstanceOf[js.Any])
    if (volumeTags != null) __obj.updateDynamic("volumeTags")(volumeTags.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceArgs]
  }
}

