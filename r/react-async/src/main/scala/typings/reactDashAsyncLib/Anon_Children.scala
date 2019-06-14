package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[T] extends js.Object {
  var children: js.UndefOr[reactDashAsyncLib.reactDashAsyncMod.AsyncChildren[T]] = js.undefined
  var persist: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply[T](
    children: reactDashAsyncLib.reactDashAsyncMod.AsyncChildren[T] = null,
    persist: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Children[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    __obj.asInstanceOf[Anon_Children[T]]
  }
}

