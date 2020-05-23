package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video. */
trait VideoPlaybackQuality extends js.Object {
  val creationTime: Double
  val droppedVideoFrames: Double
  val totalVideoFrames: Double
}

object VideoPlaybackQuality {
  @scala.inline
  def apply(creationTime: Double, droppedVideoFrames: Double, totalVideoFrames: Double): VideoPlaybackQuality = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], droppedVideoFrames = droppedVideoFrames.asInstanceOf[js.Any], totalVideoFrames = totalVideoFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlaybackQuality]
  }
}

