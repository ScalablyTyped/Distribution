package typings
package routieLib.routieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object RouteOptions {
  @scala.inline
  def apply(silent: js.UndefOr[scala.Boolean] = js.undefined): RouteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[RouteOptions]
  }
}

