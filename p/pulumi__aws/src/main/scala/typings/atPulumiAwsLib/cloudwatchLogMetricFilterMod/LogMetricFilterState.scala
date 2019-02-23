package typings
package atPulumiAwsLib.cloudwatchLogMetricFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMetricFilterState extends js.Object {
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A block defining collection of information
    * needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultValueName]] = js.undefined
  /**
    * A name for the metric filter.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

