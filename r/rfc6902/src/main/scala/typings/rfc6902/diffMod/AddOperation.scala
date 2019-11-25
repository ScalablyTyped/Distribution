package typings.rfc6902.diffMod

import typings.rfc6902.rfc6902Strings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOperation extends Operation {
  var op: add
  var path: String
  var value: js.Any
}

object AddOperation {
  @scala.inline
  def apply(op: add, path: String, value: js.Any): AddOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddOperation]
  }
}

