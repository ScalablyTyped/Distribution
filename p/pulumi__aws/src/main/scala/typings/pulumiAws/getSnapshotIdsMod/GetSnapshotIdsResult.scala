package typings.pulumiAws.getSnapshotIdsMod

import typings.pulumiAws.outputMod.ebs.GetSnapshotIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotIdsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetSnapshotIdsFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val ids: js.Array[String] = js.native
  val owners: js.UndefOr[js.Array[String]] = js.native
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
}

object GetSnapshotIdsResult {
  @scala.inline
  def apply(id: String, ids: js.Array[String]): GetSnapshotIdsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotIdsResult]
  }
  @scala.inline
  implicit class GetSnapshotIdsResultOps[Self <: GetSnapshotIdsResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
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

