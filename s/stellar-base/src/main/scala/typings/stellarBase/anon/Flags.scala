package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.TrustLineEntryExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flags extends js.Object {
  
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var asset: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var balance: Int64 = js.native
  
  var ext: TrustLineEntryExt = js.native
  
  var flags: Double = js.native
  
  var limit: Int64 = js.native
}
object Flags {
  
  @scala.inline
  def apply(
    accountId: typings.stellarBase.xdrMod.xdr.AccountId,
    asset: typings.stellarBase.xdrMod.xdr.Asset,
    balance: Int64,
    ext: TrustLineEntryExt,
    flags: Double,
    limit: Int64
  ): Flags = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsOps[Self <: Flags] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance(value: Int64): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: TrustLineEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Int64): Self = this.set("limit", value.asInstanceOf[js.Any])
  }
}
