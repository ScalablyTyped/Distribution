package typings.reduxDashThunk

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-thunk", JSImport.Namespace)
@js.native
object reduxDashThunkMod extends js.Object {
  @js.native
  trait ThunkDispatch[S, E, A /* <: Action[_] */] extends js.Object {
    def apply[T /* <: A */](action: T): T = js.native
    def apply[R](asyncAction: ThunkAction[R, S, E, A]): R = js.native
  }
  
  val default: (ThunkMiddleware[js.Object, AnyAction, js.UndefOr[scala.Nothing]]) with Anon_ExtraArgument = js.native
  type ThunkAction[R, S, E, A /* <: Action[_] */] = js.Function3[
    /* dispatch */ ThunkDispatch[S, E, A], 
    /* getState */ js.Function0[S], 
    /* extraArgument */ E, 
    R
  ]
  type ThunkMiddleware[S, A /* <: Action[_] */, E] = Middleware[ThunkDispatch[S, E, A], S, ThunkDispatch[S, E, A]]
}

