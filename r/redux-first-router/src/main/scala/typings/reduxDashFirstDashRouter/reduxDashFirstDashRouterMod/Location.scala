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
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

