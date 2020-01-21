package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyWebApiJs.spotifyWebApiJsStrings.artist
  - typings.spotifyWebApiJs.spotifyWebApiJsStrings.playlist
  - typings.spotifyWebApiJs.spotifyWebApiJsStrings.album
*/
trait ContextObjectType extends js.Object

object ContextObjectType {
  @scala.inline
  def album: typings.spotifyWebApiJs.spotifyWebApiJsStrings.album = this.cast("album")
  @scala.inline
  def artist: typings.spotifyWebApiJs.spotifyWebApiJsStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typings.spotifyWebApiJs.spotifyWebApiJsStrings.playlist = this.cast("playlist")
}

