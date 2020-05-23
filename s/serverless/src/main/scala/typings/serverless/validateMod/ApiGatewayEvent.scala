package typings.serverless.validateMod

import typings.serverless.anon.Authorizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiGatewayEvent extends js.Object {
  var http: String | Authorizer
}

object ApiGatewayEvent {
  @scala.inline
  def apply(http: String | Authorizer): ApiGatewayEvent = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiGatewayEvent]
  }
}

