package typings
package atPulumiAwsLib.efsMountTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountTargetArgs extends js.Object {
  /**
    * The ID of the file system for which the mount target is intended.
    */
  val fileSystemId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The address (within the address range of the specified subnet) at
    * which the file system may be mounted via the mount target.
    */
  val ipAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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
  val subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object MountTargetArgs {
  @scala.inline
  def apply(
    fileSystemId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ipAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): MountTargetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSystemId")(fileSystemId.asInstanceOf[js.Any])
    __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountTargetArgs]
  }
}

