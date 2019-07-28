package typings.atPulumiAws.efsGetMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMountTargetResult extends js.Object {
  /**
    * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: String
  /**
    * Amazon Resource Name of the file system for which the mount target is intended.
    */
  val fileSystemArn: String
  /**
    * ID of the file system for which the mount target is intended.
    */
  val fileSystemId: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Address at which the file system may be mounted via the mount target.
    */
  val ipAddress: String
  val mountTargetId: String
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  val networkInterfaceId: String
  /**
    * List of VPC security group IDs attached to the mount target.
    */
  val securityGroups: js.Array[String]
  /**
    * ID of the mount target's subnet.
    */
  val subnetId: String
}

object GetMountTargetResult {
  @scala.inline
  def apply(
    dnsName: String,
    fileSystemArn: String,
    fileSystemId: String,
    id: String,
    ipAddress: String,
    mountTargetId: String,
    networkInterfaceId: String,
    securityGroups: js.Array[String],
    subnetId: String
  ): GetMountTargetResult = {
    val __obj = js.Dynamic.literal(dnsName = dnsName, fileSystemArn = fileSystemArn, fileSystemId = fileSystemId, id = id, ipAddress = ipAddress, mountTargetId = mountTargetId, networkInterfaceId = networkInterfaceId, securityGroups = securityGroups, subnetId = subnetId)
  
    __obj.asInstanceOf[GetMountTargetResult]
  }
}

