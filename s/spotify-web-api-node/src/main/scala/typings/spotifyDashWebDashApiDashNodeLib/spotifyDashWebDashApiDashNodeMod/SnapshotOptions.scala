package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotOptions extends js.Object {
  var snapshot_id: js.UndefOr[java.lang.String] = js.undefined
}

object SnapshotOptions {
  @scala.inline
  def apply(snapshot_id: java.lang.String = null): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (snapshot_id != null) __obj.updateDynamic("snapshot_id")(snapshot_id)
    __obj.asInstanceOf[SnapshotOptions]
  }
}

