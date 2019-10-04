package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.AsyncState
import typings.reactDashAsync.reactDashAsyncMod.InitialChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenPersistState[T] extends js.Object {
  var children: js.UndefOr[InitialChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object Anon_ChildrenPersistState {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: InitialChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): Anon_ChildrenPersistState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    __obj.asInstanceOf[Anon_ChildrenPersistState[T]]
  }
}

