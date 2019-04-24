package typings
package atPulumiAwsLib.ebsGetSnapshotIdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotIdsResult extends js.Object {
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val ids: js.Array[java.lang.String]
  val owners: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val restorableByUserIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object GetSnapshotIdsResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    ids: js.Array[java.lang.String],
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    owners: js.Array[java.lang.String] = null,
    restorableByUserIds: js.Array[java.lang.String] = null
  ): GetSnapshotIdsResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (restorableByUserIds != null) __obj.updateDynamic("restorableByUserIds")(restorableByUserIds)
    __obj.asInstanceOf[GetSnapshotIdsResult]
  }
}

