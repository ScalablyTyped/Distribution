package typings
package rfc6902Lib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOperation extends Operation {
  var op: rfc6902Lib.rfc6902LibStrings.remove
  var path: java.lang.String
}

object RemoveOperation {
  @scala.inline
  def apply(op: rfc6902Lib.rfc6902LibStrings.remove, path: java.lang.String): RemoveOperation = {
    val __obj = js.Dynamic.literal(op = op, path = path)
  
    __obj.asInstanceOf[RemoveOperation]
  }
}

