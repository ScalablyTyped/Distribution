package typings
package atPulumiAwsLib.ec2InstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceArgs extends js.Object {
  /**
    * The AMI to use for the instance.
    */
  val ami: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Associate a public ip address with an instance in a VPC.  Boolean value.
    */
  val associatePublicIpAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The AZ to start the instance in.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Sets the number of CPU cores for an instance. This option is
    * only supported on creation of instance type that support CPU Options
    * [CPU Cores and Threads Per CPU Core Per Instance Type](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html#cpu-options-supported-instances-values) - specifying this option for unsupported instance types will return an error from the EC2 API.
    */
  val cpuCoreCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * If set to to 1, hyperthreading is disabled on the launched instance. Defaults to 2 if not set. See [Optimizing CPU Options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html) for more information.
    */
  val cpuThreadsPerCore: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Customize the credit specification of the instance. See Credit Specification below for more details.
    */
  val creditSpecification: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CpuCreditsInput]] = js.undefined
  /**
    * If true, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[
          atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeIdVolumeSize
        ]
      ]
    ]
  ] = js.undefined
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    * Note that if this is not set on an instance type that is optimized by default then
    * this will show as disabled but if the instance type is optimized by default then
    * there is no need to set this and there is no effect to disabling it.
    * See the [EBS Optimized section](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html) of the AWS User Guide for more information.
    */
  val ebsOptimized: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeviceNameNoDeviceVirtualName]
      ]
    ]
  ] = js.undefined
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `password_data` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
    */
  val hostId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The IAM Instance Profile to
    * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
    * * `ipv6_address_count`- (Optional) A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
    */
  val iamInstanceProfile: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamMod.InstanceProfile]
  ] = js.undefined
  /**
    * Shutdown behavior for the
    * instance. Amazon defaults this to `stop` for EBS-backed instances and
    * `terminate` for instance-store instances. Cannot be set on instance-store
    * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
    */
  val instanceInitiatedShutdownBehavior: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
    */
  val instanceType: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2InstanceTypeMod.InstanceType]
  val ipv6AddressCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface
    */
  val ipv6Addresses: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The key name of the Key Pair to use for the instance; which can be managed using the `aws_key_pair` resource.
    */
  val keyName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
    */
  val monitoring: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId]
      ]
    ]
  ] = js.undefined
  /**
    * The Placement Group to start the instance in.
    */
  val placementGroup: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Private IP address to associate with the
    * instance in a VPC.
    */
  val privateIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeIdVolumeSize]
  ] = js.undefined
  /**
    * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
    */
  val securityGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Controls if traffic is routed to the instance when
    * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
    */
  val sourceDestCheck: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The VPC Subnet ID to launch in.
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the import-instance command.
    */
  val tenancy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `user_data_base64` instead.
    */
  val userData: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Can be used instead of `user_data` to pass base64-encoded binary data directly. Use this instead of `user_data` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
    */
  val userDataBase64: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object InstanceArgs {
  @scala.inline
  def apply(
    ami: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    instanceType: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.ec2InstanceTypeMod.InstanceType],
    associatePublicIpAddress: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cpuCoreCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    cpuThreadsPerCore: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    creditSpecification: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CpuCreditsInput] = null,
    disableApiTermination: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ebsBlockDevices: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[
          atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeIdVolumeSize
        ]
      ]
    ] = null,
    ebsOptimized: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ephemeralBlockDevices: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeviceNameNoDeviceVirtualName]
      ]
    ] = null,
    getPasswordData: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    hostId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    iamInstanceProfile: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamMod.InstanceProfile] = null,
    instanceInitiatedShutdownBehavior: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipv6AddressCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    ipv6Addresses: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    keyName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    monitoring: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    networkInterfaces: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceIndexNetworkInterfaceId]
      ]
    ] = null,
    placementGroup: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    privateIp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rootBlockDevice: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteOnTerminationIopsVolumeIdVolumeSize] = null,
    securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    sourceDestCheck: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    tenancy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    userData: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    userDataBase64: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    volumeTags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
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
    if (hostId != null) __obj.updateDynamic("hostId")(hostId.asInstanceOf[js.Any])
    if (iamInstanceProfile != null) __obj.updateDynamic("iamInstanceProfile")(iamInstanceProfile.asInstanceOf[js.Any])
    if (instanceInitiatedShutdownBehavior != null) __obj.updateDynamic("instanceInitiatedShutdownBehavior")(instanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (ipv6AddressCount != null) __obj.updateDynamic("ipv6AddressCount")(ipv6AddressCount.asInstanceOf[js.Any])
    if (ipv6Addresses != null) __obj.updateDynamic("ipv6Addresses")(ipv6Addresses.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
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

