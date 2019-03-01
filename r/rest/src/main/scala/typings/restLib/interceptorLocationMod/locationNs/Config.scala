package typings
package restLib.interceptorLocationMod.locationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var client: js.UndefOr[restLib.restMod.restNs.Client] = js.undefined
  var code: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(client: restLib.restMod.restNs.Client = null, code: scala.Int | scala.Double = null): Config = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

