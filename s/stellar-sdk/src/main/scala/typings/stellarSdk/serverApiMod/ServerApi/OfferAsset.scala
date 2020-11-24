package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarBase.mod.AssetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferAsset extends js.Object {
  
  var asset_code: js.UndefOr[String] = js.native
  
  var asset_issuer: js.UndefOr[String] = js.native
  
  var asset_type: AssetType = js.native
}
object OfferAsset {
  
  @scala.inline
  def apply(asset_type: AssetType): OfferAsset = {
    val __obj = js.Dynamic.literal(asset_type = asset_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferAsset]
  }
  
  @scala.inline
  implicit class OfferAssetOps[Self <: OfferAsset] (val x: Self) extends AnyVal {
    
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
    def setAsset_type(value: AssetType): Self = this.set("asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_code(value: String): Self = this.set("asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset_code: Self = this.set("asset_code", js.undefined)
    
    @scala.inline
    def setAsset_issuer(value: String): Self = this.set("asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset_issuer: Self = this.set("asset_issuer", js.undefined)
  }
}
