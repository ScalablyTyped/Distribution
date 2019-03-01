package typings
package atPulumiAwsLib.rdsGetClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterSnapshotArgs extends js.Object {
  /**
    * Returns the list of snapshots created by the specific db_cluster
    */
  val dbClusterIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returns information on a specific snapshot_id.
    */
  val dbClusterSnapshotIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this value to true to include manual DB Cluster Snapshots that are public and can be
    * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
    */
  val includePublic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set this value to true to include shared manual DB Cluster Snapshots from other
    * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
    * The default is `false`.
    */
  val includeShared: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If more than one result is returned, use the most recent Snapshot.
    */
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The type of snapshots to be returned. If you don't specify a SnapshotType
    * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
    * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
    */
  val snapshotType: js.UndefOr[java.lang.String] = js.undefined
}

object GetClusterSnapshotArgs {
  @scala.inline
  def apply(
    dbClusterIdentifier: java.lang.String = null,
    dbClusterSnapshotIdentifier: java.lang.String = null,
    includePublic: js.UndefOr[scala.Boolean] = js.undefined,
    includeShared: js.UndefOr[scala.Boolean] = js.undefined,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined,
    snapshotType: java.lang.String = null
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

