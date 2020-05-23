package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracing extends js.Object {
  var apiGateway: Boolean
  var lambda: js.UndefOr[Boolean] = js.undefined
}

object Tracing {
  @scala.inline
  def apply(apiGateway: Boolean, lambda: js.UndefOr[Boolean] = js.undefined): Tracing = {
    val __obj = js.Dynamic.literal(apiGateway = apiGateway.asInstanceOf[js.Any])
    if (!js.isUndefined(lambda)) __obj.updateDynamic("lambda")(lambda.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracing]
  }
}

