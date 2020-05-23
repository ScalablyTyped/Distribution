package typings.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingProps[T] extends js.Object {
  var children: js.UndefOr[PendingChildren[T]] = js.undefined
  var initial: js.UndefOr[Boolean] = js.undefined
}

object PendingProps {
  @scala.inline
  def apply[T](children: PendingChildren[T] = null, initial: js.UndefOr[Boolean] = js.undefined): PendingProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingProps[T]]
  }
}

