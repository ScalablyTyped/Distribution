package typings
package reduxDashThunkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashThunkMod {
  type ThunkAction[R, S, E, A /* <: reduxLib.reduxMod.Action[_] */] = js.Function3[
    /* dispatch */ ThunkDispatch[S, E, A], 
    /* getState */ js.Function0[S], 
    /* extraArgument */ E, 
    R
  ]
  type ThunkMiddleware[S, A /* <: reduxLib.reduxMod.Action[_] */, E] = reduxLib.reduxMod.Middleware[ThunkDispatch[S, E, A], S, ThunkDispatch[S, E, A]]
}
