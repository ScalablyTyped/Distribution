package typings.reactAsync

import typings.reactAsync.mod.AbstractState
import typings.reactAsync.mod.AsyncFulfilled
import typings.reactAsync.mod.AsyncInitial
import typings.reactAsync.mod.AsyncPending
import typings.reactAsync.mod.AsyncRejected
import typings.reactAsync.mod.InitialChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState[T /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[InitialChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
}

object AnonState {
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]),
    children: InitialChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): AnonState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState[T]]
  }
}

