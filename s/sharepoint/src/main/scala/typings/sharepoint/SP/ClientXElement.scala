package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientXElement extends js.Object {
  def get_element(): XElement
  def set_element(value: XElement): Unit
}

object ClientXElement {
  @scala.inline
  def apply(get_element: () => XElement, set_element: XElement => Unit): ClientXElement = {
    val __obj = js.Dynamic.literal(get_element = js.Any.fromFunction0(get_element), set_element = js.Any.fromFunction1(set_element))
    __obj.asInstanceOf[ClientXElement]
  }
}

