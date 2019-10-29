package typings.selectorDashSet

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataElements[T] extends js.Object {
  var data: T
  var elements: js.Array[Element]
  var selector: String
}

object Anon_DataElements {
  @scala.inline
  def apply[T](data: T, elements: js.Array[Element], selector: String): Anon_DataElements[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elements = elements, selector = selector)
  
    __obj.asInstanceOf[Anon_DataElements[T]]
  }
}

