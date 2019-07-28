package typings.atPulumiAws.ebsGetSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-snapshots in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * If more than one result is returned, use the most recent snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
    */
  val owners: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * One or more AWS accounts IDs that can create volumes from the snapshot.
    */
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Returns information on a specific snapshot_id.
    */
  val snapshotIds: js.UndefOr[js.Array[String]] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetSnapshotArgs {
  @scala.inline
  def apply(
    filters: js.Array[Anon_NameValues] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    owners: js.Array[String] = null,
    restorableByUserIds: js.Array[String] = null,
    snapshotIds: js.Array[String] = null,
    tags: StringDictionary[js.Any] = null
  ): GetSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (restorableByUserIds != null) __obj.updateDynamic("restorableByUserIds")(restorableByUserIds)
    if (snapshotIds != null) __obj.updateDynamic("snapshotIds")(snapshotIds)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetSnapshotArgs]
  }
}

