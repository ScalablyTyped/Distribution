package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.AsyncState
import typings.reactDashAsync.reactDashAsyncMod.SettledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenPersistStateAsyncStateBooleanSettledChildren[T] extends js.Object {
  var children: js.UndefOr[SettledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object Anon_ChildrenPersistStateAsyncStateBooleanSettledChildren {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: SettledChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChildrenPersistStateAsyncStateBooleanSettledChildren[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    __obj.asInstanceOf[Anon_ChildrenPersistStateAsyncStateBooleanSettledChildren[T]]
  }
}

