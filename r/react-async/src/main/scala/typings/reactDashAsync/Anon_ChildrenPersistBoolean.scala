package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.RejectedChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenPersistBoolean[T] extends js.Object {
  var children: js.UndefOr[RejectedChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object Anon_ChildrenPersistBoolean {
  @scala.inline
  def apply[T](children: RejectedChildren[T] = null, persist: js.UndefOr[Boolean] = js.undefined): Anon_ChildrenPersistBoolean[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenPersistBoolean[T]]
  }
}

