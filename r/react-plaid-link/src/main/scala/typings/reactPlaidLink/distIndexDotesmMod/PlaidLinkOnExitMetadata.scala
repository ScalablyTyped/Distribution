package typings.reactPlaidLink.distIndexDotesmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaidLinkOnExitMetadata extends StObject {
  
  var institution: Null | PlaidInstitution
  
  var link_session_id: String
  
  var request_id: String
  
  // see possible values for status at https://plaid.com/docs/link/web/#link-web-onexit-status
  var status: Null | String
}
object PlaidLinkOnExitMetadata {
  
  inline def apply(link_session_id: String, request_id: String): PlaidLinkOnExitMetadata = {
    val __obj = js.Dynamic.literal(link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], institution = null, status = null)
    __obj.asInstanceOf[PlaidLinkOnExitMetadata]
  }
  
  extension [Self <: PlaidLinkOnExitMetadata](x: Self) {
    
    inline def setInstitution(value: PlaidInstitution): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
    
    inline def setInstitutionNull: Self = StObject.set(x, "institution", null)
    
    inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
  }
}
