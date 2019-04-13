package typings
package restLib.interceptorMimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var permissive: js.UndefOr[scala.Boolean] = js.undefined
  var registry: js.UndefOr[restLib.mimeRegistryMod.Registry] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    mime: java.lang.String = null,
    permissive: js.UndefOr[scala.Boolean] = js.undefined,
    registry: restLib.mimeRegistryMod.Registry = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (!js.isUndefined(permissive)) __obj.updateDynamic("permissive")(permissive)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Config]
  }
}

