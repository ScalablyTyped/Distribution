package typings.atPulumiAws.typesInputMod.cognitoNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolRoleAttachmentRoles extends js.Object {
  var authenticated: js.UndefOr[Input[String]] = js.undefined
  var unauthenticated: js.UndefOr[Input[String]] = js.undefined
}

object IdentityPoolRoleAttachmentRoles {
  @scala.inline
  def apply(authenticated: Input[String] = null, unauthenticated: Input[String] = null): IdentityPoolRoleAttachmentRoles = {
    val __obj = js.Dynamic.literal()
    if (authenticated != null) __obj.updateDynamic("authenticated")(authenticated.asInstanceOf[js.Any])
    if (unauthenticated != null) __obj.updateDynamic("unauthenticated")(unauthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoles]
  }
}

