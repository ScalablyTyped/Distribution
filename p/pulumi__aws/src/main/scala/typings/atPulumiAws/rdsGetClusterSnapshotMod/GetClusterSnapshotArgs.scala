package typings.atPulumiAws.rdsGetClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterSnapshotArgs extends js.Object {
  /**
    * Returns the list of snapshots created by the specific db_cluster
    */
  val dbClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Returns information on a specific snapshot_id.
    */
  val dbClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Set this value to true to include manual DB Cluster Snapshots that are public and can be
    * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
    */
  val includePublic: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this value to true to include shared manual DB Cluster Snapshots from other
    * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
    * The default is `false`.
    */
  val includeShared: js.UndefOr[Boolean] = js.undefined
  /**
    * If more than one result is returned, use the most recent Snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of snapshots to be returned. If you don't specify a SnapshotType
    * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
    * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
    */
  val snapshotType: js.UndefOr[String] = js.undefined
}

object GetClusterSnapshotArgs {
  @scala.inline
  def apply(
    dbClusterIdentifier: String = null,
    dbClusterSnapshotIdentifier: String = null,
    includePublic: js.UndefOr[Boolean] = js.undefined,
    includeShared: js.UndefOr[Boolean] = js.undefined,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    snapshotType: String = null
  ): GetClusterSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    if (dbClusterIdentifier != null) __obj.updateDynamic("dbClusterIdentifier")(dbClusterIdentifier)
    if (dbClusterSnapshotIdentifier != null) __obj.updateDynamic("dbClusterSnapshotIdentifier")(dbClusterSnapshotIdentifier)
    if (!js.isUndefined(includePublic)) __obj.updateDynamic("includePublic")(includePublic)
    if (!js.isUndefined(includeShared)) __obj.updateDynamic("includeShared")(includeShared)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType)
    __obj.asInstanceOf[GetClusterSnapshotArgs]
  }
}

