package typings
package readableDashStreamLib.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_writable ====
trait CorkedRequest extends js.Object {
  var entry: js.Any
  var next: js.Any
  def finish(): scala.Unit
}

object CorkedRequest {
  @scala.inline
  def apply(entry: js.Any, finish: () => scala.Unit, next: js.Any): CorkedRequest = {
    val __obj = js.Dynamic.literal(entry = entry, finish = js.Any.fromFunction0(finish), next = next)
  
    __obj.asInstanceOf[CorkedRequest]
  }
}

