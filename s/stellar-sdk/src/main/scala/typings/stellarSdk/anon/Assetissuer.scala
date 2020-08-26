package typings.stellarSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assetissuer extends js.Object {
  var asset_code: String = js.native
  var asset_issuer: String = js.native
  var asset_type: String = js.native
}

object Assetissuer {
  @scala.inline
  def apply(asset_code: String, asset_issuer: String, asset_type: String): Assetissuer = {
    val __obj = js.Dynamic.literal(asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assetissuer]
  }
  @scala.inline
  implicit class AssetissuerOps[Self <: Assetissuer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsset_code(value: String): Self = this.set("asset_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsset_issuer(value: String): Self = this.set("asset_issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsset_type(value: String): Self = this.set("asset_type", value.asInstanceOf[js.Any])
  }
  
}

