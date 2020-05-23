package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReorderPlaylistTracksOptions extends SnapshotOptions {
  var range_length: js.UndefOr[Double] = js.undefined
}

object ReorderPlaylistTracksOptions {
  @scala.inline
  def apply(range_length: js.UndefOr[Double] = js.undefined, snapshot_id: String = null): ReorderPlaylistTracksOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(range_length)) __obj.updateDynamic("range_length")(range_length.get.asInstanceOf[js.Any])
    if (snapshot_id != null) __obj.updateDynamic("snapshot_id")(snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReorderPlaylistTracksOptions]
  }
}

