package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncBooleans.`true`
import typings.reactDashAsync.reactDashAsyncStrings.reject
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: `true`
  var payload: Error
  var `type`: reject
}

object Anon_Error {
  @scala.inline
  def apply(error: `true`, payload: Error, `type`: reject): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error]
  }
}

