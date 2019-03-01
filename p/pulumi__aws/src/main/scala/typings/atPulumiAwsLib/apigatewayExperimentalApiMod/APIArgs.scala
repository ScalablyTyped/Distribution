package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIArgs extends js.Object {
  /**
    * Routes to use to initialize the APIGateway.
    *
    * Either [swaggerString] or [routes] must be specified.
    */
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
  var stageName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A Swagger specification already in string form to use to initialize the APIGateway.  Note
    * that you must manually provide permission for any route targets to be invoked by API Gateway
    * when using [swaggerString].
    *
    * Either [swaggerString] or [routes] must be specified.
    */
  var swaggerString: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object APIArgs {
  @scala.inline
  def apply(
    routes: js.Array[Route] = null,
    stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    swaggerString: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): APIArgs = {
    val __obj = js.Dynamic.literal()
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (swaggerString != null) __obj.updateDynamic("swaggerString")(swaggerString.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIArgs]
  }
}

