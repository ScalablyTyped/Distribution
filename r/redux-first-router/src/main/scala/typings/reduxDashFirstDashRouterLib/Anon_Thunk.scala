package typings
package reduxDashFirstDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Thunk[TState, TKeys] extends js.Object {
  var enhancer: reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object]
  var initialDispatch: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var middleware: reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
  var reducer: reduxLib.reduxMod.Reducer[
    reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.LocationState[TKeys, TState], 
    reduxLib.reduxMod.AnyAction
  ]
  def thunk(store: reduxLib.reduxMod.Store[TState, reduxLib.reduxMod.AnyAction]): js.Promise[
    reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Nullable[reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RouteThunk[TState]]
  ]
}

