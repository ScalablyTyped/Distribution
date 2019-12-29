package typings.atPusherChatkitDashClient.chatmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProviderConstructorArgs extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var queryParams: js.UndefOr[js.Any] = js.undefined
  var url: String
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object TokenProviderConstructorArgs {
  @scala.inline
  def apply(
    url: String,
    headers: js.Any = null,
    queryParams: js.Any = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): TokenProviderConstructorArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProviderConstructorArgs]
  }
}

