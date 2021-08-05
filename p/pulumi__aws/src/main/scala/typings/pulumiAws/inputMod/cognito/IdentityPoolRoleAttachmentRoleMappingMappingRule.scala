package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityPoolRoleAttachmentRoleMappingMappingRule extends StObject {
  
  /**
    * The claim name that must be present in the token, for example, "isAdmin" or "paid".
    */
  var claim: Input[String]
  
  /**
    * The match condition that specifies how closely the claim value in the IdP token must match Value.
    */
  var matchType: Input[String]
  
  /**
    * The role ARN.
    */
  var roleArn: Input[String]
  
  /**
    * A brief string that the claim must match, for example, "paid" or "yes".
    */
  var value: Input[String]
}
object IdentityPoolRoleAttachmentRoleMappingMappingRule {
  
  inline def apply(claim: Input[String], matchType: Input[String], roleArn: Input[String], value: Input[String]): IdentityPoolRoleAttachmentRoleMappingMappingRule = {
    val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], matchType = matchType.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMappingMappingRule]
  }
  
  extension [Self <: IdentityPoolRoleAttachmentRoleMappingMappingRule](x: Self) {
    
    inline def setClaim(value: Input[String]): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setMatchType(value: Input[String]): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
