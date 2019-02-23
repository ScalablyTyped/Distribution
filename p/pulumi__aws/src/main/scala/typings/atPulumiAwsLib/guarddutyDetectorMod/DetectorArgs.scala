package typings
package atPulumiAwsLib.guarddutyDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorArgs extends js.Object {
  /**
    * Enable monitoring and feedback reporting. Setting to `false` is equivalent to "suspending" GuardDuty. Defaults to `true`.
    */
  val enable: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies the frequency of notifications sent for subsequent finding occurrences. Valid values: `FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS`. Default: `SIX_HOURS`. See [AWS Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings_cloudwatch.html#guardduty_findings_cloudwatch_notification_frequency) for more information.
    */
  val findingPublishingFrequency: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

