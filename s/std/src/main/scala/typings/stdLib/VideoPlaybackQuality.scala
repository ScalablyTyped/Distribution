package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A VideoPlaybackQuality object is returned by the HTMLVideoElement.getVideoPlaybackQuality() method and contains metrics that can be used to determine the playback quality of a video. */
trait VideoPlaybackQuality extends js.Object {
  val corruptedVideoFrames: scala.Double
  val creationTime: scala.Double
  val droppedVideoFrames: scala.Double
  val totalFrameDelay: scala.Double
  val totalVideoFrames: scala.Double
}

@JSGlobal("VideoPlaybackQuality")
@js.native
class VideoPlaybackQualityCls () extends VideoPlaybackQuality {
  /* CompleteClass */
  override val corruptedVideoFrames: scala.Double = js.native
  /* CompleteClass */
  override val creationTime: scala.Double = js.native
  /* CompleteClass */
  override val droppedVideoFrames: scala.Double = js.native
  /* CompleteClass */
  override val totalFrameDelay: scala.Double = js.native
  /* CompleteClass */
  override val totalVideoFrames: scala.Double = js.native
}

@JSGlobal("VideoPlaybackQuality")
@js.native
object VideoPlaybackQuality
  extends org.scalablytyped.runtime.Instantiable0[VideoPlaybackQuality]

