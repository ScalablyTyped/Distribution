package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceBufferEventMap extends js.Object {
  var abort: Event
  var error: Event
  var update: Event
  var updateend: Event
  var updatestart: Event
}

object SourceBufferEventMap {
  @scala.inline
  def apply(abort: Event, error: Event, update: Event, updateend: Event, updatestart: Event): SourceBufferEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateend = updateend.asInstanceOf[js.Any], updatestart = updatestart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferEventMap]
  }
}

