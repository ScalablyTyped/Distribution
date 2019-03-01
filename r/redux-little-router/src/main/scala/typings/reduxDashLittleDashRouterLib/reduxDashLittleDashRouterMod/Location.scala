package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends HistoryLocation {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[LocationOptions] = js.undefined
  var params: js.UndefOr[Params] = js.undefined
  var previous: js.UndefOr[Location] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
  var queue: js.UndefOr[js.Array[Location]] = js.undefined
  var result: js.UndefOr[ObjectLiteral[_]] = js.undefined
  var routes: js.UndefOr[Routes] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    hash: java.lang.String = null,
    key: java.lang.String = null,
    options: LocationOptions = null,
    params: Params = null,
    pathname: java.lang.String = null,
    previous: Location = null,
    query: Query = null,
    queue: js.Array[Location] = null,
    result: ObjectLiteral[_] = null,
    routes: Routes = null,
    search: java.lang.String = null,
    state: ObjectLiteral[_] = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (key != null) __obj.updateDynamic("key")(key)
    if (options != null) __obj.updateDynamic("options")(options)
    if (params != null) __obj.updateDynamic("params")(params)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (query != null) __obj.updateDynamic("query")(query)
    if (queue != null) __obj.updateDynamic("queue")(queue)
    if (result != null) __obj.updateDynamic("result")(result)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (search != null) __obj.updateDynamic("search")(search)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Location]
  }
}

