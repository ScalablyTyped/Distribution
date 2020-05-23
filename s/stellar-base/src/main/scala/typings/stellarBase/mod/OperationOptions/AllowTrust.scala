package typings.stellarBase.mod.OperationOptions

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
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    if (!js.isUndefined(authorize)) __obj.updateDynamic("authorize")(authorize.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrust]
  }
}

