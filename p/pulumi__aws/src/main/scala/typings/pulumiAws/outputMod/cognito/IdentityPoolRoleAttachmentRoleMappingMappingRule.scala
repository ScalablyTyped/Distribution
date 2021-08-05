package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityPoolRoleAttachmentRoleMappingMappingRule extends StObject {
  
  /**
    * The claim name that must be present in the token, for example, "isAdmin" or "paid".
    */
  var claim: String
  
  /**
    * The match condition that specifies how closely the claim value in the IdP token must match Value.
    */
  var matchType: String
  
  /**
    * The role ARN.
    */
  var roleArn: String
  
  /**
    * A brief string that the claim must match, for example, "paid" or "yes".
    */
  var value: String
}
object IdentityPoolRoleAttachmentRoleMappingMappingRule {
  
  inline def apply(claim: String, matchType: String, roleArn: String, value: String): IdentityPoolRoleAttachmentRoleMappingMappingRule = {
    val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], matchType = matchType.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMappingMappingRule]
  }
  
  extension [Self <: IdentityPoolRoleAttachmentRoleMappingMappingRule](x: Self) {
    
    inline def setClaim(value: String): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
