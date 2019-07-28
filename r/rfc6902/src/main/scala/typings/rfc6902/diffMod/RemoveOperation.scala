package typings.rfc6902.diffMod

import typings.rfc6902.rfc6902Strings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOperation extends Operation {
  var op: remove
  var path: String
}

object RemoveOperation {
  @scala.inline
  def apply(op: remove, path: String): RemoveOperation = {
    val __obj = js.Dynamic.literal(op = op, path = path)
  
    __obj.asInstanceOf[RemoveOperation]
  }
}

