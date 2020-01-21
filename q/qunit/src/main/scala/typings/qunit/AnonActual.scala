package typings.qunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActual extends js.Object {
  var actual: js.Any
  var expected: js.Any
  var message: String
  var result: Boolean
}

object AnonActual {
  @scala.inline
  def apply(actual: js.Any, expected: js.Any, message: String, result: Boolean): AnonActual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActual]
  }
}

