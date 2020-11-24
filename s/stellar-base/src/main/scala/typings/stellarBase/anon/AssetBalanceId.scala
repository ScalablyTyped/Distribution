package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntryExt
import typings.stellarBase.xdrMod.xdr.ClaimableBalanceId
import typings.stellarBase.xdrMod.xdr.Claimant
import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetBalanceId extends js.Object {
  
  var amount: Int64 = js.native
  
  var asset: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var balanceId: ClaimableBalanceId = js.native
  
  var claimants: js.Array[Claimant] = js.native
  
  var ext: ClaimableBalanceEntryExt = js.native
}
object AssetBalanceId {
  
  @scala.inline
  def apply(
    amount: Int64,
    asset: typings.stellarBase.xdrMod.xdr.Asset,
    balanceId: ClaimableBalanceId,
    claimants: js.Array[Claimant],
    ext: ClaimableBalanceEntryExt
  ): AssetBalanceId = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], balanceId = balanceId.asInstanceOf[js.Any], claimants = claimants.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetBalanceId]
  }
  
  @scala.inline
  implicit class AssetBalanceIdOps[Self <: AssetBalanceId] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Int64): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalanceId(value: ClaimableBalanceId): Self = this.set("balanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimantsVarargs(value: Claimant*): Self = this.set("claimants", js.Array(value :_*))
    
    @scala.inline
    def setClaimants(value: js.Array[Claimant]): Self = this.set("claimants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: ClaimableBalanceEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
  }
}
