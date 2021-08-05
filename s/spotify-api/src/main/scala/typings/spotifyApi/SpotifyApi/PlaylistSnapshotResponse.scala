package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response with Playlist Snapshot
  */
trait PlaylistSnapshotResponse extends StObject {
  
  var snapshot_id: String
}
object PlaylistSnapshotResponse {
  
  inline def apply(snapshot_id: String): PlaylistSnapshotResponse = {
    val __obj = js.Dynamic.literal(snapshot_id = snapshot_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistSnapshotResponse]
  }
  
  extension [Self <: PlaylistSnapshotResponse](x: Self) {
    
    inline def setSnapshot_id(value: String): Self = StObject.set(x, "snapshot_id", value.asInstanceOf[js.Any])
  }
}
