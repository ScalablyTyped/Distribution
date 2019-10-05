package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolRoleAttachmentRoleMapping extends js.Object {
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
  @scala.inline
  def apply(
    identityProvider: String,
    `type`: String,
    ambiguousRoleResolution: String = null,
    mappingRules: js.Array[IdentityPoolRoleAttachmentRoleMappingMappingRule] = null
  ): IdentityPoolRoleAttachmentRoleMapping = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider)
    __obj.updateDynamic("type")(`type`)
    if (ambiguousRoleResolution != null) __obj.updateDynamic("ambiguousRoleResolution")(ambiguousRoleResolution)
    if (mappingRules != null) __obj.updateDynamic("mappingRules")(mappingRules)
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMapping]
  }
}

