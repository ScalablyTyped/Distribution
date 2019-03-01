package typings
package sockjsDashClientLib.sockjsDashClientMod.SockJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var server: js.UndefOr[java.lang.String] = js.undefined
  var sessionId: js.UndefOr[scala.Double | SessionGenerator] = js.undefined
  var transports: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    server: java.lang.String = null,
    sessionId: scala.Double | SessionGenerator = null,
    transports: java.lang.String | js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

