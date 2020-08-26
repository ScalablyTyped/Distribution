package typings.pulumiAws.inputMod.cloudwatch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMetricFilterMetricTransformation extends js.Object {
  /**
    * The value to emit when a filter pattern does not match a log event.
    */
  var defaultValue: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the CloudWatch metric to which the monitored log information should be published (e.g. `ErrorCount`)
    */
  var name: Input[String] = js.native
  /**
    * The destination namespace of the CloudWatch metric.
    */
  var namespace: Input[String] = js.native
  /**
    * What to publish to the metric. For example, if you're counting the occurrences of a particular term like "Error", the value will be "1" for each occurrence. If you're counting the bytes transferred the published value will be the value in the log event.
    */
  var value: Input[String] = js.native
}

object LogMetricFilterMetricTransformation {
  @scala.inline
  def apply(name: Input[String], namespace: Input[String], value: Input[String]): LogMetricFilterMetricTransformation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMetricFilterMetricTransformation]
  }
  @scala.inline
  implicit class LogMetricFilterMetricTransformationOps[Self <: LogMetricFilterMetricTransformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Input[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
  }
  
}

