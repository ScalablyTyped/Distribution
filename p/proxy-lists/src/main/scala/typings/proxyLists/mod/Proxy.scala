package typings.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  var anonymityLevel: js.UndefOr[AnonymityLevel] = js.undefined
  var country: String
  var ipAddress: String
  var port: Double
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  var source: String
  var tunnel: js.UndefOr[Boolean] = js.undefined
}

object Proxy {
  @scala.inline
  def apply(
    country: String,
    ipAddress: String,
    port: Double,
    source: String,
    anonymityLevel: AnonymityLevel = null,
    protocols: js.Array[Protocol] = null,
    tunnel: js.UndefOr[Boolean] = js.undefined
  ): Proxy = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (anonymityLevel != null) __obj.updateDynamic("anonymityLevel")(anonymityLevel.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
}

