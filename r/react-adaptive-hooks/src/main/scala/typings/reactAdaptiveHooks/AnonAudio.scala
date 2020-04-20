package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.mediaCapabilitiesMod.AudioMediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudio extends js.Object {
  var audio: AudioMediaConfiguration
}

object AnonAudio {
  @scala.inline
  def apply(audio: AudioMediaConfiguration): AnonAudio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudio]
  }
}

