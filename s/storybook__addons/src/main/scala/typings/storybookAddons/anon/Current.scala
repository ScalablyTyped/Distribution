package typings.storybookAddons.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current[T] extends js.Object {
  var current: T
}

object Current {
  @scala.inline
  def apply[T](current: T): Current[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current[T]]
  }
}

