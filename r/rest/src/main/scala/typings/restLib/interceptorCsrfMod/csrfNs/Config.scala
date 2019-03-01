package typings
package restLib.interceptorCsrfMod.csrfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(name: java.lang.String = null, token: java.lang.String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Config]
  }
}

