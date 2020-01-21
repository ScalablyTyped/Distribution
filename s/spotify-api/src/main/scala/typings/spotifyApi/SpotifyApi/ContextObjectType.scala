package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyApi.spotifyApiStrings.artist
  - typings.spotifyApi.spotifyApiStrings.playlist
  - typings.spotifyApi.spotifyApiStrings.album
*/
trait ContextObjectType extends js.Object

object ContextObjectType {
  @scala.inline
  def album: typings.spotifyApi.spotifyApiStrings.album = this.cast("album")
  @scala.inline
  def artist: typings.spotifyApi.spotifyApiStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typings.spotifyApi.spotifyApiStrings.playlist = this.cast("playlist")
}

