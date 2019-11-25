package typings.proclaim.proclaimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionError extends js.Object {
  var actual: js.Any
  var expected: js.Any
  var msg: String
  var operator: String
  var stackStartFunction: js.Any
}

object AssertionError {
  @scala.inline
  def apply(actual: js.Any, expected: js.Any, msg: String, operator: String, stackStartFunction: js.Any): AssertionError = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], stackStartFunction = stackStartFunction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssertionError]
  }
}

