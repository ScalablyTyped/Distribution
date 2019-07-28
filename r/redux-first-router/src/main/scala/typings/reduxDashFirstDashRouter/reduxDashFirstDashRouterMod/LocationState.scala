package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationState[TKeys, TState] extends js.Object {
  var hasSSR: js.UndefOr[Boolean] = js.undefined
  var history: Nullable[HistoryData]
  var kind: Nullable[String]
  var pathname: String
  var payload: Payload
  var prev: Location
  var query: js.UndefOr[Query] = js.undefined
  var routesMap: RoutesMap[TKeys, TState]
  var search: js.UndefOr[String] = js.undefined
  var `type`: String
}

object LocationState {
  @scala.inline
  def apply[TKeys, TState](
    history: Nullable[HistoryData],
    kind: Nullable[String],
    pathname: String,
    payload: Payload,
    prev: Location,
    routesMap: RoutesMap[TKeys, TState],
    `type`: String,
    hasSSR: js.UndefOr[Boolean] = js.undefined,
    query: Query = null,
    search: String = null
  ): LocationState[TKeys, TState] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pathname = pathname, payload = payload, prev = prev, routesMap = routesMap)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(hasSSR)) __obj.updateDynamic("hasSSR")(hasSSR)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[LocationState[TKeys, TState]]
  }
}

