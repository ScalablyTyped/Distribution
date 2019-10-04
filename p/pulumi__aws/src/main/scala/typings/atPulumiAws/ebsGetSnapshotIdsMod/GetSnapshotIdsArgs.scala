package typings.atPulumiAws.ebsGetSnapshotIdsMod

import typings.atPulumiAws.typesInputMod.ebsNs.GetSnapshotIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotIdsArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-volumes in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetSnapshotIdsFilter]] = js.undefined
  /**
    * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
    */
  val owners: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * One or more AWS accounts IDs that can create volumes from the snapshot.
    */
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.undefined
}

object GetSnapshotIdsArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetSnapshotIdsFilter] = null,
    owners: js.Array[String] = null,
    restorableByUserIds: js.Array[String] = null
  ): GetSnapshotIdsArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (restorableByUserIds != null) __obj.updateDynamic("restorableByUserIds")(restorableByUserIds)
    __obj.asInstanceOf[GetSnapshotIdsArgs]
  }
}

