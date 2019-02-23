package typings
package atPulumiAwsLib.efsMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountTargetState extends js.Object {
  /**
    * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon Resource Name of the file system.
    */
  val fileSystemArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the file system for which the mount target is intended.
    */
  val fileSystemId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The address (within the address range of the specified subnet) at
    * which the file system may be mounted via the mount target.
    */
  val ipAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  val networkInterfaceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of up to 5 VPC security group IDs (that must
    * be for the same VPC as subnet specified) in effect for the mount target.
    */
  val securityGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ID of the subnet to add the mount target in.
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

