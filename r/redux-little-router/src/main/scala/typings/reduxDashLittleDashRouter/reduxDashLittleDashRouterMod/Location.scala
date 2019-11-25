package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends HistoryLocation {
  var basename: js.UndefOr[String] = js.undefined
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
    basename: String = null,
    hash: String = null,
    key: String = null,
    options: LocationOptions = null,
    params: Params = null,
    pathname: String = null,
    previous: Location = null,
    query: Query = null,
    queue: js.Array[Location] = null,
    result: ObjectLiteral[_] = null,
    routes: Routes = null,
    search: String = null,
    state: ObjectLiteral[_] = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

