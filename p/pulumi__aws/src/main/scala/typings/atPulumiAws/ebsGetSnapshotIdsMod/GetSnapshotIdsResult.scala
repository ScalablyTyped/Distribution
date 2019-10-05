package typings.atPulumiAws.ebsGetSnapshotIdsMod

import typings.atPulumiAws.typesOutputMod.ebs.GetSnapshotIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotIdsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetSnapshotIdsFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val ids: js.Array[String]
  val owners: js.UndefOr[js.Array[String]] = js.undefined
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.undefined
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
    val __obj = js.Dynamic.literal(id = id, ids = ids)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (restorableByUserIds != null) __obj.updateDynamic("restorableByUserIds")(restorableByUserIds)
    __obj.asInstanceOf[GetSnapshotIdsResult]
  }
}

