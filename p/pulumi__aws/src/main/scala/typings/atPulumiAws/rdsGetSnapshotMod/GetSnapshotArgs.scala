package typings.atPulumiAws.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotArgs extends js.Object {
  /**
    * Returns the list of snapshots created by the specific db_instance
    */
  val dbInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Returns information on a specific snapshot_id.
    */
  val dbSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Set this value to true to include manual DB snapshots that are public and can be
    * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
    */
  val includePublic: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this value to true to include shared manual DB snapshots from other
    * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
    * The default is `false`.
    */
  val includeShared: js.UndefOr[Boolean] = js.undefined
  /**
    * If more than one result is returned, use the most
    * recent Snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of snapshots to be returned. If you don't specify a SnapshotType
    * value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not
    * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
    */
  val snapshotType: js.UndefOr[String] = js.undefined
}

object GetSnapshotArgs {
  @scala.inline
  def apply(
    dbInstanceIdentifier: String = null,
    dbSnapshotIdentifier: String = null,
    includePublic: js.UndefOr[Boolean] = js.undefined,
    includeShared: js.UndefOr[Boolean] = js.undefined,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    snapshotType: String = null
  ): GetSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    if (dbInstanceIdentifier != null) __obj.updateDynamic("dbInstanceIdentifier")(dbInstanceIdentifier)
    if (dbSnapshotIdentifier != null) __obj.updateDynamic("dbSnapshotIdentifier")(dbSnapshotIdentifier)
    if (!js.isUndefined(includePublic)) __obj.updateDynamic("includePublic")(includePublic)
    if (!js.isUndefined(includeShared)) __obj.updateDynamic("includeShared")(includeShared)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType)
    __obj.asInstanceOf[GetSnapshotArgs]
  }
}

