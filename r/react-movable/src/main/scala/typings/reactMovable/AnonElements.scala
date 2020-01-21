package typings.reactMovable

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElements extends js.Object {
  var elements: js.Array[Element]
  var index: Double
}

object AnonElements {
  @scala.inline
  def apply(elements: js.Array[Element], index: Double): AnonElements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElements]
  }
}

