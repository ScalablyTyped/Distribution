package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncStrings.fulfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fulfill[T] extends js.Object {
  var payload: T
  var `type`: fulfill
}

object Anon_Fulfill {
  @scala.inline
  def apply[T](payload: T, `type`: fulfill): Anon_Fulfill[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fulfill[T]]
  }
}

