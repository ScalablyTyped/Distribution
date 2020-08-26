package typings.pulumiAws.spotInstanceRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestCreditSpecification
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestEphemeralBlockDevice
import typings.pulumiAws.inputMod.ec2.SpotInstanceRequestMetadataOptions
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
  /**
    * A number of IPv6 addresses to associate with the primary network interface. Amazon EC2 chooses the IPv6 addresses from the range of your subnet.
    */
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
    * Customize the metadata options of the instance. See Metadata Options below for more details.
    */
  val metadataOptions: js.UndefOr[Input[SpotInstanceRequestMetadataOptions]] = js.native
  /**
    * If true, the launched EC2 instance will have detailed monitoring enabled. (Available since v0.6.0)
    */
  val monitoring: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Customize network interfaces to be attached at instance boot time. See Network Interfaces below for more details.
    */
  val networkInterfaces: js.UndefOr[Input[js.Array[Input[SpotInstanceRequestNetworkInterface]]]] = js.native
  val outpostArn: js.UndefOr[Input[String]] = js.native
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
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
    * A map of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
  def apply(): SpotInstanceRequestState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceRequestState]
  }
  @scala.inline
  implicit class SpotInstanceRequestStateOps[Self <: SpotInstanceRequestState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmi(value: Input[String]): Self = this.set("ami", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmi: Self = this.set("ami", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAssociatePublicIpAddress(value: Input[Boolean]): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("associatePublicIpAddress", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setBlockDurationMinutes(value: Input[Double]): Self = this.set("blockDurationMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDurationMinutes: Self = this.set("blockDurationMinutes", js.undefined)
    @scala.inline
    def setCpuCoreCount(value: Input[Double]): Self = this.set("cpuCoreCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuCoreCount: Self = this.set("cpuCoreCount", js.undefined)
    @scala.inline
    def setCpuThreadsPerCore(value: Input[Double]): Self = this.set("cpuThreadsPerCore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuThreadsPerCore: Self = this.set("cpuThreadsPerCore", js.undefined)
    @scala.inline
    def setCreditSpecification(value: Input[SpotInstanceRequestCreditSpecification]): Self = this.set("creditSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditSpecification: Self = this.set("creditSpecification", js.undefined)
    @scala.inline
    def setDisableApiTermination(value: Input[Boolean]): Self = this.set("disableApiTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableApiTermination: Self = this.set("disableApiTermination", js.undefined)
    @scala.inline
    def setEbsBlockDevicesVarargs(value: Input[SpotInstanceRequestEbsBlockDevice]*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDevices(value: Input[js.Array[Input[SpotInstanceRequestEbsBlockDevice]]]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("ebsBlockDevices", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Input[Boolean]): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: Input[SpotInstanceRequestEphemeralBlockDevice]*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEphemeralBlockDevices(value: Input[js.Array[Input[SpotInstanceRequestEphemeralBlockDevice]]]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEphemeralBlockDevices: Self = this.set("ephemeralBlockDevices", js.undefined)
    @scala.inline
    def setGetPasswordData(value: Input[Boolean]): Self = this.set("getPasswordData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetPasswordData: Self = this.set("getPasswordData", js.undefined)
    @scala.inline
    def setHibernation(value: Input[Boolean]): Self = this.set("hibernation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHibernation: Self = this.set("hibernation", js.undefined)
    @scala.inline
    def setHostId(value: Input[String]): Self = this.set("hostId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostId: Self = this.set("hostId", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: Input[String]): Self = this.set("iamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("iamInstanceProfile", js.undefined)
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = this.set("instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInitiatedShutdownBehavior: Self = this.set("instanceInitiatedShutdownBehavior", js.undefined)
    @scala.inline
    def setInstanceInterruptionBehaviour(value: Input[String]): Self = this.set("instanceInterruptionBehaviour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInterruptionBehaviour: Self = this.set("instanceInterruptionBehaviour", js.undefined)
    @scala.inline
    def setInstanceState(value: Input[String]): Self = this.set("instanceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceState: Self = this.set("instanceState", js.undefined)
    @scala.inline
    def setInstanceType(value: Input[String]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setIpv6AddressCount(value: Input[Double]): Self = this.set("ipv6AddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6AddressCount: Self = this.set("ipv6AddressCount", js.undefined)
    @scala.inline
    def setIpv6AddressesVarargs(value: Input[String]*): Self = this.set("ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: Input[js.Array[Input[String]]]): Self = this.set("ipv6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("ipv6Addresses", js.undefined)
    @scala.inline
    def setKeyName(value: Input[String]): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    @scala.inline
    def setLaunchGroup(value: Input[String]): Self = this.set("launchGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchGroup: Self = this.set("launchGroup", js.undefined)
    @scala.inline
    def setMetadataOptions(value: Input[SpotInstanceRequestMetadataOptions]): Self = this.set("metadataOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataOptions: Self = this.set("metadataOptions", js.undefined)
    @scala.inline
    def setMonitoring(value: Input[Boolean]): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    @scala.inline
    def setNetworkInterfacesVarargs(value: Input[SpotInstanceRequestNetworkInterface]*): Self = this.set("networkInterfaces", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaces(value: Input[js.Array[Input[SpotInstanceRequestNetworkInterface]]]): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    @scala.inline
    def setOutpostArn(value: Input[String]): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("outpostArn", js.undefined)
    @scala.inline
    def setPasswordData(value: Input[String]): Self = this.set("passwordData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordData: Self = this.set("passwordData", js.undefined)
    @scala.inline
    def setPlacementGroup(value: Input[String]): Self = this.set("placementGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementGroup: Self = this.set("placementGroup", js.undefined)
    @scala.inline
    def setPrimaryNetworkInterfaceId(value: Input[String]): Self = this.set("primaryNetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryNetworkInterfaceId: Self = this.set("primaryNetworkInterfaceId", js.undefined)
    @scala.inline
    def setPrivateDns(value: Input[String]): Self = this.set("privateDns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDns: Self = this.set("privateDns", js.undefined)
    @scala.inline
    def setPrivateIp(value: Input[String]): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIp: Self = this.set("privateIp", js.undefined)
    @scala.inline
    def setPublicDns(value: Input[String]): Self = this.set("publicDns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicDns: Self = this.set("publicDns", js.undefined)
    @scala.inline
    def setPublicIp(value: Input[String]): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("publicIp", js.undefined)
    @scala.inline
    def setRootBlockDevice(value: Input[SpotInstanceRequestRootBlockDevice]): Self = this.set("rootBlockDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootBlockDevice: Self = this.set("rootBlockDevice", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSourceDestCheck(value: Input[Boolean]): Self = this.set("sourceDestCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("sourceDestCheck", js.undefined)
    @scala.inline
    def setSpotBidStatus(value: Input[String]): Self = this.set("spotBidStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotBidStatus: Self = this.set("spotBidStatus", js.undefined)
    @scala.inline
    def setSpotInstanceId(value: Input[String]): Self = this.set("spotInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotInstanceId: Self = this.set("spotInstanceId", js.undefined)
    @scala.inline
    def setSpotPrice(value: Input[String]): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotPrice: Self = this.set("spotPrice", js.undefined)
    @scala.inline
    def setSpotRequestState(value: Input[String]): Self = this.set("spotRequestState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotRequestState: Self = this.set("spotRequestState", js.undefined)
    @scala.inline
    def setSpotType(value: Input[String]): Self = this.set("spotType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotType: Self = this.set("spotType", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTenancy(value: Input[String]): Self = this.set("tenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenancy: Self = this.set("tenancy", js.undefined)
    @scala.inline
    def setUserData(value: Input[String]): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
    @scala.inline
    def setUserDataBase64(value: Input[String]): Self = this.set("userDataBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDataBase64: Self = this.set("userDataBase64", js.undefined)
    @scala.inline
    def setValidFrom(value: Input[String]): Self = this.set("validFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidFrom: Self = this.set("validFrom", js.undefined)
    @scala.inline
    def setValidUntil(value: Input[String]): Self = this.set("validUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidUntil: Self = this.set("validUntil", js.undefined)
    @scala.inline
    def setVolumeTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("volumeTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeTags: Self = this.set("volumeTags", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
    @scala.inline
    def setWaitForFulfillment(value: Input[Boolean]): Self = this.set("waitForFulfillment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForFulfillment: Self = this.set("waitForFulfillment", js.undefined)
  }
  
}

