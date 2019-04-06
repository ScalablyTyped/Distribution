package typings
package atPulumiAwsLib.ec2GetInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceResult extends js.Object {
  /**
    * The ID of the AMI used to launch the instance.
    */
  val ami: java.lang.String
  /**
    * The ARN of the instance.
    */
  val arn: java.lang.String
  /**
    * Whether or not the Instance is associated with a public IP address or not (Boolean).
    */
  val associatePublicIpAddress: scala.Boolean
  /**
    * The availability zone of the Instance.
    */
  val availabilityZone: java.lang.String
  /**
    * The credit specification of the Instance.
    */
  val creditSpecifications: js.Array[atPulumiAwsLib.Anon_CpuCredits]
  val disableApiTermination: scala.Boolean
  /**
    * The EBS block device mappings of the Instance.
    */
  val ebsBlockDevices: js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId]
  /**
    * Whether the Instance is EBS optimized or not (Boolean).
    */
  val ebsOptimized: scala.Boolean
  /**
    * The ephemeral block device mappings of the Instance.
    */
  val ephemeralBlockDevices: js.Array[atPulumiAwsLib.Anon_DeviceNameNoDevice]
  /**
    * The Id of the dedicated host the instance will be assigned to.
    */
  val hostId: java.lang.String
  /**
    * The name of the instance profile associated with the Instance.
    */
  val iamInstanceProfile: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val instanceState: java.lang.String
  val instanceTags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The type of the Instance.
    */
  val instanceType: java.lang.String
  /**
    * The key name of the Instance.
    */
  val keyName: java.lang.String
  /**
    * Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
    */
  val monitoring: scala.Boolean
  /**
    * The ID of the network interface that was created with the Instance.
    */
  val networkInterfaceId: java.lang.String
  /**
    * Base-64 encoded encrypted password data for the instance.
    * Useful for getting the administrator password for instances running Microsoft Windows.
    * This attribute is only exported if `get_password_data` is true.
    * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val passwordData: java.lang.String
  /**
    * The placement group of the Instance.
    */
  val placementGroup: java.lang.String
  /**
    * The private DNS name assigned to the Instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC.
    */
  val privateDns: java.lang.String
  /**
    * The private IP address assigned to the Instance.
    */
  val privateIp: java.lang.String
  /**
    * The public DNS name assigned to the Instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC.
    */
  val publicDns: java.lang.String
  /**
    * The public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an [`aws_eip`](https://www.terraform.io/docs/providers/aws/r/eip.html) with your instance, you should refer to the EIP's address directly and not use `public_ip`, as this field will change after the EIP is attached.
    */
  val publicIp: java.lang.String
  /**
    * The root block device mappings of the Instance
    */
  val rootBlockDevices: js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationIops]
  /**
    * The associated security groups.
    */
  val securityGroups: js.Array[java.lang.String]
  /**
    * Whether the network interface performs source/destination checking (Boolean).
    */
  val sourceDestCheck: scala.Boolean
  /**
    * The VPC subnet ID.
    */
  val subnetId: java.lang.String
  /**
    * A mapping of tags assigned to the Instance.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The tenancy of the instance: `dedicated`, `default`, `host`.
    */
  val tenancy: java.lang.String
  /**
    * SHA-1 hash of User Data supplied to the Instance.
    */
  val userData: java.lang.String
  /**
    * Base64 encoded contents of User Data supplied to the Instance. Valid UTF-8 contents can be decoded with the [`base64decode` function](https://www.terraform.io/docs/configuration/functions/base64decode.html). This attribute is only exported if `get_user_data` is true.
    */
  val userDataBase64: java.lang.String
  /**
    * The associated security groups in a non-default VPC.
    */
  val vpcSecurityGroupIds: js.Array[java.lang.String]
}

object GetInstanceResult {
  @scala.inline
  def apply(
    ami: java.lang.String,
    arn: java.lang.String,
    associatePublicIpAddress: scala.Boolean,
    availabilityZone: java.lang.String,
    creditSpecifications: js.Array[atPulumiAwsLib.Anon_CpuCredits],
    disableApiTermination: scala.Boolean,
    ebsBlockDevices: js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId],
    ebsOptimized: scala.Boolean,
    ephemeralBlockDevices: js.Array[atPulumiAwsLib.Anon_DeviceNameNoDevice],
    hostId: java.lang.String,
    iamInstanceProfile: java.lang.String,
    id: java.lang.String,
    instanceState: java.lang.String,
    instanceTags: org.scalablytyped.runtime.StringDictionary[js.Any],
    instanceType: java.lang.String,
    keyName: java.lang.String,
    monitoring: scala.Boolean,
    networkInterfaceId: java.lang.String,
    passwordData: java.lang.String,
    placementGroup: java.lang.String,
    privateDns: java.lang.String,
    privateIp: java.lang.String,
    publicDns: java.lang.String,
    publicIp: java.lang.String,
    rootBlockDevices: js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationIops],
    securityGroups: js.Array[java.lang.String],
    sourceDestCheck: scala.Boolean,
    subnetId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    tenancy: java.lang.String,
    userData: java.lang.String,
    userDataBase64: java.lang.String,
    vpcSecurityGroupIds: js.Array[java.lang.String]
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal(ami = ami, arn = arn, associatePublicIpAddress = associatePublicIpAddress, availabilityZone = availabilityZone, creditSpecifications = creditSpecifications, disableApiTermination = disableApiTermination, ebsBlockDevices = ebsBlockDevices, ebsOptimized = ebsOptimized, ephemeralBlockDevices = ephemeralBlockDevices, hostId = hostId, iamInstanceProfile = iamInstanceProfile, id = id, instanceState = instanceState, instanceTags = instanceTags, instanceType = instanceType, keyName = keyName, monitoring = monitoring, networkInterfaceId = networkInterfaceId, passwordData = passwordData, placementGroup = placementGroup, privateDns = privateDns, privateIp = privateIp, publicDns = publicDns, publicIp = publicIp, rootBlockDevices = rootBlockDevices, securityGroups = securityGroups, sourceDestCheck = sourceDestCheck, subnetId = subnetId, tags = tags, tenancy = tenancy, userData = userData, userDataBase64 = userDataBase64, vpcSecurityGroupIds = vpcSecurityGroupIds)
  
    __obj.asInstanceOf[GetInstanceResult]
  }
}

