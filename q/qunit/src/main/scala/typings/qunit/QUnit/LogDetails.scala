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
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDetails]
  }
}

