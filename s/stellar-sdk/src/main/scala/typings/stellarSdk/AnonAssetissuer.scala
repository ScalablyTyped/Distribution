package typings.stellarSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssetissuer extends js.Object {
  var asset_code: String
  var asset_issuer: String
  var asset_type: String
}

object AnonAssetissuer {
  @scala.inline
  def apply(asset_code: String, asset_issuer: String, asset_type: String): AnonAssetissuer = {
    val __obj = js.Dynamic.literal(asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssetissuer]
  }
}

