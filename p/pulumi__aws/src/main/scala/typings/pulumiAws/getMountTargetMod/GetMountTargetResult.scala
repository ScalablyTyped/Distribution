package typings.pulumiAws.getMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMountTargetResult extends js.Object {
  /**
    * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
    */
  val availabilityZoneId: String = js.native
  /**
    * The name of the Availability Zone (AZ) that the mount target resides in.
    */
  val availabilityZoneName: String = js.native
  /**
    * The DNS name for the EFS file system.
    */
  val dnsName: String = js.native
  /**
    * Amazon Resource Name of the file system for which the mount target is intended.
    */
  val fileSystemArn: String = js.native
  /**
    * ID of the file system for which the mount target is intended.
    */
  val fileSystemId: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Address at which the file system may be mounted via the mount target.
    */
  val ipAddress: String = js.native
  /**
    * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val mountTargetDnsName: String = js.native
  val mountTargetId: String = js.native
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  val networkInterfaceId: String = js.native
  /**
    * AWS account ID that owns the resource.
    */
  val ownerId: String = js.native
  /**
    * List of VPC security group IDs attached to the mount target.
    */
  val securityGroups: js.Array[String] = js.native
  /**
    * ID of the mount target's subnet.
    */
  val subnetId: String = js.native
}

object GetMountTargetResult {
  @scala.inline
  def apply(
    availabilityZoneId: String,
    availabilityZoneName: String,
    dnsName: String,
    fileSystemArn: String,
    fileSystemId: String,
    id: String,
    ipAddress: String,
    mountTargetDnsName: String,
    mountTargetId: String,
    networkInterfaceId: String,
    ownerId: String,
    securityGroups: js.Array[String],
    subnetId: String
  ): GetMountTargetResult = {
    val __obj = js.Dynamic.literal(availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], availabilityZoneName = availabilityZoneName.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], fileSystemArn = fileSystemArn.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], mountTargetDnsName = mountTargetDnsName.asInstanceOf[js.Any], mountTargetId = mountTargetId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMountTargetResult]
  }
  @scala.inline
  implicit class GetMountTargetResultOps[Self <: GetMountTargetResult] (val x: Self) extends AnyVal {
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
    def setAvailabilityZoneId(value: String): Self = this.set("availabilityZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZoneName(value: String): Self = this.set("availabilityZoneName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDnsName(value: String): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSystemArn(value: String): Self = this.set("fileSystemArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setMountTargetDnsName(value: String): Self = this.set("mountTargetDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMountTargetId(value: String): Self = this.set("mountTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
  }
  
}

