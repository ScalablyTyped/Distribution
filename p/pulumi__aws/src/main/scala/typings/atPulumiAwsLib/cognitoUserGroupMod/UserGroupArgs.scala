package typings
package atPulumiAwsLib.cognitoUserGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserGroupArgs extends js.Object {
  /**
    * The description of the user group.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the user group.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The precedence of the user group.
    */
  val precedence: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The ARN of the IAM role to be associated with the user group.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The user pool ID.
    */
  val userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

