package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyApi.spotifyApiStrings.off
  - typings.spotifyApi.spotifyApiStrings.track
  - typings.spotifyApi.spotifyApiStrings.context
*/
trait PlaybackRepeatState extends js.Object

object PlaybackRepeatState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def context: typings.spotifyApi.spotifyApiStrings.context = this.cast("context")
  @scala.inline
  def off: typings.spotifyApi.spotifyApiStrings.off = this.cast("off")
  @scala.inline
  def track: typings.spotifyApi.spotifyApiStrings.track = this.cast("track")
}

