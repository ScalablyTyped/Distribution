package typings
package restLib.interceptorHateoasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var client: js.UndefOr[restLib.restMod.Client] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(client: restLib.restMod.Client = null, target: java.lang.String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Config]
  }
}

