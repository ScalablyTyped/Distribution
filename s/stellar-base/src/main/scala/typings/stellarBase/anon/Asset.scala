package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends StObject {
  
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
  implicit class AssetMutableBuilder[Self <: Asset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: AllowTrustOpAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorize(value: Double): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustor(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "trustor", value.asInstanceOf[js.Any])
  }
}
