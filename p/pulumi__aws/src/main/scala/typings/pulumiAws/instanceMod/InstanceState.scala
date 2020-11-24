package typings.pulumiAws.instanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsEc2Mod.InstanceType
import typings.pulumiAws.iamMod.InstanceProfile
import typings.pulumiAws.inputMod.ec2.InstanceCreditSpecification
import typings.pulumiAws.inputMod.ec2.InstanceEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.InstanceEphemeralBlockDevice
import typings.pulumiAws.inputMod.ec2.InstanceMetadataOptions
import typings.pulumiAws.inputMod.ec2.InstanceNetworkInterface
import typings.pulumiAws.inputMod.ec2.InstanceRootBlockDevice
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceState extends js.Object {
  
  /**
    * The AMI to use for the instance.
    */
  val ami: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the instance.
    */
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
    * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
    */
  val instanceState: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of instance to start. Updates to this field will trigger a stop/start of the EC2 instance.
    */
  val instanceType: js.UndefOr[Input[InstanceType]] = js.native
  
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
    * The ARN of the Outpost the instance is assigned to.
    */
  val outpostArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Base-64 encoded encrypted password data for the instance.
    * Useful for getting the administrator password for instances running Microsoft Windows.
    * This attribute is only exported if `getPasswordData` is true.
    * Note that this encrypted value will be stored in the state file, as with all exported attributes.
    * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val passwordData: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Placement Group to start the instance in.
    */
  val placementGroup: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the instance's primary network interface.
    */
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
    * The public IP address assigned to the instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
  
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevice: js.UndefOr[Input[InstanceRootBlockDevice]] = js.native
  
  /**
    * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC. Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a `networkInterface` block. Refer to the [Elastic network interfaces documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html#AvailableIpPerENI) to see the maximum number of private IP addresses allowed per instance type.
    */
  val secondaryPrivateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
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
    * A map of tags to assign to the devices created by the instance at launch time.
    */
  val volumeTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A list of security group IDs to associate with.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object InstanceState {
  
  @scala.inline
  def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  
  @scala.inline
  implicit class InstanceStateOps[Self <: InstanceState] (val x: Self) extends AnyVal {
    
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
    def setCpuCoreCount(value: Input[Double]): Self = this.set("cpuCoreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuCoreCount: Self = this.set("cpuCoreCount", js.undefined)
    
    @scala.inline
    def setCpuThreadsPerCore(value: Input[Double]): Self = this.set("cpuThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuThreadsPerCore: Self = this.set("cpuThreadsPerCore", js.undefined)
    
    @scala.inline
    def setCreditSpecification(value: Input[InstanceCreditSpecification]): Self = this.set("creditSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditSpecification: Self = this.set("creditSpecification", js.undefined)
    
    @scala.inline
    def setDisableApiTermination(value: Input[Boolean]): Self = this.set("disableApiTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableApiTermination: Self = this.set("disableApiTermination", js.undefined)
    
    @scala.inline
    def setEbsBlockDevicesVarargs(value: Input[InstanceEbsBlockDevice]*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEbsBlockDevices(value: Input[js.Array[Input[InstanceEbsBlockDevice]]]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("ebsBlockDevices", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: Input[Boolean]): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("ebsOptimized", js.undefined)
    
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: Input[InstanceEphemeralBlockDevice]*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEphemeralBlockDevices(value: Input[js.Array[Input[InstanceEphemeralBlockDevice]]]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    
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
    def setIamInstanceProfile(value: Input[String | InstanceProfile]): Self = this.set("iamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("iamInstanceProfile", js.undefined)
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = this.set("instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInitiatedShutdownBehavior: Self = this.set("instanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceState(value: Input[String]): Self = this.set("instanceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceState: Self = this.set("instanceState", js.undefined)
    
    @scala.inline
    def setInstanceType(value: Input[InstanceType]): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
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
    def setMetadataOptions(value: Input[InstanceMetadataOptions]): Self = this.set("metadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataOptions: Self = this.set("metadataOptions", js.undefined)
    
    @scala.inline
    def setMonitoring(value: Input[Boolean]): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: Input[InstanceNetworkInterface]*): Self = this.set("networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: Input[js.Array[Input[InstanceNetworkInterface]]]): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
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
    def setRootBlockDevice(value: Input[InstanceRootBlockDevice]): Self = this.set("rootBlockDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootBlockDevice: Self = this.set("rootBlockDevice", js.undefined)
    
    @scala.inline
    def setSecondaryPrivateIpsVarargs(value: Input[String]*): Self = this.set("secondaryPrivateIps", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryPrivateIps(value: Input[js.Array[Input[String]]]): Self = this.set("secondaryPrivateIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryPrivateIps: Self = this.set("secondaryPrivateIps", js.undefined)
    
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
    def setVolumeTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("volumeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeTags: Self = this.set("volumeTags", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
  }
}
