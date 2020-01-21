package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with Playlist Snapshot
  */
trait PlaylistSnapshotResponse extends js.Object {
  var snapshot_id: String
}

object PlaylistSnapshotResponse {
  @scala.inline
  def apply(snapshot_id: String): PlaylistSnapshotResponse = {
    val __obj = js.Dynamic.literal(snapshot_id = snapshot_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaylistSnapshotResponse]
  }
}

