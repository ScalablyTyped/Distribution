package typings
package simplecrawlerLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenOptions extends js.Object {
  var backlog: js.UndefOr[scala.Double] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object ListenOptions {
  @scala.inline
  def apply(
    backlog: scala.Int | scala.Double = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): ListenOptions = {
    val __obj = js.Dynamic.literal()
    if (backlog != null) __obj.updateDynamic("backlog")(backlog.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenOptions]
  }
}

