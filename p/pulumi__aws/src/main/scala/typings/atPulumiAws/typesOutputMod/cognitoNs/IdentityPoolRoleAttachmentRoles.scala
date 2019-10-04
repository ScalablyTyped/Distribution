package typings.atPulumiAws.typesOutputMod.cognitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolRoleAttachmentRoles extends js.Object {
  var authenticated: js.UndefOr[String] = js.undefined
  var unauthenticated: js.UndefOr[String] = js.undefined
}

object IdentityPoolRoleAttachmentRoles {
  @scala.inline
  def apply(authenticated: String = null, unauthenticated: String = null): IdentityPoolRoleAttachmentRoles = {
    val __obj = js.Dynamic.literal()
    if (authenticated != null) __obj.updateDynamic("authenticated")(authenticated)
    if (unauthenticated != null) __obj.updateDynamic("unauthenticated")(unauthenticated)
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoles]
  }
}

