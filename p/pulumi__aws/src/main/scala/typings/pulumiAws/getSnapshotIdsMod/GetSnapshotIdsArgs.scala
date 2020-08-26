package typings.pulumiAws.getSnapshotIdsMod

import typings.pulumiAws.inputMod.ebs.GetSnapshotIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotIdsArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-volumes in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetSnapshotIdsFilter]] = js.native
  /**
    * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
    */
  val owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * One or more AWS accounts IDs that can create volumes from the snapshot.
    */
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
}

object GetSnapshotIdsArgs {
  @scala.inline
  def apply(): GetSnapshotIdsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotIdsArgs]
  }
  @scala.inline
  implicit class GetSnapshotIdsArgsOps[Self <: GetSnapshotIdsArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetSnapshotIdsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetSnapshotIdsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    @scala.inline
    def setRestorableByUserIdsVarargs(value: String*): Self = this.set("restorableByUserIds", js.Array(value :_*))
    @scala.inline
    def setRestorableByUserIds(value: js.Array[String]): Self = this.set("restorableByUserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestorableByUserIds: Self = this.set("restorableByUserIds", js.undefined)
  }
  
}

