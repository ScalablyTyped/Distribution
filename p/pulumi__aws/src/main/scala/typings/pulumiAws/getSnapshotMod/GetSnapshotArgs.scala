package typings.pulumiAws.getSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ebs.GetSnapshotFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-snapshots in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetSnapshotFilter]] = js.native
  /**
    * If more than one result is returned, use the most recent snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
    */
  val owners: js.UndefOr[js.Array[String]] = js.native
  /**
    * One or more AWS accounts IDs that can create volumes from the snapshot.
    */
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Returns information on a specific snapshot_id.
    */
  val snapshotIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of tags for the resource.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetSnapshotArgs {
  @scala.inline
  def apply(): GetSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotArgs]
  }
  @scala.inline
  implicit class GetSnapshotArgsOps[Self <: GetSnapshotArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetSnapshotFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetSnapshotFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
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
    @scala.inline
    def setSnapshotIdsVarargs(value: String*): Self = this.set("snapshotIds", js.Array(value :_*))
    @scala.inline
    def setSnapshotIds(value: js.Array[String]): Self = this.set("snapshotIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotIds: Self = this.set("snapshotIds", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

