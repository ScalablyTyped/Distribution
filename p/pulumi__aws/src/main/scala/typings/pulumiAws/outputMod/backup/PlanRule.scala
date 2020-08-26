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
    * Configuration block(s) with copy operation settings. Detailed below.
    */
  var copyActions: js.UndefOr[js.Array[PlanRuleCopyAction]] = js.native
  /**
    * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
    */
  var lifecycle: js.UndefOr[PlanRuleLifecycle] = js.native
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  var recoveryPointTags: js.UndefOr[StringDictionary[String]] = js.native
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
  def apply(ruleName: String, targetVaultName: String): PlanRule = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], targetVaultName = targetVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanRule]
  }
  @scala.inline
  implicit class PlanRuleOps[Self <: PlanRule] (val x: Self) extends AnyVal {
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
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetVaultName(value: String): Self = this.set("targetVaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletionWindow(value: Double): Self = this.set("completionWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionWindow: Self = this.set("completionWindow", js.undefined)
    @scala.inline
    def setCopyActionsVarargs(value: PlanRuleCopyAction*): Self = this.set("copyActions", js.Array(value :_*))
    @scala.inline
    def setCopyActions(value: js.Array[PlanRuleCopyAction]): Self = this.set("copyActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyActions: Self = this.set("copyActions", js.undefined)
    @scala.inline
    def setLifecycle(value: PlanRuleLifecycle): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("lifecycle", js.undefined)
    @scala.inline
    def setRecoveryPointTags(value: StringDictionary[String]): Self = this.set("recoveryPointTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoveryPointTags: Self = this.set("recoveryPointTags", js.undefined)
    @scala.inline
    def setSchedule(value: String): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setStartWindow(value: Double): Self = this.set("startWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartWindow: Self = this.set("startWindow", js.undefined)
  }
  
}

