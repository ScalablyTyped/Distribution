package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.FulfilledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenPersist[T] extends js.Object {
  var children: js.UndefOr[FulfilledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object Anon_ChildrenPersist {
  @scala.inline
  def apply[T](children: FulfilledChildren[T] = null, persist: js.UndefOr[Boolean] = js.undefined): Anon_ChildrenPersist[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenPersist[T]]
  }
}

