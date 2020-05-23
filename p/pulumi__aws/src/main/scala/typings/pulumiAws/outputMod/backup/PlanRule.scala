package typings.pulumiAws.outputMod.backup

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanRule extends js.Object {
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var completionWindow: js.UndefOr[Double] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires.  Fields documented below.
    */
  var lifecycle: js.UndefOr[PlanRuleLifecycle] = js.native
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  var recoveryPointTags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * An display name for a backup rule.
    */
  var ruleName: String = js.native
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var schedule: js.UndefOr[String] = js.native
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var startWindow: js.UndefOr[Double] = js.native
  /**
    * The name of a logical container where backups are stored.
    */
  var targetVaultName: String = js.native
}

object PlanRule {
  @scala.inline
  def apply(
    ruleName: String,
    targetVaultName: String,
    completionWindow: js.UndefOr[Double] = js.undefined,
    lifecycle: PlanRuleLifecycle = null,
    recoveryPointTags: StringDictionary[js.Any] = null,
    schedule: String = null,
    startWindow: js.UndefOr[Double] = js.undefined
  ): PlanRule = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], targetVaultName = targetVaultName.asInstanceOf[js.Any])
    if (!js.isUndefined(completionWindow)) __obj.updateDynamic("completionWindow")(completionWindow.get.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (recoveryPointTags != null) __obj.updateDynamic("recoveryPointTags")(recoveryPointTags.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (!js.isUndefined(startWindow)) __obj.updateDynamic("startWindow")(startWindow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanRule]
  }
}

