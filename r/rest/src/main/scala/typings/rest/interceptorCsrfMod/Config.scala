package typings.rest.interceptorCsrfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(name: String = null, token: String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

