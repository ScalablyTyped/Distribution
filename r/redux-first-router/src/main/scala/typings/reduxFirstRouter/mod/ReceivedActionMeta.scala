package typings.reduxFirstRouter.mod

import typings.reduxFirstRouter.anon.NotFoundPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedActionMeta extends js.Object {
  var meta: NotFoundPath
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  var payload: Payload
  var query: js.UndefOr[Query] = js.undefined
  var `type`: String
}

object ReceivedActionMeta {
  @scala.inline
  def apply(
    meta: NotFoundPath,
    payload: Payload,
    `type`: String,
    navKey: js.UndefOr[Null | Nullable[String]] = js.undefined,
    query: Query = null
  ): ReceivedActionMeta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(navKey)) __obj.updateDynamic("navKey")(navKey.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedActionMeta]
  }
}

