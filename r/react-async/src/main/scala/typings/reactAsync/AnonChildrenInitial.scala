package typings.reactAsync

import typings.reactAsync.mod.PendingChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenInitial[T] extends js.Object {
  var children: js.UndefOr[PendingChildren[T]] = js.undefined
  var initial: js.UndefOr[Boolean] = js.undefined
}

object AnonChildrenInitial {
  @scala.inline
  def apply[T](children: PendingChildren[T] = null, initial: js.UndefOr[Boolean] = js.undefined): AnonChildrenInitial[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenInitial[T]]
  }
}

