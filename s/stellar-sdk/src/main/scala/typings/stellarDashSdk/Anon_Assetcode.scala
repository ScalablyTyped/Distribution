package typings.stellarDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assetcode extends js.Object {
  var asset_code: String
  var asset_issuer: String
  var asset_type: String
}

object Anon_Assetcode {
  @scala.inline
  def apply(asset_code: String, asset_issuer: String, asset_type: String): Anon_Assetcode = {
    val __obj = js.Dynamic.literal(asset_code = asset_code, asset_issuer = asset_issuer, asset_type = asset_type)
  
    __obj.asInstanceOf[Anon_Assetcode]
  }
}

