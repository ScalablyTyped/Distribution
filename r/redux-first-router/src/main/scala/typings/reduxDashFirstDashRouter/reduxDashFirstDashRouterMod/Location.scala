package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var pathname: String
  var payload: Payload
  var query: js.UndefOr[Query] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Location {
  @scala.inline
  def apply(pathname: String, payload: Payload, `type`: String, query: Query = null, search: String = null): Location = {
    val __obj = js.Dynamic.literal(pathname = pathname, payload = payload)
    __obj.updateDynamic("type")(`type`)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Location]
  }
}

