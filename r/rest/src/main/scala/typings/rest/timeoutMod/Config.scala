package typings.rest.timeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var transient: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined, transient: js.UndefOr[Boolean] = js.undefined): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transient)) __obj.updateDynamic("transient")(transient.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

