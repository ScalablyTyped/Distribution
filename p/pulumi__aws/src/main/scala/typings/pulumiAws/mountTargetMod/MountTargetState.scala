package typings.pulumiAws.mountTargetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountTargetState extends js.Object {
  /**
    * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
    */
  val availabilityZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Availability Zone (AZ) that the mount target resides in.
    */
  val availabilityZoneName: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS name for the EFS file system.
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name of the file system.
    */
  val fileSystemArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the file system for which the mount target is intended.
    */
  val fileSystemId: js.UndefOr[Input[String]] = js.native
  /**
    * The address (within the address range of the specified subnet) at
    * which the file system may be mounted via the mount target.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val mountTargetDnsName: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * AWS account ID that owns the resource.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of up to 5 VPC security group IDs (that must
    * be for the same VPC as subnet specified) in effect for the mount target.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the subnet to add the mount target in.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
}

object MountTargetState {
  @scala.inline
  def apply(): MountTargetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountTargetState]
  }
  @scala.inline
  implicit class MountTargetStateOps[Self <: MountTargetState] (val x: Self) extends AnyVal {
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
    def setAvailabilityZoneId(value: Input[String]): Self = this.set("availabilityZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("availabilityZoneId", js.undefined)
    @scala.inline
    def setAvailabilityZoneName(value: Input[String]): Self = this.set("availabilityZoneName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneName: Self = this.set("availabilityZoneName", js.undefined)
    @scala.inline
    def setDnsName(value: Input[String]): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    @scala.inline
    def setFileSystemArn(value: Input[String]): Self = this.set("fileSystemArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystemArn: Self = this.set("fileSystemArn", js.undefined)
    @scala.inline
    def setFileSystemId(value: Input[String]): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystemId: Self = this.set("fileSystemId", js.undefined)
    @scala.inline
    def setIpAddress(value: Input[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setMountTargetDnsName(value: Input[String]): Self = this.set("mountTargetDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountTargetDnsName: Self = this.set("mountTargetDnsName", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
  }
  
}

