package typings.pulumiAws.detectorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorState extends js.Object {
  /**
    * The AWS account ID of the GuardDuty detector
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the GuardDuty detector
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Enable monitoring and feedback reporting. Setting to `false` is equivalent to "suspending" GuardDuty. Defaults to `true`.
    */
  val enable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the frequency of notifications sent for subsequent finding occurrences. If the detector is a GuardDuty member account, the value is determined by the GuardDuty master account and cannot be modified, otherwise defaults to `SIX_HOURS`. For standalone and GuardDuty master accounts, it must be configured in this provider to enable drift detection. Valid values for standalone and master accounts: `FIFTEEN_MINUTES`, `ONE_HOUR`, `SIX_HOURS`. See [AWS Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings_cloudwatch.html#guardduty_findings_cloudwatch_notification_frequency) for more information.
    */
  val findingPublishingFrequency: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DetectorState {
  @scala.inline
  def apply(): DetectorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorState]
  }
  @scala.inline
  implicit class DetectorStateOps[Self <: DetectorState] (val x: Self) extends AnyVal {
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
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setEnable(value: Input[Boolean]): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setFindingPublishingFrequency(value: Input[String]): Self = this.set("findingPublishingFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingPublishingFrequency: Self = this.set("findingPublishingFrequency", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

