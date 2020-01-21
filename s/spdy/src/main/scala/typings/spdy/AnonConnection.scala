package typings.spdy

import typings.spdy.mod.server.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnection extends js.Object {
  var connection: js.UndefOr[AnonAutoSpdy31] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  var `x-forwarded-for`: js.UndefOr[Boolean] = js.undefined
}

object AnonConnection {
  @scala.inline
  def apply(
    connection: AnonAutoSpdy31 = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    protocols: js.Array[Protocol] = null,
    `x-forwarded-for`: js.UndefOr[Boolean] = js.undefined
  ): AnonConnection = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(`x-forwarded-for`)) __obj.updateDynamic("x-forwarded-for")(`x-forwarded-for`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnection]
  }
}

