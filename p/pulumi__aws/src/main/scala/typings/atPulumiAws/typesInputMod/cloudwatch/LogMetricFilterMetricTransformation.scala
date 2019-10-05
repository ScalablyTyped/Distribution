package typings.atPulumiAws.typesInputMod.cloudwatch

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMetricFilterMetricTransformation extends js.Object {
  var defaultValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * A name for the metric filter.
    */
  var name: Input[String]
  var namespace: Input[String]
  var value: Input[String]
}

object LogMetricFilterMetricTransformation {
  @scala.inline
  def apply(
    name: Input[String],
    namespace: Input[String],
    value: Input[String],
    defaultValue: Input[String] = null
  ): LogMetricFilterMetricTransformation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMetricFilterMetricTransformation]
  }
}

