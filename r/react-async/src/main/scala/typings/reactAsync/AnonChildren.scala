package typings.reactAsync

import typings.reactAsync.mod.AbstractState
import typings.reactAsync.mod.AsyncFulfilled
import typings.reactAsync.mod.AsyncInitial
import typings.reactAsync.mod.AsyncPending
import typings.reactAsync.mod.AsyncRejected
import typings.reactAsync.mod.FulfilledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[T /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[FulfilledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
}

object AnonChildren {
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]),
    children: FulfilledChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): AnonChildren[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren[T]]
  }
}

