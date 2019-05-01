package typings
package rfc6902Lib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOperation extends Operation {
  var op: rfc6902Lib.rfc6902LibStrings.add
  var path: java.lang.String
  var value: js.Any
}

object AddOperation {
  @scala.inline
  def apply(op: rfc6902Lib.rfc6902LibStrings.add, path: java.lang.String, value: js.Any): AddOperation = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value)
  
    __obj.asInstanceOf[AddOperation]
  }
}

