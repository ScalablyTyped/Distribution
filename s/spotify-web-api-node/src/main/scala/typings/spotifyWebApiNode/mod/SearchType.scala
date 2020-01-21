package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyWebApiNode.spotifyWebApiNodeStrings.album
  - typings.spotifyWebApiNode.spotifyWebApiNodeStrings.artist
  - typings.spotifyWebApiNode.spotifyWebApiNodeStrings.playlist
  - typings.spotifyWebApiNode.spotifyWebApiNodeStrings.track
*/
trait SearchType extends js.Object

object SearchType {
  @scala.inline
  def album: typings.spotifyWebApiNode.spotifyWebApiNodeStrings.album = this.cast("album")
  @scala.inline
  def artist: typings.spotifyWebApiNode.spotifyWebApiNodeStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typings.spotifyWebApiNode.spotifyWebApiNodeStrings.playlist = this.cast("playlist")
  @scala.inline
  def track: typings.spotifyWebApiNode.spotifyWebApiNodeStrings.track = this.cast("track")
}

