package typings.pulumiAws.getSnapshotIdsMod

import typings.pulumiAws.outputMod.ebs.GetSnapshotIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotIdsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetSnapshotIdsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val ids: js.Array[String] = js.native
  val owners: js.UndefOr[js.Array[String]] = js.native
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
}

object GetSnapshotIdsResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    filters: js.Array[GetSnapshotIdsFilter] = null,
    owners: js.Array[String] = null,
    restorableByUserIds: js.Array[String] = null
  ): GetSnapshotIdsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (restorableByUserIds != null) __obj.updateDynamic("restorableByUserIds")(restorableByUserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotIdsResult]
  }
}

