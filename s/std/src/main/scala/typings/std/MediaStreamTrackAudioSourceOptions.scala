package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackAudioSourceOptions extends js.Object {
  var mediaStreamTrack: MediaStreamTrack
}

object MediaStreamTrackAudioSourceOptions {
  @scala.inline
  def apply(mediaStreamTrack: MediaStreamTrack): MediaStreamTrackAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStreamTrack = mediaStreamTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackAudioSourceOptions]
  }
}

