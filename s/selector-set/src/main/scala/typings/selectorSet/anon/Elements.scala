package typings.selectorSet.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elements[T] extends js.Object {
  var data: T
  var elements: js.Array[Element]
  var selector: String
}

object Elements {
  @scala.inline
  def apply[T](data: T, elements: js.Array[Element], selector: String): Elements[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements[T]]
  }
}

