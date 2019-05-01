package typings
package rfc6902Lib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOperation extends Operation {
  var op: rfc6902Lib.rfc6902LibStrings.test
  var path: java.lang.String
  var value: js.Any
}

object TestOperation {
  @scala.inline
  def apply(op: rfc6902Lib.rfc6902LibStrings.test, path: java.lang.String, value: js.Any): TestOperation = {
    val __obj = js.Dynamic.literal(op = op, path = path, value = value)
  
    __obj.asInstanceOf[TestOperation]
  }
}

