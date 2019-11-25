package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  var snapshot_id: js.UndefOr[String] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(snapshot_id: String = null): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (snapshot_id != null) __obj.updateDynamic("snapshot_id")(snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptions]
  }
}

