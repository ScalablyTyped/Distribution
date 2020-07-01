package typings.serverlessTencentScf.triggerMod

import typings.serverlessTencentScf.anon.SecretId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayRequestContext extends js.Object {
  var httpMethod: String
  var identity: SecretId
  var path: String
  var requestId: js.UndefOr[String] = js.undefined
  var serviceId: String
  var sourceIp: String
  var stage: String
}

object APIGatewayRequestContext {
  @scala.inline
  def apply(
    httpMethod: String,
    identity: SecretId,
    path: String,
    serviceId: String,
    sourceIp: String,
    stage: String,
    requestId: String = null
  ): APIGatewayRequestContext = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayRequestContext]
  }
}

