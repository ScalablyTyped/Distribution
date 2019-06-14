package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`
  var payload: stdLib.Error
  var `type`: reactDashAsyncLib.reactDashAsyncLibStrings.reject
}

object Anon_Error {
  @scala.inline
  def apply(
    error: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`,
    payload: stdLib.Error,
    `type`: reactDashAsyncLib.reactDashAsyncLibStrings.reject
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Error]
  }
}

