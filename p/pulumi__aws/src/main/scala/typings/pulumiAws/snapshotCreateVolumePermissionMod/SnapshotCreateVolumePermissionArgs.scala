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
  @scala.inline
  implicit class SnapshotCreateVolumePermissionArgsOps[Self <: SnapshotCreateVolumePermissionArgs] (val x: Self) extends AnyVal {
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
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
  }
  
}

