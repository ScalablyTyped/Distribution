package typings.reactAsync

import typings.reactAsync.reactAsyncStrings.fulfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFulfill[T] extends js.Object {
  var payload: T
  var `type`: fulfill
}

object AnonFulfill {
  @scala.inline
  def apply[T](payload: T, `type`: fulfill): AnonFulfill[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFulfill[T]]
  }
}

