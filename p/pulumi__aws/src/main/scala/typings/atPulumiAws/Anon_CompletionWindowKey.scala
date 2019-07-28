package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletionWindowKey extends js.Object {
  var completionWindow: js.UndefOr[Input[Double]] = js.undefined
  var lifecycle: js.UndefOr[Input[Anon_ColdStorageAfterDeleteAfter]] = js.undefined
  var recoveryPointTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var ruleName: Input[String]
  var schedule: js.UndefOr[Input[String]] = js.undefined
  var startWindow: js.UndefOr[Input[Double]] = js.undefined
  var targetVaultName: Input[String]
}

object Anon_CompletionWindowKey {
  @scala.inline
  def apply(
    ruleName: Input[String],
    targetVaultName: Input[String],
    completionWindow: Input[Double] = null,
    lifecycle: Input[Anon_ColdStorageAfterDeleteAfter] = null,
    recoveryPointTags: Input[StringDictionary[Input[String]]] = null,
    schedule: Input[String] = null,
    startWindow: Input[Double] = null
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

