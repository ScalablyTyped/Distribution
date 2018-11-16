package typings
package reduxDashThunkLib.reduxDashThunkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThunkDispatch[S, E, A /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  def apply[T /* <: A */](action: T): T = js.native
  def apply[R](asyncAction: ThunkAction[R, S, E, A]): R = js.native
}

