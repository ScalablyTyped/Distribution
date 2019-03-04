package typings
package proxyDashListsLib.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  var anonymityLevel: js.UndefOr[AnonymityLevel] = js.undefined
  var country: java.lang.String
  var ipAddress: java.lang.String
  var port: scala.Double
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  var source: java.lang.String
  var tunnel: js.UndefOr[scala.Boolean] = js.undefined
}

object Proxy {
  @scala.inline
  def apply(
    country: java.lang.String,
    ipAddress: java.lang.String,
    port: scala.Double,
    source: java.lang.String,
    anonymityLevel: AnonymityLevel = null,
    protocols: js.Array[Protocol] = null,
    tunnel: js.UndefOr[scala.Boolean] = js.undefined
  ): Proxy = {
    val __obj = js.Dynamic.literal(country = country, ipAddress = ipAddress, port = port, source = source)
    if (anonymityLevel != null) __obj.updateDynamic("anonymityLevel")(anonymityLevel)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel)
    __obj.asInstanceOf[Proxy]
  }
}

