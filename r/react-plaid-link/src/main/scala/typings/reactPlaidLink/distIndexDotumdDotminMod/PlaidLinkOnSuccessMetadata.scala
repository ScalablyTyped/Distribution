package typings.reactPlaidLink.distIndexDotumdDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaidLinkOnSuccessMetadata extends StObject {
  
  var accounts: js.Array[PlaidAccount]
  
  var institution: Null | PlaidInstitution
  
  var link_session_id: String
  
  var transfer_status: js.UndefOr[String] = js.undefined
}
object PlaidLinkOnSuccessMetadata {
  
  inline def apply(accounts: js.Array[PlaidAccount], link_session_id: String): PlaidLinkOnSuccessMetadata = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], institution = null)
    __obj.asInstanceOf[PlaidLinkOnSuccessMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaidLinkOnSuccessMetadata] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: js.Array[PlaidAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: PlaidAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setInstitution(value: PlaidInstitution): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
    
    inline def setInstitutionNull: Self = StObject.set(x, "institution", null)
    
    inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    
    inline def setTransfer_status(value: String): Self = StObject.set(x, "transfer_status", value.asInstanceOf[js.Any])
    
    inline def setTransfer_statusUndefined: Self = StObject.set(x, "transfer_status", js.undefined)
  }
}
