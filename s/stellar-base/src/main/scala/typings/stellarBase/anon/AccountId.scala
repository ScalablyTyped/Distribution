package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.AccountEntryExt
import typings.stellarBase.xdrMod.xdr.Int64
import typings.stellarBase.xdrMod.xdr.SequenceNumber
import typings.stellarBase.xdrMod.xdr.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountId extends js.Object {
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

object AccountId {
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
  ): AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], homeDomain = homeDomain.asInstanceOf[js.Any], numSubEntries = numSubEntries.asInstanceOf[js.Any], seqNum = seqNum.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountId]
  }
  @scala.inline
  implicit class AccountIdOps[Self <: AccountId] (val x: Self) extends AnyVal {
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
    def setBalance(value: Int64): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: AccountEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomeDomain(value: String | Buffer): Self = this.set("homeDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumSubEntries(value: Double): Self = this.set("numSubEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeqNum(value: SequenceNumber): Self = this.set("seqNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignersVarargs(value: Signer*): Self = this.set("signers", js.Array(value :_*))
    @scala.inline
    def setSigners(value: js.Array[Signer]): Self = this.set("signers", value.asInstanceOf[js.Any])
    @scala.inline
    def setThresholds(value: Buffer): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def setInflationDest(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = this.set("inflationDest", value.asInstanceOf[js.Any])
    @scala.inline
    def setInflationDestNull: Self = this.set("inflationDest", null)
  }
  
}

