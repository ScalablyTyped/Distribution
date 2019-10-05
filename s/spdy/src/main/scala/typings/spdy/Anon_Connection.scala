package typings.spdy

import typings.spdy.spdyMod.server.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var connection: js.UndefOr[Anon_AutoSpdy31] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  var `x-forwarded-for`: js.UndefOr[Boolean] = js.undefined
}

object Anon_Connection {
  @scala.inline
  def apply(
    connection: Anon_AutoSpdy31 = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    protocols: js.Array[Protocol] = null,
    `x-forwarded-for`: js.UndefOr[Boolean] = js.undefined
  ): Anon_Connection = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (!js.isUndefined(`x-forwarded-for`)) __obj.updateDynamic("x-forwarded-for")(`x-forwarded-for`)
    __obj.asInstanceOf[Anon_Connection]
  }
}

