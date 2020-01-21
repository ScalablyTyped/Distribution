package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAudioContextEventMap extends js.Object {
  var statechange: Event_
}

object BaseAudioContextEventMap {
  @scala.inline
  def apply(statechange: Event_): BaseAudioContextEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseAudioContextEventMap]
  }
}

