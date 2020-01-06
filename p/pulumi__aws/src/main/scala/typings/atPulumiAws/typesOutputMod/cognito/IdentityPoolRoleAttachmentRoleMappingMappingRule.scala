package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolRoleAttachmentRoleMappingMappingRule extends js.Object {
  /**
    * The claim name that must be present in the token, for example, "isAdmin" or "paid".
    */
  var claim: String = js.native
  /**
    * The match condition that specifies how closely the claim value in the IdP token must match Value.
    */
  var matchType: String = js.native
  /**
    * The role ARN.
    */
  var roleArn: String = js.native
  /**
    * A brief string that the claim must match, for example, "paid" or "yes".
    */
  var value: String = js.native
}

object IdentityPoolRoleAttachmentRoleMappingMappingRule {
  @scala.inline
  def apply(claim: String, matchType: String, roleArn: String, value: String): IdentityPoolRoleAttachmentRoleMappingMappingRule = {
    val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], matchType = matchType.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMappingMappingRule]
  }
}

