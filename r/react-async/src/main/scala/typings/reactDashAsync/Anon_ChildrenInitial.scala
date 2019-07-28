package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.AsyncChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInitial[T] extends js.Object {
  var children: js.UndefOr[AsyncChildren[T]] = js.undefined
  var initial: js.UndefOr[Boolean] = js.undefined
}

object Anon_ChildrenInitial {
  @scala.inline
  def apply[T](children: AsyncChildren[T] = null, initial: js.UndefOr[Boolean] = js.undefined): Anon_ChildrenInitial[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial)
    __obj.asInstanceOf[Anon_ChildrenInitial[T]]
  }
}

