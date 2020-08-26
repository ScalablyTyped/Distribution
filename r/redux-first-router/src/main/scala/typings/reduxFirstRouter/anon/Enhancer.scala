package typings.reduxFirstRouter.anon

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.redux.mod.StoreEnhancer
import typings.redux.mod.StoreEnhancerStoreCreator
import typings.reduxFirstRouter.mod.LocationState
import typings.reduxFirstRouter.mod.Nullable
import typings.reduxFirstRouter.mod.RouteThunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enhancer[TKeys, TState] extends js.Object {
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

