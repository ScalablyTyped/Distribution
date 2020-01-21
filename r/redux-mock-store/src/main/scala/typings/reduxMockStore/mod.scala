package typings.reduxMockStore

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-mock-store", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait MockStore[S, A /* <: Action[_] */] extends Store[S, A] {
    def clearActions(): Unit = js.native
    def getActions(): js.Array[_] = js.native
  }
  
  /**
    * Create Mock Store returns a function that will create a mock store from a state
    * with the same set of set of middleware applied.
    *
    * @param middlewares The list of middleware to be applied.
    * @template S The type of state to be held by the store.
    * @template DispatchExts The additional Dispatch signatures for the middlewares applied.
    */
  def default[S, DispatchExts](): MockStoreCreator[S, DispatchExts] = js.native
  def default[S, DispatchExts](middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): MockStoreCreator[S, DispatchExts] = js.native
  type MockGetState[S] = js.Function1[/* actions */ js.Array[AnyAction], S]
  type MockStoreCreator[S, DispatchExts] = js.Function1[/* state */ js.UndefOr[S | MockGetState[S]], MockStoreEnhanced[S, DispatchExts]]
  type MockStoreEnhanced[S, DispatchExts] = (MockStore[S, AnyAction]) with AnonDispatch[DispatchExts]
}

