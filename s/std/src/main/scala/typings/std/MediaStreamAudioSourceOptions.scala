package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamAudioSourceOptions extends js.Object {
  var mediaStream: MediaStream
}

object MediaStreamAudioSourceOptions {
  @scala.inline
  def apply(mediaStream: MediaStream): MediaStreamAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStream = mediaStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
}

