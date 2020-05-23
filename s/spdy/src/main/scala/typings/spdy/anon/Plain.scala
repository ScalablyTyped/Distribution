package typings.spdy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plain extends js.Object {
  var plain: js.UndefOr[Boolean] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var `x-forwarded-for`: js.UndefOr[String] = js.undefined
}

object Plain {
  @scala.inline
  def apply(
    plain: js.UndefOr[Boolean] = js.undefined,
    protocol: String = null,
    protocols: js.Array[String] = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    `x-forwarded-for`: String = null
  ): Plain = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (`x-forwarded-for` != null) __obj.updateDynamic("x-forwarded-for")(`x-forwarded-for`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plain]
  }
}

