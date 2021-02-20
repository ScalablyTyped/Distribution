package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdAsset extends StObject {
  
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var asset: typings.stellarBase.xdrMod.xdr.Asset = js.native
}
object AccountIdAsset {
  
  @scala.inline
  def apply(accountId: typings.stellarBase.xdrMod.xdr.AccountId, asset: typings.stellarBase.xdrMod.xdr.Asset): AccountIdAsset = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIdAsset]
  }
  
  @scala.inline
  implicit class AccountIdAssetMutableBuilder[Self <: AccountIdAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
  }
}
