package typings
package restLib.interceptorErrorCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var code: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(code: scala.Int | scala.Double = null): Config = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

