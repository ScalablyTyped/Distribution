package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAndElementEventHandlersEventMap extends js.Object {
  var copy: ClipboardEvent = js.native
  var cut: ClipboardEvent = js.native
  var paste: ClipboardEvent = js.native
}

object DocumentAndElementEventHandlersEventMap {
  @scala.inline
  def apply(copy: ClipboardEvent, cut: ClipboardEvent, paste: ClipboardEvent): DocumentAndElementEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAndElementEventHandlersEventMap]
  }
  @scala.inline
  implicit class DocumentAndElementEventHandlersEventMapOps[Self <: DocumentAndElementEventHandlersEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopy(value: ClipboardEvent): Self = this.set("copy", value.asInstanceOf[js.Any])
    @scala.inline
    def setCut(value: ClipboardEvent): Self = this.set("cut", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaste(value: ClipboardEvent): Self = this.set("paste", value.asInstanceOf[js.Any])
  }
  
}

