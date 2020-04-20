package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonElementParentNode extends js.Object {
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  def getElementById(elementId: java.lang.String): Element | Null
}

object NonElementParentNode {
  @scala.inline
  def apply(getElementById: java.lang.String => Element | Null): NonElementParentNode = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById))
    __obj.asInstanceOf[NonElementParentNode]
  }
}

