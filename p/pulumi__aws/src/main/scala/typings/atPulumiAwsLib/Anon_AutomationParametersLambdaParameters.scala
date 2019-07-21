package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutomationParametersLambdaParameters extends js.Object {
  var automationParameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_DocumentVersionParameters]] = js.undefined
  var lambdaParameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ClientContextPayload]] = js.undefined
  var runCommandParameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_CommentDocumentHashDocumentHashType]] = js.undefined
  var stepFunctionsParameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_InputName]] = js.undefined
}

object Anon_AutomationParametersLambdaParameters {
  @scala.inline
  def apply(
    automationParameters: atPulumiPulumiLib.outputMod.Input[Anon_DocumentVersionParameters] = null,
    lambdaParameters: atPulumiPulumiLib.outputMod.Input[Anon_ClientContextPayload] = null,
    runCommandParameters: atPulumiPulumiLib.outputMod.Input[Anon_CommentDocumentHashDocumentHashType] = null,
    stepFunctionsParameters: atPulumiPulumiLib.outputMod.Input[Anon_InputName] = null
  ): Anon_AutomationParametersLambdaParameters = {
    val __obj = js.Dynamic.literal()
    if (automationParameters != null) __obj.updateDynamic("automationParameters")(automationParameters.asInstanceOf[js.Any])
    if (lambdaParameters != null) __obj.updateDynamic("lambdaParameters")(lambdaParameters.asInstanceOf[js.Any])
    if (runCommandParameters != null) __obj.updateDynamic("runCommandParameters")(runCommandParameters.asInstanceOf[js.Any])
    if (stepFunctionsParameters != null) __obj.updateDynamic("stepFunctionsParameters")(stepFunctionsParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutomationParametersLambdaParameters]
  }
}

