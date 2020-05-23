package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfflineAudioContextEventMap extends BaseAudioContextEventMap {
  var complete: OfflineAudioCompletionEvent
}

object OfflineAudioContextEventMap {
  @scala.inline
  def apply(complete: OfflineAudioCompletionEvent, statechange: Event): OfflineAudioContextEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioContextEventMap]
  }
}

