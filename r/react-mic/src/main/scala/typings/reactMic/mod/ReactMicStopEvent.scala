package typings.reactMic.mod

import typings.reactMic.anon.AudioBitsPerSecond
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMicStopEvent extends js.Object {
  var blob: Blob
  var blobURL: String
  var option: AudioBitsPerSecond
  var startTime: Double
  var stopTime: Double
}

object ReactMicStopEvent {
  @scala.inline
  def apply(blob: Blob, blobURL: String, option: AudioBitsPerSecond, startTime: Double, stopTime: Double): ReactMicStopEvent = {
    val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], blobURL = blobURL.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopTime = stopTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactMicStopEvent]
  }
}

