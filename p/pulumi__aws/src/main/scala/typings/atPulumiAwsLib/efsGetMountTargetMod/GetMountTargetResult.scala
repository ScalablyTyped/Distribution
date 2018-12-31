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

