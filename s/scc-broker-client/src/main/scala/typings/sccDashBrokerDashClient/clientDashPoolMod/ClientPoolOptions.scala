package typings.sccDashBrokerDashClient.clientDashPoolMod

import typings.jsonwebtoken.jsonwebtokenMod.Secret
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
  def apply(targetURI: String, authKey: Secret = null, clientCount: Int | Double = null): ClientPoolOptions = {
    val __obj = js.Dynamic.literal(targetURI = targetURI)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (clientCount != null) __obj.updateDynamic("clientCount")(clientCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPoolOptions]
  }
}

