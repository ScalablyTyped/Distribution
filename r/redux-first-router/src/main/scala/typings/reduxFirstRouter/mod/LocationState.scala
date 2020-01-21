package typings.reduxFirstRouter.mod

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
    pathname: String,
    payload: Payload,
    prev: Location,
    routesMap: RoutesMap[TKeys, TState],
    `type`: String,
    hasSSR: js.UndefOr[Boolean] = js.undefined,
    history: Nullable[HistoryData] = null,
    kind: Nullable[String] = null,
    query: Query = null,
    search: String = null
  ): LocationState[TKeys, TState] = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], routesMap = routesMap.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSSR)) __obj.updateDynamic("hasSSR")(hasSSR.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationState[TKeys, TState]]
  }
}

