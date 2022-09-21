package typings.saml2Js

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var authentication_method: js.UndefOr[String] = js.undefined
    
    var common_name: js.UndefOr[String] = js.undefined
    
    var deny_only_group_sid: js.UndefOr[String] = js.undefined
    
    var deny_only_primary_group_sid: js.UndefOr[String] = js.undefined
    
    var deny_only_primary_sid: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var given_name: js.UndefOr[String] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var group_sid: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var name_id: String
    
    var ppid: js.UndefOr[String] = js.undefined
    
    var primary_group_sid: js.UndefOr[String] = js.undefined
    
    var primary_sid: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var session_index: js.UndefOr[String] = js.undefined
    
    var session_not_on_or_after: js.UndefOr[String] = js.undefined
    
    var surname: js.UndefOr[String] = js.undefined
    
    var upn: js.UndefOr[String] = js.undefined
    
    var windows_account_name: js.UndefOr[String] = js.undefined
  }
  object Attributes {
    
    inline def apply(name_id: String): Attributes = {
      val __obj = js.Dynamic.literal(name_id = name_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAuthentication_method(value: String): Self = StObject.set(x, "authentication_method", value.asInstanceOf[js.Any])
      
      inline def setAuthentication_methodUndefined: Self = StObject.set(x, "authentication_method", js.undefined)
      
      inline def setCommon_name(value: String): Self = StObject.set(x, "common_name", value.asInstanceOf[js.Any])
      
      inline def setCommon_nameUndefined: Self = StObject.set(x, "common_name", js.undefined)
      
      inline def setDeny_only_group_sid(value: String): Self = StObject.set(x, "deny_only_group_sid", value.asInstanceOf[js.Any])
      
      inline def setDeny_only_group_sidUndefined: Self = StObject.set(x, "deny_only_group_sid", js.undefined)
      
      inline def setDeny_only_primary_group_sid(value: String): Self = StObject.set(x, "deny_only_primary_group_sid", value.asInstanceOf[js.Any])
      
      inline def setDeny_only_primary_group_sidUndefined: Self = StObject.set(x, "deny_only_primary_group_sid", js.undefined)
      
      inline def setDeny_only_primary_sid(value: String): Self = StObject.set(x, "deny_only_primary_sid", value.asInstanceOf[js.Any])
      
      inline def setDeny_only_primary_sidUndefined: Self = StObject.set(x, "deny_only_primary_sid", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setGroup_sid(value: String): Self = StObject.set(x, "group_sid", value.asInstanceOf[js.Any])
      
      inline def setGroup_sidUndefined: Self = StObject.set(x, "group_sid", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setName_id(value: String): Self = StObject.set(x, "name_id", value.asInstanceOf[js.Any])
      
      inline def setPpid(value: String): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
      
      inline def setPpidUndefined: Self = StObject.set(x, "ppid", js.undefined)
      
      inline def setPrimary_group_sid(value: String): Self = StObject.set(x, "primary_group_sid", value.asInstanceOf[js.Any])
      
      inline def setPrimary_group_sidUndefined: Self = StObject.set(x, "primary_group_sid", js.undefined)
      
      inline def setPrimary_sid(value: String): Self = StObject.set(x, "primary_sid", value.asInstanceOf[js.Any])
      
      inline def setPrimary_sidUndefined: Self = StObject.set(x, "primary_sid", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSession_index(value: String): Self = StObject.set(x, "session_index", value.asInstanceOf[js.Any])
      
      inline def setSession_indexUndefined: Self = StObject.set(x, "session_index", js.undefined)
      
      inline def setSession_not_on_or_after(value: String): Self = StObject.set(x, "session_not_on_or_after", value.asInstanceOf[js.Any])
      
      inline def setSession_not_on_or_afterUndefined: Self = StObject.set(x, "session_not_on_or_after", js.undefined)
      
      inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
      
      inline def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
      
      inline def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
      
      inline def setWindows_account_name(value: String): Self = StObject.set(x, "windows_account_name", value.asInstanceOf[js.Any])
      
      inline def setWindows_account_nameUndefined: Self = StObject.set(x, "windows_account_name", js.undefined)
    }
  }
  
  trait Destination extends StObject {
    
    var destination: String
    
    var id: String
    
    var in_response_to: String
  }
  object Destination {
    
    inline def apply(destination: String, id: String, in_response_to: String): Destination = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], in_response_to = in_response_to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Destination]
    }
    
    extension [Self <: Destination](x: Self) {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIn_response_to(value: String): Self = StObject.set(x, "in_response_to", value.asInstanceOf[js.Any])
    }
  }
  
  trait SAMLRequest extends StObject {
    
    var SAMLRequest: js.UndefOr[Any] = js.undefined
    
    var SAMLResponse: js.UndefOr[Any] = js.undefined
  }
  object SAMLRequest {
    
    inline def apply(): SAMLRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SAMLRequest]
    }
    
    extension [Self <: SAMLRequest](x: Self) {
      
      inline def setSAMLRequest(value: Any): Self = StObject.set(x, "SAMLRequest", value.asInstanceOf[js.Any])
      
      inline def setSAMLRequestUndefined: Self = StObject.set(x, "SAMLRequest", js.undefined)
      
      inline def setSAMLResponse(value: Any): Self = StObject.set(x, "SAMLResponse", value.asInstanceOf[js.Any])
      
      inline def setSAMLResponseUndefined: Self = StObject.set(x, "SAMLResponse", js.undefined)
    }
  }
}
