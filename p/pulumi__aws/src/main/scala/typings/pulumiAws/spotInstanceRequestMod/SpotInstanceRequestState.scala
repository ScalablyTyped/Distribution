package typings.pulumiAws.spotInstanceRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestCreditSpecification
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestNetworkInterface
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestRootBlockDevice
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestState extends js.Object {
  /**
    * The AMI to use for the instance.
    */
  val ami: js.UndefOr[Input[String]] = js.native
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Associate a public ip address with an instance in a VPC.  Boolean value.
    */
  val associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AZ to start the instance in.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The required duration for the Spot instances, in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    * The duration period starts as soon as your Spot instance receives its instance ID. At the end of the duration period, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
    * Note that you can't specify an Availability Zone group or a launch group if you specify a duration.
    */
  val blockDurationMinutes: js.UndefOr[Input[Double]] = js.native
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
  val creditSpecification: js.UndefOr[Input[SpotInstanceRequestCreditSpecification]] = js.native
  /**
    * If true, enables [EC2 Instance
    * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
    */
  val disableApiTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  Block device configurations only apply on resource creation. See Block Devices below for details on attributes and drift detection.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[SpotInstanceRequestEbsBlockDevice]]]] = js.native
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
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[SpotInstanceRequestEphemeralBlockDevice]]]] = js.native
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The Id of a dedicated host that the instance will be assigned to. Use when an instance is to be launched on a specific dedicated host.
    */
  val hostId: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM Instance Profile to
    * launch the instance with. Specified as the name of the Instance Profile. Ensure your credentials have the correct permission to assign the instance profile according to the [EC2 documentation](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_switch-role-ec2.html#roles-usingrole-ec2instance-permissions), notably `iam:PassRole`.
    * * `ipv6AddressCount`- (Optional) A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
    */
  val iamInstanceProfile: js.UndefOr[Input[String]] = js.native
  /**
    * Shutdown behavior for the
    * instance. Amazon defaults this to `stop` for EBS-backed instances and
    * `terminate` for instance-store instances. Cannot be set on instance-store
    * instances. See [Shutdown Behavior](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingInstanceInitiatedShutdownBehavior) for more information.
    */
  val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether a Spot instance stops or terminates when it is interrupted. Default is `terminate` as this is the current AWS behaviour.
    */
  val instanceInterruptionBehaviour: js.UndefOr[Input[String]] = js.native
  val instanceState: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
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
    * A launch group is a group of spot instances that launch together and terminate together.
    * If left empty instances are launched and terminated individually.
    */
  val launchGroup: js.UndefOr[Input[String]] = js.native
  /**
    * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
    */
  val monitoring: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[Input[js.Array[Input[SpotInstanceRequestNetworkInterface]]]] = js.native
  val passwordData: js.UndefOr[Input[String]] = js.native
  /**
    * The Placement Group to start the instance in.
    */
  val placementGroup: js.UndefOr[Input[String]] = js.native
  val primaryNetworkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: js.UndefOr[Input[String]] = js.native
  /**
    * Private IP address to associate with the
    * instance in a VPC.
    */
  val privateIp: js.UndefOr[Input[String]] = js.native
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: js.UndefOr[Input[SpotInstanceRequestRootBlockDevice]] = js.native
  /**
    * A list of security group names (EC2-Classic) or IDs (default VPC) to associate with.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Controls if traffic is routed to the instance when
    * the destination address does not match the instance. Used for NAT or VPNs. Defaults true.
    */
  val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The current [bid
    * status](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html)
    * of the Spot Instance Request.
    * * `spotRequestState` The current [request
    * state](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html#creating-spot-request-status)
    * of the Spot Instance Request.
    */
  val spotBidStatus: js.UndefOr[Input[String]] = js.native
  /**
    * The Instance ID (if any) that is currently fulfilling
    * the Spot Instance request.
    */
  val spotInstanceId: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum price to request on the spot market.
    */
  val spotPrice: js.UndefOr[Input[String]] = js.native
  val spotRequestState: js.UndefOr[Input[String]] = js.native
  /**
    * If set to `one-time`, after
    * the instance is terminated, the spot request will be closed.
    */
  val spotType: js.UndefOr[Input[String]] = js.native
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
    * The start date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  val validFrom: js.UndefOr[Input[String]] = js.native
  /**
    * The end date and time of the request, in UTC [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.8) format(for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot instance requests are placed or enabled to fulfill the request. The default end date is 7 days from the current date.
    */
  val validUntil: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * If set, this provider will
    * wait for the Spot Request to be fulfilled, and will throw an error if the
    * timeout of 10m is reached.
    */
  val waitForFulfillment: js.UndefOr[Input[Boolean]] = js.native
}

object SpotInstanceRequestState {
  @scala.inline
  def apply(
    ami: Input[String] = null,
    arn: Input[String] = null,
    associatePublicIpAddress: Input[Boolean] = null,
    availabilityZone: Input[String] = null,
    blockDurationMinutes: Input[Double] = null,
    cpuCoreCount: Input[Double] = null,
    cpuThreadsPerCore: Input[Double] = null,
    creditSpecification: Input[SpotInstanceRequestCreditSpecification] = null,
    disableApiTermination: Input[Boolean] = null,
    ebsBlockDevices: Input[js.Array[Input[SpotInstanceRequestEbsBlockDevice]]] = null,
    ebsOptimized: Input[Boolean] = null,
    ephemeralBlockDevices: Input[js.Array[Input[SpotInstanceRequestEphemeralBlockDevice]]] = null,
    getPasswordData: Input[Boolean] = null,
    hostId: Input[String] = null,
    iamInstanceProfile: Input[String] = null,
    instanceInitiatedShutdownBehavior: Input[String] = null,
    instanceInterruptionBehaviour: Input[String] = null,
    instanceState: Input[String] = null,
    instanceType: Input[String] = null,
    ipv6AddressCount: Input[Double] = null,
    ipv6Addresses: Input[js.Array[Input[String]]] = null,
    keyName: Input[String] = null,
    launchGroup: Input[String] = null,
    monitoring: Input[Boolean] = null,
    networkInterfaces: Input[js.Array[Input[SpotInstanceRequestNetworkInterface]]] = null,
    passwordData: Input[String] = null,
    placementGroup: Input[String] = null,
    primaryNetworkInterfaceId: Input[String] = null,
    privateDns: Input[String] = null,
    privateIp: Input[String] = null,
    publicDns: Input[String] = null,
    publicIp: Input[String] = null,
    rootBlockDevice: Input[SpotInstanceRequestRootBlockDevice] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    sourceDestCheck: Input[Boolean] = null,
    spotBidStatus: Input[String] = null,
    spotInstanceId: Input[String] = null,
    spotPrice: Input[String] = null,
    spotRequestState: Input[String] = null,
    spotType: Input[String] = null,
    subnetId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    tenancy: Input[String] = null,
    userData: Input[String] = null,
    userDataBase64: Input[String] = null,
    validFrom: Input[String] = null,
    validUntil: Input[String] = null,
    volumeTags: Input[StringDictionary[_]] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null,
    waitForFulfillment: Input[Boolean] = null
  ): SpotInstanceRequestState = {
    val __obj = js.Dynamic.literal()
    if (ami != null) __obj.updateDynamic("ami")(ami.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (associatePublicIpAddress != null) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (blockDurationMinutes != null) __obj.updateDynamic("blockDurationMinutes")(blockDurationMinutes.asInstanceOf[js.Any])
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
    if (instanceInterruptionBehaviour != null) __obj.updateDynamic("instanceInterruptionBehaviour")(instanceInterruptionBehaviour.asInstanceOf[js.Any])
    if (instanceState != null) __obj.updateDynamic("instanceState")(instanceState.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (ipv6AddressCount != null) __obj.updateDynamic("ipv6AddressCount")(ipv6AddressCount.asInstanceOf[js.Any])
    if (ipv6Addresses != null) __obj.updateDynamic("ipv6Addresses")(ipv6Addresses.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (launchGroup != null) __obj.updateDynamic("launchGroup")(launchGroup.asInstanceOf[js.Any])
    if (monitoring != null) __obj.updateDynamic("monitoring")(monitoring.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (passwordData != null) __obj.updateDynamic("passwordData")(passwordData.asInstanceOf[js.Any])
    if (placementGroup != null) __obj.updateDynamic("placementGroup")(placementGroup.asInstanceOf[js.Any])
    if (primaryNetworkInterfaceId != null) __obj.updateDynamic("primaryNetworkInterfaceId")(primaryNetworkInterfaceId.asInstanceOf[js.Any])
    if (privateDns != null) __obj.updateDynamic("privateDns")(privateDns.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (publicDns != null) __obj.updateDynamic("publicDns")(publicDns.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    if (rootBlockDevice != null) __obj.updateDynamic("rootBlockDevice")(rootBlockDevice.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (sourceDestCheck != null) __obj.updateDynamic("sourceDestCheck")(sourceDestCheck.asInstanceOf[js.Any])
    if (spotBidStatus != null) __obj.updateDynamic("spotBidStatus")(spotBidStatus.asInstanceOf[js.Any])
    if (spotInstanceId != null) __obj.updateDynamic("spotInstanceId")(spotInstanceId.asInstanceOf[js.Any])
    if (spotPrice != null) __obj.updateDynamic("spotPrice")(spotPrice.asInstanceOf[js.Any])
    if (spotRequestState != null) __obj.updateDynamic("spotRequestState")(spotRequestState.asInstanceOf[js.Any])
    if (spotType != null) __obj.updateDynamic("spotType")(spotType.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (userDataBase64 != null) __obj.updateDynamic("userDataBase64")(userDataBase64.asInstanceOf[js.Any])
    if (validFrom != null) __obj.updateDynamic("validFrom")(validFrom.asInstanceOf[js.Any])
    if (validUntil != null) __obj.updateDynamic("validUntil")(validUntil.asInstanceOf[js.Any])
    if (volumeTags != null) __obj.updateDynamic("volumeTags")(volumeTags.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    if (waitForFulfillment != null) __obj.updateDynamic("waitForFulfillment")(waitForFulfillment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestState]
  }
}

