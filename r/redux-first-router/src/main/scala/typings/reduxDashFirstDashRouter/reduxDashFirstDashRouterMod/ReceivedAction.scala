package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedAction extends js.Object {
  var meta: js.UndefOr[js.Object] = js.undefined
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  var payload: Payload
  var query: js.UndefOr[Query] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var `type`: String
}

object ReceivedAction {
  @scala.inline
  def apply(
    payload: Payload,
    `type`: String,
    meta: js.Object = null,
    navKey: Nullable[String] = null,
    query: Query = null,
    search: String = null
  ): ReceivedAction = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (navKey != null) __obj.updateDynamic("navKey")(navKey.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[ReceivedAction]
  }
}

