package typings.stellarSdk.stellarTomlResolverMod.StellarTomlResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StellarTomlResolveOptions extends js.Object {
  var allowHttp: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object StellarTomlResolveOptions {
  @scala.inline
  def apply(allowHttp: js.UndefOr[Boolean] = js.undefined, timeout: js.UndefOr[Double] = js.undefined): StellarTomlResolveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHttp)) __obj.updateDynamic("allowHttp")(allowHttp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarTomlResolveOptions]
  }
}

