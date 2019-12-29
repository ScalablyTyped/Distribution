package typings.atPusherChatkitDashClient.chatmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatManagerConstructorArgs extends js.Object {
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var instanceLocator: String
  var logger: js.UndefOr[Logger] = js.undefined
  var userId: String
}

object ChatManagerConstructorArgs {
  @scala.inline
  def apply(
    instanceLocator: String,
    userId: String,
    connectionTimeout: Int | Double = null,
    logger: Logger = null
  ): ChatManagerConstructorArgs = {
    val __obj = js.Dynamic.literal(instanceLocator = instanceLocator.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatManagerConstructorArgs]
  }
}

