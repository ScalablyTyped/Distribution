package typings.atPulumiAws.typesOutputMod.cognitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolRoleAttachmentRoleMappingMappingRule extends js.Object {
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
  @scala.inline
  def apply(claim: String, matchType: String, roleArn: String, value: String): IdentityPoolRoleAttachmentRoleMappingMappingRule = {
    val __obj = js.Dynamic.literal(claim = claim, matchType = matchType, roleArn = roleArn, value = value)
  
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMappingMappingRule]
  }
}

