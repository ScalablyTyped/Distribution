package typings.pulumiAws.logMetricFilterMod

import typings.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMetricFilterArgs extends js.Object {
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: Input[String] = js.native
  /**
    * A block defining collection of information
    * needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: Input[LogMetricFilterMetricTransformation] = js.native
  /**
    * A name for the metric filter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: Input[String] = js.native
}

object LogMetricFilterArgs {
  @scala.inline
  def apply(
    logGroupName: Input[String],
    metricTransformation: Input[LogMetricFilterMetricTransformation],
    pattern: Input[String],
    name: Input[String] = null
  ): LogMetricFilterArgs = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], metricTransformation = metricTransformation.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMetricFilterArgs]
  }
}

