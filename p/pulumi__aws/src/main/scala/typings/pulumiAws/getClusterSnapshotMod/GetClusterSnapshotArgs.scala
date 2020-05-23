package typings.pulumiAws.getClusterSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterSnapshotArgs extends js.Object {
  /**
    * Returns the list of snapshots created by the specific db_cluster
    */
  val dbClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * Returns information on a specific snapshot_id.
    */
  val dbClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Set this value to true to include manual DB Cluster Snapshots that are public and can be
    * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
    */
  val includePublic: js.UndefOr[Boolean] = js.native
  /**
    * Set this value to true to include shared manual DB Cluster Snapshots from other
    * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
    * The default is `false`.
    */
  val includeShared: js.UndefOr[Boolean] = js.native
  /**
    * If more than one result is returned, use the most recent Snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * The type of snapshots to be returned. If you don't specify a SnapshotType
    * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
    * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
    */
  val snapshotType: js.UndefOr[String] = js.native
  /**
    * A mapping of tags for the resource.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetClusterSnapshotArgs {
  @scala.inline
  def apply(
    dbClusterIdentifier: String = null,
    dbClusterSnapshotIdentifier: String = null,
    includePublic: js.UndefOr[Boolean] = js.undefined,
    includeShared: js.UndefOr[Boolean] = js.undefined,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    snapshotType: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetClusterSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    if (dbClusterIdentifier != null) __obj.updateDynamic("dbClusterIdentifier")(dbClusterIdentifier.asInstanceOf[js.Any])
    if (dbClusterSnapshotIdentifier != null) __obj.updateDynamic("dbClusterSnapshotIdentifier")(dbClusterSnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(includePublic)) __obj.updateDynamic("includePublic")(includePublic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeShared)) __obj.updateDynamic("includeShared")(includeShared.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.get.asInstanceOf[js.Any])
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterSnapshotArgs]
  }
}

