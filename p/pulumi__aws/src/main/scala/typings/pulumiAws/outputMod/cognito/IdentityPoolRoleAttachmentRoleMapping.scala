package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityPoolRoleAttachmentRoleMapping extends StObject {
  
  /**
    * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
    */
  var ambiguousRoleResolution: js.UndefOr[String] = js.undefined
  
  /**
    * A string identifying the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
    */
  var identityProvider: String
  
  /**
    * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
    */
  var mappingRules: js.UndefOr[js.Array[IdentityPoolRoleAttachmentRoleMappingMappingRule]] = js.undefined
  
  /**
    * The role mapping type.
    */
  var `type`: String
}
object IdentityPoolRoleAttachmentRoleMapping {
  
  inline def apply(identityProvider: String, `type`: String): IdentityPoolRoleAttachmentRoleMapping = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMapping]
  }
  
  extension [Self <: IdentityPoolRoleAttachmentRoleMapping](x: Self) {
    
    inline def setAmbiguousRoleResolution(value: String): Self = StObject.set(x, "ambiguousRoleResolution", value.asInstanceOf[js.Any])
    
    inline def setAmbiguousRoleResolutionUndefined: Self = StObject.set(x, "ambiguousRoleResolution", js.undefined)
    
    inline def setIdentityProvider(value: String): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
    
    inline def setMappingRules(value: js.Array[IdentityPoolRoleAttachmentRoleMappingMappingRule]): Self = StObject.set(x, "mappingRules", value.asInstanceOf[js.Any])
    
    inline def setMappingRulesUndefined: Self = StObject.set(x, "mappingRules", js.undefined)
    
    inline def setMappingRulesVarargs(value: IdentityPoolRoleAttachmentRoleMappingMappingRule*): Self = StObject.set(x, "mappingRules", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
