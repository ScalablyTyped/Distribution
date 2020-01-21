package typings.rest.errorCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(code: Int | Double = null): Config = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

