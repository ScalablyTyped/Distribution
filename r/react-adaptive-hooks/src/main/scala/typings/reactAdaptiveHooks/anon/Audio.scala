package typings.reactAdaptiveHooks.anon

import typings.reactAdaptiveHooks.mediaCapabilitiesMod.AudioMediaConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  var audio: AudioMediaConfiguration
}

object Audio {
  @scala.inline
  def apply(audio: AudioMediaConfiguration): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

