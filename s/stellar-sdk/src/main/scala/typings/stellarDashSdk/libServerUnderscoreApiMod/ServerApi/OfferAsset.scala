package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import typings.stellarDashBase.stellarDashBaseMod.AssetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferAsset extends js.Object {
  var asset_code: js.UndefOr[String] = js.undefined
  var asset_issuer: js.UndefOr[String] = js.undefined
  var asset_type: AssetType
}

object OfferAsset {
  @scala.inline
  def apply(asset_type: AssetType, asset_code: String = null, asset_issuer: String = null): OfferAsset = {
    val __obj = js.Dynamic.literal(asset_type = asset_type.asInstanceOf[js.Any])
    if (asset_code != null) __obj.updateDynamic("asset_code")(asset_code)
    if (asset_issuer != null) __obj.updateDynamic("asset_issuer")(asset_issuer)
    __obj.asInstanceOf[OfferAsset]
  }
}

