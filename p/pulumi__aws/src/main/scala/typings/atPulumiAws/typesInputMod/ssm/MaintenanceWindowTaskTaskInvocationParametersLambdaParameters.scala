package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersLambdaParameters extends js.Object {
  /**
    * Pass client-specific information to the Lambda function that you are invoking.
    */
  var clientContext: js.UndefOr[Input[String]] = js.native
  /**
    * JSON to provide to your Lambda function as input.
    */
  var payload: js.UndefOr[Input[String]] = js.native
  /**
    * Specify a Lambda function version or alias name.
    */
  var qualifier: js.UndefOr[Input[String]] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersLambdaParameters {
  @scala.inline
  def apply(
    clientContext: Input[String] = null,
    payload: Input[String] = null,
    qualifier: Input[String] = null
  ): MaintenanceWindowTaskTaskInvocationParametersLambdaParameters = {
    val __obj = js.Dynamic.literal()
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]
  }
}

