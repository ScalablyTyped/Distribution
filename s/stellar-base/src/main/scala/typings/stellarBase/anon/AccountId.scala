package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.SignerKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountId extends js.Object {
  
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var signerKey: SignerKey = js.native
}
object AccountId {
  
  @scala.inline
  def apply(accountId: typings.stellarBase.xdrMod.xdr.AccountId, signerKey: SignerKey): AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], signerKey = signerKey.asInstanceOf[js.Any])
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
    def setSignerKey(value: SignerKey): Self = this.set("signerKey", value.asInstanceOf[js.Any])
  }
}
