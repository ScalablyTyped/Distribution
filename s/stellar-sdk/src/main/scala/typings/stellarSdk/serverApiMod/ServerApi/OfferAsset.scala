package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarBase.mod.AssetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferAsset extends StObject {
  
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
  implicit class OfferAssetMutableBuilder[Self <: OfferAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_codeUndefined: Self = StObject.set(x, "asset_code", js.undefined)
    
    @scala.inline
    def setAsset_issuer(value: String): Self = StObject.set(x, "asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_issuerUndefined: Self = StObject.set(x, "asset_issuer", js.undefined)
    
    @scala.inline
    def setAsset_type(value: AssetType): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
  }
}
