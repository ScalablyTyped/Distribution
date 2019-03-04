package typings
package reactDashRouterDashReduxLib.reactDashRouterDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedRouterProps[State] extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var store: js.UndefOr[reduxLib.reduxMod.Store[State, reduxLib.reduxMod.AnyAction]] = js.undefined
}

object ConnectedRouterProps {
  @scala.inline
  def apply[State](
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    store: reduxLib.reduxMod.Store[State, reduxLib.reduxMod.AnyAction] = null
  ): ConnectedRouterProps[State] = {
    val __obj = js.Dynamic.literal(history = history)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[ConnectedRouterProps[State]]
  }
}

