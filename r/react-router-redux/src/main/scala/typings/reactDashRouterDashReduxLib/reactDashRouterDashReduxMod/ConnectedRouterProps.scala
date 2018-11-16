package typings
package reactDashRouterDashReduxLib.reactDashRouterDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectedRouterProps[State] extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var store: js.UndefOr[reduxLib.reduxMod.Store[State, reduxLib.reduxMod.AnyAction]] = js.undefined
}

