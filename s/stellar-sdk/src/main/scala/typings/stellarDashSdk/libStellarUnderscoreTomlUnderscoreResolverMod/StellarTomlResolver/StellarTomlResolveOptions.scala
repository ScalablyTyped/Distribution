package typings.stellarDashSdk.libStellarUnderscoreTomlUnderscoreResolverMod.StellarTomlResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StellarTomlResolveOptions extends js.Object {
  var allowHttp: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object StellarTomlResolveOptions {
  @scala.inline
  def apply(allowHttp: js.UndefOr[Boolean] = js.undefined, timeout: Int | Double = null): StellarTomlResolveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHttp)) __obj.updateDynamic("allowHttp")(allowHttp.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarTomlResolveOptions]
  }
}

