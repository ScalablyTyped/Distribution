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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actual")(actual)
    __obj.updateDynamic("expected")(expected)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("runtime")(runtime)
    __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[LogDetails]
  }
}

