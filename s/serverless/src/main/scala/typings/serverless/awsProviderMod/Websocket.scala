package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Websocket extends js.Object {
  var authorizer: js.UndefOr[WebsocketAuthorizer] = js.undefined
  var route: String
  var routeResponseSelectionExpression: js.UndefOr[String] = js.undefined
}

object Websocket {
  @scala.inline
  def apply(
    route: String,
    authorizer: WebsocketAuthorizer = null,
    routeResponseSelectionExpression: String = null
  ): Websocket = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    if (authorizer != null) __obj.updateDynamic("authorizer")(authorizer.asInstanceOf[js.Any])
    if (routeResponseSelectionExpression != null) __obj.updateDynamic("routeResponseSelectionExpression")(routeResponseSelectionExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Websocket]
  }
}

