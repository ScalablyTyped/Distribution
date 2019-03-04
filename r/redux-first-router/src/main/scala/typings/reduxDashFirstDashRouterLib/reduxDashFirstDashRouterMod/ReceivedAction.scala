package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceivedAction extends js.Object {
  var meta: js.UndefOr[js.Object] = js.undefined
  var navKey: js.UndefOr[Nullable[java.lang.String]] = js.undefined
  var payload: Payload
  var query: js.UndefOr[js.Object] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object ReceivedAction {
  @scala.inline
  def apply(
    payload: Payload,
    `type`: java.lang.String,
    meta: js.Object = null,
    navKey: Nullable[java.lang.String] = null,
    query: js.Object = null,
    search: java.lang.String = null
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

