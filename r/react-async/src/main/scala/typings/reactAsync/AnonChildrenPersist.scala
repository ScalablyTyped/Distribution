package typings.reactAsync

import typings.reactAsync.mod.AbstractState
import typings.reactAsync.mod.AsyncFulfilled
import typings.reactAsync.mod.AsyncInitial
import typings.reactAsync.mod.AsyncPending
import typings.reactAsync.mod.AsyncRejected
import typings.reactAsync.mod.RejectedChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenPersist[T /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[RejectedChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
}

object AnonChildrenPersist {
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]),
    children: RejectedChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): AnonChildrenPersist[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenPersist[T]]
  }
}

