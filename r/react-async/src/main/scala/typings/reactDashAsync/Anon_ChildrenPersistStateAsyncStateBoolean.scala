package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.AsyncState
import typings.reactDashAsync.reactDashAsyncMod.RejectedChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenPersistStateAsyncStateBoolean[T] extends js.Object {
  var children: js.UndefOr[RejectedChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object Anon_ChildrenPersistStateAsyncStateBoolean {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: RejectedChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChildrenPersistStateAsyncStateBoolean[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenPersistStateAsyncStateBoolean[T]]
  }
}

