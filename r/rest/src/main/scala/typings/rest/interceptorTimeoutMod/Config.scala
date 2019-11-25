package typings.rest.interceptorTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var transient: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(timeout: Int | Double = null, transient: js.UndefOr[Boolean] = js.undefined): Config = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transient)) __obj.updateDynamic("transient")(transient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

