package typings
package atPulumiAwsLib.iamUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserArgs extends js.Object {
  /**
    * When destroying this user, destroy even if it
    * has non-Terraform-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
    * a user with non-Terraform-managed access keys and login profile will fail to be destroyed.
    */
  val forceDestroy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The user's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both "TESTUSER" and "testuser".
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Path in which to create the user.
    */
  val path: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  val permissionsBoundary: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Key-value mapping of tags for the IAM user
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

