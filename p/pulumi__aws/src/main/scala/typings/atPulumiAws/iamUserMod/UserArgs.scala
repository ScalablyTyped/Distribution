package typings.atPulumiAws.iamUserMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserArgs extends js.Object {
  /**
    * When destroying this user, destroy even if it
    * has non-this provider-managed IAM access keys, login profile or MFA devices. Without `forceDestroy`
    * a user with non-this provider-managed access keys and login profile will fail to be destroyed.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The user's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both "TESTUSER" and "testuser".
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Path in which to create the user.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  val permissionsBoundary: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of tags for the IAM user
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object UserArgs {
  @scala.inline
  def apply(
    forceDestroy: Input[Boolean] = null,
    name: Input[String] = null,
    path: Input[String] = null,
    permissionsBoundary: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): UserArgs = {
    val __obj = js.Dynamic.literal()
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (permissionsBoundary != null) __obj.updateDynamic("permissionsBoundary")(permissionsBoundary.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserArgs]
  }
}

