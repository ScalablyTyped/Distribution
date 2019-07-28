package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video. */
trait VideoPlaybackQuality extends js.Object {
  val corruptedVideoFrames: Double
  val creationTime: Double
  val droppedVideoFrames: Double
  val totalFrameDelay: Double
  val totalVideoFrames: Double
}

@JSGlobal("VideoPlaybackQuality")
@js.native
class VideoPlaybackQualityCls () extends VideoPlaybackQuality {
  /* CompleteClass */
  override val corruptedVideoFrames: Double = js.native
  /* CompleteClass */
  override val creationTime: Double = js.native
  /* CompleteClass */
  override val droppedVideoFrames: Double = js.native
  /* CompleteClass */
  override val totalFrameDelay: Double = js.native
  /* CompleteClass */
  override val totalVideoFrames: Double = js.native
}

@JSGlobal("VideoPlaybackQuality")
@js.native
object VideoPlaybackQuality extends Instantiable0[VideoPlaybackQuality]

