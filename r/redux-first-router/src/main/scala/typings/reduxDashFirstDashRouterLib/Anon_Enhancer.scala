package typings
package reduxDashFirstDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Enhancer[TKeys, TState] extends js.Object {
  @JSName("enhancer")
  var enhancer_Original: reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object] = js.native
  var initialDispatch: js.UndefOr[js.Function0[scala.Unit]] = js.native
  @JSName("middleware")
  var middleware_Original: reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]] = js.native
  @JSName("reducer")
  var reducer_Original: reduxLib.reduxMod.Reducer[
    reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.LocationState[TKeys, TState], 
    reduxLib.reduxMod.AnyAction
  ] = js.native
  def enhancer(next: reduxLib.reduxMod.StoreEnhancerStoreCreator[js.Object, js.Object]): reduxLib.reduxMod.StoreEnhancerStoreCreator[js.Object, js.Object] = js.native
  def middleware(api: reduxLib.reduxMod.MiddlewareAPI[reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], _]): js.Function1[
    /* next */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], 
    js.Function1[/* action */ _, _]
  ] = js.native
  def reducer(state: js.UndefOr[scala.Nothing], action: reduxLib.reduxMod.AnyAction): reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.LocationState[TKeys, TState] = js.native
  def reducer(
    state: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.LocationState[TKeys, TState],
    action: reduxLib.reduxMod.AnyAction
  ): reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.LocationState[TKeys, TState] = js.native
  def thunk(store: reduxLib.reduxMod.Store[TState, reduxLib.reduxMod.AnyAction]): js.Promise[
    reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Nullable[reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.RouteThunk[TState]]
  ] = js.native
}

