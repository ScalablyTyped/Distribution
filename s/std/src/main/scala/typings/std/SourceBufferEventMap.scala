package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceBufferEventMap extends js.Object {
  var abort: Event_
  var error: Event_
  var update: Event_
  var updateend: Event_
  var updatestart: Event_
}

object SourceBufferEventMap {
  @scala.inline
  def apply(abort: Event_, error: Event_, update: Event_, updateend: Event_, updatestart: Event_): SourceBufferEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateend = updateend.asInstanceOf[js.Any], updatestart = updatestart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceBufferEventMap]
  }
}

