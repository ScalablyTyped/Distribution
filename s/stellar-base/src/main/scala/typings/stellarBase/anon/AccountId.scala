package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.SignerKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountId extends StObject {
  
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
  implicit class AccountIdMutableBuilder[Self <: AccountId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerKey(value: SignerKey): Self = StObject.set(x, "signerKey", value.asInstanceOf[js.Any])
  }
}
