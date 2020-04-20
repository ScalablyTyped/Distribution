package typings.rfc6902.diffMod

import typings.rfc6902.rfc6902Strings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOperation extends Operation {
  var op: test
  var path: String
  var value: js.Any
}

object TestOperation {
  @scala.inline
  def apply(op: test, path: String, value: js.Any): TestOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOperation]
  }
}

