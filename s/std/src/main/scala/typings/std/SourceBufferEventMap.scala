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
    val __obj = js.Dynamic.literal(abort = abort, error = error, update = update, updateend = updateend, updatestart = updatestart)
  
    __obj.asInstanceOf[SourceBufferEventMap]
  }
}

