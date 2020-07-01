package typings.reactRedux.mod

import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatchProp[A /* <: Action[_] */] extends js.Object {
  var dispatch: Dispatch[A]
}

object DispatchProp {
  @scala.inline
  def apply[/* <: typings.redux.mod.Action[_] */ A](dispatch: A => A): DispatchProp[A] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
    __obj.asInstanceOf[DispatchProp[A]]
  }
}

