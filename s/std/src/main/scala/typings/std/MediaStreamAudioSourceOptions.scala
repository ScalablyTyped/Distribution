package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamAudioSourceOptions extends js.Object {
  var mediaStream: MediaStream = js.native
}

object MediaStreamAudioSourceOptions {
  @scala.inline
  def apply(mediaStream: MediaStream): MediaStreamAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStream = mediaStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
  @scala.inline
  implicit class MediaStreamAudioSourceOptionsOps[Self <: MediaStreamAudioSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMediaStream(value: MediaStream): Self = this.set("mediaStream", value.asInstanceOf[js.Any])
  }
  
}

