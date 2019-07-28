package typings.rfc6902.diffMod

import typings.rfc6902.rfc6902Strings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceOperation extends Operation {
  var op: replace
  var path: String
  var value: js.Any
}

object ReplaceOperation {
  @scala.inline
  def apply(op: replace, path: String, value: js.Any): ReplaceOperation = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value)
  
    __obj.asInstanceOf[ReplaceOperation]
  }
}

