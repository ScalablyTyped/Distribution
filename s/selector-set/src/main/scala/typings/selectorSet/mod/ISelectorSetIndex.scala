package typings.selectorSet.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectorSetIndex extends js.Object {
  var name: String
  def element(el: Element): js.Array[String] | Unit
  def selector(selector: String): String | Unit
}

object ISelectorSetIndex {
  @scala.inline
  def apply(element: Element => js.Array[String] | Unit, name: String, selector: String => String | Unit): ISelectorSetIndex = {
    val __obj = js.Dynamic.literal(element = js.Any.fromFunction1(element), name = name.asInstanceOf[js.Any], selector = js.Any.fromFunction1(selector))
    __obj.asInstanceOf[ISelectorSetIndex]
  }
}

