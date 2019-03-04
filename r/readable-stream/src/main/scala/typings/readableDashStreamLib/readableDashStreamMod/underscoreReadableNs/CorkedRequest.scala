package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

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
  def apply(entry: js.Any, finish: js.Function0[scala.Unit], next: js.Any): CorkedRequest = {
    val __obj = js.Dynamic.literal(entry = entry, finish = finish, next = next)
  
    __obj.asInstanceOf[CorkedRequest]
  }
}

