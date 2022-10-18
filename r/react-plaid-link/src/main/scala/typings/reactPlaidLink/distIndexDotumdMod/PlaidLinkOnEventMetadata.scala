package typings.reactPlaidLink.distIndexDotumdMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaidLinkOnEventMetadata extends StObject {
  
  var error_code: Null | String
  
  var error_message: Null | String
  
  var error_type: Null | String
  
  var exit_status: Null | String
  
  var institution_id: Null | String
  
  var institution_name: Null | String
  
  var institution_search_query: Null | String
  
  var link_session_id: String
  
  var mfa_type: Null | String
  
  var request_id: String
  
  // see possible values for selection at https://plaid.com/docs/link/web/#link-web-onevent-selection
  var selection: Null | String
  
  // ISO 8601 format timestamp
  var timestamp: String
  
  // see possible values for view_name at https://plaid.com/docs/link/web/#link-web-onevent-view-name
  var view_name: Null | String
}
object PlaidLinkOnEventMetadata {
  
  inline def apply(link_session_id: String, request_id: String, timestamp: String): PlaidLinkOnEventMetadata = {
    val __obj = js.Dynamic.literal(link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], error_code = null, error_message = null, error_type = null, exit_status = null, institution_id = null, institution_name = null, institution_search_query = null, mfa_type = null, selection = null, view_name = null)
    __obj.asInstanceOf[PlaidLinkOnEventMetadata]
  }
  
  extension [Self <: PlaidLinkOnEventMetadata](x: Self) {
    
    inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
    
    inline def setError_codeNull: Self = StObject.set(x, "error_code", null)
    
    inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    inline def setError_messageNull: Self = StObject.set(x, "error_message", null)
    
    inline def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
    
    inline def setError_typeNull: Self = StObject.set(x, "error_type", null)
    
    inline def setExit_status(value: String): Self = StObject.set(x, "exit_status", value.asInstanceOf[js.Any])
    
    inline def setExit_statusNull: Self = StObject.set(x, "exit_status", null)
    
    inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
    
    inline def setInstitution_idNull: Self = StObject.set(x, "institution_id", null)
    
    inline def setInstitution_name(value: String): Self = StObject.set(x, "institution_name", value.asInstanceOf[js.Any])
    
    inline def setInstitution_nameNull: Self = StObject.set(x, "institution_name", null)
    
    inline def setInstitution_search_query(value: String): Self = StObject.set(x, "institution_search_query", value.asInstanceOf[js.Any])
    
    inline def setInstitution_search_queryNull: Self = StObject.set(x, "institution_search_query", null)
    
    inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    
    inline def setMfa_type(value: String): Self = StObject.set(x, "mfa_type", value.asInstanceOf[js.Any])
    
    inline def setMfa_typeNull: Self = StObject.set(x, "mfa_type", null)
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionNull: Self = StObject.set(x, "selection", null)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setView_name(value: String): Self = StObject.set(x, "view_name", value.asInstanceOf[js.Any])
    
    inline def setView_nameNull: Self = StObject.set(x, "view_name", null)
  }
}
