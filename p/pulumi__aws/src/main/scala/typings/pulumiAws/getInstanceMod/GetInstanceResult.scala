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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val instanceId: js.UndefOr[String] = js.native
  /**
    * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
    */
  val instanceState: String = js.native
  val instanceTags: StringDictionary[js.Any] = js.native
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
    * The public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an [`aws.ec2.Eip`](https://www.terraform.io/docs/providers/aws/r/eip.html) with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
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
  val tags: StringDictionary[js.Any] = js.native
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
    instanceTags: StringDictionary[js.Any],
    instanceType: String,
    keyName: String,
    metadataOptions: js.Array[GetInstanceMetadataOption],
    monitoring: Boolean,
    networkInterfaceId: String,
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
    tags: StringDictionary[js.Any],
    tenancy: String,
    userData: String,
    userDataBase64: String,
    vpcSecurityGroupIds: js.Array[String],
    filters: js.Array[GetInstanceFilter] = null,
    getPasswordData: js.UndefOr[Boolean] = js.undefined,
    getUserData: js.UndefOr[Boolean] = js.undefined,
    instanceId: String = null
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associatePublicIpAddress = associatePublicIpAddress.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], creditSpecifications = creditSpecifications.asInstanceOf[js.Any], disableApiTermination = disableApiTermination.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ebsOptimized = ebsOptimized.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], iamInstanceProfile = iamInstanceProfile.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceState = instanceState.asInstanceOf[js.Any], instanceTags = instanceTags.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], metadataOptions = metadataOptions.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], passwordData = passwordData.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], privateDns = privateDns.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicDns = publicDns.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], sourceDestCheck = sourceDestCheck.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tenancy = tenancy.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], userDataBase64 = userDataBase64.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(getPasswordData)) __obj.updateDynamic("getPasswordData")(getPasswordData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(getUserData)) __obj.updateDynamic("getUserData")(getUserData.get.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceResult]
  }
}

