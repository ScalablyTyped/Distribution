package typings.atPulumiAws.organizationsAccountMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountArgs extends js.Object {
  /**
    * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
    */
  val email: Input[String]
  /**
    * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
    */
  val iamUserAccessToBilling: js.UndefOr[Input[String]] = js.undefined
  /**
    * A friendly name for the member account.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
    */
  val parentId: js.UndefOr[Input[String]] = js.undefined
  val roleName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object AccountArgs {
  @scala.inline
  def apply(
    email: Input[String],
    iamUserAccessToBilling: Input[String] = null,
    name: Input[String] = null,
    parentId: Input[String] = null,
    roleName: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): AccountArgs = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (iamUserAccessToBilling != null) __obj.updateDynamic("iamUserAccessToBilling")(iamUserAccessToBilling.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountArgs]
  }
}

