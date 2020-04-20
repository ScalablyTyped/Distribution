package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentAndElementEventHandlersEventMap extends js.Object {
  var copy: ClipboardEvent
  var cut: ClipboardEvent
  var paste: ClipboardEvent
}

object DocumentAndElementEventHandlersEventMap {
  @scala.inline
  def apply(copy: ClipboardEvent, cut: ClipboardEvent, paste: ClipboardEvent): DocumentAndElementEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAndElementEventHandlersEventMap]
  }
}

