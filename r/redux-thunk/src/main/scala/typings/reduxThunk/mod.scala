package typings.reduxThunk

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-thunk", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ThunkDispatch[S, E, A /* <: Action[_] */] extends js.Object {
    def apply[T /* <: A */](action: T): T = js.native
    def apply[R](asyncAction: ThunkAction[R, S, E, A]): R = js.native
  }
  
  val default: (ThunkMiddleware[js.Object, AnyAction, js.UndefOr[scala.Nothing]]) with AnonExtraArgument = js.native
  type ThunkAction[R, S, E, A /* <: Action[_] */] = js.Function3[
    /* dispatch */ ThunkDispatch[S, E, A], 
    /* getState */ js.Function0[S], 
    /* extraArgument */ E, 
    R
  ]
  type ThunkMiddleware[S, A /* <: Action[_] */, E] = Middleware[ThunkDispatch[S, E, A], S, ThunkDispatch[S, E, A]]
}

