package typings.selectorSet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T] extends js.Object {
  var data: T
  var selector: String
}

object Data {
  @scala.inline
  def apply[T](data: T, selector: String): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

