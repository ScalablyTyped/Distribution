package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectLockEnabledRule extends js.Object {
  var objectLockEnabled: Input[String]
  var rule: js.UndefOr[Input[Anon_DefaultRetentionAnonDaysModeYears]] = js.undefined
}

object Anon_ObjectLockEnabledRule {
  @scala.inline
  def apply(objectLockEnabled: Input[String], rule: Input[Anon_DefaultRetentionAnonDaysModeYears] = null): Anon_ObjectLockEnabledRule = {
    val __obj = js.Dynamic.literal(objectLockEnabled = objectLockEnabled.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ObjectLockEnabledRule]
  }
}

