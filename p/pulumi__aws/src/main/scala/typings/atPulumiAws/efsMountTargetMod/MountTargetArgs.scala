package typings.atPulumiAws.efsMountTargetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountTargetArgs extends js.Object {
  /**
    * The ID of the file system for which the mount target is intended.
    */
  val fileSystemId: Input[String]
  /**
    * The address (within the address range of the specified subnet) at
    * which the file system may be mounted via the mount target.
    */
  val ipAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of up to 5 VPC security group IDs (that must
    * be for the same VPC as subnet specified) in effect for the mount target.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ID of the subnet to add the mount target in.
    */
  val subnetId: Input[String]
}

object MountTargetArgs {
  @scala.inline
  def apply(
    fileSystemId: Input[String],
    subnetId: Input[String],
    ipAddress: Input[String] = null,
    securityGroups: Input[js.Array[Input[String]]] = null
  ): MountTargetArgs = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountTargetArgs]
  }
}

