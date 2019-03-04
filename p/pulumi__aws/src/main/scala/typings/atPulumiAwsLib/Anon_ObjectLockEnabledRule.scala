package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectLockEnabledRule extends js.Object {
  var objectLockEnabled: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var rule: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_DefaultRetentionAnonDaysModeYears]] = js.undefined
}

object Anon_ObjectLockEnabledRule {
  @scala.inline
  def apply(
    objectLockEnabled: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    rule: atPulumiPulumiLib.outputMod.Input[Anon_DefaultRetentionAnonDaysModeYears] = null
  ): Anon_ObjectLockEnabledRule = {
    val __obj = js.Dynamic.literal(objectLockEnabled = objectLockEnabled.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ObjectLockEnabledRule]
  }
}

