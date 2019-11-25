package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyDashApi.spotifyDashApiStrings.off
  - typings.spotifyDashApi.spotifyDashApiStrings.track
  - typings.spotifyDashApi.spotifyDashApiStrings.context
*/
trait PlaybackRepeatState extends js.Object

object PlaybackRepeatState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def context: typings.spotifyDashApi.spotifyDashApiStrings.context = this.cast("context")
  @scala.inline
  def off: typings.spotifyDashApi.spotifyDashApiStrings.off = this.cast("off")
  @scala.inline
  def track: typings.spotifyDashApi.spotifyDashApiStrings.track = this.cast("track")
}

