package typings.reactAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialProps[T] extends js.Object {
  var children: js.UndefOr[InitialChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object InitialProps {
  @scala.inline
  def apply[T](children: InitialChildren[T] = null, persist: js.UndefOr[Boolean] = js.undefined): InitialProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProps[T]]
  }
}

