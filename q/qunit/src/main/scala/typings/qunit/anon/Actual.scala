package typings.qunit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actual extends js.Object {
  var actual: js.Any
  var expected: js.Any
  var message: String
  var result: Boolean
}

object Actual {
  @scala.inline
  def apply(actual: js.Any, expected: js.Any, message: String, result: Boolean): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
}

