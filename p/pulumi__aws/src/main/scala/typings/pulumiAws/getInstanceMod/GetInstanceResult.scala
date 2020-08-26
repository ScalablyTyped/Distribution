package typings.pulumiAws.getInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetInstanceCreditSpecification
import typings.pulumiAws.outputMod.ec2.GetInstanceEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.GetInstanceEphemeralBlockDevice
import typings.pulumiAws.outputMod.ec2.GetInstanceFilter
import typings.pulumiAws.outputMod.ec2.GetInstanceMetadataOption
import typings.pulumiAws.outputMod.ec2.GetInstanceRootBlockDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceResult extends js.Object {
  /**
    * The ID of the AMI used to launch the instance.
    */
  val ami: String = js.native
  /**
    * The ARN of the instance.
    */
  val arn: String = js.native
  /**
    * Whether or not the Instance is associated with a public IP address or not (Boolean).
    */
  val associatePublicIpAddress: Boolean = js.native
  /**
    * The availability zone of the Instance.
    */
  val availabilityZone: String = js.native
  /**
    * The credit specification of the Instance.
    */
  val creditSpecifications: js.Array[GetInstanceCreditSpecification] = js.native
  val disableApiTermination: Boolean = js.native
  /**
    * The EBS block device mappings of the Instance.
    */
  val ebsBlockDevices: js.Array[GetInstanceEbsBlockDevice] = js.native
  /**
    * Whether the Instance is EBS optimized or not (Boolean).
    */
  val ebsOptimized: Boolean = js.native
  /**
    * The ephemeral block device mappings of the Instance.
    */
  val ephemeralBlockDevices: js.Array[GetInstanceEphemeralBlockDevice] = js.native
  val filters: js.UndefOr[js.Array[GetInstanceFilter]] = js.native
  val getPasswordData: js.UndefOr[Boolean] = js.native
  val getUserData: js.UndefOr[Boolean] = js.native
  /**
    * The Id of the dedicated host the instance will be assigned to.
    */
  val hostId: String = js.native
  /**
    * The name of the instance profile associated with the Instance.
    */
  val iamInstanceProfile: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val instanceId: js.UndefOr[String] = js.native
  /**
    * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
    */
  val instanceState: String = js.native
  val instanceTags: StringDictionary[String] = js.native
  /**
    * The type of the Instance.
    */
  val instanceType: String = js.native
  /**
    * The key name of the Instance.
    */
  val keyName: String = js.native
  /**
    * The metadata options of the Instance.
    */
  val metadataOptions: js.Array[GetInstanceMetadataOption] = js.native
  /**
    * Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
    */
  val monitoring: Boolean = js.native
  /**
    * The ID of the network interface that was created with the Instance.
    */
  val networkInterfaceId: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  val outpostArn: String = js.native
  /**
    * Base-64 encoded encrypted password data for the instance.
    * Useful for getting the administrator password for instances running Microsoft Windows.
    * This attribute is only exported if `getPasswordData` is true.
    * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val passwordData: String = js.native
  /**
    * The placement group of the Instance.
    */
  val placementGroup: String = js.native
  /**
    * The private DNS name assigned to the Instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC.
    */
  val privateDns: String = js.native
  /**
    * The private IP address assigned to the Instance.
    */
  val privateIp: String = js.native
  /**
    * The public DNS name assigned to the Instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC.
    */
  val publicDns: String = js.native
  /**
    * The public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
    */
  val publicIp: String = js.native
  /**
    * The root block device mappings of the Instance
    */
  val rootBlockDevices: js.Array[GetInstanceRootBlockDevice] = js.native
  /**
    * The associated security groups.
    */
  val securityGroups: js.Array[String] = js.native
  /**
    * Whether the network interface performs source/destination checking (Boolean).
    */
  val sourceDestCheck: Boolean = js.native
  /**
    * The VPC subnet ID.
    */
  val subnetId: String = js.native
  /**
    * A mapping of tags assigned to the Instance.
    */
  val tags: StringDictionary[String] = js.native
  /**
    * The tenancy of the instance: `dedicated`, `default`, `host`.
    */
  val tenancy: String = js.native
  /**
    * SHA-1 hash of User Data supplied to the Instance.
    */
  val userData: String = js.native
  /**
    * Base64 encoded contents of User Data supplied to the Instance. This attribute is only exported if `getUserData` is true.
    */
  val userDataBase64: String = js.native
  /**
    * The associated security groups in a non-default VPC.
    */
  val vpcSecurityGroupIds: js.Array[String] = js.native
}

