package typings
package atPulumiAwsLib.cloudwatchLogMetricFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMetricFilterArgs extends js.Object {
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A block defining collection of information
    * needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DefaultValueName]
  /**
    * A name for the metric filter.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

