package typings.reduxApiMiddleware.mod

import typings.reduxApiMiddleware.reduxApiMiddlewareBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :string | symbol,   error ? :false} & [Payload] extends [never] ? {} : {  payload  :Payload} & [Meta] extends [never] ? {} : {  meta  :Meta} */
trait ValidAction[Payload, Meta] extends js.Object {
  var error: js.UndefOr[`false`] = js.undefined
  var meta: Meta
  var payload: Payload
  var `type`: String | js.Symbol
}

object ValidAction {
  @scala.inline
  def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String | js.Symbol, error: `false` = null): ValidAction[Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidAction[Payload, Meta]]
  }
}

