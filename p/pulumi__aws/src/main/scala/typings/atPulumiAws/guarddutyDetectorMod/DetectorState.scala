package typings.atPulumiAws.guarddutyDetectorMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorState extends js.Object {
  /**
    * The AWS account ID of the GuardDuty detector
    */
  val accountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Enable monitoring and feedback reporting. Setting to `false` is equivalent to "suspending" GuardDuty. Defaults to `true`.
    */
  val enable: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies the frequency of notifications sent for subsequent finding occurrences. If the detector is a GuardDuty member account, the value is determined by the GuardDuty master account and cannot be modified, otherwise defaults to `SIX_HOURS`. For standalone and GuardDuty master accounts, it must be configured in this provider to enable drift detection. Valid values for standalone and master accounts: `FIFTEEN_MINUTES`, `ONE_HOUR`, `SIX_HOURS`. See [AWS Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings_cloudwatch.html#guardduty_findings_cloudwatch_notification_frequency) for more information.
    */
  val findingPublishingFrequency: js.UndefOr[Input[String]] = js.undefined
}

object DetectorState {
  @scala.inline
  def apply(
    accountId: Input[String] = null,
    enable: Input[Boolean] = null,
    findingPublishingFrequency: Input[String] = null
  ): DetectorState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (findingPublishingFrequency != null) __obj.updateDynamic("findingPublishingFrequency")(findingPublishingFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorState]
  }
}

