package typings.atPulumiAws.cloudwatchLogMetricFilterMod

import typings.atPulumiAws.typesInputMod.cloudwatch.LogMetricFilterMetricTransformation
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMetricFilterState extends js.Object {
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A block defining collection of information
    * needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: js.UndefOr[Input[LogMetricFilterMetricTransformation]] = js.native
  /**
    * A name for the metric filter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: js.UndefOr[Input[String]] = js.native
}

object LogMetricFilterState {
  @scala.inline
  def apply(
    logGroupName: Input[String] = null,
    metricTransformation: Input[LogMetricFilterMetricTransformation] = null,
    name: Input[String] = null,
    pattern: Input[String] = null
  ): LogMetricFilterState = {
    val __obj = js.Dynamic.literal()
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (metricTransformation != null) __obj.updateDynamic("metricTransformation")(metricTransformation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMetricFilterState]
  }
}

