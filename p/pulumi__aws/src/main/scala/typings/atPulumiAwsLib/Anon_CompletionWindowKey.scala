package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletionWindowKey extends js.Object {
  var completionWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var lifecycle: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ColdStorageAfterDeleteAfter]] = js.undefined
  var recoveryPointTags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  var ruleName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var schedule: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var startWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var targetVaultName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_CompletionWindowKey {
  @scala.inline
  def apply(
    ruleName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    targetVaultName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    completionWindow: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    lifecycle: atPulumiPulumiLib.outputMod.Input[Anon_ColdStorageAfterDeleteAfter] = null,
    recoveryPointTags: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    schedule: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    startWindow: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_CompletionWindowKey = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], targetVaultName = targetVaultName.asInstanceOf[js.Any])
    if (completionWindow != null) __obj.updateDynamic("completionWindow")(completionWindow.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (recoveryPointTags != null) __obj.updateDynamic("recoveryPointTags")(recoveryPointTags.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (startWindow != null) __obj.updateDynamic("startWindow")(startWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompletionWindowKey]
  }
}

