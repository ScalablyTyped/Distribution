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
  def apply(): SnapshotCreateVolumePermissionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCreateVolumePermissionState]
  }
  @scala.inline
  implicit class SnapshotCreateVolumePermissionStateOps[Self <: SnapshotCreateVolumePermissionState] (val x: Self) extends AnyVal {
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
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
  }
  
}

