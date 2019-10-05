package typings.stellarDashBase.stellarDashBaseMod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowTrust extends BaseOptions {
  var assetCode: String
  var authorize: js.UndefOr[Boolean] = js.undefined
  var trustor: String
}

object AllowTrust {
  @scala.inline
  def apply(
    assetCode: String,
    trustor: String,
    authorize: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): AllowTrust = {
    val __obj = js.Dynamic.literal(assetCode = assetCode, trustor = trustor)
    if (!js.isUndefined(authorize)) __obj.updateDynamic("authorize")(authorize)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[AllowTrust]
  }
}

