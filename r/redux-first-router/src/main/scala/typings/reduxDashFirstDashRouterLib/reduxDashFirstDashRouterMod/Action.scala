package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var meta: js.UndefOr[Meta] = js.undefined
  var navKey: js.UndefOr[Nullable[java.lang.String]] = js.undefined
  var payload: js.UndefOr[Payload] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
  var `type`: java.lang.String
}

object Action {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    meta: Meta = null,
    navKey: Nullable[java.lang.String] = null,
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

