package typings.stellarBase.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdDataName extends StObject {
  
  var accountId: typings.stellarBase.xdrMod.xdr.AccountId = js.native
  
  var dataName: String | Buffer = js.native
}
object AccountIdDataName {
  
  @scala.inline
  def apply(accountId: typings.stellarBase.xdrMod.xdr.AccountId, dataName: String | Buffer): AccountIdDataName = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], dataName = dataName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIdDataName]
  }
  
  @scala.inline
  implicit class AccountIdDataNameMutableBuilder[Self <: AccountIdDataName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: typings.stellarBase.xdrMod.xdr.AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataName(value: String | Buffer): Self = StObject.set(x, "dataName", value.asInstanceOf[js.Any])
  }
}
