package typings.pulumiAws.snapshotCreateVolumePermissionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCreateVolumePermissionState extends js.Object {
  /**
    * An AWS Account ID to add create volume permissions
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * A snapshot ID
    */
  val snapshotId: js.UndefOr[Input[String]] = js.native
}

object SnapshotCreateVolumePermissionState {
  @scala.inline
  def apply(accountId: Input[String] = null, snapshotId: Input[String] = null): SnapshotCreateVolumePermissionState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreateVolumePermissionState]
  }
}

