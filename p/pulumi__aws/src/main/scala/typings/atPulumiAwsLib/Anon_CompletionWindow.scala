package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletionWindow extends js.Object {
  var completionWindow: js.UndefOr[scala.Double] = js.undefined
  var lifecycle: js.UndefOr[Anon_ColdStorageAfter] = js.undefined
  var recoveryPointTags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var ruleName: java.lang.String
  var schedule: js.UndefOr[java.lang.String] = js.undefined
  var startWindow: js.UndefOr[scala.Double] = js.undefined
  var targetVaultName: java.lang.String
}

object Anon_CompletionWindow {
  @scala.inline
  def apply(
    ruleName: java.lang.String,
    targetVaultName: java.lang.String,
    completionWindow: scala.Int | scala.Double = null,
    lifecycle: Anon_ColdStorageAfter = null,
    recoveryPointTags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    schedule: java.lang.String = null,
    startWindow: scala.Int | scala.Double = null
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

