package typings.reactPlaidLink

import typings.reactPlaidLink.reactPlaidLinkStrings.API_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.ASSET_REPORT_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.CONNECTED
import typings.reactPlaidLink.reactPlaidLinkStrings.CREDENTIAL
import typings.reactPlaidLink.reactPlaidLinkStrings.ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.EXIT
import typings.reactPlaidLink.reactPlaidLinkStrings.INSTITUTION_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.INVALID_INPUT
import typings.reactPlaidLink.reactPlaidLinkStrings.INVALID_REQUEST
import typings.reactPlaidLink.reactPlaidLinkStrings.ITEM_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.LOADING
import typings.reactPlaidLink.reactPlaidLinkStrings.MFA
import typings.reactPlaidLink.reactPlaidLinkStrings.RATE_LIMIT_EXCEEDED
import typings.reactPlaidLink.reactPlaidLinkStrings.RECAPTCHA
import typings.reactPlaidLink.reactPlaidLinkStrings.SELECT_ACCOUNT
import typings.reactPlaidLink.reactPlaidLinkStrings.SELECT_INSTITUTION
import typings.reactPlaidLink.reactPlaidLinkStrings.choose_device
import typings.reactPlaidLink.reactPlaidLinkStrings.institution_not_found
import typings.reactPlaidLink.reactPlaidLinkStrings.manually_verified
import typings.reactPlaidLink.reactPlaidLinkStrings.pending_automatic_verification
import typings.reactPlaidLink.reactPlaidLinkStrings.pending_manual_verification
import typings.reactPlaidLink.reactPlaidLinkStrings.requires_code
import typings.reactPlaidLink.reactPlaidLinkStrings.requires_credentials
import typings.reactPlaidLink.reactPlaidLinkStrings.requires_questions
import typings.reactPlaidLink.reactPlaidLinkStrings.requires_selections
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accounts extends StObject {
    
    var accounts: js.Array[Id]
    
    var institution: Institutionid
    
    var link_session_id: String
  }
  object Accounts {
    
    inline def apply(accounts: js.Array[Id], institution: Institutionid, link_session_id: String): Accounts = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accounts]
    }
    
    extension [Self <: Accounts](x: Self) {
      
      inline def setAccounts(value: js.Array[Id]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      inline def setAccountsVarargs(value: Id*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      inline def setInstitution(value: Institutionid): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Displaymessage extends StObject {
    
    var display_message: String | Null
    
    var error_code: String
    
    var error_message: String
    
    var error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
  }
  object Displaymessage {
    
    inline def apply(
      error_code: String,
      error_message: String,
      error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
    ): Displaymessage = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], display_message = null)
      __obj.asInstanceOf[Displaymessage]
    }
    
    extension [Self <: Displaymessage](x: Self) {
      
      inline def setDisplay_message(value: String): Self = StObject.set(x, "display_message", value.asInstanceOf[js.Any])
      
      inline def setDisplay_messageNull: Self = StObject.set(x, "display_message", null)
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      inline def setError_type(
        value: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
      ): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailAddress extends StObject {
    
    var emailAddress: js.UndefOr[String] = js.undefined
    
    var legalName: js.UndefOr[String] = js.undefined
  }
  object EmailAddress {
    
    inline def apply(): EmailAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailAddress]
    }
    
    extension [Self <: EmailAddress](x: Self) {
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
      
      inline def setLegalName(value: String): Self = StObject.set(x, "legalName", value.asInstanceOf[js.Any])
      
      inline def setLegalNameUndefined: Self = StObject.set(x, "legalName", js.undefined)
    }
  }
  
  trait Errorcode extends StObject {
    
    var error_code: js.UndefOr[String | Null] = js.undefined
    
    var error_message: js.UndefOr[String | Null] = js.undefined
    
    var error_type: js.UndefOr[
        INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR | Null
      ] = js.undefined
    
    var exit_status: js.UndefOr[String | Double | Null] = js.undefined
    
    var institution_id: String
    
    var institution_name: String
    
    var institution_search_query: js.UndefOr[String | Null] = js.undefined
    
    var link_session_id: String
    
    var mfa_type: js.UndefOr[String | Null] = js.undefined
    
    var request_id: String
    
    var timestamp: String
    
    var view_name: js.UndefOr[
        CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION | Null
      ] = js.undefined
  }
  object Errorcode {
    
    inline def apply(
      institution_id: String,
      institution_name: String,
      link_session_id: String,
      request_id: String,
      timestamp: String
    ): Errorcode = {
      val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errorcode]
    }
    
    extension [Self <: Errorcode](x: Self) {
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_codeNull: Self = StObject.set(x, "error_code", null)
      
      inline def setError_codeUndefined: Self = StObject.set(x, "error_code", js.undefined)
      
      inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
      
      inline def setError_messageNull: Self = StObject.set(x, "error_message", null)
      
      inline def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
      
      inline def setError_type(
        value: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
      ): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
      
      inline def setError_typeNull: Self = StObject.set(x, "error_type", null)
      
      inline def setError_typeUndefined: Self = StObject.set(x, "error_type", js.undefined)
      
      inline def setExit_status(value: String | Double): Self = StObject.set(x, "exit_status", value.asInstanceOf[js.Any])
      
      inline def setExit_statusNull: Self = StObject.set(x, "exit_status", null)
      
      inline def setExit_statusUndefined: Self = StObject.set(x, "exit_status", js.undefined)
      
      inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      inline def setInstitution_name(value: String): Self = StObject.set(x, "institution_name", value.asInstanceOf[js.Any])
      
      inline def setInstitution_search_query(value: String): Self = StObject.set(x, "institution_search_query", value.asInstanceOf[js.Any])
      
      inline def setInstitution_search_queryNull: Self = StObject.set(x, "institution_search_query", null)
      
      inline def setInstitution_search_queryUndefined: Self = StObject.set(x, "institution_search_query", js.undefined)
      
      inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
      
      inline def setMfa_type(value: String): Self = StObject.set(x, "mfa_type", value.asInstanceOf[js.Any])
      
      inline def setMfa_typeNull: Self = StObject.set(x, "mfa_type", null)
      
      inline def setMfa_typeUndefined: Self = StObject.set(x, "mfa_type", js.undefined)
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setView_name(
        value: CONNECTED | CREDENTIAL | ERROR | EXIT | LOADING | MFA | RECAPTCHA | SELECT_ACCOUNT | SELECT_INSTITUTION
      ): Self = StObject.set(x, "view_name", value.asInstanceOf[js.Any])
      
      inline def setView_nameNull: Self = StObject.set(x, "view_name", null)
      
      inline def setView_nameUndefined: Self = StObject.set(x, "view_name", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var mask: String
    
    var name: String
    
    var subtype: String
    
    var `type`: String
    
    var verification_status: pending_automatic_verification | pending_manual_verification | manually_verified | Null
  }
  object Id {
    
    inline def apply(id: String, mask: String, name: String, subtype: String, `type`: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], verification_status = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVerification_status(value: pending_automatic_verification | pending_manual_verification | manually_verified): Self = StObject.set(x, "verification_status", value.asInstanceOf[js.Any])
      
      inline def setVerification_statusNull: Self = StObject.set(x, "verification_status", null)
    }
  }
  
  trait Institution extends StObject {
    
    var institution: Name
    
    var link_session_id: String | Null
    
    var request_id: String | Null
    
    var status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
  }
  object Institution {
    
    inline def apply(
      institution: Name,
      status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
    ): Institution = {
      val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], link_session_id = null, request_id = null)
      __obj.asInstanceOf[Institution]
    }
    
    extension [Self <: Institution](x: Self) {
      
      inline def setInstitution(value: Name): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
      
      inline def setLink_session_id(value: String): Self = StObject.set(x, "link_session_id", value.asInstanceOf[js.Any])
      
      inline def setLink_session_idNull: Self = StObject.set(x, "link_session_id", null)
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setRequest_idNull: Self = StObject.set(x, "request_id", null)
      
      inline def setStatus(
        value: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Institutionid extends StObject {
    
    var institution_id: String
    
    var name: String
  }
  object Institutionid {
    
    inline def apply(institution_id: String, name: String): Institutionid = {
      val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Institutionid]
    }
    
    extension [Self <: Institutionid](x: Self) {
      
      inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var institution_id: String | Null
    
    var name: String | Null
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal(institution_id = null, name = null)
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setInstitution_id(value: String): Self = StObject.set(x, "institution_id", value.asInstanceOf[js.Any])
      
      inline def setInstitution_idNull: Self = StObject.set(x, "institution_id", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
    }
  }
}
