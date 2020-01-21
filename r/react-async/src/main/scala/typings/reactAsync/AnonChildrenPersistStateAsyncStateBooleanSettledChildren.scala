package typings.reactAsync

import typings.reactAsync.mod.AsyncState
import typings.reactAsync.mod.SettledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenPersistStateAsyncStateBooleanSettledChildren[T] extends js.Object {
  var children: js.UndefOr[SettledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object AnonChildrenPersistStateAsyncStateBooleanSettledChildren {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: SettledChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): AnonChildrenPersistStateAsyncStateBooleanSettledChildren[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenPersistStateAsyncStateBooleanSettledChildren[T]]
  }
}

