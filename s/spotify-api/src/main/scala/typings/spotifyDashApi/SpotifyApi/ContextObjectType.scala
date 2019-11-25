package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyDashApi.spotifyDashApiStrings.artist
  - typings.spotifyDashApi.spotifyDashApiStrings.playlist
  - typings.spotifyDashApi.spotifyDashApiStrings.album
*/
trait ContextObjectType extends js.Object

object ContextObjectType {
  @scala.inline
  def album: typings.spotifyDashApi.spotifyDashApiStrings.album = this.cast("album")
  @scala.inline
  def artist: typings.spotifyDashApi.spotifyDashApiStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typings.spotifyDashApi.spotifyDashApiStrings.playlist = this.cast("playlist")
}

