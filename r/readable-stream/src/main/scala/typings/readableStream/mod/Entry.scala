package typings.readableStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== BufferList ====
trait Entry[D] extends js.Object {
  var data: D
  var next: Entry[D] | Null
}

object Entry {
  @scala.inline
  def apply[D](data: D, next: Entry[D] = null): Entry[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[D]]
  }
}

