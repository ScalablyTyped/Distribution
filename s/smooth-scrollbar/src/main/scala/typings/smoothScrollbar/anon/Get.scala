package typings.smoothScrollbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  def get(): js.Any
}

object Get {
  @scala.inline
  def apply(get: () => js.Any): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Get]
  }
}

