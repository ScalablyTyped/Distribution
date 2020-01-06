package typings.atPulumiAws.typesOutputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMetricFilterMetricTransformation extends js.Object {
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * A name for the metric filter.
    */
  var name: String = js.native
  var namespace: String = js.native
  var value: String = js.native
}

object LogMetricFilterMetricTransformation {
  @scala.inline
  def apply(name: String, namespace: String, value: String, defaultValue: String = null): LogMetricFilterMetricTransformation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMetricFilterMetricTransformation]
  }
}

