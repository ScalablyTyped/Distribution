package typings.atPulumiAws.ec2GetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_CpuCredits
import typings.atPulumiAws.Anon_DeleteOnTerminationDeviceNameEncryptedIopsKmsKeyId
import typings.atPulumiAws.Anon_DeleteOnTerminationEncrypted
import typings.atPulumiAws.Anon_DeviceNameNoDevice
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceResult extends js.Object {
  /**
    * The ID of the AMI used to launch the instance.
    */
  val ami: String
  /**
    * The ARN of the instance.
    */
  val arn: String
  /**
    * Whether or not the Instance is associated with a public IP address or not (Boolean).
    */
  val associatePublicIpAddress: Boolean
  /**
    * The availability zone of the Instance.
    */
  val availabilityZone: String
  /**
    * The credit specification of the Instance.
    */
  val creditSpecifications: js.Array[Anon_CpuCredits]
  val disableApiTermination: Boolean
  /**
    * The EBS block device mappings of the Instance.
    */
  val ebsBlockDevices: js.Array[Anon_DeleteOnTerminationDeviceNameEncryptedIopsKmsKeyId]
  /**
    * Whether the Instance is EBS optimized or not (Boolean).
    */
  val ebsOptimized: Boolean
  /**
    * The ephemeral block device mappings of the Instance.
    */
  val ephemeralBlockDevices: js.Array[Anon_DeviceNameNoDevice]
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  val getPasswordData: js.UndefOr[Boolean] = js.undefined
  val getUserData: js.UndefOr[Boolean] = js.undefined
  /**
    * The Id of the dedicated host the instance will be assigned to.
    */
  val hostId: String
  /**
    * The name of the instance profile associated with the Instance.
    */
  val iamInstanceProfile: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val instanceId: js.UndefOr[String] = js.undefined
  /**
    * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
    */
  val instanceState: String
  val instanceTags: StringDictionary[js.Any]
  /**
    * The type of the Instance.
    */
  val instanceType: String
  /**
    * The key name of the Instance.
    */
  val keyName: String
  /**
    * Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
    */
  val monitoring: Boolean
  /**
    * The ID of the network interface that was created with the Instance.
    */
  val networkInterfaceId: String
  /**
    * Base-64 encoded encrypted password data for the instance.
    * Useful for getting the administrator password for instances running Microsoft Windows.
    * This attribute is only exported if `getPasswordData` is true.
    * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val passwordData: String
  /**
    * The placement group of the Instance.
    */
  val placementGroup: String
  /**
    * The private DNS name assigned to the Instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC.
    */
  val privateDns: String
  /**
    * The private IP address assigned to the Instance.
    */
  val privateIp: String
  /**
    * The public DNS name assigned to the Instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC.
    */
  val publicDns: String
  /**
    * The public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an [`aws.ec2.Eip`](https://www.terraform.io/docs/providers/aws/r/eip.html) with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
    */
  val publicIp: String
  /**
    * The root block device mappings of the Instance
    */
  val rootBlockDevices: js.Array[Anon_DeleteOnTerminationEncrypted]
  /**
    * The associated security groups.
    */
  val securityGroups: js.Array[String]
  /**
    * Whether the network interface performs source/destination checking (Boolean).
    */
  val sourceDestCheck: Boolean
  /**
    * The VPC subnet ID.
    */
  val subnetId: String
  /**
    * A mapping of tags assigned to the Instance.
    */
  val tags: StringDictionary[js.Any]
  /**
    * The tenancy of the instance: `dedicated`, `default`, `host`.
    */
  val tenancy: String
  /**
    * SHA-1 hash of User Data supplied to the Instance.
    */
  val userData: String
  /**
    * Base64 encoded contents of User Data supplied to the Instance. Valid UTF-8 contents can be decoded with the [`base64decode` function](https://www.terraform.io/docs/configuration/functions/base64decode.html). This attribute is only exported if `getUserData` is true.
    */
  val userDataBase64: String
  /**
    * The associated security groups in a non-default VPC.
    */
  val vpcSecurityGroupIds: js.Array[String]
}

object GetInstanceResult {
  @scala.inline
  def apply(
    ami: String,
    arn: String,
    associatePublicIpAddress: Boolean,
    availabilityZone: String,
    creditSpecifications: js.Array[Anon_CpuCredits],
    disableApiTermination: Boolean,
    ebsBlockDevices: js.Array[Anon_DeleteOnTerminationDeviceNameEncryptedIopsKmsKeyId],
    ebsOptimized: Boolean,
    ephemeralBlockDevices: js.Array[Anon_DeviceNameNoDevice],
    hostId: String,
    iamInstanceProfile: String,
    id: String,
    instanceState: String,
    instanceTags: StringDictionary[js.Any],
    instanceType: String,
    keyName: String,
    monitoring: Boolean,
    networkInterfaceId: String,
    passwordData: String,
    placementGroup: String,
    privateDns: String,
    privateIp: String,
    publicDns: String,
    publicIp: String,
    rootBlockDevices: js.Array[Anon_DeleteOnTerminationEncrypted],
    securityGroups: js.Array[String],
    sourceDestCheck: Boolean,
    subnetId: String,
    tags: StringDictionary[js.Any],
    tenancy: String,
    userData: String,
    userDataBase64: String,
    vpcSecurityGroupIds: js.Array[String],
    filters: js.Array[Anon_NameValues] = null,
    getPasswordData: js.UndefOr[Boolean] = js.undefined,
    getUserData: js.UndefOr[Boolean] = js.undefined,
    instanceId: String = null
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal(ami = ami, arn = arn, associatePublicIpAddress = associatePublicIpAddress, availabilityZone = availabilityZone, creditSpecifications = creditSpecifications, disableApiTermination = disableApiTermination, ebsBlockDevices = ebsBlockDevices, ebsOptimized = ebsOptimized, ephemeralBlockDevices = ephemeralBlockDevices, hostId = hostId, iamInstanceProfile = iamInstanceProfile, id = id, instanceState = instanceState, instanceTags = instanceTags, instanceType = instanceType, keyName = keyName, monitoring = monitoring, networkInterfaceId = networkInterfaceId, passwordData = passwordData, placementGroup = placementGroup, privateDns = privateDns, privateIp = privateIp, publicDns = publicDns, publicIp = publicIp, rootBlockDevices = rootBlockDevices, securityGroups = securityGroups, sourceDestCheck = sourceDestCheck, subnetId = subnetId, tags = tags, tenancy = tenancy, userData = userData, userDataBase64 = userDataBase64, vpcSecurityGroupIds = vpcSecurityGroupIds)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(getPasswordData)) __obj.updateDynamic("getPasswordData")(getPasswordData)
    if (!js.isUndefined(getUserData)) __obj.updateDynamic("getUserData")(getUserData)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    __obj.asInstanceOf[GetInstanceResult]
  }
}

