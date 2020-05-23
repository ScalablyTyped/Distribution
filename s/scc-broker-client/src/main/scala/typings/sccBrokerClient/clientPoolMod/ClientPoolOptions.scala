package typings.sccBrokerClient.clientPoolMod

import typings.jsonwebtoken.mod.Secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientPoolOptions extends js.Object {
  var authKey: js.UndefOr[Secret] = js.undefined
  var clientCount: js.UndefOr[Double] = js.undefined
  var targetURI: String
}

object ClientPoolOptions {
  @scala.inline
  def apply(targetURI: String, authKey: Secret = null, clientCount: js.UndefOr[Double] = js.undefined): ClientPoolOptions = {
    val __obj = js.Dynamic.literal(targetURI = targetURI.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (!js.isUndefined(clientCount)) __obj.updateDynamic("clientCount")(clientCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPoolOptions]
  }
}

