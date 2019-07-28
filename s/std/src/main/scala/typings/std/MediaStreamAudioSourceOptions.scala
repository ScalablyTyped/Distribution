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
    val __obj = js.Dynamic.literal(mediaStream = mediaStream)
  
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
}

