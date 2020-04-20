package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.mediaCapabilitiesMod.VideoMediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVideo extends js.Object {
  var video: VideoMediaConfiguration
}

object AnonVideo {
  @scala.inline
  def apply(video: VideoMediaConfiguration): AnonVideo = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVideo]
  }
}

