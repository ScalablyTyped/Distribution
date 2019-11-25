package typings.readableDashStream.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_writable ====
trait CorkedRequest extends js.Object {
  var entry: js.Any
  var next: js.Any
  def finish(): Unit
}

object CorkedRequest {
  @scala.inline
  def apply(entry: js.Any, finish: () => Unit, next: js.Any): CorkedRequest = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), next = next.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CorkedRequest]
  }
}

