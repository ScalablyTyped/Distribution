package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptProcessorNodeEventMap extends js.Object {
  var audioprocess: AudioProcessingEvent
}

object ScriptProcessorNodeEventMap {
  @scala.inline
  def apply(audioprocess: AudioProcessingEvent): ScriptProcessorNodeEventMap = {
    val __obj = js.Dynamic.literal(audioprocess = audioprocess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptProcessorNodeEventMap]
  }
}

