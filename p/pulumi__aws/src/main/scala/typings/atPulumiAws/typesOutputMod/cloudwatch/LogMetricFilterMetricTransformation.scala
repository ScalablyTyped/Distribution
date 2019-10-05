package typings.atPulumiAws.typesOutputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMetricFilterMetricTransformation extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
    * A name for the metric filter.
    */
  var name: String
  var namespace: String
  var value: String
}

object LogMetricFilterMetricTransformation {
  @scala.inline
  def apply(name: String, namespace: String, value: String, defaultValue: String = null): LogMetricFilterMetricTransformation = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, value = value)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.asInstanceOf[LogMetricFilterMetricTransformation]
  }
}

