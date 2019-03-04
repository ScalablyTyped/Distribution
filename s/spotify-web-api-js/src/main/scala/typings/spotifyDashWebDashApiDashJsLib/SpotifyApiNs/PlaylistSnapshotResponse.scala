package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with Playlist Snapshot
  */
trait PlaylistSnapshotResponse extends js.Object {
  var snapshot_id: java.lang.String
}

object PlaylistSnapshotResponse {
  @scala.inline
  def apply(snapshot_id: java.lang.String): PlaylistSnapshotResponse = {
    val __obj = js.Dynamic.literal(snapshot_id = snapshot_id)
  
    __obj.asInstanceOf[PlaylistSnapshotResponse]
  }
}

