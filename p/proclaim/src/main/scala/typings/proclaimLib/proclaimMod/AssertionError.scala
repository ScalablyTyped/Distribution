package typings
package proclaimLib.proclaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionError extends js.Object {
  var actual: js.Any
  var expected: js.Any
  var msg: java.lang.String
  var operator: java.lang.String
  var stackStartFunction: js.Any
}

object AssertionError {
  @scala.inline
  def apply(
    actual: js.Any,
    expected: js.Any,
    msg: java.lang.String,
    operator: java.lang.String,
    stackStartFunction: js.Any
  ): AssertionError = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, msg = msg, operator = operator, stackStartFunction = stackStartFunction)
  
    __obj.asInstanceOf[AssertionError]
  }
}

