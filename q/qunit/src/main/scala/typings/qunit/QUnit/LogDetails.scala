package typings.qunit.QUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDetails extends js.Object {
  var actual: js.Any
  var expected: js.Any
  var message: String
  var module: String
  var name: String
  var result: Boolean
  var runtime: Double
  var source: String
}

object LogDetails {
  @scala.inline
  def apply(
    actual: js.Any,
    expected: js.Any,
    message: String,
    module: String,
    name: String,
    result: Boolean,
    runtime: Double,
    source: String
  ): LogDetails = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, message = message, module = module, name = name, result = result, runtime = runtime, source = source)
  
    __obj.asInstanceOf[LogDetails]
  }
}

