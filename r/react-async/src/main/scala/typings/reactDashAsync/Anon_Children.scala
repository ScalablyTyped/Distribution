package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncMod.AsyncChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[T] extends js.Object {
  var children: js.UndefOr[AsyncChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply[T](children: AsyncChildren[T] = null, persist: js.UndefOr[Boolean] = js.undefined): Anon_Children[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    __obj.asInstanceOf[Anon_Children[T]]
  }
}

