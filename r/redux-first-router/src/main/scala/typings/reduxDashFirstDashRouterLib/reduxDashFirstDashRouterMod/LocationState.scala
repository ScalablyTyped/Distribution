package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationState[TKeys, TState] extends js.Object {
  var hasSSR: js.UndefOr[scala.Boolean] = js.undefined
  var history: Nullable[HistoryData]
  var kind: Nullable[java.lang.String]
  var pathname: java.lang.String
  var payload: Payload
  var prev: Location
  var query: js.UndefOr[js.Object] = js.undefined
  var routesMap: RoutesMap[TKeys, TState]
  var search: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object LocationState {
  @scala.inline
  def apply[TKeys, TState](
    history: Nullable[HistoryData],
    kind: Nullable[java.lang.String],
    pathname: java.lang.String,
    payload: Payload,
    prev: Location,
    routesMap: RoutesMap[TKeys, TState],
    `type`: java.lang.String,
    hasSSR: js.UndefOr[scala.Boolean] = js.undefined,
    query: js.Object = null,
    search: java.lang.String = null
  ): LocationState[TKeys, TState] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("pathname")(pathname)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("routesMap")(routesMap)
    if (!js.isUndefined(hasSSR)) __obj.updateDynamic("hasSSR")(hasSSR)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[LocationState[TKeys, TState]]
  }
}

