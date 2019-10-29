package typings.stellarDashSdk.libFederationUnderscoreServerMod.FederationServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHttp: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(allowHttp: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHttp)) __obj.updateDynamic("allowHttp")(allowHttp)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

