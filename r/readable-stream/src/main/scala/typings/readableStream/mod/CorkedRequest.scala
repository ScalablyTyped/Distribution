package typings.readableStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_writable ====
@js.native
trait CorkedRequest extends js.Object {
  var entry: js.Any = js.native
  var next: js.Any = js.native
  def finish(): Unit = js.native
}

object CorkedRequest {
  @scala.inline
  def apply(entry: js.Any, finish: () => Unit, next: js.Any): CorkedRequest = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorkedRequest]
  }
  @scala.inline
  implicit class CorkedRequestOps[Self <: CorkedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntry(value: js.Any): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinish(value: () => Unit): Self = this.set("finish", js.Any.fromFunction0(value))
    @scala.inline
    def setNext(value: js.Any): Self = this.set("next", value.asInstanceOf[js.Any])
  }
  
}

