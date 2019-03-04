package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var pathname: java.lang.String
  var payload: Payload
  var query: js.UndefOr[js.Object] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Location {
  @scala.inline
  def apply(
    pathname: java.lang.String,
    payload: Payload,
    `type`: java.lang.String,
    query: js.Object = null,
    search: java.lang.String = null
  ): Location = {
    val __obj = js.Dynamic.literal(pathname = pathname, payload = payload)
    __obj.updateDynamic("type")(`type`)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Location]
  }
}

