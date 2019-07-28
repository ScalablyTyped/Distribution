package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import typings.reduxDashFirstDashRouter.Anon_NotFoundPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedActionMeta extends js.Object {
  var meta: Anon_NotFoundPath
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  var payload: Payload
  var query: js.UndefOr[Query] = js.undefined
  var `type`: String
}

object ReceivedActionMeta {
  @scala.inline
  def apply(
    meta: Anon_NotFoundPath,
    payload: Payload,
    `type`: String,
    navKey: Nullable[String] = null,
    query: Query = null
  ): ReceivedActionMeta = {
    val __obj = js.Dynamic.literal(meta = meta, payload = payload)
    __obj.updateDynamic("type")(`type`)
    if (navKey != null) __obj.updateDynamic("navKey")(navKey.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[ReceivedActionMeta]
  }
}

