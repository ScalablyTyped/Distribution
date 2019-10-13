package typings.atStorybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current[T] extends js.Object {
  var current: T
}

object Anon_Current {
  @scala.inline
  def apply[T](current: T): Anon_Current[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Current[T]]
  }
}

