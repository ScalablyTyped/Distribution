package typings
package atPulumiAwsLib.efsGetMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMountTargetResult extends js.Object {
  /**
    * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: java.lang.String
  /**
    * Amazon Resource Name of the file system for which the mount target is intended.
    */
  val fileSystemArn: java.lang.String
  /**
    * ID of the file system for which the mount target is intended.
    */
  val fileSystemId: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Address at which the file system may be mounted via the mount target.
    */
  val ipAddress: java.lang.String
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  val networkInterfaceId: java.lang.String
  /**
    * List of VPC security group IDs attached to the mount target.
    */
  val securityGroups: js.Array[java.lang.String]
  /**
    * ID of the mount target's subnet.
    */
  val subnetId: java.lang.String
}

object GetMountTargetResult {
  @scala.inline
  def apply(
    dnsName: java.lang.String,
    fileSystemArn: java.lang.String,
    fileSystemId: java.lang.String,
    id: java.lang.String,
    ipAddress: java.lang.String,
    networkInterfaceId: java.lang.String,
    securityGroups: js.Array[java.lang.String],
    subnetId: java.lang.String
  ): GetMountTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dnsName")(dnsName)
    __obj.updateDynamic("fileSystemArn")(fileSystemArn)
    __obj.updateDynamic("fileSystemId")(fileSystemId)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ipAddress")(ipAddress)
    __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    __obj.updateDynamic("securityGroups")(securityGroups)
    __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[GetMountTargetResult]
  }
}

