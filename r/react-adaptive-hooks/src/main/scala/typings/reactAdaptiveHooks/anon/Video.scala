package typings.reactAdaptiveHooks.anon

import typings.reactAdaptiveHooks.mediaCapabilitiesMod.VideoMediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  var video: VideoMediaConfiguration = js.native
}

object Video {
  @scala.inline
  def apply(video: VideoMediaConfiguration): Video = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
  @scala.inline
  implicit class VideoOps[Self <: Video] (val x: Self) extends AnyVal {
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
    def setVideo(value: VideoMediaConfiguration): Self = this.set("video", value.asInstanceOf[js.Any])
  }
  
}

