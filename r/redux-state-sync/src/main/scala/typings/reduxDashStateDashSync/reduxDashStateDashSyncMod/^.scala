package typings.reduxDashStateDashSync.reduxDashStateDashSyncMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-state-sync", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createMessageListener(config: MessageListenerConfig): Unit = js.native
  def createStateSyncMiddleware(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def createStateSyncMiddleware(config: Config): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def generateUuidForAction(action: AnyAction): StampedAction = js.native
  def initStateWithPrevTab(store: Store[_, AnyAction]): Store[_, AnyAction] = js.native
  def isActionAllowed(config: Config): js.Function1[/* type */ String, Boolean] = js.native
  def withReduxStateSync(appReducer: Reducer[_, AnyAction]): js.Function2[/* state */ js.Any, /* action */ AnyAction, Reducer[_, AnyAction]] = js.native
}

