package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var meta: js.UndefOr[Meta] = js.undefined
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  var payload: js.UndefOr[Payload] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
  var `type`: String
}

object Action {
  @scala.inline
  def apply(
    `type`: String,
    meta: Meta = null,
    navKey: Nullable[String] = null,
    payload: Payload = null,
    query: Query = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (navKey != null) __obj.updateDynamic("navKey")(navKey.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Action]
  }
}

