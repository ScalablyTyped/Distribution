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
    * A mapping of tags for the resource.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetSnapshotArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetSnapshotFilter] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    owners: js.Array[String] = null,
    restorableByUserIds: js.Array[String] = null,
    snapshotIds: js.Array[String] = null,
    tags: StringDictionary[js.Any] = null
  ): GetSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (restorableByUserIds != null) __obj.updateDynamic("restorableByUserIds")(restorableByUserIds.asInstanceOf[js.Any])
    if (snapshotIds != null) __obj.updateDynamic("snapshotIds")(snapshotIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotArgs]
  }
}

