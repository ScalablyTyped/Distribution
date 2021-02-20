package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdAccountId extends StObject {
  
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
}
object AccountIdAccountId {
  
  @scala.inline
  def apply(accountId: typings.stellarBase.xdrMod.xdr.AccountId): AccountIdAccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIdAccountId]
  }
  
  @scala.inline
  implicit class AccountIdAccountIdMutableBuilder[Self <: AccountIdAccountId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
