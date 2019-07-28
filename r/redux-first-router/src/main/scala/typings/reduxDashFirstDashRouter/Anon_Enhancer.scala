package typings.reduxDashFirstDashRouter

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Middleware
import typings.redux.reduxMod.MiddlewareAPI
import typings.redux.reduxMod.Reducer
import typings.redux.reduxMod.Store
import typings.redux.reduxMod.StoreEnhancer
import typings.redux.reduxMod.StoreEnhancerStoreCreator
import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.LocationState
import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.Nullable
import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.RouteThunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Enhancer[TKeys, TState] extends js.Object {
  @JSName("enhancer")
  var enhancer_Original: StoreEnhancer[js.Object, js.Object] = js.native
  var initialDispatch: js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("middleware")
  var middleware_Original: Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSName("reducer")
  var reducer_Original: Reducer[LocationState[TKeys, TState], AnyAction] = js.native
  def enhancer(next: StoreEnhancerStoreCreator[js.Object, js.Object]): StoreEnhancerStoreCreator[js.Object, js.Object] = js.native
  def middleware(api: MiddlewareAPI[Dispatch[AnyAction], _]): js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ _, _]] = js.native
  def reducer(state: js.UndefOr[scala.Nothing], action: AnyAction): LocationState[TKeys, TState] = js.native
  def reducer(state: LocationState[TKeys, TState], action: AnyAction): LocationState[TKeys, TState] = js.native
  def thunk(store: Store[TState, AnyAction]): js.Promise[Nullable[RouteThunk[TState]]] = js.native
}

