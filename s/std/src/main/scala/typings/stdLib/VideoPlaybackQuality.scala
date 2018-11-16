package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoPlaybackQuality extends js.Object {
  val corruptedVideoFrames: scala.Double
  val creationTime: scala.Double
  val droppedVideoFrames: scala.Double
  val totalFrameDelay: scala.Double
  val totalVideoFrames: scala.Double
}

@JSGlobal("VideoPlaybackQuality")
@js.native
object VideoPlaybackQuality
  extends ScalablyTyped.runtime.Instantiable0[VideoPlaybackQuality]

