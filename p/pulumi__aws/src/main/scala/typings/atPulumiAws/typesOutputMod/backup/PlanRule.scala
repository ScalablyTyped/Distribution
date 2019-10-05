package typings.atPulumiAws.typesOutputMod.backup

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanRule extends js.Object {
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var completionWindow: js.UndefOr[Double] = js.undefined
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires.  Fields documented below.
    */
  var lifecycle: js.UndefOr[PlanRuleLifecycle] = js.undefined
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  var recoveryPointTags: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * An display name for a backup rule.
    */
  var ruleName: String
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var schedule: js.UndefOr[String] = js.undefined
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var startWindow: js.UndefOr[Double] = js.undefined
  /**
    * The name of a logical container where backups are stored.
    */
  var targetVaultName: String
}

object PlanRule {
  @scala.inline
  def apply(
    ruleName: String,
    targetVaultName: String,
    completionWindow: Int | Double = null,
    lifecycle: PlanRuleLifecycle = null,
    recoveryPointTags: StringDictionary[String] = null,
    schedule: String = null,
    startWindow: Int | Double = null
  ): PlanRule = {
    val __obj = js.Dynamic.literal(ruleName = ruleName, targetVaultName = targetVaultName)
    if (completionWindow != null) __obj.updateDynamic("completionWindow")(completionWindow.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle)
    if (recoveryPointTags != null) __obj.updateDynamic("recoveryPointTags")(recoveryPointTags)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (startWindow != null) __obj.updateDynamic("startWindow")(startWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanRule]
  }
}

