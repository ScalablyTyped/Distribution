package typings
package qunitLib.QUnitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogDetails extends js.Object {
  var actual: js.Any
  var expected: js.Any
  var message: java.lang.String
  var module: java.lang.String
  var name: java.lang.String
  var result: scala.Boolean
  var runtime: scala.Double
  var source: java.lang.String
}

object LogDetails {
  @scala.inline
  def apply(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    module: java.lang.String,
    name: java.lang.String,
    result: scala.Boolean,
    runtime: scala.Double,
    source: java.lang.String
  ): LogDetails = {
    val __obj = js.Dynamic.literal(actual = actual, expected = expected, message = message, module = module, name = name, result = result, runtime = runtime, source = source)
  
    __obj.asInstanceOf[LogDetails]
  }
}

