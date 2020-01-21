package typings.selectorSet

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataElements[T] extends js.Object {
  var data: T
  var elements: js.Array[Element]
  var selector: String
}

object AnonDataElements {
  @scala.inline
  def apply[T](data: T, elements: js.Array[Element], selector: String): AnonDataElements[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataElements[T]]
  }
}

