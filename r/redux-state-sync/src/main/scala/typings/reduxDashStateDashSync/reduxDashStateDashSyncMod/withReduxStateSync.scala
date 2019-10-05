package typings.reduxDashStateDashSync.reduxDashStateDashSyncMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-state-sync", "withReduxStateSync")
@js.native
object withReduxStateSync extends js.Object {
  def apply(appReducer: Reducer[_, AnyAction]): js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[_, AnyAction]] = js.native
}

