package typings.rest.locationMod

import typings.rest.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var client: js.UndefOr[Client] = js.undefined
  var code: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(client: Client = null, code: js.UndefOr[Double] = js.undefined): Config = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

