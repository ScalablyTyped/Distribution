package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.account_error
  - typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.authentication_error
  - typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.initialization_error
  - typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.playback_error
*/
trait ErrorTypes extends js.Object

object ErrorTypes {
  @scala.inline
  def account_error: typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.account_error = this.cast("account_error")
  @scala.inline
  def authentication_error: typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.authentication_error = this.cast("authentication_error")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initialization_error: typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.initialization_error = this.cast("initialization_error")
  @scala.inline
  def playback_error: typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.playback_error = this.cast("playback_error")
}

