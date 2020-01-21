package typings.reactRouterRedux.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedRouterProps[State] extends js.Object {
  var history: History[LocationState]
  var store: js.UndefOr[Store[State, AnyAction]] = js.undefined
}

object ConnectedRouterProps {
  @scala.inline
  def apply[State](history: History[LocationState], store: Store[State, AnyAction] = null): ConnectedRouterProps[State] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedRouterProps[State]]
  }
}

