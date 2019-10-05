package typings.atPulumiAws.typesInputMod.backup

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanRule extends js.Object {
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var completionWindow: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires.  Fields documented below.
    */
  var lifecycle: js.UndefOr[Input[PlanRuleLifecycle]] = js.undefined
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  var recoveryPointTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * An display name for a backup rule.
    */
  var ruleName: Input[String]
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var schedule: js.UndefOr[Input[String]] = js.undefined
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var startWindow: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The name of a logical container where backups are stored.
    */
  var targetVaultName: Input[String]
}

object PlanRule {
  @scala.inline
  def apply(
    ruleName: Input[String],
    targetVaultName: Input[String],
    completionWindow: Input[Double] = null,
    lifecycle: Input[PlanRuleLifecycle] = null,
    recoveryPointTags: Input[StringDictionary[Input[String]]] = null,
    schedule: Input[String] = null,
    startWindow: Input[Double] = null
  ): PlanRule = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], targetVaultName = targetVaultName.asInstanceOf[js.Any])
    if (completionWindow != null) __obj.updateDynamic("completionWindow")(completionWindow.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (recoveryPointTags != null) __obj.updateDynamic("recoveryPointTags")(recoveryPointTags.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (startWindow != null) __obj.updateDynamic("startWindow")(startWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanRule]
  }
}

