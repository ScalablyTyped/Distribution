package typings
package reduxDashStateDashSyncLib.reduxDashStateDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-state-sync", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createMessageListener(config: reduxDashStateDashSyncLib.reduxDashStateDashSyncMod.MessageListenerConfig): scala.Unit = js.native
  def createStateSyncMiddleware(): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def createStateSyncMiddleware(config: reduxDashStateDashSyncLib.reduxDashStateDashSyncMod.Config): reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  def generateUuidForAction(action: reduxLib.reduxMod.AnyAction): reduxDashStateDashSyncLib.reduxDashStateDashSyncMod.StampedAction = js.native
  def initStateWithPrevTab(store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]): reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction] = js.native
  def isActionAllowed(config: reduxDashStateDashSyncLib.reduxDashStateDashSyncMod.Config): js.Function1[/* type */ java.lang.String, scala.Boolean] = js.native
  def withReduxStateSync(appReducer: reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction]): js.Function2[
    /* state */ js.Any, 
    /* action */ reduxLib.reduxMod.AnyAction, 
    reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction]
  ] = js.native
}

