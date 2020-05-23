package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioScheduledSourceNodeEventMap extends js.Object {
  var ended: Event
}

object AudioScheduledSourceNodeEventMap {
  @scala.inline
  def apply(ended: Event): AudioScheduledSourceNodeEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioScheduledSourceNodeEventMap]
  }
}

