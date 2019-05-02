package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowHalfOpenFamily extends js.Object {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
  var family: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var localPort: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
}

object Anon_AllowHalfOpenFamily {
  @scala.inline
  def apply(
    port: scala.Double,
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    family: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    localAddress: java.lang.String = null,
    localPort: java.lang.String = null
  ): Anon_AllowHalfOpenFamily = {
    val __obj = js.Dynamic.literal(port = port)
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort)
    __obj.asInstanceOf[Anon_AllowHalfOpenFamily]
  }
}

