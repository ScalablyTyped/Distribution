package typings.rest.interceptorHateoasMod

import typings.rest.restMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var client: js.UndefOr[Client] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(client: Client = null, target: String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Config]
  }
}

