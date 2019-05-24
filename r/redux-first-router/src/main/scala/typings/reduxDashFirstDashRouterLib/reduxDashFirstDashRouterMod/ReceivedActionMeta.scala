package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedActionMeta extends js.Object {
  var meta: reduxDashFirstDashRouterLib.Anon_NotFoundPath
  var navKey: js.UndefOr[Nullable[java.lang.String]] = js.undefined
  var payload: Payload
  var query: js.UndefOr[Query] = js.undefined
  var `type`: java.lang.String
}

object ReceivedActionMeta {
  @scala.inline
  def apply(
    meta: reduxDashFirstDashRouterLib.Anon_NotFoundPath,
    payload: Payload,
    `type`: java.lang.String,
    navKey: Nullable[java.lang.String] = null,
    query: Query = null
  ): ReceivedActionMeta = {
    val __obj = js.Dynamic.literal(meta = meta, payload = payload)
    __obj.updateDynamic("type")(`type`)
    if (navKey != null) __obj.updateDynamic("navKey")(navKey.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[ReceivedActionMeta]
  }
}

