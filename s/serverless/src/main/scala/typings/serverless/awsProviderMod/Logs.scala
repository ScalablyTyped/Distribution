package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logs extends js.Object {
  var frameworkLambda: js.UndefOr[Boolean] = js.undefined
  var httpApi: js.UndefOr[HttpApiLogs] = js.undefined
  var restApi: js.UndefOr[RestApiLogs] = js.undefined
  var websocket: js.UndefOr[WebsocketLogs] = js.undefined
}

object Logs {
  @scala.inline
  def apply(
    frameworkLambda: js.UndefOr[Boolean] = js.undefined,
    httpApi: HttpApiLogs = null,
    restApi: RestApiLogs = null,
    websocket: WebsocketLogs = null
  ): Logs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frameworkLambda)) __obj.updateDynamic("frameworkLambda")(frameworkLambda.get.asInstanceOf[js.Any])
    if (httpApi != null) __obj.updateDynamic("httpApi")(httpApi.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (websocket != null) __obj.updateDynamic("websocket")(websocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logs]
  }
}

