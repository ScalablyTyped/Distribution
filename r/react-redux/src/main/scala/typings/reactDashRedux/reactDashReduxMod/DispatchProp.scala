package typings.reactDashRedux.reactDashReduxMod

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatchProp[A /* <: Action[_] */] extends js.Object {
  var dispatch: Dispatch[A]
}

object DispatchProp {
  @scala.inline
  def apply[A /* <: Action[_] */](dispatch: A => A): DispatchProp[A] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
  
    __obj.asInstanceOf[DispatchProp[A]]
  }
}

