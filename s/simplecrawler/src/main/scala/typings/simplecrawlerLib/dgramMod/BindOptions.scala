package typings
package simplecrawlerLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindOptions extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var port: scala.Double
}

object BindOptions {
  @scala.inline
  def apply(
    port: scala.Double,
    address: java.lang.String = null,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined
  ): BindOptions = {
    val __obj = js.Dynamic.literal(port = port)
    if (address != null) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    __obj.asInstanceOf[BindOptions]
  }
}

