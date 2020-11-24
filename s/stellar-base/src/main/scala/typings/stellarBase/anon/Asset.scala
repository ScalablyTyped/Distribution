package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends js.Object {
  
  var asset: AllowTrustOpAsset = js.native
  
  var authorize: Double = js.native
  
  var trustor: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}
object Asset {
  
  @scala.inline
  def apply(asset: AllowTrustOpAsset, authorize: Double, trustor: typings.stellarBase.xdrMod.xdr.AccountId): Asset = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], authorize = authorize.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
    
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
    def setAsset(value: AllowTrustOpAsset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorize(value: Double): Self = this.set("authorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustor(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("trustor", value.asInstanceOf[js.Any])
  }
}
