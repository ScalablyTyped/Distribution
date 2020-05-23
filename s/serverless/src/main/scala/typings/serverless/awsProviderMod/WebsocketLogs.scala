package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsocketLogs extends js.Object {
  var level: js.UndefOr[String] = js.undefined
}

object WebsocketLogs {
  @scala.inline
  def apply(level: String = null): WebsocketLogs = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsocketLogs]
  }
}

