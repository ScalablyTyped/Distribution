package typings.sntp.sntpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var resolveReference: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    host: String = null,
    port: Int | Double = null,
    resolveReference: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveReference)) __obj.updateDynamic("resolveReference")(resolveReference)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

