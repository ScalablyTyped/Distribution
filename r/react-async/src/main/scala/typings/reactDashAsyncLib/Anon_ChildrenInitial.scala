package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInitial[T] extends js.Object {
  var children: js.UndefOr[reactDashAsyncLib.reactDashAsyncMod.AsyncChildren[T]] = js.undefined
  var initial: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ChildrenInitial {
  @scala.inline
  def apply[T](
    children: reactDashAsyncLib.reactDashAsyncMod.AsyncChildren[T] = null,
    initial: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ChildrenInitial[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial)
    __obj.asInstanceOf[Anon_ChildrenInitial[T]]
  }
}

