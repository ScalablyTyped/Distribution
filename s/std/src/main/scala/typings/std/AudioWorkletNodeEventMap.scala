package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioWorkletNodeEventMap extends js.Object {
  var processorerror: Event
}

object AudioWorkletNodeEventMap {
  @scala.inline
  def apply(processorerror: Event): AudioWorkletNodeEventMap = {
    val __obj = js.Dynamic.literal(processorerror = processorerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeEventMap]
  }
}

