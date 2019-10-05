package typings.atPulumiAws.typesOutputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskTaskInvocationParametersLambdaParameters extends js.Object {
  /**
    * Pass client-specific information to the Lambda function that you are invoking.
    */
  var clientContext: js.UndefOr[String] = js.undefined
  /**
    * JSON to provide to your Lambda function as input.
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * Specify a Lambda function version or alias name.
    */
  var qualifier: js.UndefOr[String] = js.undefined
}

object MaintenanceWindowTaskTaskInvocationParametersLambdaParameters {
  @scala.inline
  def apply(clientContext: String = null, payload: String = null, qualifier: String = null): MaintenanceWindowTaskTaskInvocationParametersLambdaParameters = {
    val __obj = js.Dynamic.literal()
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]
  }
}

