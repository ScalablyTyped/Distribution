package typings.reactInstantsearchDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hit[T] extends js.Object {
  var hit: typings.reactInstantsearchCore.mod.Hit[T]
}

object Hit {
  @scala.inline
  def apply[T](hit: typings.reactInstantsearchCore.mod.Hit[T]): Hit[T] = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit[T]]
  }
}

