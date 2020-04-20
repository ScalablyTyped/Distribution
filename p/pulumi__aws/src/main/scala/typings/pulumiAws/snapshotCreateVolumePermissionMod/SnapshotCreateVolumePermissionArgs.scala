package typings.pulumiAws.snapshotCreateVolumePermissionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCreateVolumePermissionArgs extends js.Object {
  /**
    * An AWS Account ID to add create volume permissions
    */
  val accountId: Input[String] = js.native
  /**
    * A snapshot ID
    */
  val snapshotId: Input[String] = js.native
}

object SnapshotCreateVolumePermissionArgs {
  @scala.inline
  def apply(accountId: Input[String], snapshotId: Input[String]): SnapshotCreateVolumePermissionArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreateVolumePermissionArgs]
  }
}

