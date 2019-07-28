package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletionWindow extends js.Object {
  var completionWindow: js.UndefOr[Double] = js.undefined
  var lifecycle: js.UndefOr[Anon_ColdStorageAfter] = js.undefined
  var recoveryPointTags: js.UndefOr[StringDictionary[String]] = js.undefined
  var ruleName: String
  var schedule: js.UndefOr[String] = js.undefined
  var startWindow: js.UndefOr[Double] = js.undefined
  var targetVaultName: String
}

object Anon_CompletionWindow {
  @scala.inline
  def apply(
    ruleName: String,
    targetVaultName: String,
    completionWindow: Int | Double = null,
    lifecycle: Anon_ColdStorageAfter = null,
    recoveryPointTags: StringDictionary[String] = null,
    schedule: String = null,
    startWindow: Int | Double = null
  ): Anon_CompletionWindow = {
    val __obj = js.Dynamic.literal(ruleName = ruleName, targetVaultName = targetVaultName)
    if (completionWindow != null) __obj.updateDynamic("completionWindow")(completionWindow.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle)
    if (recoveryPointTags != null) __obj.updateDynamic("recoveryPointTags")(recoveryPointTags)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (startWindow != null) __obj.updateDynamic("startWindow")(startWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompletionWindow]
  }
}

