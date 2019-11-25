package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.AsyncState
import typings.reactDashAsync.reactDashAsyncMod.FulfilledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenPersistStateAsyncState[T] extends js.Object {
  var children: js.UndefOr[FulfilledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object Anon_ChildrenPersistStateAsyncState {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: FulfilledChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChildrenPersistStateAsyncState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenPersistStateAsyncState[T]]
  }
}

