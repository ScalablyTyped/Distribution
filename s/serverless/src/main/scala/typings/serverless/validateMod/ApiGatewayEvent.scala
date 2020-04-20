package typings.serverless.validateMod

import typings.serverless.AnonAuthorizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiGatewayEvent extends js.Object {
  var http: String | AnonAuthorizer
}

object ApiGatewayEvent {
  @scala.inline
  def apply(http: String | AnonAuthorizer): ApiGatewayEvent = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiGatewayEvent]
  }
}

