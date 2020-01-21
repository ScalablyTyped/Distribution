package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolRoleAttachmentRoles extends js.Object {
  var authenticated: js.UndefOr[String] = js.native
  var unauthenticated: js.UndefOr[String] = js.native
}

object IdentityPoolRoleAttachmentRoles {
  @scala.inline
  def apply(authenticated: String = null, unauthenticated: String = null): IdentityPoolRoleAttachmentRoles = {
    val __obj = js.Dynamic.literal()
    if (authenticated != null) __obj.updateDynamic("authenticated")(authenticated.asInstanceOf[js.Any])
    if (unauthenticated != null) __obj.updateDynamic("unauthenticated")(unauthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoles]
  }
}