object GetInstanceResult {
  @scala.inline
  def apply(
    ami: String,
    arn: String,
    associatePublicIpAddress: Boolean,
    availabilityZone: String,
    creditSpecifications: js.Array[GetInstanceCreditSpecification],
    disableApiTermination: Boolean,
    ebsBlockDevices: js.Array[GetInstanceEbsBlockDevice],
    ebsOptimized: Boolean,
    ephemeralBlockDevices: js.Array[GetInstanceEphemeralBlockDevice],
    hostId: String,
    iamInstanceProfile: String,
    id: String,
    instanceState: String,
    instanceTags: StringDictionary[String],
    instanceType: String,
    keyName: String,
    metadataOptions: js.Array[GetInstanceMetadataOption],
    monitoring: Boolean,
    networkInterfaceId: String,
    outpostArn: String,
    passwordData: String,
    placementGroup: String,
    privateDns: String,
    privateIp: String,
    publicDns: String,
    publicIp: String,
    rootBlockDevices: js.Array[GetInstanceRootBlockDevice],
    securityGroups: js.Array[String],
    sourceDestCheck: Boolean,
    subnetId: String,
    tags: StringDictionary[String],
    tenancy: String,
    userData: String,
    userDataBase64: String,
    vpcSecurityGroupIds: js.Array[String]
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associatePublicIpAddress = associatePublicIpAddress.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], creditSpecifications = creditSpecifications.asInstanceOf[js.Any], disableApiTermination = disableApiTermination.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ebsOptimized = ebsOptimized.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], iamInstanceProfile = iamInstanceProfile.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceState = instanceState.asInstanceOf[js.Any], instanceTags = instanceTags.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], metadataOptions = metadataOptions.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], passwordData = passwordData.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], privateDns = privateDns.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicDns = publicDns.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], sourceDestCheck = sourceDestCheck.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tenancy = tenancy.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], userDataBase64 = userDataBase64.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceResult]
  }
  @scala.inline
  implicit class GetInstanceResultOps[Self <: GetInstanceResult] (val x: Self) extends AnyVal {
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
    def setAmi(value: String): Self = this.set("ami", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreditSpecificationsVarargs(value: GetInstanceCreditSpecification*): Self = this.set("creditSpecifications", js.Array(value :_*))
    @scala.inline
    def setCreditSpecifications(value: js.Array[GetInstanceCreditSpecification]): Self = this.set("creditSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableApiTermination(value: Boolean): Self = this.set("disableApiTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def setEbsBlockDevicesVarargs(value: GetInstanceEbsBlockDevice*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDevices(value: js.Array[GetInstanceEbsBlockDevice]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("ebsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: GetInstanceEphemeralBlockDevice*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEphemeralBlockDevices(value: js.Array[GetInstanceEphemeralBlockDevice]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostId(value: String): Self = this.set("hostId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIamInstanceProfile(value: String): Self = this.set("iamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceState(value: String): Self = this.set("instanceState", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceTags(value: StringDictionary[String]): Self = this.set("instanceTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataOptionsVarargs(value: GetInstanceMetadataOption*): Self = this.set("metadataOptions", js.Array(value :_*))
    @scala.inline
    def setMetadataOptions(value: js.Array[GetInstanceMetadataOption]): Self = this.set("metadataOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoring(value: Boolean): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordData(value: String): Self = this.set("passwordData", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacementGroup(value: String): Self = this.set("placementGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateDns(value: String): Self = this.set("privateDns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateIp(value: String): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicDns(value: String): Self = this.set("publicDns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicIp(value: String): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootBlockDevicesVarargs(value: GetInstanceRootBlockDevice*): Self = this.set("rootBlockDevices", js.Array(value :_*))
    @scala.inline
    def setRootBlockDevices(value: js.Array[GetInstanceRootBlockDevice]): Self = this.set("rootBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceDestCheck(value: Boolean): Self = this.set("sourceDestCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTenancy(value: String): Self = this.set("tenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserData(value: String): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserDataBase64(value: String): Self = this.set("userDataBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: js.Array[String]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetInstanceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetInstanceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setGetPasswordData(value: Boolean): Self = this.set("getPasswordData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetPasswordData: Self = this.set("getPasswordData", js.undefined)
    @scala.inline
    def setGetUserData(value: Boolean): Self = this.set("getUserData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetUserData: Self = this.set("getUserData", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
  }
  
}

