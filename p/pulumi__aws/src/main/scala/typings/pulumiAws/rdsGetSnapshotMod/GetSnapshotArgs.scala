package typings.pulumiAws.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotArgs extends js.Object {
  /**
    * Returns the list of snapshots created by the specific db_instance
    */
  val dbInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * Returns information on a specific snapshot_id.
    */
  val dbSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Set this value to true to include manual DB snapshots that are public and can be
    * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
    */
  val includePublic: js.UndefOr[Boolean] = js.native
  /**
    * Set this value to true to include shared manual DB snapshots from other
    * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
    * The default is `false`.
    */
  val includeShared: js.UndefOr[Boolean] = js.native
  /**
    * If more than one result is returned, use the most
    * recent Snapshot.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * The type of snapshots to be returned. If you don't specify a SnapshotType
    * value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not
    * included in the returned results by default. Possible values are, `automated`, `manual`, `shared` and `public`.
    */
  val snapshotType: js.UndefOr[String] = js.native
}

object GetSnapshotArgs {
  @scala.inline
  def apply(): GetSnapshotArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotArgs]
  }
  @scala.inline
  implicit class GetSnapshotArgsOps[Self <: GetSnapshotArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDbInstanceIdentifier(value: String): Self = this.set("dbInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("dbInstanceIdentifier", js.undefined)
    @scala.inline
    def setDbSnapshotIdentifier(value: String): Self = this.set("dbSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbSnapshotIdentifier: Self = this.set("dbSnapshotIdentifier", js.undefined)
    @scala.inline
    def setIncludePublic(value: Boolean): Self = this.set("includePublic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePublic: Self = this.set("includePublic", js.undefined)
    @scala.inline
    def setIncludeShared(value: Boolean): Self = this.set("includeShared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeShared: Self = this.set("includeShared", js.undefined)
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
    @scala.inline
    def setSnapshotType(value: String): Self = this.set("snapshotType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotType: Self = this.set("snapshotType", js.undefined)
  }
  
}

