package typings.rest.interceptorMimeMod

import typings.rest.mimeRegistryMod.Registry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var permissive: js.UndefOr[Boolean] = js.undefined
  var registry: js.UndefOr[Registry] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    accept: String = null,
    mime: String = null,
    permissive: js.UndefOr[Boolean] = js.undefined,
    registry: Registry = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (!js.isUndefined(permissive)) __obj.updateDynamic("permissive")(permissive)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Config]
  }
}

