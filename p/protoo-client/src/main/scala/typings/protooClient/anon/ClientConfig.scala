package typings.protooClient.anon

import typings.node.httpMod.OutgoingHttpHeaders
import typings.retry.mod.OperationOptions
import typings.websocket.mod.IClientConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig extends js.Object {
  var clientConfig: js.UndefOr[IClientConfig] = js.undefined
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var protocols: js.UndefOr[String | js.Array[String]] = js.undefined
  var requestOptions: js.UndefOr[js.Object] = js.undefined
  var retry: js.UndefOr[OperationOptions] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    clientConfig: IClientConfig = null,
    headers: OutgoingHttpHeaders = null,
    origin: String = null,
    protocols: String | js.Array[String] = null,
    requestOptions: js.Object = null,
    retry: OperationOptions = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (clientConfig != null) __obj.updateDynamic("clientConfig")(clientConfig.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

