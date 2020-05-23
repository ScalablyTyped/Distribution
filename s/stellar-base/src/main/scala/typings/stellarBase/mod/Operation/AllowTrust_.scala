package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.AllowTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowTrust_ extends BaseOperation[AllowTrust] {
  var assetCode: String
  var authorize: js.UndefOr[Boolean] = js.undefined
  var trustor: String
}

object AllowTrust_ {
  @scala.inline
  def apply(
    assetCode: String,
    trustor: String,
    `type`: AllowTrust,
    authorize: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): AllowTrust_ = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(authorize)) __obj.updateDynamic("authorize")(authorize.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrust_]
  }
}

