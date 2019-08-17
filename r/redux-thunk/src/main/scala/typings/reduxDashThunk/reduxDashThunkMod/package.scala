package typings.reduxDashThunk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashThunkMod {
  import typings.redux.reduxMod.Action
  import typings.redux.reduxMod.Middleware

  type ThunkAction[R, S, E, A /* <: Action[_] */] = js.Function3[
    /* dispatch */ ThunkDispatch[S, E, A], 
    /* getState */ js.Function0[S], 
    /* extraArgument */ E, 
    R
  ]
  type ThunkMiddleware[S, A /* <: Action[_] */, E] = Middleware[ThunkDispatch[S, E, A], S, ThunkDispatch[S, E, A]]
}
