package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaElementAudioSourceOptions extends js.Object {
  var mediaElement: HTMLMediaElement
}

object MediaElementAudioSourceOptions {
  @scala.inline
  def apply(mediaElement: HTMLMediaElement): MediaElementAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaElement = mediaElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaElementAudioSourceOptions]
  }
}

