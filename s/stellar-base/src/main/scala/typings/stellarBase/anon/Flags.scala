package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.TrustLineEntryExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flags extends StObject {
  
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
  implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance(value: Int64): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: TrustLineEntryExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Int64): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
