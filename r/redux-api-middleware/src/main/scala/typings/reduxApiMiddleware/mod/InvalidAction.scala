package typings.reduxApiMiddleware.mod

import typings.reduxApiMiddleware.reduxApiMiddlewareBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAction[Payload] extends js.Object {
  var error: `true`
  var payload: Payload
  var `type`: String | js.Symbol
}

object InvalidAction {
  @scala.inline
  def apply[Payload](error: `true`, payload: Payload, `type`: String | js.Symbol): InvalidAction[Payload] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAction[Payload]]
  }
}

