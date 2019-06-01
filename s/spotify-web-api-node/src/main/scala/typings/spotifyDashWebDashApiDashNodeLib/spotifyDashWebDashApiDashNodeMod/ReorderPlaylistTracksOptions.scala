package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReorderPlaylistTracksOptions extends SnapshotOptions {
  var range_length: js.UndefOr[scala.Double] = js.undefined
}

object ReorderPlaylistTracksOptions {
  @scala.inline
  def apply(range_length: scala.Int | scala.Double = null, snapshot_id: java.lang.String = null): ReorderPlaylistTracksOptions = {
    val __obj = js.Dynamic.literal()
    if (range_length != null) __obj.updateDynamic("range_length")(range_length.asInstanceOf[js.Any])
    if (snapshot_id != null) __obj.updateDynamic("snapshot_id")(snapshot_id)
    __obj.asInstanceOf[ReorderPlaylistTracksOptions]
  }
}

