package typings.reactAdaptiveHooks.anon

import typings.reactAdaptiveHooks.mediaCapabilitiesMod.VideoMediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  var video: VideoMediaConfiguration
}

object Video {
  @scala.inline
  def apply(video: VideoMediaConfiguration): Video = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
}

