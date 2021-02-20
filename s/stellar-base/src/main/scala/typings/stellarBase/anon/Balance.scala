package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.AccountEntryExt
import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.SequenceNumber
import typings.stellarBase.xdrMod.xdr.Signer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Balance extends StObject {
  
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var balance: Int64 = js.native
  
  var ext: AccountEntryExt = js.native
  
  var flags: Double = js.native
  
  var homeDomain: String | Buffer = js.native
  
  var inflationDest: Null | typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var numSubEntries: Double = js.native
  
  var seqNum: SequenceNumber = js.native
  
  var signers: js.Array[Signer] = js.native
  
  var thresholds: Buffer = js.native
}
object Balance {
  
  @scala.inline
  def apply(
    accountId: typings.stellarBase.xdrMod.xdr.AccountId,
    balance: Int64,
    ext: AccountEntryExt,
    flags: Double,
    homeDomain: String | Buffer,
    numSubEntries: Double,
    seqNum: SequenceNumber,
    signers: js.Array[Signer],
    thresholds: Buffer
  ): Balance = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], homeDomain = homeDomain.asInstanceOf[js.Any], numSubEntries = numSubEntries.asInstanceOf[js.Any], seqNum = seqNum.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balance]
  }
  
  @scala.inline
  implicit class BalanceMutableBuilder[Self <: Balance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance(value: Int64): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: AccountEntryExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDomain(value: String | Buffer): Self = StObject.set(x, "homeDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflationDest(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "inflationDest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflationDestNull: Self = StObject.set(x, "inflationDest", null)
    
    @scala.inline
    def setNumSubEntries(value: Double): Self = StObject.set(x, "numSubEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeqNum(value: SequenceNumber): Self = StObject.set(x, "seqNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigners(value: js.Array[Signer]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignersVarargs(value: Signer*): Self = StObject.set(x, "signers", js.Array(value :_*))
    
    @scala.inline
    def setThresholds(value: Buffer): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
  }
}
