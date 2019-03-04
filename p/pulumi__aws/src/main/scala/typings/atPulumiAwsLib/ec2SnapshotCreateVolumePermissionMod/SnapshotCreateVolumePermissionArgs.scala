package typings
package atPulumiAwsLib.ec2SnapshotCreateVolumePermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCreateVolumePermissionArgs extends js.Object {
  /**
    * An AWS Account ID to add create volume permissions
    */
  val accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A snapshot ID
    */
  val snapshotId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object SnapshotCreateVolumePermissionArgs {
  @scala.inline
  def apply(
    accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    snapshotId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): SnapshotCreateVolumePermissionArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnapshotCreateVolumePermissionArgs]
  }
}

