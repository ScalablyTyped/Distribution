package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyWebApiJs.spotifyWebApiJsStrings.off
  - typings.spotifyWebApiJs.spotifyWebApiJsStrings.track
  - typings.spotifyWebApiJs.spotifyWebApiJsStrings.context
*/
trait PlaybackRepeatState extends js.Object

object PlaybackRepeatState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def context: typings.spotifyWebApiJs.spotifyWebApiJsStrings.context = this.cast("context")
  @scala.inline
  def off: typings.spotifyWebApiJs.spotifyWebApiJsStrings.off = this.cast("off")
  @scala.inline
  def track: typings.spotifyWebApiJs.spotifyWebApiJsStrings.track = this.cast("track")
}

