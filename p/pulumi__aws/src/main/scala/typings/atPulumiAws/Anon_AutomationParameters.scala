package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutomationParameters extends js.Object {
  var automationParameters: js.UndefOr[Anon_DocumentVersion] = js.undefined
  var lambdaParameters: js.UndefOr[Anon_ClientContext] = js.undefined
  var runCommandParameters: js.UndefOr[Anon_CommentDocumentHash] = js.undefined
  var stepFunctionsParameters: js.UndefOr[Anon_Input] = js.undefined
}

object Anon_AutomationParameters {
  @scala.inline
  def apply(
    automationParameters: Anon_DocumentVersion = null,
    lambdaParameters: Anon_ClientContext = null,
    runCommandParameters: Anon_CommentDocumentHash = null,
    stepFunctionsParameters: Anon_Input = null
  ): Anon_AutomationParameters = {
    val __obj = js.Dynamic.literal()
    if (automationParameters != null) __obj.updateDynamic("automationParameters")(automationParameters)
    if (lambdaParameters != null) __obj.updateDynamic("lambdaParameters")(lambdaParameters)
    if (runCommandParameters != null) __obj.updateDynamic("runCommandParameters")(runCommandParameters)
    if (stepFunctionsParameters != null) __obj.updateDynamic("stepFunctionsParameters")(stepFunctionsParameters)
    __obj.asInstanceOf[Anon_AutomationParameters]
  }
}

