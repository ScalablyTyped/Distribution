package typings.sockjsDashClient.sockjsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var server: js.UndefOr[String] = js.undefined
  var sessionId: js.UndefOr[Double | SessionGenerator] = js.undefined
  var transports: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    server: String = null,
    sessionId: Double | SessionGenerator = null,
    transports: String | js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

