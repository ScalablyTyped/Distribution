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

