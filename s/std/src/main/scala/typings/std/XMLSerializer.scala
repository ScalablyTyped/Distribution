package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the serializeToString() method to construct an XML string representing a DOM tree. */
trait XMLSerializer extends js.Object {
  def serializeToString(root: Node): java.lang.String
}

object XMLSerializer {
  @scala.inline
  def apply(serializeToString: Node => java.lang.String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.asInstanceOf[XMLSerializer]
  }
}

