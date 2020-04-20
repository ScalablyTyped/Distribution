package typings.qunitDom.assertionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionResult extends js.Object {
  var actual: js.Any
  var expected: js.Any
  var message: String
  var result: Boolean
}

object AssertionResult {
  @scala.inline
  def apply(actual: js.Any, expected: js.Any, message: String, result: Boolean): AssertionResult = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResult]
  }
}

