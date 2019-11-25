package typings.rfc6902.diffMod

import typings.rfc6902.rfc6902Strings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOperation extends Operation {
  var from: String
  var op: move
  var path: String
}

object MoveOperation {
  @scala.inline
  def apply(from: String, op: move, path: String): MoveOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MoveOperation]
  }
}

