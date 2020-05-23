package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonDocumentTypeChildNode extends js.Object {
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  val nextElementSibling: Element | Null
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  val previousElementSibling: Element | Null
}

object NonDocumentTypeChildNode {
  @scala.inline
  def apply(nextElementSibling: Element = null, previousElementSibling: Element = null): NonDocumentTypeChildNode = {
    val __obj = js.Dynamic.literal(nextElementSibling = nextElementSibling.asInstanceOf[js.Any], previousElementSibling = previousElementSibling.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDocumentTypeChildNode]
  }
}

