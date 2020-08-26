package typings.sipJs.simpleUserOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleUserMediaConstraints extends js.Object {
  /** If true, offer and answer to send and receive audio. */
  var audio: Boolean = js.native
  /** If true, offer and answer to send and receive video. */
  var video: Boolean = js.native
}

object SimpleUserMediaConstraints {
  @scala.inline
  def apply(audio: Boolean, video: Boolean): SimpleUserMediaConstraints = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleUserMediaConstraints]
  }
  @scala.inline
  implicit class SimpleUserMediaConstraintsOps[Self <: SimpleUserMediaConstraints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudio(value: Boolean): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
  }
  
}

