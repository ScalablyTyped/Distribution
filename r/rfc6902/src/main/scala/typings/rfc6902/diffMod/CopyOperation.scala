package typings.rfc6902.diffMod

import typings.rfc6902.rfc6902Strings.copy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOperation extends Operation {
  var from: String
  var op: copy
  var path: String
}

object CopyOperation {
  @scala.inline
  def apply(from: String, op: copy, path: String): CopyOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CopyOperation]
  }
}

