package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fulfill[T] extends js.Object {
  var payload: T
  var `type`: reactDashAsyncLib.reactDashAsyncLibStrings.fulfill
}

object Anon_Fulfill {
  @scala.inline
  def apply[T](payload: T, `type`: reactDashAsyncLib.reactDashAsyncLibStrings.fulfill): Anon_Fulfill[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Fulfill[T]]
  }
}

