package typings.reactAsync

import typings.reactAsync.mod.AbstractState
import typings.reactAsync.mod.AsyncFulfilled
import typings.reactAsync.mod.AsyncInitial
import typings.reactAsync.mod.AsyncPending
import typings.reactAsync.mod.AsyncRejected
import typings.reactAsync.mod.PendingChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitial[T /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[PendingChildren[T]] = js.undefined
  var initial: js.UndefOr[Boolean] = js.undefined
  var state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
}

object AnonInitial {
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]),
    children: PendingChildren[T] = null,
    initial: js.UndefOr[Boolean] = js.undefined
  ): AnonInitial[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitial[T]]
  }
}

