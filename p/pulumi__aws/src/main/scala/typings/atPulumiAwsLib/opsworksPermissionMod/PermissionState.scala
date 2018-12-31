package typings
package atPulumiAwsLib.opsworksPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionState extends js.Object {
  /**
    * Whether the user is allowed to use SSH to communicate with the instance
    */
  val allowSsh: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether the user is allowed to use sudo to elevate privileges
    */
  val allowSudo: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
    */
  val level: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The stack to set the permissions for
    */
  val stackId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The user's IAM ARN to set permissions for
    */
  val userArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

