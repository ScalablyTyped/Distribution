package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.AsyncState
import typings.reactDashAsync.reactDashAsyncMod.PendingChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInitialState[T] extends js.Object {
  var children: js.UndefOr[PendingChildren[T]] = js.undefined
  var initial: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object Anon_ChildrenInitialState {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: PendingChildren[T] = null,
    initial: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChildrenInitialState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenInitialState[T]]
  }
}

